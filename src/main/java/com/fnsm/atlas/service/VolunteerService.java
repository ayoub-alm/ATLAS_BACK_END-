package com.fnsm.atlas.service;

import com.fnsm.atlas.dto.request.VolunteerCreateDto;
import com.fnsm.atlas.dto.response.VolunteerDTO;
import com.fnsm.atlas.entity.Volunteer;
import com.fnsm.atlas.exception.DataNotFoundException;
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

    @Autowired
    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    // Create new volunteer
    public VolunteerDTO createVolunteer(VolunteerCreateDto volunteerCreateDto) {
        Volunteer volunteer = VolunteerMapper.toEntity(volunteerCreateDto);
        return VolunteerMapper.toDTO(volunteerRepository.save(volunteer));
    }

    public List<VolunteerDTO> getAllVolunteers() {
        List<Volunteer> volunteers = volunteerRepository.findAll();
        if (volunteers.isEmpty()) {
            throw new DataNotFoundException("لم يتم العثور على بيانات المتطوعين", 4004L);
        }
        return VolunteerMapper.toDTOList(volunteers);
    }

    public VolunteerDTO getVolunteerById(Long volunteerId) {
        Volunteer volunteer = volunteerRepository.findById(volunteerId)
                .orElseThrow(() -> new EntityNotFoundException("المتطوع غير موجود"));
        return VolunteerMapper.toDTO(volunteer);
    }
}
