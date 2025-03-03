package com.fnsm.atlas.controller;

import com.fnsm.atlas.dto.VolunteerCreateDto;
import com.fnsm.atlas.entity.Volunteer;
import com.fnsm.atlas.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@CrossOrigin
public class VolunteerController  {

    private final VolunteerService volunteerService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }



    @GetMapping("")
    ResponseEntity<List<Volunteer>> getAllVolunteers(){
        return ResponseEntity.ok(volunteerService.getAllVolunteers());
    }


    @GetMapping("/{volunteerId}")
    ResponseEntity<Volunteer> getVolunteerById(@PathVariable Long volunteerId){
        return ResponseEntity.ok(volunteerService.getVolunteerById(volunteerId  ));
    }

    // Endpoint to create a new volunteer
    @PostMapping("")
    public ResponseEntity<Volunteer> createVolunteer(@RequestBody VolunteerCreateDto volunteerCreateDto) {
        Volunteer volunteer = volunteerService.createVolunteer(volunteerCreateDto);
        return ResponseEntity.ok(volunteer);
    }
}