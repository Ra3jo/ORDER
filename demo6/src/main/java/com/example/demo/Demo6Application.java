package com.example.demo;

import com.example.demo.ENTITY.OrderReturn;
import com.example.demo.REPOSITORY.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo6Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }
       @Autowired
       private OrderRepository orderRepository;
    @Override
    public void run(String... args) throws Exception {
        OrderReturn orderReturn=new OrderReturn();
        orderReturn.setOrderName("MAJAGI");
        orderReturn.setStakeName("JOFREY");
        orderReturn.setLocation("MWANZA");
        orderReturn.setEmail("gonabi@gmail.com");
        orderRepository.save(orderReturn);

        OrderReturn orderReturn1=new OrderReturn();
        orderReturn1.setOrderName("MABAKURII");
        orderReturn1.setStakeName("Godfrey");
        orderReturn1.setLocation("MARA");
        orderReturn1.setEmail("gonawork@gmail.com");
        orderRepository.save(orderReturn1);

    }
}
