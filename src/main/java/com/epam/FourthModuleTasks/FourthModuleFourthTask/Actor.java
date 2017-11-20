package com.epam.FourthModuleTasks.FourthModuleFourthTask;

import java.io.Serializable;

public class Actor implements Serializable{
    private String fullName;

    public Actor(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

}
