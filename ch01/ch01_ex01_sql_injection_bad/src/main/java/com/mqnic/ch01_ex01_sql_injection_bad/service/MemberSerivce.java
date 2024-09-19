package com.mqnic.ch01_ex01_sql_injection_bad.service;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;

public interface MemberSerivce {

    Member findById(Long id);
}
