package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Executer {
    int currentTry = 1;
    final int MAX_RETRY = 3;

    Employee employee1;
    Employee employee2;
    Intern intern1;
    Intern intern2;
    private Employee[] employees = new Employee[2];
    private List<Intern> interns = new ArrayList<>();

    public void start() {
        managerLogin();
        initEmployees();
        initInterns();

        int i = 1;
        System.out.println();
        System.out.println("-------------------------------");
        while (i <= 2) {
            System.out.println("Semester " + i + " review: ");
            employeesReview();
            internsReview();
            i++;

        }
        reviewResults();

    }

    public void managerLogin() {
        Manager manager = new Manager("Fry", "1234");

        String managerName = manager.getName();
        String managerPassword = manager.getPassword();

        System.out.println("Hello! Welcome to the end of the year review!");
        System.out.println("To Login, please insert name and password.");
        System.out.println("Name: ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();


        if (managerName.equals(name) && managerPassword.equals(password)) {
            System.out.println("Login successful.");
            System.out.println("Welcome, " + manager.getName() + "!");
            System.out.println();


        } else {
            if (MAX_RETRY != currentTry) {
                System.out.println("Credentials incorrect, please repeat login process.");
                System.out.println("You have " + (MAX_RETRY - currentTry) + " more attempts left.");
                System.out.println();

                currentTry++;
                managerLogin();
            } else {
                System.out.println("Your Login failed.");
            }

        }

    }

    public void initEmployees() {
        System.out.println("Employees under review: ");

        employee1 = new Employee("Frank");
        employee2 = new Employee("Dave");

        employee1.setSalary(1500);
        employee1.setAge(30);
        employee1.setExperience(3.5);

        employee2.setSalary(1650);
        employee2.setAge(34);
        employee2.setExperience(4.9);

        employees[0] = employee1;
        employees[1] = employee2;

        displayEmployees();
        System.out.println();
    }

    public void initInterns() {
        System.out.println("Interns under review: ");

        intern1 = new Intern("Steven");
        intern2 = new Intern("Stan");

        intern1.setAge(20);
        intern1.setSalary(600);

        intern2.setAge(22);
        intern2.setSalary(600);

        interns.add(intern1);
        interns.add(intern2);

        displayInterns();
    }

    private void displayInterns() {
        for (Intern intern : interns) {
            if (intern != null) {
                System.out.println(intern.getName() + " ");
            }
        }
    }

    private void displayEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName() + " ");
            }
        }
    }

    private void employeesReview() {
        System.out.println();

        int i = 0;
        System.out.println("Name: " + employees[i].getName());
        System.out.println("Age: " + employees[i].getAge());
        System.out.println("Experience: " + employees[i].getExperience());
        System.out.println("Salary: " + employees[i].getSalary());

        System.out.println("Enter review value (number between 1 and 10): ");
        Scanner scanner1 = new Scanner(System.in);

        double review1 = 0;
        try {
            review1 = scanner1.nextDouble();

        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid number.");
        }

        if (review1 < 1 || review1 > 10){
            System.out.println("The inserted value " + review1 + " is invalid.");
            System.out.println();
            System.exit(0);
        }

        employees[i].setSemesterReview(review1 + employees[i].getSemesterReview());

        int j = 1;
        System.out.println("Name: " + employees[j].getName());
        System.out.println("Age: " + employees[j].getAge());
        System.out.println("Experience: " + employees[j].getExperience());
        System.out.println("Salary: " + employees[j].getSalary());

        System.out.println("Enter review value (number between 1 and 10): ");
        Scanner scanner2 = new Scanner(System.in);
        double review2 = 0;

        try {
            review2 = scanner2.nextDouble();

        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid number.");
        }

        if (review2 < 1 || review2 > 10){
            System.out.println("The inserted value " + review2 + " is invalid.");
            System.out.println();
            System.exit(0);
        }

        employees[j].setSemesterReview(review2 + employees[j].getSemesterReview());
    }


    private void internsReview() {
        System.out.println();

        int i = 0;
        System.out.println("Name: " + interns.get(i).getName());
        System.out.println("Age: " + interns.get(i).getAge());
        System.out.println("Salary: " + interns.get(i).getSalary());

        System.out.println("Enter review value (number between 1 and 10): ");
        Scanner scanner1 = new Scanner(System.in);
        double review1 = 0;

        try {
            review1 = scanner1.nextDouble();

        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid number.");
        }

        if (review1 < 1 || review1 > 10){
            System.out.println("The inserted value " + review1 + " is invalid.");
            System.out.println();
            System.exit(0);
        }

        interns.get(i).setSemesterReview(review1 + interns.get(i).getSemesterReview());

        int j = 1;
        System.out.println("Name: " + interns.get(j).getName());
        System.out.println("Age: " + interns.get(j).getAge());
        System.out.println("Salary: " + interns.get(j).getSalary());

        System.out.println("Enter review value (number between 1 and 10): ");
        Scanner scanner2 = new Scanner(System.in);
        double review2 = 0;

        try {
            review2 = scanner2.nextDouble();

        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid number.");
        }

        if (review2 < 1 || review2 > 10){
            System.out.println("The inserted value " + review2 + " is invalid.");
            System.out.println();
            System.exit(0);
        }

        interns.get(j).setSemesterReview(review2 + interns.get(j).getSemesterReview());
    }

    private void reviewResults() {
        System.out.println();
        System.out.println("The results for the year are: ");

        for (Employee employee : employees) {
            if (employee.getSemesterReview() >= 15) {
                employee.setRaise(true);
            } else {
                employee.setRaise(false);
            }
            System.out.println(employee.getName() + "'s review value is: " + employee.getSemesterReview() + ".");
            System.out.println(employee.getName() + " gets raise: " + employee.getRaise());

        }
        for (Intern intern : interns) {
            if (intern.getSemesterReview() >= 12) {
                intern.setIsHired(true);
            } else {
                intern.setIsHired(false);
            }
            System.out.println(intern.getName() + "'s review value is: " + intern.getSemesterReview() + ".");
            System.out.println(intern.getName() + " is hired: " + intern.getIsHired());

        }
    }
}



