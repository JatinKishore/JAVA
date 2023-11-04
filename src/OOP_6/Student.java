package OOP_6;

public class Student implements Comparable<Student> {
    int rollNo;
    int marks;
    public Student(int rollNo, int marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o.marks;

        return diff;
    }
}
