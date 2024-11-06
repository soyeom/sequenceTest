package org.spring.sequenceTest.repository;

import org.spring.sequenceTest.entity.AwardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardRepository extends JpaRepository<AwardEntity, Long> {
}
