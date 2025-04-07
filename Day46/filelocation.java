package Day46;

import java.io.File; 
class filelocation {
    public static void main(String[] args) {
        File f = new File("C:\\api\\file.txt");

    if(f.exists()){
        System.out.println("File Name: "+ f.getName());
        System.out.println("File Location: "+ f.getAbsolutePath());
        System.out.println("File Write: "+ f.canWrite());
        System.out.println("File Read: "+ f.canRead());
        System.out.println("File Execute: "+ f.canExecute());
        System.out.println("File Size: "+ f.length());
        System.out.println("File remove: "+ f.delete());
    }
    else{
        System.out.println("File does not exist.");
    }
    }
}