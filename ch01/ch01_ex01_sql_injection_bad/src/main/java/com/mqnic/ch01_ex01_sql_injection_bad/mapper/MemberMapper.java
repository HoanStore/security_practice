package com.mqnic.ch01_ex01_sql_injection_bad.mapper;

import com.mqnic.ch01_ex01_sql_injection_bad.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM member WHERE id = ${id}")
    Member findMemberById(String id);

    /**
     * BAD CASE) SQL INJECTION에 노출됨
     * @param sex
     * @return
     */
//    @Select("SELECT * FROM member WHERE sex = ${sex}")
//    List<Member> findMemberBySex(String sex);

    /**
     * GOOD CASE) #{} 키워드를 쓰면 파라미터를 모두 문자열로 변환함.
     * @param sex
     * @return
     */
    @Select("SELECT * FROM member WHERE sex = #{sex}")
    List<Member> findMemberBySex(String sex);
}
