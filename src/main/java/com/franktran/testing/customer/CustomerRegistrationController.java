package com.franktran.testing.customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer-registration")
public class CustomerRegistrationController {
    @PostMapping
    public void registerNewCustomer(@RequestBody CustomerRegistrationRequest request)  {

    }
}
