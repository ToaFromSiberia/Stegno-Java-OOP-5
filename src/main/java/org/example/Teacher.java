package org.example;

import java.util.Date;
import java.util.List;

public class Teacher extends User {
    int exp;
    List<Integer> group;

    public Teacher(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "exp=" + exp +
                ", group=" + group +
                ", dateBirth=" + dateBirth +
                ", fio Teacher='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Teacher() {
    }
}
