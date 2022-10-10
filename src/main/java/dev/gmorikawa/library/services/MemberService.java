package dev.gmorikawa.library.services;

import dev.gmorikawa.library.models.Member;
import dev.gmorikawa.library.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

@Service
public class MemberService {
    
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    public void insertMember(Member newMember) {
        memberRepository.save(newMember);
    }

    @Transactional
    public void updateMember(Member modifiedMember) {
        Member registeredMember = memberRepository.findById(modifiedMember.getId()).get();

        registeredMember.setName(modifiedMember.getName());
        registeredMember.setEmail(modifiedMember.getEmail());
        registeredMember.setTelephone(modifiedMember.getTelephone());
        registeredMember.setAddress(modifiedMember.getAddress());
    }

    public void deleteMember(Long memberId) {
        memberRepository.delete(memberRepository.findById(memberId).get());
    }

}
