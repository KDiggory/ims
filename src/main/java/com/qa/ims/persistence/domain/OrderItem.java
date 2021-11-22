package com.qa.ims.persistence.domain;

import java.util.Objects;

public class OrderItem {
	
	private Long id;
	private Long orderId;
	private Long itemId;	
	private String itemName;
	private Long numItems;
	
	public OrderItem(Long id, Long orderId, Long itemId, String itemName, Long numItems) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.numItems = numItems;
	}
	
	public OrderItem(Long orderId, Long itemId, String itemName, Long numItems) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.numItems = numItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getNumItems() {
		return numItems;
	}

	public void setNumItems(Long numItems) {
		this.numItems = numItems;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, itemId, itemName, numItems, orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id) && Objects.equals(itemId, other.itemId)
				&& Objects.equals(itemName, other.itemName) && Objects.equals(numItems, other.numItems)
				&& Objects.equals(orderId, other.orderId);
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", itemId=" + itemId + ", itemName=" + itemName
				+ ", numItems=" + numItems + "]";
	}
	
	

}
