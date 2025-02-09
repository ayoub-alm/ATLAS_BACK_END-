package com.fnsm.atlas.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Service;

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
    public String cityId;
    public String regionId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    public String getScoutGradId() {
        return scoutGradId;
    }

    public void setScoutGradId(String scoutGradId) {
        this.scoutGradId = scoutGradId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getScoutMissionId() {
        return scoutMissionId;
    }

    public void setScoutMissionId(String scoutMissionId) {
        this.scoutMissionId = scoutMissionId;
    }

    public String getSaveFromHarm() {
        return saveFromHarm;
    }

    public void setSaveFromHarm(String saveFromHarm) {
        this.saveFromHarm = saveFromHarm;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getSchoolDegree() {
        return schoolDegree;
    }

    public void setSchoolDegree(String schoolDegree) {
        this.schoolDegree = schoolDegree;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(LocalDate inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
}