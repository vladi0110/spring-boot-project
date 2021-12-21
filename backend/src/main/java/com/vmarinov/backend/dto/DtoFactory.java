package com.vmarinov.backend.dto;

import com.vmarinov.backend.entity.*;

import java.util.stream.Collectors;

public final class DtoFactory {

    private DtoFactory() throws IllegalAccessException{
        throw new IllegalAccessException("No instance for you!");
    }

    public static EngineTypeDto toDto(EngineType engineType) {
        return new EngineTypeDto(
                engineType.getId(),
                engineType.getType()
        );
    }

    public static EuroStandardDto toDto(EuroStandard euroStandard) {
        return new EuroStandardDto(
                euroStandard.getId(),
                euroStandard.getType()
        );
    }

    public static PictureDto toDto(Picture picture) {
        return new PictureDto(
                picture.getId(),
                picture.getLocation()
        );
    }

    public static RightDto toDto(Right right) {
        return new RightDto(
                right.getId(),
                right.getName()
        );
    }

    public static RoleDto toDto(Role role) {
        return new RoleDto(
                role.getId(),
                role.getName(),
                role.getRights().stream().map(DtoFactory::toDto).collect(Collectors.toSet())
        );
    }

    public static SpecificationDto toDto(Specification specification) {
        return new SpecificationDto(
                specification.getId(),
                specification.getCategory(),
                specification.getName()
        );
    }

    public static TransmissionDto toDto(Transmission transmission) {
        return new TransmissionDto(
                transmission.getId(),
                transmission.getType()
        );
    }

    public static TypeDto toDto(Type type) {
        return new TypeDto(
                type.getId(),
                type.getType()
        );
    }

    public static UserDto toDto(User user) {
        return new UserDto(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getPhoneNumber(),
                toDto(user.getRole())
        );
    }

    public static AdvertDto toDto(Advert advert) {
        return new AdvertDto(

        );
    }

    public static AdvertShortDto toShortDto(Advert advert) {
        return new AdvertShortDto(

        );
    }


}
