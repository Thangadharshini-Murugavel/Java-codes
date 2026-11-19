
package string_oops;

import java.util.Scanner;

public class MovieMagic {

    int year;
    String title;
    float rating;

    Scanner sc = new Scanner(System.in);

    
    MovieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }

    
    void accept() {

        System.out.println("Enter movie year:");
        year = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter movie title:");
        title = sc.nextLine();

        System.out.println("Enter movie rating:");
        rating = sc.nextFloat();
    }

    
    void display() {

        System.out.println("\nMovie Details");
        System.out.println("Year: " + year);
        System.out.println("Title: " + title);
        System.out.println("Rating: " + rating);

        if (rating >= 0.0 && rating <= 2.0) {
            System.out.println("Flop");
        }
        else if (rating > 2.0 && rating <= 3.4) {
            System.out.println("Semi-Hit");
        }
        else if (rating > 3.4 && rating <= 4.5) {
            System.out.println("Hit");
        }
        else if (rating > 4.5 && rating <= 5.0) {
            System.out.println("Super Hit");
        }
        else {
            System.out.println("Invalid Rating");
        }
    }

    public static void main(String[] args) {

        MovieMagic m = new MovieMagic();

        m.accept();
        m.display();
    }
}
