package com.cxs.dao;

import java.util.List;

import com.cxs.Pojo.Applyout;

public interface ApplyoutMapper {
	public void insertapplyout(Applyout applyout);
	List<Applyout> findallapplyout();
	public void updateapplyout(Applyout applyout);
	public void updateapplyoutbyhouse(Applyout applyout);
	public Applyout findbyid(Integer id);
	public void deleteapplyout(Integer id);
}
