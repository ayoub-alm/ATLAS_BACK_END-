package com.fnsm.atlas.service;

import com.fnsm.atlas.entity.City;
import com.fnsm.atlas.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities(){
        return this.cityRepository.findAll();
    }
}
