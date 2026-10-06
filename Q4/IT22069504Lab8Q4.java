
import java.util.Scanner;

public class IT22069504Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        int i = 0;

        while (i < 8) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int studentID = input.nextInt();

            if (studentID <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = studentID;
                i++;
            }
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int j = 0; j < 8; j++) {
            if (studentsArray[j] == searchID) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}
