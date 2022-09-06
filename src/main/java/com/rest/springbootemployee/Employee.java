package com.rest.springbootemployee;

public class Employee {

    private String name;
    private int id;
    private String gender;

    public Employee(String name, int id, String gender){
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public Object getId() {
        return null;
    }
}
