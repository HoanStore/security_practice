package com.mqnic.ch01_ex01_sql_injection_bad.service;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;

import java.util.List;

public interface MemberSerivce {

    Member findById(String id);

    List<Member> findBySex(String sex);
}
