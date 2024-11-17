package com.driver;

public class Main {
    public static  void main(String[] args)
    {
        B objB = new B();
        System.out.println(objB.meth()); // Calls method from class A

        // Task 4: Override method meth of class A in class B
        B objBOverridden = new B()
        {
            @Override
            public String meth() {
                return "Method is overridden in Extended class B";
            }
        };

        // Task 5: Call this overridden method from object of class B
        System.out.println(objBOverridden.meth());
    }
}