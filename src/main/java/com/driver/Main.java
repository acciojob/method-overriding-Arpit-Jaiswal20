package com.driver;

public class Main {
    public static  void main(String[] args)
    {
        B objB = new B();

        // Call meth from class A using a method in class B
        String resultFromA = objB.callSuperMeth();
        System.out.println(resultFromA); // Output: "Invoking method from class A"

        // Call the overridden method
        String resultFromB = objB.meth();
        System.out.println(resultFromB); 
    }
}