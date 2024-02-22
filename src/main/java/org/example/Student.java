package org.example;

import java.util.Date;
import java.util.List;

public class Student extends User{

    int groupID;
    List<Integer> grade;

    public Student(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    public Student(Date date, int id) {

    }

    @Override
    public String toString() {
        return "Students{" +
                "groupID=" + groupID +
                ", grade=" + grade +
                ", dateBirth=" + dateBirth +
                ", fio Student='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Student() {
    }
}
