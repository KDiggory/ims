package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order>{
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private CustomerDAO customerDAO;
	private ItemDAO itemDAO;
	private Utils utils;


	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("Please enter the customer id");
		Long customerId = utils.getLong();
		LOGGER.info("Please enter the Item id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter the number of this item");
		Long numItems = utils.getLong();
		
		Customer cust = customerDAO.read(customerId);
		Item item = itemDAO.read(customerId);
		String customerSurname = cust.getSurname();
		String itemName = item.getName();
		Long totalCost = numItems * item.getCost();
		
		Order order = orderDAO.create(new Order(customerSurname, customerId, itemName, itemId,
				 numItems, totalCost));
		LOGGER.info("Order created");
		return order;
	}

	@Override
	public Order update() {
		System.out.println("You can only update the item or number of items in an order, "
				+ "if you want to change anything more please delete and make a new order.");
		
		LOGGER.info("Please enter the id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the item name you would like to update");
		String itemName = utils.getString();
		LOGGER.info("Please enter the number of this item you would like");
		Long numItems = utils.getLong();
		
		Order ord = orderDAO.read(id);
		String customerSurname = ord.getCustomerSurname();
		Long customerId = ord.getCustomerId();
		Long itemId = ord.getItemId();
		Item item = itemDAO.read(itemId);
		Long totalCost = numItems * item.getCost();
		
		Order order = orderDAO.update(new Order(customerSurname, customerId, itemName, itemId,
				 numItems, totalCost));
		LOGGER.info("Order Updated");
		return order;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		return customerDAO.delete(id);
	}

}
