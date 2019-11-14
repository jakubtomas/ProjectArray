package sk.itsovy.student;

public class Group {
    private String name;
    private int size; // defalut
    private int capacity;
    private Student[] arr;


    public Group(String name, int capacity) {//
        this.name = name;
        this.capacity = capacity;
        this.size = 0;
        this.arr = new Student[capacity];
    }


    public void addStudent(Student student) {

    }

    public Student getStudent(String firstName, String lastName) {
        return  null;
    }

    public void deleteStudent(Student student) {

    }


    public void print() {
        System.out.println("LIst of studetns ["+this.name+"]" );
        for (int i = 0; i < size; i++) {
            System.out.println("  " + arr[i].toString());
        }
    }
}
