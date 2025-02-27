package code.challenge.departament;

public class Student {

    private String name;
    private String lastName;

    public Student() {}

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // sobre escribiendo la funcion de equals para comparar los atributos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;

        boolean equals = lastName.equals(student.lastName);
        if (equals) {
            this.setValues(student);
        }

        return equals;
    }

    private void setValues(Student student) {
        this.lastName = student.lastName;
        this.name = student.name;
    }


    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
