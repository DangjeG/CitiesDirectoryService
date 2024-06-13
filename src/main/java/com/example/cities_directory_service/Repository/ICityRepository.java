package com.example.cities_directory_service.Repository;

import com.example.cities_directory_service.Repository.Model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<CityEntity, Integer> {}
