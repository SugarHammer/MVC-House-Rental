package com.cxs.dao;

import java.util.List;

import com.cxs.Pojo.Checkout;

public interface CheckoutMapper {
	public void insertcheckout(Checkout checkout);
	public List<Checkout> getallcheckout();
	public void deletecheckout(Integer id);
}
