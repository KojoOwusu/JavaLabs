package com.company;

import java.util.*;

public class ArrayClass {
    private Set<Integer>  numbers = new HashSet<>();

    public ArrayClass (){

            for(int i=0;i<6;i++){
                numbers.add(randomIntGen());
            }
       // Collections.sort(numbers);
        }


    private static int randomIntGen(){
        int range = 49-1;
        return (int)(Math.random()*range)+1;
    }

    public Set<Integer> getArray(){
        return numbers;
    }
}
