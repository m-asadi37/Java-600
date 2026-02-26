package app;

import entity.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static Student[] students = new Student[10];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isExit = false;
        do {
            printMenu();
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    boolean isBack = false;
                    do {
                        printStudentMenu();
                        int submenu = scanner.nextInt();
                        switch (submenu) {
                            case 1 -> {
                                Student student = getStudent(scanner);
                                doAddStudent(student);
                            }
                            case 2 -> {
                                System.out.print("id: ");
                                int id = scanner.nextInt();
                                System.out.print("grade: ");
                                double grade = scanner.nextDouble();
                                doUpdateStudent(id, grade);
                            }
                            case 3 -> {
                            }
                            case 4 -> {
                            }
                            case 5 -> {
                            }
                            case 0 -> isBack = true;
                        }
                    } while (!isBack);
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 0 -> isExit = true;

            }
        } while (!isExit);
    }

    private static void doUpdateStudent(int id, double grade) {
        boolean flag = true;
        for (Student find : students) {
            if (find != null && find.getId() == id) {
                flag = false;
                find.setGrade(grade);
                System.out.println(">> Student Grade Updated");
                break;
            }
        }
        if (flag) {
            System.out.println(">> Student Not Found");
        }
    }

    private static void doAddStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println(">> Student Added successfully!");
                break;
            }
        }
    }

    private static Student getStudent(Scanner scanner) {
        System.out.print("id: ");
        int id = scanner.nextInt();
        System.out.print("name: ");
        String name = scanner.next();
        System.out.print("family: ");
        String family = scanner.next();
        System.out.print("birthday: ");
        String str = scanner.next();
        LocalDate birthday = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        return new Student(id, name, family, birthday);
    }

    private static void printStudentMenu() {
        System.out.println("===== STUDENT =====");
        System.out.println("1. ADD");
        System.out.println("2. UPDATE");
        System.out.println("3. REMOVE");
        System.out.println("4. SEARCH");
        System.out.println("5. LIST");
        System.out.println("0. BACK");
    }

    private static void printMenu() {
        System.out.println("===== SCHOOL MANAGEMENT =====");
        System.out.println("1. STUDENT");
        System.out.println("2. TEACHER");
        System.out.println("3. COURSE");
        System.out.println("0. EXIT");
    }
}
