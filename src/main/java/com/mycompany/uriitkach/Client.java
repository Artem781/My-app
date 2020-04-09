package com.mycompany.uriitkach;

public class Client {
    private String id;
    private String fullName;

    public Client() {
    }

    public Client(String id, String name) {
        this.id = id;
        this.fullName = name;
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
}
