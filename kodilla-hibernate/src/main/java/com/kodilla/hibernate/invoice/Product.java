package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @GeneratedValue
    @Id
    private int id;
    private String name;

    @OneToMany
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
