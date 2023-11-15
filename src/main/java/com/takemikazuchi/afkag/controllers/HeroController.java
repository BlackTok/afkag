package com.takemikazuchi.afkag.controllers;

import com.takemikazuchi.afkag.dto.HeroDto;
import com.takemikazuchi.afkag.dto.HeroDtoToEntity;
import com.takemikazuchi.afkag.entitys.Hero;
import com.takemikazuchi.afkag.repositorys.HeroRepository;
import com.takemikazuchi.afkag.services.ElevationService;
import com.takemikazuchi.afkag.services.FractionService;
import com.takemikazuchi.afkag.services.RankService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name="Герои", description="Информация по героям")
public class HeroController {
    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private ElevationService elevationService;

    @Autowired
    private FractionService fractionService;

    @Autowired
    private RankService rankService;

    private final HeroDtoToEntity heroDtoToEntity = new HeroDtoToEntity(elevationService, rankService, fractionService);

    @GetMapping(path = "heroes")
    @Operation(
            summary = "Все герои",
            description = "Возвращает список всех героев"
    )
    public @ResponseBody Iterable<HeroDto> getAllHeroes() {
        return heroRepository.getAll();
    }

    @GetMapping(path = "/heroes/{id}")
    @Operation(
            summary = "Герой",
            description = "Возвращает героя по его id"
    )
    public @ResponseBody HeroDto getHeroById(@PathVariable int id) {
        Hero hero = heroRepository.findById(id)
                .orElseThrow(() -> new ExpressionException("Employee not exist with id: " + id));

        return new HeroDto(hero);
    }

    @PostMapping(path = "/heroes/add")
    @Operation(
            summary = "Добавить героя",
            description = "Добавляет нового героя в базу данных"
    )
    public Hero createEmployee(@RequestBody HeroDto heroDto) {
        Hero hero = heroDtoToEntity.dtoToEntity(heroDto);

        heroRepository.saveAndFlush(hero);

        return hero;//heroRepository.save(hero);
    }

    @PutMapping("/heroes/{id}")
    @Operation(
            summary = "Изменить героя",
            description = "Изменяет герояв базе данных. В пути указываетс id героя, в теле запроса json со всеми данными героя"
    )
    public ResponseEntity<Hero> updateEmployee(
            @PathVariable int id,
            @RequestBody HeroDto heroDto) {
        HeroDtoToEntity heroDtoToEntity = new HeroDtoToEntity(elevationService, rankService, fractionService);

        Hero hero = heroRepository.findById(id)
                .orElseThrow(() -> new ExpressionException("Employee not exist with id: " + id));

        Hero updateHero = heroDtoToEntity.dtoToEntityUpdate(hero, heroDto);

        heroRepository.saveAndFlush(updateHero);

        return ResponseEntity.ok(updateHero);
    }

}
