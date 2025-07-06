package com.cxs.service;

import java.util.List;

import com.cxs.Pojo.Paid;
import com.cxs.Pojo.QueryVo;
import com.cxs.Pojo.Topaid;

public interface TopaidService {
	public void inserttopaid(Topaid topaid);
	public List<Topaid> findtopaid(QueryVo vo);
	public Topaid findbyid(Integer id);
	public void gotopay(Integer id,Paid paid);
}
