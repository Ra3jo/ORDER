package com.example.demo.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderTable")
public class OrderReturn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "OrderNmae")
    private String OrderName;
    @Column(name = "StakeName")
    private String StakeName;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Location")
    private String Location;
}
