package com.vmarinov.backend.dto;


import java.util.Set;

public class RoleDto {

    private int id;

    private String name;

    private Set<RightDto> rights;

    public RoleDto() {
    }

    public RoleDto(int id, String name, Set<RightDto> rights) {
        this.id = id;
        this.name = name;
        this.rights = rights;
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

    public Set<RightDto> getRights() {
        return rights;
    }

    public void setRights(Set<RightDto> rights) {
        this.rights = rights;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rights=" + rights +
                '}';
    }
}
