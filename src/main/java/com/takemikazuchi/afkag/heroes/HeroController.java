package com.takemikazuchi.afkag.heroes;

import com.takemikazuchi.afkag.dto.HeroDto;
import com.takemikazuchi.afkag.dto.HeroDtoToEntity;
import com.takemikazuchi.afkag.entitys.Hero;
import com.takemikazuchi.afkag.repositorys.HeroRepository;
import com.takemikazuchi.afkag.services.ElevationService;
import com.takemikazuchi.afkag.services.FractionService;
import com.takemikazuchi.afkag.services.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private ElevationService elevationService;

    @Autowired
    private FractionService fractionService;

    @Autowired
    private RankService rankService;

//    @PostMapping(path="/heroes") // Map ONLY POST Requests
//    public @ResponseBody String addNewHero (@RequestParam String name
//            , @RequestParam String email) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        Hero hero = new Hero();
//
//        return "Saved";
//    }
    @GetMapping(path = "/heroes")
    public @ResponseBody Iterable<HeroDto> getAllHeroes() {
        return heroRepository.getAll();
    }

    @PostMapping(path = "/heroes/add")
    public Hero createEmployee(@RequestBody HeroDto heroDto) {
        HeroDtoToEntity heroDtoToEntity = new HeroDtoToEntity(elevationService, rankService, fractionService);
        Hero hero = heroDtoToEntity.dtoToEntity(heroDto);


        heroRepository.saveAndFlush(hero);

        return hero;//heroRepository.save(hero);
    }

    @PutMapping("/heroes/{id}")
    public ResponseEntity<Hero> updateEmployee(@PathVariable int id, @RequestBody HeroDto heroDto) {
        HeroDtoToEntity heroDtoToEntity = new HeroDtoToEntity(elevationService, rankService, fractionService);

        Hero hero = heroRepository.findById(id)
                .orElseThrow(() -> new ExpressionException("Employee not exist with id: " + id));

        Hero updateHero = heroDtoToEntity.dtoToEntityUpdate(hero, heroDto);

        heroRepository.save(updateHero);

        return ResponseEntity.ok(updateHero);
    }

//    @GetMapping(path="/heroes/{id}")
//    public Optional<Hero> getHero(@PathVariable("id") String idString) {
//        try {
//            int id = Integer.parseInt(idString);
//            return heroRepository.findById(id);
//        } catch (NumberFormatException e) {
//            return Optional.empty();
//        }
//    }

//    @GetMapping(path="/heroes/filter")
//    public Iterable<Hero> getHeroesByFilter(@RequestParam String fraction) {
//        Map<String, String> filters = new HashMap<>();
//        filters.put("fraction", fraction);
//
//        return  heroRepository.findAllByFilters(filters);
//    }
}
