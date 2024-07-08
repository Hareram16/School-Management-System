
package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hareram on 08/07/2024.
 */
public class Main {
    public static void main(String[] args) {
        Teacher Adi = new Teacher(1,"Adi",500);
        Teacher Om = new Teacher(2,"Om",700);
        Teacher Mahesh = new Teacher(3,"Mahesh",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Adi);
        teacherList.add(Om);
        teacherList.add(Mahesh);


        Student Ram = new Student(1,"Ram",4);
        Student Akash = new Student(2,"Akash",12);
        Student Abhi = new Student(3,"Abhi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Ram);
        studentList.add(Akash);
        studentList.add(Abhi);




        School DYP = new School(teacherList,studentList);

        Teacher Snehal = new Teacher(6,"Snehal", 900);

        DYP.addTeacher(Snehal);


        Ram.payFees(5000);
        Abhi.payFees(6000);
        System.out.println("DYP has earned $"+ DYP.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Adi.receiveSalary(Adi.getSalary());
        System.out.println("DYP has spent for salary to " + Adi.getName()
                +" and now has $" + DYP.getTotalMoneyEarned());

        Mahesh.receiveSalary(Mahesh.getSalary());
        System.out.println("DYP has spent for salary to " + Mahesh.getName()
                +" and now has $" + DYP.getTotalMoneyEarned());


        System.out.println(Ram);

        Om.receiveSalary(Om.getSalary());

        System.out.println(Om);


    }
}
