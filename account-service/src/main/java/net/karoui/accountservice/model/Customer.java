package net.karoui.accountservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Customer {
    private Long Id;
    private String firstName;
    private String LastName;
    private String email;
}
