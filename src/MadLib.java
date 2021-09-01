import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;
public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String pluralNoun1;
        String place;
        String noun;
        String pluralNoun2;
        String noun2;
        String adjective;
        String verb;
        String number;
        String adjective2;
        String bodyPart;
        String verb2;

        System.out.println("Noun? (Plural) ");
        System.out.println("Place? ");
        System.out.println("Noun? ");
        System.out.println("Noun? (Plural) ");
        System.out.println("Noun? ");
        System.out.println("Adjective? ");
        System.out.println("Verb? ");
        System.out.println("Number? ");
        System.out.println("Adjective? ");
        System.out.println("Body part ");
        System.out.println("Verb? ");

        pluralNoun1 = read.next();
        place = read.next();
        noun = read.next();
        pluralNoun2 = read.next();
        noun2 = read.next();
        adjective = read.next();
        verb = read.next();
        number = read.next();
        adjective2 = read.next();
        bodyPart = read.next();
        verb2 = read.nextLine();







    }
}
