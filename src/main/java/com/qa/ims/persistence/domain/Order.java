package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private Long customerId;

	private Long totalCost;
	
	
	public Order(Long id, Long customerId, Long totalCost) {

	private String itemName;
	private Long itemId;
;
	private Long numItems;
	private Long totalCost;
	
	
	
		public Order(String customerSurname, Long customerId, String itemName, Long itemId,
				Long numItems, Long totalCost) {
			super();
			this.customerSurname = customerSurname;
			this.customerId = customerId;
			this.itemName = itemName;
			this.itemId = itemId;
			this.numItems = numItems;
			this.totalCost = totalCost;
		}
	
	

	}
	

	public Order(Long customerId, Long totalCost) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.totalCost = totalCost;
	}
	public Order(Long customerId) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.totalCost = totalCost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



		



	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public void setTotalCost(Long totalCost) {
		this.totalCost = totalCost;
	}


	@Override
	public int hashCode() {
		return Objects.hash(customerId, id, totalCost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(id, other.id)
				&& Objects.equals(totalCost, other.totalCost);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", totalCost=" + totalCost + "]";
	}

		@Override
		public int hashCode() {
			return Objects.hash(customerId, customerSurname, id, itemId, itemName, numItems, totalCost);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return Objects.equals(customerId, other.customerId)
					&& Objects.equals(customerSurname, other.customerSurname) && Objects.equals(id, other.id)
					&& Objects.equals(itemId, other.itemId) && Objects.equals(itemName, other.itemName)
					&& Objects.equals(numItems, other.numItems) && Objects.equals(totalCost, other.totalCost);
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", customerSurname=" + customerSurname + ", customerId=" + customerId
					+ ", itemName=" + itemName + ", itemId=" + itemId + ", numItems=" + numItems + ", totalCost="
					+ totalCost + "]";
		}

	
}
	