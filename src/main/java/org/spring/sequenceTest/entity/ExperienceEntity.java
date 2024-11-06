package org.spring.sequenceTest.entity;

import jakarta.persistence.*;
import lombok.Data;

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


}
