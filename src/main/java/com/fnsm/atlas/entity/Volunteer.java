package com.fnsm.atlas.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private LocalDate birthday;
    private String cin;
    private String email;
    private String phone;
    private String address;
    private String sexId;  // 'male' or 'female'
    private String blood;  // 'A+', 'A-', etc.
    private String roleId;
    private String scoutGradId;
    private String scoutMissionId;
    private String saveFromHarm; // 'yes' or 'no'
    private String healthStatus;
    private String schoolDegree;
    private String organisation;
    private String profession;
    private LocalDate inscriptionDate;
    private String familyStatus;
    private String cityId;
    private String regionId;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCin() {
        return cin;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSexId() {
        return sexId;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getBlood() {
        return blood;
    }

    public String getScoutGradId() {
        return scoutGradId;
    }

    public String getScoutMissionId() {
        return scoutMissionId;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public String getSchoolDegree() {
        return schoolDegree;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getSaveFromHarm() {
        return saveFromHarm;
    }

    public String getRegionId() {
        return regionId;
    }

    public String getCityId() {
        return cityId;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setScoutGradId(String scoutGradId) {
        this.scoutGradId = scoutGradId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setScoutMissionId(String scoutMissionId) {
        this.scoutMissionId = scoutMissionId;
    }

    public void setSaveFromHarm(String saveFromHarm) {
        this.saveFromHarm = saveFromHarm;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setSchoolDegree(String schoolDegree) {
        this.schoolDegree = schoolDegree;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public void setInscriptionDate(LocalDate inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    // Getters and Setters
}