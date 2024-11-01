/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_calculatorwithgui;

/**
 *
 * @author trion
 */
public class Calculator {
    public int add (int operand1, int operand2 ) {
        return operand1 + operand2;
    }
    
    public int subtract ( int operand1, int operand2) {
        
        return operand1 - operand2;
    }
    
    public int divide ( int operand1, int operand2) throws IllegalArgumentException {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Cannot divide by Zero" );
        }
        return operand1 / operand2;
    }    
    
    
    public int multiply ( int operand1, int operand2 ) {
        
        return operand1 * operand2;
    }
    
    
  

    
}
