package com.example.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/SoftwareEngineer")
public class SoftwareEngineerController {

    private final SoftwareEngineerService SoftwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService){
        this.SoftwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return SoftwareEngineerService.getAllSoftwareEngineer();
    }
    @GetMapping("{id}")
    public SoftwareEngineer getEngineerByID(@PathVariable Integer id){
        return SoftwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        SoftwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
    @PutMapping("{id}")
    public SoftwareEngineer updateEngineer(@PathVariable Integer id,
                                           @RequestBody SoftwareEngineer engineer) {
        return SoftwareEngineerService.updateSoftwareEngineer(id, engineer);
    }

    @DeleteMapping("{id}")
    public void deleteEngineer(@PathVariable Integer id) {
        SoftwareEngineerService.deleteSoftwareEngineer(id);
    }
}
