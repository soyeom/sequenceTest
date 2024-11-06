package org.spring.sequenceTest.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.spring.sequenceTest.dto.MemberDTO;

import java.util.Date;

@Data
@Entity
@Table(name = "experience")
public class ExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private MemberEntity member;

    @Column
    private String activityName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date activityDuration;

    @Column
    private String activityDescription;

    public static ExperienceEntity toExperienceEntity(MemberDTO memberDTO){
        ExperienceEntity experienceEntity = new ExperienceEntity();

        experienceEntity.setActivityName(memberDTO.getActivity_name());
        experienceEntity.setActivityDuration(memberDTO.getActivity_duration());
        experienceEntity.setActivityDescription(memberDTO.getActivity_description());
        return experienceEntity;
    }

}
