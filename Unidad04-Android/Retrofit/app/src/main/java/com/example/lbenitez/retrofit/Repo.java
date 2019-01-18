package com.example.lbenitez.retrofit;

public class Repo {

    private String name;

    public Repo(String name) {

        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "name='" + name + '\'' +
                '}';
    }
}
