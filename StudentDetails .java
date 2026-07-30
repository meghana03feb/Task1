import java.util.Scanner;

public class StudentUtility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int mark1, mark2, mark3, mark4, mark5;
        int total;
        double percentage;

        // Accept Student Details
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        mark3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        mark4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        mark5 = sc.nextInt();

        // Calculate Total and Percentage
        total = mark1 + mark2 + mark3 + mark4 + mark5;
        percentage = total / 5.0;

        // Display Student Information
        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");

        sc.close();
    }
}
