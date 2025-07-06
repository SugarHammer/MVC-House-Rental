package com.cxs.dao;

import java.util.List;

import com.cxs.Pojo.Apply;
import com.cxs.Pojo.Applyout;

public interface ApplyMapper {
	void insertapply(Apply apply);
	public List<Apply> findapplylist() throws Exception;
	Apply findbyhouse_id(String house_id);
	public void deletebyhouse_id(String house_id);
	public void updateapplyout(Applyout applyout);
}
