package com.fnsm.atlas.repository;

import com.fnsm.atlas.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
