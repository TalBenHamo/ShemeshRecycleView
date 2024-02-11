package com.example.shemeshresacleview;

public class item {

    String name;
    String description;
    int image;

    // Default constructor
    public item() {
    }

    public item(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    // Getter and setter methods..


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
