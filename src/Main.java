/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) {
    	Client client1 = new Client(1,"mohamed", "Amman", "0792010035", 10);
    	Client client2 = new Client(2,"Balqess", "Jerash", "0792010035", 10);
    	Client client3 = new Client(3,"Safaa", "Irbid", "0792010035", 10);
    	Client client4 = new Client(3,"Wesam", "Irbid"," 0792010035", 5);
    	
    	Order orderC1 = new Order(client1, 1, "pizzahut", "sandwitch tuna");
    	Order orderC2 = new Order(client2, 1, "pizzahut", "sandwich beef");
    	Order orderC3 = new Order(client3, 1, "pizzahut", "chawarma");
    	Order orderC4 = new Order (client4,1,"pizzahut","crisbe sandiwitch" );
    	
    	
    	
    	RestaurantSystem system = new RestaurantSystem();
    	system.addClient(client3);
    	system.addOrder(orderC3);

    	system.addClient(client1);
    	system.addOrder(orderC1);
    	system.addClient(client2);
    	system.addOrder(orderC2);
    	
        system.addClient(client4);
        system.addOrder(orderC4);

    	
    	system.processOrder();
    	system.processOrder();
    	system.processOrder();
    	system.processOrder();
    	system.processOrder();

    	
    	
    }
}
