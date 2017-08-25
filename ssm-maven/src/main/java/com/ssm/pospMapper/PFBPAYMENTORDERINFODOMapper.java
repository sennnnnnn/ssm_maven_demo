package com.ssm.pospMapper;

import com.ssm.entity.PFBPAYMENTORDERINFODO;
import com.ssm.entity.PFBPAYMENTORDERINFODOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface PFBPAYMENTORDERINFODOMapper {
    int countByExample(PFBPAYMENTORDERINFODOExample example);

    int deleteByExample(PFBPAYMENTORDERINFODOExample example);

    int deleteByPrimaryKey(String id);

    int insert(PFBPAYMENTORDERINFODO record);

    int insertSelective(PFBPAYMENTORDERINFODO record);

    List<PFBPAYMENTORDERINFODO> selectByExample(PFBPAYMENTORDERINFODOExample example);

    PFBPAYMENTORDERINFODO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PFBPAYMENTORDERINFODO record, @Param("example") PFBPAYMENTORDERINFODOExample example);

    int updateByExample(@Param("record") PFBPAYMENTORDERINFODO record, @Param("example") PFBPAYMENTORDERINFODOExample example);

    int updateByPrimaryKeySelective(PFBPAYMENTORDERINFODO record);

    int updateByPrimaryKey(PFBPAYMENTORDERINFODO record);
    
  //根据用户id查询有效代金券个数
    @Select("select count(1)  from user_to_redeem u " +
            "where u.user_redeem_state='0' " +
            "  and u.user_id=#{userId}" +
            "  and (u.user_redeem_endtime is null or u.user_redeem_endtime  > now())")

    @Result(jdbcType = JdbcType.INTEGER)

    int queryUserRedeemCount(@Param("userId") long userId);
}