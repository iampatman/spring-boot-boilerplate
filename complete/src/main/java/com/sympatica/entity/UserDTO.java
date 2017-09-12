package com.sympatica.entity;

/**
 * Created by NguyenTrung on 12/9/17.
 */
public class UserDTO {

    private String fullName;

    private String mobile;

    private String password;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
