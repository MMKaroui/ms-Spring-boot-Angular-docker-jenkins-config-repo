package net.karoui.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Customer {
    @Id  @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String fistName;
    private String lastName;
    private String email;
    }
