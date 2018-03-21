package com.zinios.rdc.redisDemoApp.model;

import java.io.Serializable;

public class User implements Serializable {
    private String userId;
    private String userName;
    private Long salary;

    public User(String userId, String userName, Long salary) {
        this.userId = userId;
        this.userName = userName;
        this.salary = salary;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
