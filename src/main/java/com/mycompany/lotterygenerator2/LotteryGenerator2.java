/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lotterygenerator2;
import javax.swing.*;
/**
 *
 * @author OAGENG.M
 */
public class LotteryGenerator2 {

    public static void main(String[] args) {
        
        int num1, num2, num3, num4, num5, powerball;
        num1 = (int) ((Math.random() * 51) + 1);

        do {num2 = (int) ((Math.random() * 51) + 1); 
        } while (num1 == num2);
        
        do {num3 = (int) ((Math.random() * 51) + 1); 
        } while ((num1 == num2) || (num2 == num3));
        
        do {num4 = (int) ((Math.random() * 51) + 1); 
        } while ((num1 == num2) || (num2 == num3) || (num3 == num4));
        
        do {num5 = (int) ((Math.random() * 51) + 1); 
        } while ((num1 == num2) || (num1 == num2) || (num3 == num4) || (num4== num5));
        
        do {powerball = (int) ((Math.random() * 51) + 1); 
        } while ((num1 == num2) || (num1 == num2) || (num3 == num4) || (num4== num5) || (num5== powerball));
        
        JOptionPane.showMessageDialog(null, "Lottery numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", "  +  "\nPowerball: " + powerball);
        
        }  
    }

