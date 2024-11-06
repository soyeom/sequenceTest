package org.spring.sequenceTest.repository;

import org.spring.sequenceTest.entity.EducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<EducationEntity, Long> {
}
