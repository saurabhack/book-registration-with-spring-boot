package registrationSystem.registration.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import registrationSystem.registration.entity.Library;

public interface repository extends JpaRepository<Library, Integer> {

}
