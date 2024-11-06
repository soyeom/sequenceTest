package org.spring.sequenceTest.repository;

import org.spring.sequenceTest.entity.CareerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerRepository extends JpaRepository<CareerEntity, Long> {
}
