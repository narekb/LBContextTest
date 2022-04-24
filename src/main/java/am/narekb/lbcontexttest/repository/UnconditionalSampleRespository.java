package am.narekb.lbcontexttest.repository;

import am.narekb.lbcontexttest.domain.UnconditionalSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnconditionalSampleRespository extends JpaRepository<UnconditionalSample, Long> {
}
