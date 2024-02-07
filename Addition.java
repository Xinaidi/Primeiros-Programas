/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition;

import javax.swing.JOptionPane;

public class Addition {

    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2 ;
        
        JOptionPane.showMessageDialog(null, "The sum is: " +sum, "Sum of Two Integer", JOptionPane.PLAIN_MESSAGE);
    }
    
}
