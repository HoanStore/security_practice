package com.mqnic.ch01_ex01_sql_injection_bad.controllers;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;
import com.mqnic.ch01_ex01_sql_injection_bad.service.MemberSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

        private final MemberSerivce memberSerivce;

        @GetMapping("/member")
        public List<Member> getMember(@RequestParam String sex) {
            return memberSerivce.findBySex(sex);
        }
}
