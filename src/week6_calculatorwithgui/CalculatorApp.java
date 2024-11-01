/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_calculatorwithgui;

/**
 *
 * @author trion
 */
public class CalculatorApp {
    
    public static void main (String[] args) {
    
    Calculator calculator = new Calculator();
    
    CalculatorGUI calculatorGUI = new CalculatorGUI(calculator);
    calculatorGUI.setVisible(true);
    }
}
