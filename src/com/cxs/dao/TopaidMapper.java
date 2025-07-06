package com.cxs.dao;

import java.util.List;

import com.cxs.Pojo.QueryVo;
import com.cxs.Pojo.Topaid;

public interface TopaidMapper {
public void inserttopaid(Topaid topaid);
public List<Topaid> findtopaid(QueryVo vo);
public Topaid findbyid(Integer id);
public void deletetopaid(Integer id);
}
