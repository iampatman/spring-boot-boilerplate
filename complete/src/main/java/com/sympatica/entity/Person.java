package com.sympatica.entity;

/**
 * Created by NguyenTrung on 11/9/17.
 */
import org.springframework.data.annotation.Id;

public class Person {

    @Id private String id;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}