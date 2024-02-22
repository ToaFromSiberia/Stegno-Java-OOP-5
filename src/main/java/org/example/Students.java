package org.example;

import java.util.Date;

public class Students extends Student {


    public Students(Date dateBirth, int ID) {
        super(dateBirth, ID);
    }

    public Students() {
    }

    public Students(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
    }

    @Override
    public String toString() {
        return "Students{" +
                "groupID=" + groupID +
                ", gradeStudents=" + grade +
                ", dateBirth=" + dateBirth +
                ", IDStudents=" + ID +
                '}';
    }
}



