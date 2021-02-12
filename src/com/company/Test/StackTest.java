package com.company.Test;

import com.company.StrickStack;
import org.junit.Test;

public class StackTest {
    @Test

    public void testStack(){
        StrickStack<String> numberStack = new StrickStack<String>();

        numberStack.push("Kwadwo");
        numberStack.push("Owusu");   //pushing to top of stack
        numberStack.push("23");

        System.out.println(numberStack.top());

        numberStack.pop();
        System.out.println(numberStack.top());

        System.out.println(numberStack.size());


    }
}
