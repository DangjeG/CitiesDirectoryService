package com.example.cities_directory_service.Controller.Model;


import lombok.Getter;

@Getter
public class CityRequest {
    private String country;
    private String code;
    private String name;
    private Double latitude;
    private Double longitude;

}
