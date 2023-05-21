package com.example.demo.CONTROLLER;

import com.example.demo.ENTITY.OrderReturn;
import com.example.demo.SERVICE.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/OrderTable")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    //create
    @PostMapping
    public ResponseEntity<OrderReturn>createOrderReturn(@RequestBody OrderReturn OrderReturn){
      return new ResponseEntity<>(orderService.createOrderReturn(OrderReturn),HttpStatus.CREATED);
    }
      // get All
    @GetMapping
    public List<OrderReturn>getAllOrderReturn(){
        return orderService.getAllOrderReturn();
    }
      // get by id
    @GetMapping("{id}")
    public ResponseEntity<OrderReturn>getOrderReturnById(@PathVariable Long id){
        return new ResponseEntity<>(orderService.getOrderReturnById(id),HttpStatus.OK);
    }
      // update
    @PutMapping("{id}")
    public ResponseEntity<OrderReturn>updateOrderReturn(@PathVariable Long id,@RequestBody OrderReturn orderReturn){
        return new ResponseEntity<>(orderService.updateOrderReturn(id,orderReturn),HttpStatus.OK);
    }
     // delete
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteOrderReturn(@PathVariable Long id){
        orderService.deleteOrderReturn(id);
        return new ResponseEntity<>("DeletedSuccessfully",HttpStatus.OK);

    }
}
