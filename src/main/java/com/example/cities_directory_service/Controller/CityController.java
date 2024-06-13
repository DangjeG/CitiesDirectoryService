package com.example.cities_directory_service.Controller;


import com.example.cities_directory_service.Controller.Model.CityRequest;
import com.example.cities_directory_service.Controller.Model.CityResponse;
import com.example.cities_directory_service.Model.City;
import com.example.cities_directory_service.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;


    @GetMapping("/")
    public ResponseEntity<List<CityResponse>> getAll(){
        List<City> cities = cityService.getAll();
        List<CityResponse> responses = cities.stream().map(City::toCityResponse).toList();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityResponse> get(@PathVariable int id){
        City city = cityService.getById(id);

        if(city == null) return ResponseEntity.notFound().build();

        CityResponse response = City.toCityResponse(city);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CityRequest request){
        City city = City.fromCityRequest(request);
        cityService.create(city);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> update(@RequestBody CityRequest request, @PathVariable Integer id){
        City city = City.fromCityRequest(request);
        Boolean answer = cityService.update(city, id);
        return ResponseEntity.ok(answer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> update(@PathVariable Integer id){
        Boolean answer = cityService.delete(id);
        return ResponseEntity.ok(answer);
    }

}
