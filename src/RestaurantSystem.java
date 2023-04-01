/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;


public class RestaurantSystem {
    
	private LinkedList<Client> clients;
    private OrdersQueue ordersQueue;

    public RestaurantSystem() {
        this.clients = new LinkedList<Client>();
        this.ordersQueue = new OrdersQueue();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addOrder(Order order) {
        ordersQueue.enqueue(order);
    }

	public LinkedList<Client> getClients() {
		return clients;
	}

	public void setClients(LinkedList<Client> clients) {
		this.clients = clients;
	}

	public OrdersQueue getOrdersQueue() {
		return ordersQueue;
	}

	public void setOrdersQueue(OrdersQueue ordersQueue) {
		this.ordersQueue = ordersQueue;
	}
    
    public Order processOrder() {
    	return getOrdersQueue().dequeue();
    }
}
