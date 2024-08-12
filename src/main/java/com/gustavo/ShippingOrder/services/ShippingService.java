package com.gustavo.ShippingOrder.services;

import com.gustavo.ShippingOrder.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basic = order.getBasic();
        double shippingCost = 0.0;

        if(basic < 100.0) {
            shippingCost = 20;
        }else if(basic < 200.0) {
            shippingCost = 12;
        }

        return shippingCost;
    }
}
