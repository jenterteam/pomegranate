package com.pom.core.persistence;

import com.pom.core.persistence.enums.OrderType;

public class PropertyOrder {
    /**
     * 1
     */
    final private String propertyName;
    /**
     * 2
     */
    final private OrderType orderType;

    /**
     * 3
     * @param propertyName
     * @param orderType
     */
    public PropertyOrder(String propertyName, OrderType orderType) {
        super();
        this.propertyName = propertyName;
        this.orderType = orderType;
    }

    /**
     * 4
     * @param propertyName
     */
    public PropertyOrder(String propertyName) {
        super();
        this.propertyName = propertyName;
        this.orderType = OrderType.ASC;
    }

    /**
     * 5
     * @return
     */
    public String getPropertyName() {
        return propertyName;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
