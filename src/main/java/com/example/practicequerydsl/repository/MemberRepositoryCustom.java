package com.example.practicequerydsl.repository;

import com.example.practicequerydsl.dto.MemberSearchCondition;
import com.example.practicequerydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);

}
