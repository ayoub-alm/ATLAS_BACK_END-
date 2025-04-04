package com.fnsm.atlas.controller;

import com.fnsm.atlas.entity.City;
import com.fnsm.atlas.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Controller
@RequestMapping("/api/cities")
@CrossOrigin
public class CitiesController {
    private final CityService cityService;

    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping()
    public List<City> getAllCities(){
        return this.cityService.getAllCities();
    }
}
