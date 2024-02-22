package org.example;

import java.util.Date;

// model
public abstract class User {
    Date dateBirth;
    String fio;
    int ID;

    public User(Date dateBirth, String fio, int ID) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "dateBirth=" + dateBirth +
                ", fio User='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }

    public User() {
    }
}
