package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Address;
import com.kugelblitz.EmployeeManagementService.domain.AddressRepository;

public interface AddressWritePlatformService {

    Address saveAddress(Address address);
}
