package com.fnsm.atlas.controller;

import com.fnsm.atlas.dto.response.VolunteerDashboardDTO;
import com.fnsm.atlas.service.VolunteerDashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin
public class VolunteerDashboardController {

    private final VolunteerDashboardService volunteerDashboardService;

    public VolunteerDashboardController(VolunteerDashboardService volunteerDashboardService) {
        this.volunteerDashboardService = volunteerDashboardService;
    }

    @GetMapping("/volunteers")
    public ResponseEntity<VolunteerDashboardDTO> getVolunteerDashboard(
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) String cityId,
            @RequestParam(required = false) String regionId,
            @RequestParam(required = false) String roleId,
            @RequestParam(required = false) String blood,
            @RequestParam(required = false) String profession) {

        return ResponseEntity.ok(volunteerDashboardService.getVolunteerDashboard(
                gender, cityId, regionId, roleId, blood, profession));
    }
}
