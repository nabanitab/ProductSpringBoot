package com.nabanita.TestProduct.model.paymentEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "paymentuser")
public class PaymentUser {

    @Id
    @GeneratedValue
    private int userId;

    private String name;

    private String email;

}
