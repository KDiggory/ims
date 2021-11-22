package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private String customerSurname;
	private Long customerId;
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
	
	
	public Order(Long id, String customerSurname, Long customerId, String itemName, Long itemId,
			Long numItems, Long totalCost) {
		super();
		this.id = id;
		this.customerSurname = customerSurname;
		this.customerId = customerId;
		this.itemName = itemName;
		this.itemId = itemId;
		this.numItems = numItems;
		this.totalCost = totalCost;
	}
	


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCustomerSurname() {
			return customerSurname;
		}

		public void setCustomerSurname(String customerSurname) {
			this.customerSurname = customerSurname;
		}

		public Long getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Long getItemId() {
			return itemId;
		}

		public void setItemId1(Long itemId) {
			this.itemId = itemId;
		}

//		public String getItemName2() {
//			return itemName2;
//		}
//
//		public void setItemName2(String itemName2) {
//			this.itemName2 = itemName2;
//		}
//
//		public Long getItemId2() {
//			return itemId2;
//		}
//
//		public void setItemId2(Long itemId2) {
//			this.itemId2 = itemId2;
//		}
//
//		public String getItemName3() {
//			return itemName3;
//		}
//
//		public void setItemName3(String itemName3) {
//			this.itemName3 = itemName3;
//		}
//
//		public Long getItemId3() {
//			return itemId3;
//		}
//
//		public void setItemId3(Long itemId3) {
//			this.itemId3 = itemId3;
//		}

		public Long getNumItems() {
			return numItems;
		}

		public void setNumItems(Long numItems) {
			this.numItems = numItems;
		}

		public long getTotalCost() {
			return totalCost;
		}

		public void setTotalCost(Long totalCost) {
			this.totalCost = totalCost;
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

//		@Override
//		public int hashCode() {
//			return Objects.hash(customerId, customerSurname, id, itemId, itemId2, itemId3, itemName, itemName2,
//					itemName3, numItems, totalCost);
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Order other = (Order) obj;
//			return Objects.equals(customerId, other.customerId)
//					&& Objects.equals(customerSurname, other.customerSurname) && Objects.equals(id, other.id)
//					&& Objects.equals(itemId, other.itemId) && Objects.equals(itemId2, other.itemId2)
//					&& Objects.equals(itemId3, other.itemId3) && Objects.equals(itemName, other.itemName)
//					&& Objects.equals(itemName2, other.itemName2) && Objects.equals(itemName3, other.itemName3)
//					&& numItems == other.numItems
//					&& Double.doubleToLongBits(totalCost) == Double.doubleToLongBits(other.totalCost);
//		}
//
//		@Override
//		public String toString() {
//			return "Order [id=" + id + ", customerSurname=" + customerSurname + ", customerId=" + customerId
//					+ ", itemName=" + itemName + ", itemId=" + itemId + ", itemName2=" + itemName2 + ", itemId2="
//					+ itemId2 + ", itemName3=" + itemName3 + ", itemId3=" + itemId3 + ", numItems=" + numItems
//					+ ", totalCost=" + totalCost + "]";
//		}
//		
	
	

}
