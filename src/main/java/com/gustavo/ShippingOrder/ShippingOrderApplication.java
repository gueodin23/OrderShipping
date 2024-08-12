package com.gustavo.ShippingOrder;

import com.gustavo.ShippingOrder.entities.Order;
import com.gustavo.ShippingOrder.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class ShippingOrderApplication implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ShippingOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Order order = new Order(1309, 95.90, 0.0);

		System.out.println("Pedigo código: " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
	}
}
