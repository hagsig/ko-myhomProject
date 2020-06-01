package com.myhome.www.store.service.impl;

import com.myhome.www.store.dto.OrderDetail;
import com.myhome.www.store.dto.OrderHistory;

public interface OrderDao {

	//주문서 등록
	int insertOrder(OrderDetail orderDetail);
	//주문내역 등록
	int insertOrderHistory(OrderHistory orderHistory);
}
