package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Address;

import java.util.List;
import java.util.Optional;

public interface AddressReadPlatformService {
    List<Address> getAllAddress();
    Optional<Address> getAddressById(Long id);
}
