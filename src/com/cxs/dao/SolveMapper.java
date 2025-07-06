package com.cxs.dao;

import java.util.List;

import com.cxs.Pojo.QueryVo;
import com.cxs.Pojo.Solve;

public interface SolveMapper {
	public List<Solve> selectall(QueryVo vo);
	public Integer selectcount(QueryVo vo);
	public void deletesolve(Integer id);
	public void insertsolve(Solve solve);
}
