package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }

    // Method to explicitly call A's meth
    public String callSuperMeth() {
        return super.meth(); // This calls meth from class A
    }
}

public class Main {

    public static void main(String[] args) {
//        B objB = new B();
//        System.out.println(objB.meth()); // Calls overridden method in B
//
//        // Task 5: Call the overridden method
//        String result = objB.meth();
//        System.out.println(result);


        B objB = new B();

        // Call meth from class A using a method in class B
        String resultFromA = objB.callSuperMeth();
        System.out.println(resultFromA); // Output: "Invoking method from class A"

        // Call the overridden method
        String resultFromB = objB.meth();
        System.out.println(resultFromB); // Output: "Method is overridden in Extended class B"
    }
}
