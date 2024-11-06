package org.spring.sequenceTest.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.spring.sequenceTest.dto.MemberDTO;

import java.util.Date;

@Entity
@Data
@Table(name = "award")
public class AwardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long awardId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private MemberEntity member;

    @Column
    private String awardName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date awardDuration;

    @Column
    private String awardDescription;

    public static AwardEntity toAwardEntity(MemberDTO memberDTO){
        AwardEntity awardEntity = new AwardEntity();

        awardEntity.setAwardName(memberDTO.getAward_name());
        awardEntity.setAwardDuration(memberDTO.getAward_duration());
        awardEntity.setAwardDescription(memberDTO.getAward_description());

        return awardEntity;
    }

}
