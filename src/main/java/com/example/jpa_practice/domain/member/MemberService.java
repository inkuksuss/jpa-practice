package com.example.jpa_practice.domain.member;

import com.example.jpa_practice.domain.entity.Member;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member findByName(String name) {
        Optional<Member> findMember = memberRepository.findByName(name);

        if (findMember.isEmpty()) {
            throw new RuntimeException("Member not found with name: " + name);
        }

        return findMember.get();
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }
}
