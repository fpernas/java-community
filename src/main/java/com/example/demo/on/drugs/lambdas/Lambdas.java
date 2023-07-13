package com.example.demo.on.drugs.lambdas;

import java.util.function.Predicate;

/*
 * Which one of the following is a correct lambda definition?
 * Note that they are all independent between each other.
 * 
 * Ans: all of them are invalid. None of them even compiles
 */

public class Lambdas {
    
    // If the type is indicated, type and variable must be between ( )
    Predicate<String> p1 = String a -> System.out.println(a); 
    
    // // Same case here.
    Predicate<?> p2 = var b -> b instanceof String;

    // // If there are more than one parameter, and if one is typed or annotated with var, all of them must be
    Predicate<?> p3 = (var a, b) -> a + b;

    // // when the body of the predicate has more than one sentence, it needs a return value
    Predicate<?> p4 = (a, b) -> {var c = a + b; c++;};
    
    // // If there are more than one parameter, and they are typed, they both need to have either
    // // the type name or the var reserved keyword
    Predicate<?> p5 = (String a, var b) -> System.out.println(a.concat(b));
    

}
