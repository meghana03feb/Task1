import java.util.Scanner;

public class StudentUtility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int sub1marks, sub2marks, sub3marks, sub4marks, sub5marks;
        int total;
        double percentage;

        // Accept Student Details
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        sub1marks = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        sub2marks = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        sub3marks = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        sub4marks = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        sub5marks = sc.nextInt();

        // Calculate Total and Percentage
        total = sub1marks + sub2marks + sub3marks + sub4marks + sub5marks;
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
