package org.spring.sequenceTest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "education")
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private MemberEntity member;

    @Column(name = "school_name", nullable = false, length = 100)
    private String schoolName;

    @Column(name = "major", nullable = false, length = 50)
    private String major;

    @Column(name = "entrance_date")
    @Temporal(TemporalType.DATE)
    private Date entranceDate;

    @Column(name = "graduation_date")
    @Temporal(TemporalType.DATE)
    private Date graduationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "degree", nullable = false)
    private Degree degree;

    @Enumerated(EnumType.STRING)
    @Column(name = "skill_category", nullable = false)
    private SkillCategory skillCategory;

    @Enumerated(EnumType.STRING)
    @Column(name = "desired_job", nullable = false)
    private DesiredJob desiredJob;

    public enum Degree {
        ENROLLMENT, LEAVE_OF_ABSENCE, GRADUATION, MASTER, DOCTORATE, EXPELLED, DROPOUT;
    }

    public enum SkillCategory {
        ADOBE_ILLUSTRATOR, ADOBE_PHOTOSHOP, ADOBE_INDESIGN, JAVASCRIPT, TYPESCRIPT;
    }

    public enum DesiredJob {
        UI_UX_DESIGN, FRONT_END, BACK_END, PM;
    }


}
