import java.util.Scanner;

// Student class (OOP concept)
class Student {
    private String name;
    private int rollNo;
    private int marks;

    // Constructor
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getters (Encapsulation)
    public int getRollNo() {
        return rollNo;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks;
    }
}

public class StudentProfileManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store students
        Student[] students = new Student[3]; // fixed size to show error handling
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student | 2. View All | 3. Search | 4. Exit");
            System.out.print("Choice: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (choice) {

                case 1: // Add Student
                    if (count == students.length) {
                        System.out.println("Error: Storage is full! Cannot add more students.");
                        break;
                    }

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    students[count] = new Student(name, rollNo, marks);
                    count++;

                    System.out.println("Student added successfully!");
                    break;

                case 2: // View All
                    if (count == 0) {
                        System.out.println("No students available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;

                case 3: // Search
                    if (count == 0) {
                        System.out.println("No students to search.");
                        break;
                    }

                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].getRollNo() == searchRoll) {
                            System.out.println("Student Found: " + students[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
