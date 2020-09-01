package com.he.order_service.service;

import com.he.order_service.domain.OrderProduct;

/**
 * @author hewei
 * @date 2020/6/14
 */
public interface IOrderService
{
    OrderProduct saveOrder(int userId, int productId);
}
