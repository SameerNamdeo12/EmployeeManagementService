package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Skills;

import java.util.List;
import java.util.Optional;

public interface SkillsReadPlatformService {
    List<Skills> getAllSkill();
    Optional<Skills> getSkillById(Long id);
}


