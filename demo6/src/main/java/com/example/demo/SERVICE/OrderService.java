package com.example.demo.SERVICE;

import com.example.demo.ENTITY.OrderReturn;

import java.util.List;

public interface OrderService {
    //create
    OrderReturn createOrderReturn(OrderReturn orderReturn);
    //get all
    List<OrderReturn>getAllOrderReturn();
    // get Id
    OrderReturn getOrderReturnById(Long id);
    // update
    OrderReturn updateOrderReturn(Long id,OrderReturn orderReturn);
    // delete
    void deleteOrderReturn(Long id);
}
