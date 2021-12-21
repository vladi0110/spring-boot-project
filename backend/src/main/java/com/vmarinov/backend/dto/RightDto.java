package com.vmarinov.backend.dto;

public class RightDto {

    private int id;

    private String name;

    public RightDto() {
    }

    public RightDto(int id, String name) {
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

    @Override
    public String toString() {
        return "RightDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
