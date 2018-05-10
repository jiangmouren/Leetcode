package com.mycompany.app;
import com.mycompany.app.BasicCalculatorGeneric;

/**
 * Question:
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces.
 * The integer division should truncate toward zero.
 * You may assume that the given expression is always valid.
 * Some examples:
 * "3+2*2" = 7
 * " 3/2 " = 1
 * " 3+5 / 2 " = 5
 * Note: Do not use the eval built-in library function.
 */

public class BasicCalculatorII {
    BasicCalculatorGeneric obj = new BasicCalculatorGeneric();
    public int calculate(String s) {
        return obj.calculate(s);
    }
}