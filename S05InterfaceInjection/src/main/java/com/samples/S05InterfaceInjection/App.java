package com.samples.S05InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S05InterfaceInjection.service.OrderService;

/**
 * Hello world!
 *
 */
public class App {
	private static final String List = null;

	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S05InterfaceInjection/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("orderservice");
		System.out.println(service);
		service.placeOrder();

	}
}