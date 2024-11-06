package org.spring.sequenceTest.service;

import lombok.RequiredArgsConstructor;
import org.spring.sequenceTest.dto.MemberDTO;
import org.spring.sequenceTest.entity.MemberEntity;
import org.spring.sequenceTest.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
}
