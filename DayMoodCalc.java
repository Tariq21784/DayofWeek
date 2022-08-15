/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayofweek;

/**
 *
 * @author arnol
 */
//Create a method that will ask the user to enter a day of a week and the program should tell the mood of the day. 
//If the user enter a wrong value the program should exit with 0.
import javax.swing.*;

public class DayMoodCalc {
    public static void main(String[] args) {
        enumDayMood DayMood = new enumDayMood();
        String user_input = JOptionPane.showInputDialog ("Please enter a day of the week:\n Monday to Sunday to calculate your mood").toUpperCase();

        try {
            Day day = Day.valueOf(user_input);
            DayMood.telDayMood(day);
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Illegal Argument Exception",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}