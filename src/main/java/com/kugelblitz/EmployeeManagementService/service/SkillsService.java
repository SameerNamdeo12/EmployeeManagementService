package com.kugelblitz.EmployeeManagementService.service;

import com.kugelblitz.EmployeeManagementService.domain.Skills;
import com.kugelblitz.EmployeeManagementService.domain.SkillsRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {

    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public Skills saveSkills(Skills skills){
        Skills newSkills=new Skills();
        newSkills.setName(skills.getName());
        skillsRepository.save(newSkills);
        return newSkills;
    }
}
