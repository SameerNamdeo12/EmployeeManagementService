package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Address;
import com.kugelblitz.EmployeeManagementService.service.AddressReadPlatformServiceImpl;
import com.kugelblitz.EmployeeManagementService.service.AddressWritePlatformServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AddressApiResources {

    private final AddressWritePlatformServiceImpl addressService;
    private final AddressReadPlatformServiceImpl addressReadPlatformService;


    public AddressApiResources(AddressWritePlatformServiceImpl addressService, AddressReadPlatformServiceImpl addressReadPlatformService) {
        this.addressService = addressService;
        this.addressReadPlatformService = addressReadPlatformService;
    }

    @PostMapping("/saveAddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("/getAllAddress")
    public List<Address> fetchAllAddress(){
        return addressReadPlatformService.getAllAddress();
    }

    @GetMapping("/getAddressById/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressReadPlatformService.getAddressById(id);
    }

}
