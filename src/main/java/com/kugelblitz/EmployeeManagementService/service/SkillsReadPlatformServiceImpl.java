package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Skills;
import com.kugelblitz.EmployeeManagementService.domain.SkillsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillsReadPlatformServiceImpl implements SkillsReadPlatformService{
    private final SkillsRepository skillsRepository;

    public SkillsReadPlatformServiceImpl(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @Override
    public List<Skills> getAllSkill(){
        return skillsRepository.findAll();
    }
    @Override
    public Optional<Skills> getSkillById(Long id){
        return  skillsRepository.findById(id);
    }
}
