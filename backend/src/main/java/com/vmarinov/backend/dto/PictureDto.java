package com.vmarinov.backend.dto;

public class PictureDto {

    private int id;

    private String location;

    public PictureDto() {
    }

    public PictureDto(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PictureDto{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
