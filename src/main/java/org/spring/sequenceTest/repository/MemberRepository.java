package org.spring.sequenceTest.repository;

import org.spring.sequenceTest.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
