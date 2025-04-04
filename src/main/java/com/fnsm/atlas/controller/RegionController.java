package com.fnsm.atlas.controller;

import com.fnsm.atlas.entity.City;
import com.fnsm.atlas.entity.Region;
import com.fnsm.atlas.service.CityService;
import com.fnsm.atlas.service.RegionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/regions")
@CrossOrigin
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }


    @GetMapping()
    public List<Region> getAllRegions(){
        return this.regionService.getAllRegions();
    }
}
