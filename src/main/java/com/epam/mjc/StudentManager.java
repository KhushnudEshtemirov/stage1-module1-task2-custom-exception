package com.epam.mjc;

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        Student student = Student.getValueOf(studentID);
        if (student == null) {
            throw new CustomException(studentID);
        }

        return student;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (long i = 0; i < IDs.length; i++) {
            try {
                Student student = manager.find(IDs[(int) i]);
                System.out.println("Student name " + student.getName());
            } catch (CustomException err) {
                System.out.println(err.getMessage());
            }
        }

    }
}