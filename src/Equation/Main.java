/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equation;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.superlativeEquation();
                    break;
                case 2:
                    manager.quadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    } 
}
