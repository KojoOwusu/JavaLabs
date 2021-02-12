package com.company;

public class ExceptionTrigger {
    private int[] data;

    ExceptionTrigger(){
        System.out.println(data[10]);
    }

    public Double divideByZero(){
        return 14.2/0;
    }
    public String illegalCastFunction(){
        Object i = Integer.valueOf(42);
        String s = (String)i;
        return s;
    }
}
