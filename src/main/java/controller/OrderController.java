package controller;

import model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private List<Order> orders = new ArrayList<>();

    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orders;
    }

    @PostMapping("/")
    public Order createOrder(@RequestBody Order order) {
        // Generate orderId and set delivery date (for demonstration)
        order.setOrderId(orders.size() + 1);
        order.setDeliveryDate(new Date());

        orders.add(order);
        return order;
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null; // Order not found
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@PathVariable int orderId, @RequestBody Order updatedOrder) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                order.setTrackingNumber(updatedOrder.getTrackingNumber());
                order.setStatus(updatedOrder.getStatus());
                order.setRecipientName(updatedOrder.getRecipientName());
                order.setAddress(updatedOrder.getAddress());
                // You can update other fields as needed
                return order;
            }
        }
        return null; // Order not found
    }

    @DeleteMapping("/{orderId}")
    public String deleteOrder(@PathVariable int orderId) {
        orders.removeIf(order -> order.getOrderId() == orderId);
        return "Order with ID " + orderId + " has been deleted.";
    }
}

