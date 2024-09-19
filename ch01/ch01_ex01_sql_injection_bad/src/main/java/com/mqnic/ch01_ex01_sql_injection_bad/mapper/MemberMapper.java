package com.mqnic.ch01_ex01_sql_injection_bad.mapper;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM member WHERE id = #{id}")
    Member findMemberById(Long id);
}
