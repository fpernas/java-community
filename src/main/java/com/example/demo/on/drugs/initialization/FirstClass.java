package com.example.demo.on.drugs.initialization;

public class FirstClass {
    
    static { System.out.print("a"); }

    { System.out.print("b"); }

    public static void print() { System.out.print("c"); }

    public FirstClass() {
        System.out.print("d");
    }
}
