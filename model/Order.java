package model;

import java.util.ArrayList;

public class Order {

    ArrayList<Medicine> MainOrder = new ArrayList<>();
    int order_id;
    int order_weight;
    String order_adress;
    String estimated_time;

    public ArrayList<Medicine> getMainOrder() {
        return MainOrder;
    }

    public void setMainOrder(ArrayList<Medicine> mainOrder) {
        MainOrder = mainOrder;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_weight() {
        return order_weight;
    }

    public void setOrder_weight(int order_weight) {
        this.order_weight = order_weight;
    }

    public String getOrder_adress() {
        return order_adress;
    }

    public void setOrder_adress(String order_adress) {
        this.order_adress = order_adress;
    }

    public String getEstimated_time() {
        return estimated_time;
    }

    public void setEstimated_time(String estimated_time) {
        this.estimated_time = estimated_time;
    }

    public Order(ArrayList<Medicine> mainOrder, int order_id, int order_weight, String order_adress, String estimated_time) {
        MainOrder = mainOrder;
        this.order_id = order_id;
        this.order_weight = order_weight;
        this.order_adress = order_adress;
        this.estimated_time = estimated_time;
    }
    public void printFormat() {
        for (int i = 0; i < MainOrder.size(); i++) {
            System.out.println(MainOrder.get(i));
        }

    }



}
