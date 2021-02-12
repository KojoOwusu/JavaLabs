package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfInts {
    private int [] numbers = new int[10];

    public ArrayOfInts(){
        for(int i=1;i<=10;i++){
            numbers[i-1]=i;
        }
    }
    public int[] getArray(){
        return numbers;
    }
}
