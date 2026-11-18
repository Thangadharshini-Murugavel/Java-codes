package functions;

import java.util.Scanner;

public class Capital {

    void isCapital(char ch) {

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a capital letter");
        }
        else {
            System.out.println(ch + " is not a capital letter");
        }
    }

    public static void main(String[] args) {

        Capital obj = new Capital();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = s.next().charAt(0);

        obj.isCapital(ch);
    }
}