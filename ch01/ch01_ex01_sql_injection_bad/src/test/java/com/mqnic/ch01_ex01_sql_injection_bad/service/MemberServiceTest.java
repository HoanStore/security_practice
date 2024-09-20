package com.mqnic.ch01_ex01_sql_injection_bad.service;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberSerivce memberSerivce;

    @Test
    public void findByIdTest() {
        Member member = memberSerivce.findById("1");
        log.info(member.toString());
    }
}
