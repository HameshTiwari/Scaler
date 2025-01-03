import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class OrderQueue {
    private PriorityQueue<Order> Orders;

    public OrderQueue() {
        // Prioritize express orders
        Orders =  new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        Orders.offer(order);
    }

    public Order processOrder() {
        return Orders.poll();
    }

    public int getSize(){
        return Orders.size();
    }

}