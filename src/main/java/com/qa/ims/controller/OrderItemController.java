package com.qa.ims.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.Utils;

public class OrderItemController implements CrudController<OrderItem>  {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private CustomerDAO customerDAO;
	private ItemDAO itemDAO;
	private OrderItemDAO orderItemDAO;
	private Utils utils;


	@Override
	public List<OrderItem> readAll() {
		List<OrderItem> orderItems = orderItemDAO.readAll();
		for (OrderItem orderItem : orderItems) {
			LOGGER.info(orderItem);
		}
		return orderItems;
	}

	@Override
	public OrderItem create() {
		LOGGER.info("Please enter the order id");
		Long orderId = utils.getLong();
		//here is where you would go to the next method to add the entry to the itemorders table
		LOGGER.info("Please enter the Item id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter the number of this item");
		Long numItems = utils.getLong();
		
		OrderDAO orderDAO = new OrderDAO();;
		CustomerDAO customerDAO = new CustomerDAO();
		ItemDAO itemDAO = new ItemDAO();;
		OrderItemDAO orderItemDAO = new OrderItemDAO();
		
		Order order = orderDAO.read(orderId);
		Long custId = order.getCustomerId();
		
		Item item = itemDAO.read(itemId);
		String itemName = item.getName();
		
		
		
		OrderItem orderItem = orderItemDAO.create(new OrderItem(orderId, itemId, itemName, numItems));
		LOGGER.info("Order Item created");
		return orderItem;
	}

	@Override
	public OrderItem update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
