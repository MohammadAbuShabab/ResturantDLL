/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Order {
    private Client client;
    private int restaurantId;
    private String restaurantName;
    private String orderDescription;

    public Order(Client client, int restaurantId, String restaurantName, String orderDescription) {
        this.client = client;
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.orderDescription = orderDescription;
    }
    
    public Order() {
    	
    }

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

    
    
}
