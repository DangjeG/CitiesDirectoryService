package com.example.cities_directory_service.Repository.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "cities")
public class CityEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String country;

    @Column
    private String code;

    @Column
    private String name;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    public CityEntity(){}
    public CityEntity(Integer id, String country, String code, String name, Double latitude, Double longitude){
        this.id = id;
        this.country = country;
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
