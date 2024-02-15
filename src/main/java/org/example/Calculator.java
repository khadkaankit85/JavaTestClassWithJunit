package org.example;
public class Calculator {
//let's start by creating asked methods
    public static float Add(float a, float b){
    return (a+b);
    }

    public static float Subtract(float a, float b){
        return (a-b);
    }

    public static float Multiply(float a, float b){
        return (a*b);
    }
    public static float Divide(float a, float b){
        return (a/b);
    }

//    public static void main(String[] args) {
//
//        System.out.println(Add(2.0f,2.0f));
//        System.out.println(Subtract(2.0f,2.0f));
//        System.out.println(Multiply(2.0f,2.0f));
//        System.out.println(Divide(2.0f,2.0f));
//        //All the methods are working well, to test this in junit, I don't need a main method here..
//    }
    }