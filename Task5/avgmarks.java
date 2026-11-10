
package arraystringsfunctions;

import java.util.Scanner;

public class avgmarks {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the total no of students:");
        int tot = s.nextInt();

        int rollno[] = new int[tot];
        String name[] = new String[tot];

        int tam[] = new int[tot];
        int eng[] = new int[tot];
        int math[] = new int[tot];

        for(int j = 0; j < tot; j++) {

            System.out.println("Enter roll no:");
            rollno[j] = s.nextInt();

            System.out.println("Enter student name:");
            name[j] = s.next();

            System.out.println("Enter Tamil mark:");
            tam[j] = s.nextInt();

            System.out.println("Enter English mark:");
            eng[j] = s.nextInt();

            System.out.println("Enter Maths mark:");
            math[j] = s.nextInt();
        }

        int avg[] = new int[tot];
        String remarks[] = new String[tot];

        for(int i = 0; i < tot; i++) {

            avg[i] = (tam[i] + eng[i] + math[i]) / 3;

            if(avg[i] >= 85) {
                remarks[i] = "EXCELLENT";
            }
            else if(avg[i] >= 75) {
                remarks[i] = "DISTINCTION";
            }
            else if(avg[i] >= 60) {
                remarks[i] = "FIRST CLASS";
            }
            else if(avg[i] >= 40) {
                remarks[i] = "PASS";
            }
            else {
                remarks[i] = "POOR";
            }
        }

        System.out.println("\n----- STUDENT REPORT -----");

        for(int k = 0; k < tot; k++) {

            System.out.println("Roll No: " + rollno[k]);
            System.out.println("Name: " + name[k]);
            System.out.println("Average: " + avg[k]);
            System.out.println("Remark: " + remarks[k]);

            System.out.println("----------------------");
        }

        s.close();
    }
}
