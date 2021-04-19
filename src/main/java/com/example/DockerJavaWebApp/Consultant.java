package com.example.DockerJavaWebApp;

import java.util.List;

public class Consultant {

    String name;
    String occupation;
    List<String> coordinates;
    String description;
    String photo;
    String background;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
