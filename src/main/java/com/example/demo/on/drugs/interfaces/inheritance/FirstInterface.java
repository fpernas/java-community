package com.example.demo.on.drugs.interfaces.inheritance;

public interface FirstInterface {
    
    default void print() {
        System.out.println("Value from first interface");
    }
}
