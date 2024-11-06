package org.spring.sequenceTest.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.attoparser.dom.Text;
import org.checkerframework.checker.units.qual.C;
import org.spring.sequenceTest.dto.MemberDTO;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false, length = 45, unique = true)
    private String userId;

    @Column(name="user_pwd", nullable = false, length = 150)
    private String userPwd;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "birth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birth;

    @Column(name="gender", nullable = false, columnDefinition = "ENUM('M','F')")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @Column(name = "phone", nullable = false, length = 11)
    private String phone;

    @Column(name = "email", nullable = false, length = 45, unique = true)
    private String email;

    @Column(name="introduction", nullable = false)
    private String introduction;

    @Column(name="web_url", nullable = false, length = 150)
    private String webUrl;

    // AwardEntity와의 일대다 관계 설정
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AwardEntity> awards;

    // CareerEntity와의 일대다 관계 설정
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CareerEntity> careers;

    //ExperienceEntity와의 일대다 관계 설정
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExperienceEntity> experiences;

    @OneToOne(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private EducationEntity education;

    public enum Gender{
        M,F
    }

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUserId(memberDTO.getUser_id());
        memberEntity.setUserPwd(memberDTO.getUser_pwd());
        memberEntity.setName(memberDTO.getName());
        memberEntity.setBirth(memberDTO.getBirth());
        memberEntity.setGender(Gender.valueOf(memberDTO.getGender().toString().toUpperCase()));
        memberEntity.setAddress(memberDTO.getAddress());
        memberEntity.setPhone(memberDTO.getPhone());
        memberEntity.setEmail(memberDTO.getEmail());
        return memberEntity;
    }

}
