package org.example.view;

import org.example.User;

import java.util.List;

public class View {
    public String studentView(List<User> student) {
        return student.toString();
    }

    public String sgView(List<User> students) {
        return students.toString();
    }
}

