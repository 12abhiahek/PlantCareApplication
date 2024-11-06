package com.example.plantCare.contoller;

import com.example.plantCare.entity.Plant;
import com.example.plantCare.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plants")
public class PlantController {
    @Autowired
    private PlantService plantService;

    @GetMapping
    public ResponseEntity<List<Plant>> getAllPlants() {
        return ResponseEntity.ok(plantService.getAllPlants());
    }

    @PostMapping
    public ResponseEntity<Plant> addPlant(@RequestBody Plant plant) {
        return ResponseEntity.ok(plantService.addPlant(plant));
    }

}
