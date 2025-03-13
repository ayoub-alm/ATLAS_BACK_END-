package com.fnsm.atlas.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Map;

@Data
@AllArgsConstructor
public class VolunteerDashboardDTO {
    private Long totalVolunteers;
    private Long maleVolunteers;
    private Long femaleVolunteers;
    private Long activeVolunteers;
    private Long inactiveVolunteers;
    private Double averageAge;
    private Map<String, Long> volunteersPerRegion;
    private Map<String, Long> volunteersPerCity;
    private Map<String, Long> bloodGroupDistribution;
}
