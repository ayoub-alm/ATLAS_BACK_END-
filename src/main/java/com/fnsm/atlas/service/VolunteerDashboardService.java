package com.fnsm.atlas.service;

import com.fnsm.atlas.dto.response.VolunteerDashboardDTO;
import com.fnsm.atlas.entity.Volunteer;
import com.fnsm.atlas.repository.VolunteerRepository;
import com.fnsm.atlas.specification.VolunteerSpecification;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class VolunteerDashboardService {

    private final VolunteerRepository volunteerRepository;

    public VolunteerDashboardService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public VolunteerDashboardDTO getVolunteerDashboard(
            String gender, String cityId, String regionId, String roleId, String blood, String profession) {

        // Create a specification for filtering volunteers
        Specification<Volunteer> spec = VolunteerSpecification.filterVolunteers(gender, cityId, regionId, roleId, blood, profession);

        // Fetch filtered volunteers with sorting
        List<Volunteer> filteredVolunteers = volunteerRepository.findAll(spec, Sort.by(Sort.Direction.ASC, "id"));

        Long totalVolunteers = (long) filteredVolunteers.size();
        Long maleVolunteers = filteredVolunteers.stream().filter(v -> "male".equalsIgnoreCase(v.getSexId())).count();
        Long femaleVolunteers = filteredVolunteers.stream().filter(v -> "female".equalsIgnoreCase(v.getSexId())).count();
        Long activeVolunteers = totalVolunteers; // Assuming all are active
        Long inactiveVolunteers = 0L; // Adjust logic if needed

        // Calculate average age
        Double averageAge = filteredVolunteers.stream()
                .filter(v -> v.getBirthday() != null)
                .mapToDouble(v -> Period.between(v.getBirthday(), LocalDate.now()).getYears())
                .average()
                .orElse(0.0);

        // Count volunteers per region
        Map<String, Long> volunteersPerRegion = filteredVolunteers.stream()
                .filter(v -> v.getRegion() != null)  // ✅ Ensure Region is not null
                .collect(Collectors.groupingBy(v -> v.getRegion().getName(), Collectors.counting()));

        // Count volunteers per city
        Map<String, Long> volunteersPerCity = filteredVolunteers.stream()
                .filter(v -> v.getCity() != null)  // ✅ Ensure City is not null
                .collect(Collectors.groupingBy(v -> v.getCity().getName(), Collectors.counting()));

        // Count blood group distribution
        Map<String, Long> bloodGroupDistribution = filteredVolunteers.stream()
                .filter(v -> v.getBlood() != null)
                .collect(Collectors.groupingBy(Volunteer::getBlood, Collectors.counting()));

        return new VolunteerDashboardDTO(
                totalVolunteers,
                maleVolunteers,
                femaleVolunteers,
                activeVolunteers,
                inactiveVolunteers,
                averageAge,
                volunteersPerRegion,
                volunteersPerCity,
                bloodGroupDistribution
        );
    }
}
