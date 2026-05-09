package com.example.springboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final softwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(softwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineer(){
        return softwareEngineerRepository.findAll();
    }

    public  void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {

        softwareEngineerRepository.save(softwareEngineer);

    }

    public  SoftwareEngineer getSoftwareEngineerById( Integer id) {

        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException
                (id+ "not found"));

    }
    public SoftwareEngineer updateSoftwareEngineer(Integer id, SoftwareEngineer dados) {
        SoftwareEngineer engineer = softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " not found"));

        engineer.setName(dados.getName());
        engineer.setTechStack(dados.getTechStack());

        return softwareEngineerRepository.save(engineer);
    }

    public void deleteSoftwareEngineer(Integer id) {
        if (!softwareEngineerRepository.existsById(id)) {
            throw new IllegalStateException(id + " not found");
        }
        softwareEngineerRepository.deleteById(id);
    }
}
