package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 1000);
        Teacher david = new Teacher(3, "David", 2000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(david);

        Student drew = new Student(1, "Drew", 4);
        Student bob = new Student(2, "Bob", 5);
        Student bill = new Student(3, "Bill", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(drew);
        studentList.add(bob);
        studentList.add(bill);

        School ahs = new School(teacherList, studentList);
        System.out.println(ahs.getTotalMoneyEarned());

        drew.payFees(5000);
        bob.payFees(7000);

        System.out.println("AHS has earned $" + ahs.getTotalMoneyEarned());
        System.our.println("---Making SCHOOL PAY SALARY---");

        lizzy.receiveSalary(lizzy.getSalary());

        System.out.println("GHS has spent for salary to " +

                lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());
        david.receiveSalary(david.getSalary());
        System.out.println("GHS has spent for salary to " +
        david.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);
    }

    }
}
