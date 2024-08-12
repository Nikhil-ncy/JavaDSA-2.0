package com.Nikhil.generics.comparing;

public class Student implements Comparable<Student>{
    int rno;
    float marks;

    Student(int rno, float marks){
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rno + ": "+ marks;
    }

    @Override
    public int compareTo( Student o) {
//        System.out.println("in compareto method");
        float diff = this.marks - o.marks;

        if (diff > 0){
            return 1;
        }
        else if (diff < 0) {
            return -1;
        }
        return 0;
    }
}
