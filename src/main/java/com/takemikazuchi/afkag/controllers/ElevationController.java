package com.takemikazuchi.afkag.controllers;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.services.ElevationService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name="Возвышение", description="Соотношение id возвышения с его названием")
@Hidden
public class ElevationController {
    private final ElevationService elevationService;

    @Autowired
    public ElevationController(ElevationService elevationService) {
        this.elevationService = elevationService;
    }

    @GetMapping(path = "/elevations")
    public @ResponseBody List<Elevation> getAllElevations() {
        return elevationService.getAllElevations();
    }
}
