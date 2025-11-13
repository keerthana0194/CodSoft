import java.util.*;

class Student {
    String name;
    int roll;
    String grade;

    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    public String toString() {
        return roll + " - " + name + " - " + grade;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add  2.Remove  3.Search  4.Display  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Roll No: "); int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Grade: "); String grade = sc.nextLine();
                    list.add(new Student(name, roll, grade));
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.print("Enter Roll No to remove: "); 
                    int r = sc.nextInt();
                    list.removeIf(s -> s.roll == r);
                    System.out.println("Student removed!");
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: "); 
                    int sr = sc.nextInt();
                    list.stream().filter(s -> s.roll == sr)
                        .forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("\nAll Students:");
                    list.forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}