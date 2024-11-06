package org.spring.sequenceTest.controller;

import lombok.RequiredArgsConstructor;
import org.spring.sequenceTest.dto.MemberDTO;
import org.spring.sequenceTest.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private final MemberService memberService;

    @PostMapping("/api/member/join")
    public String login(@RequestBody MemberDTO memberDTO){
        memberService.save(memberDTO);
        return "index";
    }
}
