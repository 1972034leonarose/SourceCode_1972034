package com.leona.entity;
/**
 * @author Leona Rose
 */

public class Department {

    private int id;
    private String name;

    public Department(){
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // karena ada combobox

    @Override
    public String toString() {
        return name;
    }
}
