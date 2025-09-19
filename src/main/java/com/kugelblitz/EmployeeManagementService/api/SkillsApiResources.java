package com.kugelblitz.EmployeeManagementService.api;

import com.kugelblitz.EmployeeManagementService.domain.Skills;
import com.kugelblitz.EmployeeManagementService.service.SkillsReadPlatformServiceImpl;
import com.kugelblitz.EmployeeManagementService.service.SkillsWritePlatformServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SkillsApiResources
{
    private final SkillsWritePlatformServiceImpl skillsService;
    private final SkillsReadPlatformServiceImpl skillsReadPlatformService;


    public SkillsApiResources(SkillsWritePlatformServiceImpl skillsService, SkillsReadPlatformServiceImpl skillsReadPlatformService) {
        this.skillsService = skillsService;
        this.skillsReadPlatformService = skillsReadPlatformService;
    }

    @PostMapping("/saveSkills")
    public Skills saveSkills(@RequestBody Skills skills){
        return skillsService.saveSkills(skills);
    }
    @GetMapping("/getAllSkills")
    public List<Skills> getAllSkills(){
        return skillsReadPlatformService.getAllSkill();
    }

    @GetMapping("/getSkillsById/{id}")
    public Optional<Skills> getSkillById(@PathVariable Long id){
        return skillsReadPlatformService.getSkillById(id);
    }
}
