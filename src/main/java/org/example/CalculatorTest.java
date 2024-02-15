package org.example;// I pasted this code from my intellijIDE so if it shows error here, execute it in intellijIDE


//import statements
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


//this is our testClass
public class CalculatorTest {
    //encapsulated variables
    private Calculator calculator;


    //according to the question
    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }
    //test method for first one
    // I have used only number 2 because its easier for me to calculate that number 😁
    @Test
    public void Add() {
        float result = calculator.Add(2.0f, 2.0f);
        float expected = 4.0f;
        assertEquals(expected, result, 0.001f);
    }
    //test class for second method
    @Test
    public void Multiply() {
        float result = calculator.Multiply(2.0f, 2.0f);
        float expected = 4.0f;
        assertEquals(expected, result, 0.001f);
    }
    @Test
    public void Divide(){
        float result =calculator.Divide(2.0f,2.0f);
        float expected = 1.0f;
        assertEquals(expected,result,0.001f);
    }

    @Test
    public void Subtract(){
        float result =calculator.Subtract(2.0f,2.0f);
        float expected = 0.0f;
        assertEquals(expected,result,0.000f);
    }
}
