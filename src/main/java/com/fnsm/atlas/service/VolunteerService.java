package com.fnsm.atlas.service;


import com.fnsm.atlas.dto.VolunteerCreateDto;
import com.fnsm.atlas.entity.Volunteer;
import com.fnsm.atlas.mapper.VolunteerMapper;
import com.fnsm.atlas.repository.VolunteerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;
    private final VolunteerMapper volunteerMapper;

    @Autowired
    public VolunteerService(VolunteerRepository volunteerRepository, VolunteerMapper volunteerMapper) {
        this.volunteerRepository = volunteerRepository;
        this.volunteerMapper = volunteerMapper;
    }

    // Create new volunteer
    public Volunteer createVolunteer(VolunteerCreateDto volunteerCreateDto) {
        Volunteer volunteer = volunteerMapper.toEntity(volunteerCreateDto);
        return volunteerRepository.save(volunteer);
    }

    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    public Volunteer getVolunteerById(Long volunteerId) throws  EntityNotFoundException{
        Optional<Volunteer> volunteer =  this.volunteerRepository.findById(volunteerId);
        if (volunteer.isPresent()){
            return volunteer.get();
        }else {
            throw new EntityNotFoundException("Volunteer not found");
        }
    }
}