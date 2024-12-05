package com.driver;

public class B extends A{

    @Override
    public String meth()
    {
        return "Method is overridden in Extended class B";
    }
    public String callSuperMeth() {
        return super.meth(); // This calls meth from class A
    }
}
