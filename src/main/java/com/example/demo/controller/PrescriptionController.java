package com.example.demo.controller;

import com.example.demo.dto.CreatePrescriptionDto;
import com.example.demo.model.Prescription;
import com.example.demo.service.PrescriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PrescriptionController {
    private PrescriptionService prescriptionService;

    @PostMapping("/prescriptions")
    public Prescription createPrescription(@RequestBody CreatePrescriptionDto createPrescriptionDto) {
        return prescriptionService.createPrescription(createPrescriptionDto);
    }

    @GetMapping("/prescriptions/{id}")
    public Prescription getPrescription(@PathVariable Long id) {
        return prescriptionService.getPrescriptionById(id);
    }

    @DeleteMapping("/prescriptions/{id}")
    public void deletePrescription(@PathVariable Long id) {
        prescriptionService.deletePrescriptionById(id);
    }
}
