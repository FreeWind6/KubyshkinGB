package Lesson_1;

import java.util.Arrays;

public class StudentsTeam {
    private String[] students = {"Vaska", "Sofia", "Petr"};

    public String[] getStudents() {
        String[] arraycopy = new String[students.length];

        for (int i = 0; i < students.length; i++) {
            arraycopy[i]  = students[i];
        }

        return arraycopy;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }


//    public String[] getStudents() {
//        return students;
//    }
//
//    public void setStudents(String[] students) {
//        this.students = students;
//    }

    void info() {
        System.out.println(Arrays.toString(students));
    }
}

class TestInc {
    public static void main(String[] args) {
        StudentsTeam studentsTeam = new StudentsTeam();
        String[] mass = studentsTeam.getStudents();

        mass[1] = "asdasd";
        studentsTeam.info();
    }
}
