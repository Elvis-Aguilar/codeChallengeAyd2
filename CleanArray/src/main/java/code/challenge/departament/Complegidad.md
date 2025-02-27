# Notacion BigO complegidad

---

### funcion critica
```java
    public void addStudentAndMark(Student student, int mark){
        this.studentMap.put(student, mark);
    }
```
esta funcion solo realiza la insercion en el map

### funcion critica
```java

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
```

esta funcion se encuentra en la clase estudiante ya que en la clase departamento al hacer el put
la este utiliza esta funcion sobre escrita


por lo tanto la complegidad es 
# `O(1)` o de 1