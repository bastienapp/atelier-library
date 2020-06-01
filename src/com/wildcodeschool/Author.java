package com.wildcodeschool;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Author {

    private String firstName;
    private String lastName;
    private Date birthDate;

    public Author(String firstName, String lastName, Date birthDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = null;
    }

    public String fullName() {

        return this.firstName + " " + this.lastName;
    }

    public String authorInfos() {

        if (birthDate == null) {
            return fullName();
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat(" (MM/dd/yyyy)");
            String formattedDate = sdf.format(this.birthDate);
            return fullName() + formattedDate;
        }
    }
}
