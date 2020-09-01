package com.he.order_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hewei
 * @date 2020/6/15
 */

@FeignClient(name="product-service")
public interface ProductClient
{
    @GetMapping("/product/v1/getProduct")
    String getById(@RequestParam("id") int id);
}
