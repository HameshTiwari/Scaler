import java.util.PriorityQueue;
import java.util.Comparator;

class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }


    @Override
    public int compareTo(Order other) {
        // Prioritize express orders
        if (this.isExpress == other.isExpress) {
            return this.orderId.compareTo(other.orderId);
        } else if (this.isExpress) {
            return -1;
        } else {
            // If both are express or both are regular, compare by orderId
            return 1;
        }
    }
}