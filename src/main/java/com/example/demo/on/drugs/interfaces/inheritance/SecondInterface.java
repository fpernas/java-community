package com.example.demo.on.drugs.interfaces.inheritance;

public interface SecondInterface {
    
    default void print() {
        System.out.println("Value from second interface");
    }

}
