package com.tong.logic.chapterThree.mall;

import java.util.Date;

//訂單類
public class Order {

    private String id;
    private User user;
    private OrderItem[] items;
    private Date createtime;
    private String receiver;
    private String address;
    private String phone;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderItem[] getItems() {
        return items;
    }

    public void setItems(OrderItem[] items) {
        this.items = items;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double computeTotalPrice() {
        double totalPrice = 0;
        if (items != null) {
            for (OrderItem item : items) {
                totalPrice += item.computePrice();
            }
        }
        return totalPrice;
    }
}
