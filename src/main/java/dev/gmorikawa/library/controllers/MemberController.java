package dev.gmorikawa.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gmorikawa.library.models.Member;
import dev.gmorikawa.library.services.MemberService;

@RestController
@RequestMapping(path = "api/v1/member")
public class MemberController {
    
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    @PostMapping
    public void registerNewMember(@RequestBody Member newMember) {
        memberService.insertMember(newMember);
    }

    @DeleteMapping(path = "{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
    }

    @PutMapping
    public void modifyMember(@RequestBody Member modifiedMember) {
        memberService.updateMember(modifiedMember);
    }
}
