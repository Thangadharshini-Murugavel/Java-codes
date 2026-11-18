package functions;

import java.util.Scanner;

public class SmallLetter {

    void toSmallLetter(char ch) {

        char small = Character.toLowerCase(ch);

        System.out.println("Small letter: " + small);
    }

    public static void main(String[] args) {

        SmallLetter obj = new SmallLetter();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = s.next().charAt(0);

        obj.toSmallLetter(ch);
    }
}