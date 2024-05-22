package com.hanuldure.project.mapper;

import com.hanuldure.project.dto.MemberDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProfileMapper {

    @Select("SELECT user_phone, user_region, user_intro FROM user WHERE user_seq = #{user_seq}")
    MemberDTO selectUserDetails(int user_seq);
}
