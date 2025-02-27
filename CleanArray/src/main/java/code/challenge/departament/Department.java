package code.challenge.departament;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Department {

    private Map<Student, Integer> studentMap = new HashMap<>();

    public Department() {}

    public String printStudents(){

        String sb = "";


        for (Student key : this.studentMap.keySet()) {
            sb += "name= " + key.getName() + " " + key.getLastName()+", mark= "+this.studentMap.get(key);
        }


        return sb;
    }


    public void addStudentAndMark(Student student, int mark){
        this.studentMap.put(student, mark);
    }


}
