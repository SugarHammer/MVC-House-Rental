package com.cxs.dao;

import java.util.List;

import com.cxs.Pojo.Paid;
import com.cxs.Pojo.QueryVo;

public interface PaidMapper {
public List<Paid> selectall(QueryVo vo);
public Double selectsum(QueryVo vo);
public void deletepaid(Integer id);
public void insertpaid(Paid paid);
}
