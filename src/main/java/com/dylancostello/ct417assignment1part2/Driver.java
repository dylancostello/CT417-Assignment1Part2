/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dylancostello.ct417assignment1part2;

import com.dylancostello.ct417assignment1.*;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/**
 *
 * @author Dylan
 */
public class Driver {
    public static void main(String[] args) {
        student student1 = new student("Darragh Burns", 21,new DateTime(1997, 2, 10, 0, 0),"12345678");
        student student2 = new student("Tom Flynn", 20,new DateTime(1998, 11, 23, 0, 0),"12343658");
        student student3 = new student("Roger Mac", 19,new DateTime(1999, 2, 3, 0, 0),"13576898");
        student student4 = new student("Ellie O'Hara", 21,new DateTime(1997, 3, 4, 0, 0),"12123489");
        student student5 = new student("Sam Naughton", 22,new DateTime(1996, 2, 23, 0, 0),"12987654");
        student student6 = new student("Sean Smith", 21,new DateTime(1997, 5, 19, 0, 0),"1765432");
        student student7 = new student("Frank Mcellin", 19,new DateTime(1999, 7, 8, 0, 0),"12341234");
        
        module module1 = new module("Software Engineering", "CT417");
        module module2 = new module("Professional Skills", "CT412");
        module module3 = new module("Data Mining", "CT403");
        module module4 = new module("Databases", "CT412");
        
        course course1 = new course("Computer Science", new DateTime(2018,9,1,0,0), new DateTime(2019,5,31,0,0));
        course course2 = new course("Electronic Engineering", new DateTime(2018,9,1,0,0), new DateTime(2019,5,31,0,0));
        
        course1.registerModule(module1);
        course1.registerModule(module2);
        course1.registerModule(module3);
        
        course2.registerModule(module2);
        course2.registerModule(module3);
        course2.registerModule(module4);
        
        course1.registerStudent(student1);
        course1.registerStudent(student2);
        course1.registerStudent(student3);
        course1.registerStudent(student4);
        
        course2.registerStudent(student7);
        course2.registerStudent(student6);
        course2.registerStudent(student5);
        
        module1.registerStudent(student1);
        module1.registerStudent(student2);
        module1.registerStudent(student3);
        module1.registerStudent(student4);
        
        module2.registerStudent(student1);
        module2.registerStudent(student2);
        module2.registerStudent(student3);
        module2.registerStudent(student4);
        module2.registerStudent(student5);
        module2.registerStudent(student6);
        module2.registerStudent(student7);
        
        module3.registerStudent(student1);
        module3.registerStudent(student2);
        module3.registerStudent(student3);
        module3.registerStudent(student4);
        module3.registerStudent(student5);
        module3.registerStudent(student6);
        module3.registerStudent(student7);
        
        module4.registerStudent(student5);
        module4.registerStudent(student6);
        module4.registerStudent(student7);
        
        //Course print out
        ArrayList<course> courses = new ArrayList();
        courses.add(course1);
        courses.add(course2);
        for (course course:courses){
            System.out.println(course.getName());
            System.out.println(course.getModules());
        }
        
        //Student print out
        ArrayList<student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        for (student student:students){
            System.out.println(student.getName());
            System.out.println(student.getUsername());
            System.out.println(student.getModules());
            System.out.println(student.getCourse());
        }
    }
}
