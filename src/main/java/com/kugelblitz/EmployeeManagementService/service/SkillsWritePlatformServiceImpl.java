package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Skills;
import com.kugelblitz.EmployeeManagementService.domain.SkillsRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillsWritePlatformServiceImpl implements SkiilsWritePlatformService{

    private final SkillsRepository skillsRepository;

    public SkillsWritePlatformServiceImpl(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @Override
    public Skills saveSkills(Skills skills){
        Skills newSkills=new Skills();
        newSkills.setName(skills.getName());
        skillsRepository.save(newSkills);
        return newSkills;
    }
}
