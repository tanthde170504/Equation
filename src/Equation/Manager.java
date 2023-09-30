package Equation;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Manager {
    
    private final Scanner in = new Scanner(System.in);
    Validation validation = new Validation();
    
    public int menu() {
        System.out.println("\n1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = validation.checkInputIntLimit(1, 3);
        return choice;
    }


  
    public void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = validation.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        System.out.print("Odd Number: ");
        if (validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Even Number: ");
        if (validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("\nPerfect Square Number: ");
        if (validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }

    //allow user calculate Quadratic Equation
    public void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = validation.checkInputDouble();
        System.out.print("Enter C: ");
        double c = validation.checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Odd Number: ");
        if (validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (validation.checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (validation.checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("\nEven Number: ");
        if (validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkEven(c)) {
            System.out.print(b + " ");
        }
        if (validation.checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (validation.checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("\nPerfect Square Number: ");
        if (validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (validation.checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (validation.checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (validation.checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    }
}
