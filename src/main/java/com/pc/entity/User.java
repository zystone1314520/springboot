package com.pc.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionID = 8655851615465363473L;
    private long id;
    private String username;
    private String password;

    public static long getSerialVersionID() {
        return serialVersionID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

