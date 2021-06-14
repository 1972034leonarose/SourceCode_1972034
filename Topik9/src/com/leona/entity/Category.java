package com.leona.entity;

/**
 * @author Leona Rose
 */

import java.util.*;

public class Category {
    int id;
    String name;
    HashSet<String> items = new HashSet();

    public Category(){
    }

    public Category(int id, String name) {
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

    public HashSet<String> getItems() {
        return items;
    }

    public void setItems(HashSet<String> items) {
        this.items = items;
    }

    public String toString(){
        return name;
    }
}
