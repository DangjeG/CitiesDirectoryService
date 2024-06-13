package com.example.cities_directory_service.Service;

import com.example.cities_directory_service.Model.City;

import java.util.List;

public interface ICityService {

    public City getById(Integer id);
    public List<City> getAll();
    public void create(City city);

    public boolean update(City city, Integer id);

    public boolean delete(Integer id);


}

