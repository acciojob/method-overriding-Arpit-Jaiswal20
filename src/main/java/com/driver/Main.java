package com.driver;

public class Main {
    public static  void main(String[] args)
    {
        B objB = new B();
        System.out.println(objB.meth()); // Calls overridden method in B

        // Task 5: Call the overridden method
        String result = objB.meth();
        System.out.println(result);
    }
}