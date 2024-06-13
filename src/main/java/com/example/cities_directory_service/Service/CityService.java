package com.example.cities_directory_service.Service;

import com.example.cities_directory_service.Model.City;
import com.example.cities_directory_service.Repository.ICityRepository;
import com.example.cities_directory_service.Repository.Model.CityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private ICityRepository cityRepository;

    @Override
    public City getById(Integer id) {
        CityEntity entity = cityRepository.getOne(id);
        return City.fromCityEntity(entity);
    }

    @Override
    public List<City> getAll() {
        List<CityEntity> entities = cityRepository.findAll();
        return entities.stream().map(City::fromCityEntity).toList();
    }

    @Override
    public void create(City city) {
        CityEntity entity = City.toCityEntity(city);
        cityRepository.save(entity);
    }

    @Override
    public boolean update(City city, Integer id) {
        if (cityRepository.existsById(id)) {
            city.setId(id);
            cityRepository.save(City.toCityEntity(city));
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (cityRepository.existsById(id)) {
            cityRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
