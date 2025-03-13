package com.fnsm.atlas.dto.request;

import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class VolunteerCreateDto {
    public String name;
    public String lastName;
    public LocalDate birthday;
    public String cin;
    public String email;
    public String phone;
    public String address;
    public String sexId;  // 'male' or 'female'
    public String blood;  // 'A+', 'A-', etc.
    public String roleId;
    public String scoutGradId;
    public String scoutMissionId;
    public String saveFromHarm; // 'yes' or 'no'
    public String healthStatus;
    public String schoolDegree;
    public String organisation;
    public String profession;
    public LocalDate inscriptionDate;
    public String familyStatus;
    public Long cityId;
    public Long regionId;

}