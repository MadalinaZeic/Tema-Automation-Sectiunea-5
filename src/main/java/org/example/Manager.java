package org.example;

public class Manager extends WorkForce {

    private String password;

    public Manager(String name, String password){
        this.setName(name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
