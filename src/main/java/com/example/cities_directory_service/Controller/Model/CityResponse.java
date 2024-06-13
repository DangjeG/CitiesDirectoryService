package com.example.cities_directory_service.Controller.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityResponse {
    private Integer id;
    private String country;
    private String code;
    private String name;
    private Double latitude;
    private Double longitude;

    public CityResponse(Integer id,
                        String country,
                        String code,
                        String name,
                        Double latitude,
                        Double longitude) {
        this.id = id;
        this.country = country;
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
