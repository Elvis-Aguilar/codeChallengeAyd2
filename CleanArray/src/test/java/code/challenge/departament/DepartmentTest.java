package code.challenge.departament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department department = new Department();


    @Test
    void testAddStudentAndMark(){

        // arrage
        Student input1 = new Student("Juan", "Paz");
        Student input2 = new Student("Elvis", "Aguilar" );
        Student input3 = new Student("Pedro", "Aguilar" );

        int mark1 = 25;
        int mark2 = 50;
        int mark3 = 15;

        String expected1 =  "name= Juan Paz, mark= 25 - name= Elvis Aguilar, mark = 15";
        String result1 = department.printStudents();
        System.out.println("serut + "+ result1);


        //arc
        this.department.addStudentAndMark(input1, mark1);
        this.department.addStudentAndMark(input2, mark2);
        this.department.addStudentAndMark(input3, mark3);


        // assert
        assertEquals(expected1, result1);

    }


}