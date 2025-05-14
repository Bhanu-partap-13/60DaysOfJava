package Day59;

import java.io.Serializable;

/*
 * Java Beans - Understanding Java Bean Components
 * 
 * A JavaBean is a reusable software component that follows certain conventions:
 * 1. Must have a no-argument constructor
 * 2. Properties must be accessible through getter and setter methods
 * 3. Should be serializable (implements Serializable)
 * 4. May have additional methods
 * 
 * Common Conventions:
 * - Private fields
 * - Public getter/setter methods
 * - Implements java.io.Serializable
 * - Property naming follows camelCase
 */

// Basic Java Bean (Ek basic Java Bean class)
class SimpleBean implements Serializable {
    private String name;    // name variable private hai
    private int age;       // age variable private hai
    
    // No-arg constructor (Bina kisi parameter ka constructor)
    public SimpleBean() {}
    
    // Getters and Setters (Name aur age ko get/set karne ke methods)
    public String getName() { return name; }     // name ko bahar dene ke liye
    public void setName(String name) { this.name = name; }  // name ko set karne ke liye
    public int getAge() { return age; }         // age ko bahar dene ke liye
    public void setAge(int age) { this.age = age; }        // age ko set karne ke liye
}

// Advanced Java Bean (Advanced features ke saath bean)
class AdvancedBean implements Serializable {
    private static final long serialVersionUID = 1L;    // serialization ke liye unique ID
    private String id;          // id private variable hai
    private String description; // description private variable hai
    private boolean active;     // active status ke liye boolean
    private transient String temporaryData;     // temporary data jo save nahi hoga file mein
    
    // Bina parameter ka constructor
    public AdvancedBean() {}
    
    // Do parameters wala constructor
    public AdvancedBean(String id, String description) {
        this.id = id;
        this.description = description;
    }
    
    // Getters aur Setters (Saare variables ke liye get/set methods)
    public String getId() { return id; }        // id nikalne ke liye
    public void setId(String id) { this.id = id; }      // id set karne ke liye
    public String getDescription() { return description; }    // description nikalne ke liye
    public void setDescription(String description) { this.description = description; }  // description set karne ke liye
    public boolean isActive() { return active; }     // active status check karne ke liye
    public void setActive(boolean active) { this.active = active; }    // active status set karne ke liye
    
    // Reset method (Saare variables ko khali karne ke liye)
    public void reset() {
        this.id = null;
        this.description = null;
        this.active = false;
    }
}
// Example usage (Bean ka use kaise karte hain)
class Beans {
    public static void main(String[] args) {
        // Simple bean ka example
        SimpleBean simple = new SimpleBean();
        simple.setName("John");     // name set kiya
        simple.setAge(25);          // age set kiya
        System.out.println("Simple Bean - Name: " + simple.getName() + ", Age: " + simple.getAge());
        
        // Advanced bean ka example
        AdvancedBean advanced = new AdvancedBean();
        advanced.setId("A123");             // id set kiya
        advanced.setDescription("Advanced Bean Example");  // description set kiya
        advanced.setActive(true);           // active status true kiya
        System.out.println("Advanced Bean - ID: " + advanced.getId() + 
                         ", Description: " + advanced.getDescription() + 
                         ", Active: " + advanced.isActive());
        
        // Reset method ka use
        advanced.reset();   // saare variables khali kar diye
        System.out.println("After Reset - ID: " + advanced.getId() + 
                         ", Description: " + advanced.getDescription() + 
                         ", Active: " + advanced.isActive());
    }
}

