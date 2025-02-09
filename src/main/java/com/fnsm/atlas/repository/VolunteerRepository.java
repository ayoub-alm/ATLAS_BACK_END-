package com.fnsm.atlas.repository;

import com.fnsm.atlas.entity.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    // Add custom queries if needed
}