package org.spring.sequenceTest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "career")
public class CareerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long career_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private MemberEntity member;

    @Column(name = "career_name", length = 100)
    private String careerName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date careerDuration;

    @Column
    private String careerDescription;
}
