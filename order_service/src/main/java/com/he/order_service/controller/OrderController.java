package com.he.order_service.controller;

import com.he.order_service.domain.OrderProduct;
import com.he.order_service.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hewei
 * @date 2020/6/14
 */
@RestController
@RequestMapping("/order/v1/")
public class OrderController
{
    @Autowired
    private IOrderService orderService;

    @RequestMapping("save")
    public OrderProduct saveOrder(@RequestParam("userId") int userId, @RequestParam("productId") int productId)
    {
        OrderProduct result = orderService.saveOrder(userId, productId);
        return result;
    }
}
