package org.spring.sequenceTest.repository;

import org.spring.sequenceTest.entity.ExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<ExperienceEntity, Long> {
}
