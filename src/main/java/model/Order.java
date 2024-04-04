package model;

import java.util.Date;

public class Order {
    private int orderId;
    private String trackingNumber;
    private String status;
    private Date deliveryDate;
    private String recipientName;
    private String address;

    public Order(int orderId, String trackingNumber, String status, Date deliveryDate, String recipientName, String address) {
        this.orderId = orderId;
        this.trackingNumber = trackingNumber;
        this.status = status;
        this.deliveryDate = deliveryDate;
        this.recipientName = recipientName;
        this.address = address;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

