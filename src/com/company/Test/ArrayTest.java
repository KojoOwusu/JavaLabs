package com.company.Test;

import com.company.ArrayClass;
import com.company.ArrayOfInts;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test

    public void testArrayInitialization(){
        ArrayOfInts numArray = new ArrayOfInts();
        int[] arrayTest = {1,2,3,4,5,6,7,8,9,10};
        int [] arr = numArray.getArray();
        for(var i: arr){
            System.out.println(i);
        }

        Assert.assertArrayEquals(arrayTest,numArray.getArray());
    }

    @Test
    public void testArraywithoutDuplicates(){
        ArrayClass numArray = new ArrayClass();
        //numArray.getArray()
        numArray.getArray().stream().sorted().forEach(System.out::println);
    }
}


