package org.spring.sequenceTest.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.spring.sequenceTest.entity.EducationEntity;
import org.spring.sequenceTest.entity.EducationEntity.*;
import org.spring.sequenceTest.entity.MemberEntity.Gender;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String user_id;
    private String user_pwd;
    private String name;
    private Date birth;
    private Gender gender;
    private String address;
    private String phone;
    private String email;
    private String introduction;
    private String webUrl;
    private String school_name;
    private String major;
    private Date entrance_date;
    private Date graduation_date;
    private Degree degree;
    private SkillCategory skill_category;
    private DesiredJob desired_job;
    private String activity_name;
    private Date activity_duration;
    private String activity_description;
    private String career_name;
    private Date career_duration;
    private String career_description;
    private String award_name;
    private Date award_duration;
    private String award_description;

}
