/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayofweek;

/**
 *
 * @author arnol
 */
//Create a second class called enumDayMood with a void method call telDayMood ().
//This method contain a switch case as follows:
import javax.swing.*;
public class enumDayMood {
    public void telDayMood(Day day){
        switch (day) {
            case MONDAY:
                JOptionPane.showMessageDialog (null, "Mondays are bad.");
                break;
            case FRIDAY:
                JOptionPane.showMessageDialog (null, "Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                JOptionPane.showMessageDialog (null, "Weekends are best.");
                break;

            default:
                JOptionPane.showMessageDialog (null, "Midweek days are so-so.");
                break;
        }
    }
}