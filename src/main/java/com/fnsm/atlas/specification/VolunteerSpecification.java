package com.fnsm.atlas.specification;


import com.fnsm.atlas.entity.Volunteer;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class VolunteerSpecification {

    public static Specification<Volunteer> filterVolunteers(
            String gender, String cityId, String regionId, String roleId, String blood, String profession) {

        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (gender != null && !gender.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("sexId"), gender));
            }

            if (cityId != null && !cityId.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("cityId"), cityId));
            }

            if (regionId != null && !regionId.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("regionId"), regionId));
            }

            if (roleId != null && !roleId.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("roleId"), roleId));
            }

            if (blood != null && !blood.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("blood"), blood));
            }

            if (profession != null && !profession.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("profession"), profession));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
