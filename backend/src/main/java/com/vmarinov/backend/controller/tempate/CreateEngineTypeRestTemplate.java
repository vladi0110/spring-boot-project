package com.vmarinov.backend.controller.tempate;

import javax.validation.constraints.NotBlank;

public class CreateEngineTypeRestTemplate {

    @NotBlank
    private String engineType;

    public CreateEngineTypeRestTemplate() {
    }

    public CreateEngineTypeRestTemplate(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
