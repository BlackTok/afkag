package com.takemikazuchi.afkag.services;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElevationService {
    private final ElevationRepository elevationRepository;

    @Autowired
    public ElevationService(ElevationRepository elevationRepository) {
        this.elevationRepository = elevationRepository;
    }


    public List<Elevation> getAllElevations() {
        return elevationRepository.findAll();
    }
}
