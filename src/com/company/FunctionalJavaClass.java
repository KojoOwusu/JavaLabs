package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalJavaClass {

    public BiFunction<Integer, Integer, Integer> functionRunner(String operation) {

        if (operation == "add") {
            return new BiFunction<Integer, Integer, Integer>() {
                public Integer apply(Integer a, Integer b) {
                    return a + b;
                }
            };
        } else if (operation == "subtract") {
            return new BiFunction<Integer, Integer, Integer>() {
                @Override
                public Integer apply(Integer integer, Integer integer2) {
                    return integer-integer2;
                }
            };
        }
        else {
            return new BiFunction<Integer, Integer, Integer>(){
                    public Integer apply(Integer a, Integer b){
                        return a*b;
                    }
            };

            }
        }
     }

