package com.example._09_dto_example;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public CustomerDTO getCustomerDTO() {
        // Bu metot, gerçek bir senaryoda veritabanından veya başka bir kaynaktan veriyi alabilir.
        // Ancak burada örnek olması için sabit bir değer döndürüyoruz.

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName("John Doe");
        customerDTO.setEmail("john.doe@example.com");

        return customerDTO;
    }
}
