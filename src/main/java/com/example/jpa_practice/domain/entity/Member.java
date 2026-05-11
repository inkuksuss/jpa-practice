package com.example.jpa_practice.domain.entity;

import com.example.jpa_practice.domain.entity.base.BaseEntity;
import jakarta.persistence.*;

@Entity(name = "member")
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private Long memberTypeId;

    @Column(columnDefinition = "CHAR(1)")
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    protected Member() {}

    public static Member of(String name, String phoneNumber, Long memberTypeId, String gender) {
        Member member = new Member();
        member.name = name;
        member.phoneNumber = phoneNumber;
        member.memberTypeId = memberTypeId;
        member.gender = gender;

        return member;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Long getMemberTypeId() {
        return memberTypeId;
    }

    public String getGender() {
        return gender;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", memberTypeId=" + memberTypeId +
                ", gender='" + gender + '\'' +
                ", team=" + team +
                '}';
    }
}
