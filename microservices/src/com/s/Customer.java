package com.s;

import java.util.*;


class Test {
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		c1.setName("John");
		c1.setAddress("Pune");
		Order o = new Order();
		o.setItemName("Pizza");
		o.setQuantity(2);
		o.setCustomer(c1);

		o.prepareOrder();

		BillCalculation b = new BillCalculation(o);
		b.calculateBill();

		DeliveryApp d = new DeliveryApp(o);
		d.delivery();
	}
}

public class Customer
{
	// customer class which defines the structure of customer
	
		private String name;
		private String address;
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name; 
		}
		public String getAddress() { return address; }
		public void setAddress(String address)
		{
			this.address = address;
		}
	}

	class Order {

		private Customer customer;
		private String orderId;
		private String itemName;
		private int quantity;
		private int totalBillAmt;

		public Customer getCustomer() { return customer; }
		public void setCustomer(Customer customer)
		{
			this.customer = customer;
		}
		public String getOrderId() { return orderId; }
		public void setOrderId(String orderId)
		{
			Random random = new Random();

			this.orderId = orderId + "-" + random.nextInt(500);
		}
		public String getItemName() { return itemName; }
		public void setItemName(String itemName)
		{
			this.itemName = itemName;
			setOrderId(itemName);
		}
		public int getQuantity() { return quantity; }
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		public int getTotalBillAmt() { return totalBillAmt; }
		public void setTotalBillAmt(int totalBillAmt)
		{
			this.totalBillAmt = totalBillAmt;
		}

		public void prepareOrder()
		{
			System.out.println("Preparing order for customer -"
							+ this.getCustomer().getName()
							+ " who has ordered "
							+ this.getItemName());
		}
	}


	//class is to Calculate bill
	class BillCalculation {

		private Order order;
		public BillCalculation(Order order)
		{
			this.order = order;
		}

		public void calculateBill()
		{
			
			Random rand = new Random();
			int totalAmt= rand.nextInt(200) * this.order.getQuantity();

			this.order.setTotalBillAmt(totalAmt);
			System.out.println("Order with order id "+ this.order.getOrderId()+ " has a total bill amount of "+ this.order.getTotalBillAmt());
		}
	}


	// class for the delivery 
	class DeliveryApp 
	{

		private Order order;
		
		public DeliveryApp(Order order)
		{
			this.order = order;
		}

		public void delivery()
		{
			
			System.out.println("Delivering the order");
			System.out.println("Order with order id as "+ this.order.getOrderId()+ " being delivered to "+ this.order.getCustomer().getName());
			System.out.println("Order is to be delivered to: "+ this.order.getCustomer().getAddress());
		}
	}


