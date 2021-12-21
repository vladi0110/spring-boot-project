package com.vmarinov.backend.dto;

public class TransmissionDto {

    private int id;

    private String type;

    public TransmissionDto() {
    }

    public TransmissionDto(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransmissionDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
