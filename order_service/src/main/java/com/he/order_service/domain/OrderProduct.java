package com.he.order_service.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hewei
 * @date 2020/6/14
 */

public class OrderProduct implements Serializable
{
    /**
     * 订单id
     */
    private int orderId;
    /**
     * 流水号
     */
    private String serialNo;
    /**
     * 商品id
     */
    private int productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 用户姓名
     */
    private String userName;
    
    private Date createTime;

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public String getSerialNo()
    {
        return serialNo;
    }

    public void setSerialNo(String serialNo)
    {
        this.serialNo = serialNo;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}
