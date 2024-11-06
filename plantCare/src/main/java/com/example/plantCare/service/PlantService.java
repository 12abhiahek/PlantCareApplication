package com.example.plantCare.service;

import com.example.plantCare.entity.Plant;
import com.example.plantCare.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {
    @Autowired
    private PlantRepository plantRepository;


    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    public Plant getPlantById(Long id) {
        return plantRepository.findById(id).orElse(null);
    }

    public Plant addPlant(Plant plant) {
        return plantRepository.save(plant);
    }

    public Plant updatePlant(Long id, Plant plant) {
        return plantRepository.findById(id).map(existingPlant -> {
            existingPlant.setName(plant.getName());
            existingPlant.setSpecies(plant.getSpecies());
            existingPlant.setCareInstructions(plant.getCareInstructions());
            existingPlant.setWateringFrequency(plant.getWateringFrequency());
            return plantRepository.save(existingPlant);
        }).orElse(null);
    }

    public void deletePlant(Long id) {
        plantRepository.deleteById(id);
    }
}
