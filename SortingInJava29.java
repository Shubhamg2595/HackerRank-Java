package com.HackerRank.Exer;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}


public class SortingInJava29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Comparator<Student> sortStudentComparator;

        sortStudentComparator = (o1,o2) -> {
//            System.out.println(o1.toString());
//            System.out.println(o2.toString());
//            System.out.println(Double.compare(o1.getCgpa(),o2.getCgpa()) == 0);
            if(Double.compare(o2.getCgpa(),o1.getCgpa()) == 0  && o1.getFname().equals(o2.getFname())){
//                System.out.println("in here 0");
                return o2.getId() - o1.getId();
            }
            else if(Double.compare(o2.getCgpa(),o1.getCgpa()) == 0){
//                System.out.println("in here 1");

                return o1.getFname().compareTo(o2.getFname());
            }
            else {
//                System.out.println("in here 2 ");

                return Double.compare(o2.getCgpa(),o1.getCgpa());
            }

        };

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,sortStudentComparator);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
