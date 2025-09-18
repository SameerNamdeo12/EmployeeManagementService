package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Address;
import com.kugelblitz.EmployeeManagementService.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AddressApiResources {

    private final AddressService addressService;


    public AddressApiResources(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/saveAddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
}
