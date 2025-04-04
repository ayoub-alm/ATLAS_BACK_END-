package com.fnsm.atlas.service;

import com.fnsm.atlas.entity.Region;
import com.fnsm.atlas.repository.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    private final RegionRepository repository;

    public RegionService(RegionRepository repository) {
        this.repository = repository;
    }


    public List<Region> getAllRegions(){
        return this.repository.findAll();
    }
}
