package com.fnsm.atlas.repository;

import com.fnsm.atlas.entity.City;
import com.fnsm.atlas.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
