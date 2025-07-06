package com.cxs.service;

import java.util.List;

import com.cxs.Pojo.Checkout;

public interface CheckoutService {
public void insertcheckout(Checkout checkout);
public List<Checkout> getallcheckout();
public void deletecheckout(Integer id);
}
