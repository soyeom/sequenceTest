package org.spring.sequenceTest.service;

import lombok.RequiredArgsConstructor;
import org.spring.sequenceTest.dto.MemberDTO;
import org.spring.sequenceTest.entity.*;
import org.spring.sequenceTest.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;
    private final AwardRepository awardRepository;
    private final CareerRepository careerRepository;
    private final EducationRepository educationRepository;
    private final ExperienceRepository experienceRepository;

    public void save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        ExperienceEntity experienceEntity = ExperienceEntity.toExperienceEntity(memberDTO);
        EducationEntity educationEntity = EducationEntity.toEducationEntity(memberDTO);
        CareerEntity careerEntity = CareerEntity.toCareerEntity(memberDTO);
        AwardEntity awardEntity = AwardEntity.toAwardEntity(memberDTO);

        memberRepository.save(memberEntity);
        experienceRepository.save(experienceEntity);
        educationRepository.save(educationEntity);
        careerRepository.save(careerEntity);
        awardRepository.save(awardEntity);
    }

}
