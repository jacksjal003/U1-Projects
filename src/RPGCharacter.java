import javax.swing.*;
import java.sql.SQLOutput;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {

        String characterStrength = JOptionPane.showInputDialog("What is your strength?");
        String characterStamina = JOptionPane.showInputDialog("What is your stamina?");
        String characterSpeed = JOptionPane.showInputDialog("What is your speed?");
        String characterFlexibility = JOptionPane.showInputDialog("What is your flexibility?");
        String characterHealth = JOptionPane.showInputDialog("What is your health?");
        String characterSkill = JOptionPane.showInputDialog("What is your skill?");

        String armor = characterStrength + characterHealth + characterStamina + characterStamina;
        String damage = characterStrength + characterSpeed;
        String agility = characterSpeed + characterFlexibility + characterStamina;
        String swordsmanship = characterStamina + characterStrength + characterFlexibility + characterSpeed + characterSkill;

        JOptionPane.showMessageDialog(null, "Your character's armor is at " + armor + " out of 500");
        JOptionPane.showMessageDialog(null, "Your character's damage is at " + damage + " out of 100");
        JOptionPane.showMessageDialog(null, "Your character's agility is at " + agility + " out of 200");
        JOptionPane.showMessageDialog(null, "Your character's swordsmanship is at " + swordsmanship + " out of 500");




    }
}
