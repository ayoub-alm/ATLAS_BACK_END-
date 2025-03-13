package com.fnsm.atlas.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VolunteerDTO {
    private Long id;
    private String name;
    private String lastName;
    private LocalDate birthday;
    private String cin;
    private String email;
    private String phone;
    private String address;
    private String sexId;
    private String blood;
    private String roleId;
    private String scoutGradId;
    private String scoutMissionId;
    private String saveFromHarm;
    private String healthStatus;
    private String schoolDegree;
    private String organisation;
    private String profession;
    private LocalDate inscriptionDate;
    private String familyStatus;
    private String cityId;
    private String regionId;
}
