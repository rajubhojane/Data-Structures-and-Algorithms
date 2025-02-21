package Strings;

class Parent {
    void parentMethod() {
        System.out.println("Inside Parent class");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Inside Child class");
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.childMethod();   // Output: Inside Child class
        obj.parentMethod();  // Output: Inside Parent class

        // Object class methods (inherited indirectly)
        System.out.println(obj.toString());   // Child@some_hash_value
        System.out.println(obj.hashCode());   // Some integer value
        System.out.println(obj.getClass());   // class Child
    }
}

