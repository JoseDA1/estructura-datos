/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-19
 */
public class Ui {

    public void sum(float num1, float num2){
        float cal = num1 + num2;
        JOptionPane.showMessageDialog(null, cal);
    }
    public void rest(float num1, float num2){
        float cal = num1 - num2;
        JOptionPane.showMessageDialog(null, cal);
    }
    public void mult(float num1, float num2){
        float cal = num1 * num2;
        JOptionPane.showMessageDialog(null, cal);
    }
    public void div(float num1, float num2){
        float cal = num1 / num2;
        JOptionPane.showMessageDialog(null, cal);
    }
    
}
