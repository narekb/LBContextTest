package am.narekb.lbcontexttest.repository;

import am.narekb.lbcontexttest.domain.ConditionalSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionalSampleRepository extends JpaRepository<ConditionalSample, Long> {
}
