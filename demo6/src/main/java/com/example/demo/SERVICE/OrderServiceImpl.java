package com.example.demo.SERVICE;

import com.example.demo.ENTITY.OrderReturn;
import com.example.demo.REPOSITORY.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
      //create
    @Override
    public OrderReturn createOrderReturn(OrderReturn orderReturn) {
        return orderRepository.save(orderReturn) ;
    }
     // get all
    @Override
    public List<OrderReturn> getAllOrderReturn() {
        return orderRepository.findAll();
    }
     // get by id
    @Override
    public OrderReturn getOrderReturnById(Long id) {
        OrderReturn orderReturn=orderRepository.findById(id).orElseThrow(()->new RuntimeException("NotFound"));

        return orderReturn;
    }
     // update
    @Override
    public OrderReturn updateOrderReturn(Long id, OrderReturn orderReturn) {
        OrderReturn existingOrderReturn=orderRepository.findById(id).orElseThrow(()-> new RuntimeException("NotFound"));
        existingOrderReturn.setOrderName(orderReturn.getOrderName());
        existingOrderReturn.setStakeName(orderReturn.getStakeName());
        existingOrderReturn.setEmail(orderReturn.getEmail());
        existingOrderReturn.setLocation(orderReturn.getLocation());
        OrderReturn updateOrderReturn=orderRepository.save(existingOrderReturn);
        return updateOrderReturn;
    }
      // delete

    @Override
    public void deleteOrderReturn(Long id) {
        OrderReturn deleteOrderReturn=orderRepository.findById(id).orElseThrow(()->new RuntimeException("NotFound"));
        orderRepository.delete(deleteOrderReturn);

    }
}
