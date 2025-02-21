package Strings;

public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java"; // Both refer to the same object in the String Pool

        System.out.println("Before Modification:");
        System.out.println("s1: " + s1);
        System.out.println("s1 HashCode: " + s1.hashCode());
        System.out.println("s2: " + s2);
        System.out.println("s2 HashCode: " + s2.hashCode());
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2));

        // Modify s1
        s1 = s1 + " Programming";

        System.out.println("\nAfter Modification:");
        System.out.println("s1: " + s1);
        System.out.println("s1 HashCode: " + s1.hashCode());
        System.out.println("s2: " + s2);
        System.out.println("s2 HashCode: " + s2.hashCode());
        System.out.println("Are s1 and s2 the same object now? " + (s1 == s2));
    }
}

