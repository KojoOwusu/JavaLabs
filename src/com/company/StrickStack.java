package com.company;

import java.util.ArrayList;

public class StrickStack<T> {
    private ArrayList<T> stackData;

    public StrickStack(){
        stackData = new ArrayList<>();
    }
    public void push(T data){
        stackData.add(data);
    }

    public T top(){
        Integer topIndex = stackData.size()-1;
        return stackData.get(topIndex);
    }

    public void pop(){
        var obj = top();
        stackData.remove(obj);
    }

    public int size(){
        return stackData.size();
    }
}
