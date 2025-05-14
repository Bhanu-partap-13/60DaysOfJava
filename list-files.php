<?php
// Enable CORS
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

// Get directory from query parameter
$dir = isset($_GET['dir']) ? $_GET['dir'] : '';

// Validate to prevent directory traversal attacks
if (empty($dir) || !preg_match('/^Day[0-9]{1,2}$/', $dir) || strpos($dir, '..') !== false) {
    // Return empty array if invalid
    echo json_encode([]);
    exit;
}

// Check if directory exists
if (!is_dir($dir)) {
    echo json_encode([]);
    exit;
}

// Get files in directory
$files = [];
$dir_handle = opendir($dir);

if ($dir_handle) {
    while (($file = readdir($dir_handle)) !== false) {
        // Skip hidden files and directories
        if ($file[0] === '.' || is_dir($dir . '/' . $file)) {
            continue;
        }
        $files[] = $file;
    }
    closedir($dir_handle);
}

// Sort files: readme first, then Java files, then others
usort($files, function($a, $b) {
    // Readme files first
    if (strtolower($a) === 'readme.md' || strtolower($a) === 'readme.txt') return -1;
    if (strtolower($b) === 'readme.md' || strtolower($b) === 'readme.txt') return 1;
    
    // Java files next
    $a_ext = pathinfo($a, PATHINFO_EXTENSION);
    $b_ext = pathinfo($b, PATHINFO_EXTENSION);
    
    if ($a_ext === 'java' && $b_ext !== 'java') return -1;
    if ($a_ext !== 'java' && $b_ext === 'java') return 1;
    
    // Otherwise alphabetical
    return strcmp($a, $b);
});

// Return JSON response
echo json_encode($files);
?> 