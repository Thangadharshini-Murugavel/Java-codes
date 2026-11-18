
package functions;

import java.util.Scanner;

public class Vowel {

    public static void isVowel(char a) {

        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (a == arr[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(a + " is a Vowel");
        }
        else {
            System.out.println(a + " is a Consonant");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any Alphabet: ");
        char b = s.next().charAt(0);

        isVowel(b);

        s.close();
    }
}
