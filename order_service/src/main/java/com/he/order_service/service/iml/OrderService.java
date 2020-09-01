package com.he.order_service.service.iml;

import com.fasterxml.jackson.databind.JsonNode;
import com.he.order_service.domain.OrderProduct;
import com.he.order_service.service.IOrderService;
import com.he.order_service.service.ProductClient;
import com.he.order_service.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @author hewei
 * @date 2020/6/14
 */
@Service
public class OrderService implements IOrderService
{
   /* @Autowired
    private RestTemplate restTemplate;
*/

    @Autowired
    private ProductClient productClient;

    @Override
    public OrderProduct saveOrder(int userId, int productId)
    {

        String response = productClient.getById(productId);
        JsonNode jsonNode = JsonUtils.str2JsonNode(response);
        
        
        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setUserId(userId);
        orderProduct.setCreateTime(new Date());
        orderProduct.setSerialNo(UUID.randomUUID().toString());
        orderProduct.setProductId(Integer.parseInt(jsonNode.get("id").toString()));
        orderProduct.setProductName(jsonNode.get("name").toString());
        return orderProduct;
    }
}
