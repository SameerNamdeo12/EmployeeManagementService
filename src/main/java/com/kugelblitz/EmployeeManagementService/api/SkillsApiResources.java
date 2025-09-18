package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Skills;
import com.kugelblitz.EmployeeManagementService.service.SkillsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SkillsApiResources
{
    private final SkillsService skillsService;


    public SkillsApiResources(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @PostMapping("/saveSkills")
    public Skills saveSkills(@RequestBody Skills skills){
        return skillsService.saveSkills(skills);
    }
}
