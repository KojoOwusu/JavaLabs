package com.company;

public class Main {

    public static void main(String[] args) {
        FunctionalJavaClass func = new FunctionalJavaClass();

        var funcobj = func.functionRunner("add");
        System.out.println(funcobj.apply(2,6));
    }
}
