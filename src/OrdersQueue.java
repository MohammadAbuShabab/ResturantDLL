  // import java.util.LinkedList;
//import java.util.Queue;
public class OrdersQueue {
    private DoublyLinkedList<Order> queue;

    public OrdersQueue() {
        queue = new DoublyLinkedList<Order>();
    }

    public void enqueue(Order order) {
        queue.add(order);
    }

    public Order dequeue() {
        if(queue.isEmpty()) {
        	System.out.println("Sorry,there is no order !");
            return null;
        }
        Order order = queue.poll();
        System.out.println("processing order "+order.getOrderDescription()+" of client " + order.getClient().getName());
        return order;
    }
    
}
