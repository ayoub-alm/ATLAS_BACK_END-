package com.fnsm.atlas.repository;

import com.fnsm.atlas.entity.Volunteer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    List<Volunteer> findAll(Specification<Volunteer> spec, Sort id);
    // Add custom queries if needed
}