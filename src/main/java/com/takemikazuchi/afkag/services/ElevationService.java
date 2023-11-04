package com.takemikazuchi.afkag.services;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElevationService {
    @Autowired
    private ElevationRepository elevationRepository;

    public List<Elevation> getAllElevations() {
        return elevationRepository.getAll().stream().toList();
    }
}
