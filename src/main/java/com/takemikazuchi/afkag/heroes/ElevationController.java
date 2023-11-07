package com.takemikazuchi.afkag.heroes;

import com.takemikazuchi.afkag.dto.HeroDto;
import com.takemikazuchi.afkag.dto.HeroDtoToEntity;
import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.entitys.Hero;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import com.takemikazuchi.afkag.repositorys.HeroRepository;
import com.takemikazuchi.afkag.services.ElevationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
