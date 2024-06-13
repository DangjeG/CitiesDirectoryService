package com.example.cities_directory_service.Model;

import com.example.cities_directory_service.Controller.Model.CityRequest;
import com.example.cities_directory_service.Controller.Model.CityResponse;
import com.example.cities_directory_service.Repository.Model.CityEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {

    public City(Integer id,
                String country,
                String code,
                String name,
                Double latitude,
                Double longitude){
        this.id = id;
        this.country = country;
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    private Integer id;
    private String country;
    private String code;
    private String name;
    private Double latitude;
    private Double longitude;

    public static CityEntity toCityEntity(City city){
        return new CityEntity(
                city.id,
                city.country,
                city.code,
                city.name,
                city.latitude,
                city.longitude
        );
    }

    public static City fromCityEntity(CityEntity cityEntity){
        return new City(
                cityEntity.getId(),
                cityEntity.getCountry(),
                cityEntity.getCode(),
                cityEntity.getName(),
                cityEntity.getLatitude(),
                cityEntity.getLongitude()
        );
    }

    public static CityResponse toCityResponse(City city){
        return new CityResponse(
                city.id,
                city.country,
                city.code,
                city.name,
                city.latitude,
                city.longitude
        );
    }

    public static City fromCityRequest(CityRequest cityRequest){
        return new City(
                0,
                cityRequest.getCountry(),
                cityRequest.getCode(),
                cityRequest.getName(),
                cityRequest.getLatitude(),
                cityRequest.getLongitude()
        );
    }
}