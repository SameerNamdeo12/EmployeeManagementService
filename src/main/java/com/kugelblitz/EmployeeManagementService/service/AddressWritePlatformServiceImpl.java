package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Address;
import com.kugelblitz.EmployeeManagementService.domain.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressWritePlatformServiceImpl implements  AddressWritePlatformService {

    private final AddressRepository addressRepository;

    public AddressWritePlatformServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address saveAddress(Address address){
        Address add=new Address();
        add.setCity(address.getCity());
        add.setState(address.getState());
        addressRepository.save(add);
        return add;
    }


}
