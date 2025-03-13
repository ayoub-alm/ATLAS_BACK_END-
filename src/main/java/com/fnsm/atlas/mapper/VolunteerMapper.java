package com.fnsm.atlas.mapper;

import com.fnsm.atlas.dto.request.VolunteerCreateDto;
import com.fnsm.atlas.dto.response.VolunteerDTO;
import com.fnsm.atlas.entity.City;
import com.fnsm.atlas.entity.Region;
import com.fnsm.atlas.entity.Volunteer;

import java.util.List;
import java.util.stream.Collectors;

public class VolunteerMapper {

    // Convert entity to DTO
    public static VolunteerDTO toDTO(Volunteer volunteer) {
        if (volunteer == null) {
            return null;
        }

        return new VolunteerDTO(
                volunteer.getId(),
                volunteer.getName(),
                volunteer.getLastName(),
                volunteer.getBirthday(),
                volunteer.getCin(),
                volunteer.getEmail(),
                volunteer.getPhone(),
                volunteer.getAddress(),
                volunteer.getSexId(),
                volunteer.getBlood(),
                volunteer.getRoleId(),
                volunteer.getScoutGradId(),
                volunteer.getScoutMissionId(),
                volunteer.getSaveFromHarm(),
                volunteer.getHealthStatus(),
                volunteer.getSchoolDegree(),
                volunteer.getOrganisation(),
                volunteer.getProfession(),
                volunteer.getInscriptionDate(),
                volunteer.getFamilyStatus(),
                volunteer.getCity().getName(),
                volunteer.getRegion().getName()
        );
    }

    // Convert DTO to entity
    public static Volunteer toEntity(VolunteerCreateDto dto) {
        if (dto == null) {
            return null;
        }

        Volunteer volunteer = new Volunteer();
        volunteer.setName(dto.getName());
        volunteer.setLastName(dto.getLastName());
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
        volunteer.setCity(City.builder().id(dto.getCityId()).build());
        volunteer.setRegion(Region.builder().id(dto.getRegionId()).build());

        return volunteer;
    }

    // Convert list of entities to DTOs
    public static List<VolunteerDTO> toDTOList(List<Volunteer> volunteers) {
        return volunteers.stream().map(VolunteerMapper::toDTO).collect(Collectors.toList());
    }
}
