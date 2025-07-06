package com.cxs.service;

import java.util.List;

import com.cxs.Pojo.Paid;
import com.cxs.Pojo.QueryVo;
import com.cxs.Pojo.Zulist;

public interface PaidService {
	public List<Paid> selectall(QueryVo vo);
	public Double selectsum(QueryVo vo);
	public void deletepaid(Integer id);
	public List<Zulist> findzuuserlist() throws Exception;
	public Zulist findzukezulist(Integer id);
	
}
