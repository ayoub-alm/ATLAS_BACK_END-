package com.fnsm.atlas.controller;

import com.fnsm.atlas.dto.request.VolunteerCreateDto;
import com.fnsm.atlas.dto.response.VolunteerDTO;
import com.fnsm.atlas.exception.DataAlreadyExistsException;
import com.fnsm.atlas.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@CrossOrigin
public class VolunteerController {

    private final VolunteerService volunteerService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @GetMapping("")
    ResponseEntity<List<VolunteerDTO>> getAllVolunteers() {
        return ResponseEntity.ok(volunteerService.getAllVolunteers());
    }

    @GetMapping("/{volunteerId}")
    ResponseEntity<VolunteerDTO> getVolunteerById(@PathVariable Long volunteerId) {
        return ResponseEntity.ok(volunteerService.getVolunteerById(volunteerId));
    }

    @PostMapping("")
    public ResponseEntity<VolunteerDTO> createVolunteer(@RequestBody VolunteerCreateDto volunteerCreateDto) {
        try {
            return ResponseEntity.ok(volunteerService.createVolunteer(volunteerCreateDto));
        }catch (Exception e){
            throw  new DataAlreadyExistsException(e.getMessage(), 500L);
        }
    }
}
