package com.fnsm.atlas.mapper;

import com.fnsm.atlas.dto.VolunteerCreateDto;
import com.fnsm.atlas.entity.Volunteer;
import org.springframework.stereotype.Component;

@Component
public class VolunteerMapper {

    // Map DTO to Entity
    public Volunteer toEntity(VolunteerCreateDto dto) {
        Volunteer volunteer = new Volunteer();
        volunteer.setName(dto.name);
        volunteer.setLastName(dto.lastName);
        volunteer.setBirthday(dto.getBirthday());
        volunteer.setCin(dto.getCin());
        volunteer.setEmail(dto.getEmail());
        volunteer.setPhone(dto.getPhone());
        volunteer.setAddress(dto.getAddress());
        volunteer.setSexId(dto.getSexId());
        volunteer.setBlood(dto.getBlood());
        volunteer.setRoleId(dto.getRoleId());
        volunteer.setScoutGradId(dto.getScoutGradId());
        volunteer.setScoutMissionId(dto.getScoutMissionId());
        volunteer.setSaveFromHarm(dto.getSaveFromHarm());
        volunteer.setHealthStatus(dto.getHealthStatus());
        volunteer.setSchoolDegree(dto.getSchoolDegree());
        volunteer.setOrganisation(dto.getOrganisation());
        volunteer.setProfession(dto.getProfession());
        volunteer.setInscriptionDate(dto.getInscriptionDate());
        volunteer.setFamilyStatus(dto.getFamilyStatus());
        volunteer.setCityId(dto.getCityId());
        volunteer.setRegionId(dto.getRegionId());
        return volunteer;
    }

    // Map Entity to DTO
    public VolunteerCreateDto toDto(Volunteer volunteer) {
        VolunteerCreateDto dto = new VolunteerCreateDto();
        dto.setName(volunteer.getName());
        dto.setLastName(volunteer.getLastName());
        dto.setBirthday(volunteer.getBirthday());
        dto.setCin(volunteer.getCin());
        dto.setEmail(volunteer.getEmail());
        dto.setPhone(volunteer.getPhone());
        dto.setAddress(volunteer.getAddress());
        dto.setSexId(volunteer.getSexId());
        dto.setBlood(volunteer.getBlood());
        dto.setRoleId(volunteer.getRoleId());
        dto.setScoutGradId(volunteer.getScoutGradId());
        dto.setScoutMissionId(volunteer.getScoutMissionId());
        dto.setSaveFromHarm(volunteer.getSaveFromHarm());
        dto.setHealthStatus(volunteer.getHealthStatus());
        dto.setSchoolDegree(volunteer.getSchoolDegree());
        dto.setOrganisation(volunteer.getOrganisation());
        dto.setProfession(volunteer.getProfession());
        dto.setInscriptionDate(volunteer.getInscriptionDate());
        dto.setFamilyStatus(volunteer.getFamilyStatus());
        dto.setCityId(volunteer.getCityId());
        dto.setRegionId(volunteer.getRegionId());
        return dto;
    }
}