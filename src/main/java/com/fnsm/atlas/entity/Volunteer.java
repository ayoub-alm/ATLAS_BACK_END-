package com.fnsm.atlas.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder @Getter @Setter
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


    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "region_id")
    private Region region;

    // Getters and Setters
}