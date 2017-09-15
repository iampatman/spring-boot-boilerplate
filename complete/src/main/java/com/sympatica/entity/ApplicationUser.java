package com.sympatica.entity;

import javax.persistence.*;

/**
 * Created by NguyenTrung on 11/9/17.
 */

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "User")
@Embeddable
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;

    private String fullName;

    private String email;

    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
