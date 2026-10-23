
import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int marks[] = new int[5];
        int total = 0;

        String subjects[] = {"Java", "Python", "C++", "Maths", "English"};

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + subjects[i] + " marks: ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        double average = total / 5.0;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        if (average >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        sc.close();
    }
}
