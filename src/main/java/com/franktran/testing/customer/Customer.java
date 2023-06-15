package com.franktran.testing.customer;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Customer {
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String phoneNumber;
}
