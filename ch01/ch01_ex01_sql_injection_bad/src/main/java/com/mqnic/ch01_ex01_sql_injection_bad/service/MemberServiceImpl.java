package com.mqnic.ch01_ex01_sql_injection_bad.service;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;
import com.mqnic.ch01_ex01_sql_injection_bad.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberSerivce {

    private final MemberMapper mapper;

    @Override
    public Member findById(String id) {
        return mapper.findMemberById(id);
    }

    @Override
    public List<Member> findBySex(String sex) {
        return mapper.findMemberBySex(sex);
    }
}
