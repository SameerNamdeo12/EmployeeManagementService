package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Address;
import com.kugelblitz.EmployeeManagementService.domain.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressReadPlatformServiceImpl implements AddressReadPlatformService{
    private final AddressRepository addressRepository;

    public AddressReadPlatformServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> getAddressById(Long id){
        return addressRepository.findById(id);
    }
}
