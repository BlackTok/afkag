package com.takemikazuchi.afkag.controllers;

import com.takemikazuchi.afkag.entitys.HeroRank;
import com.takemikazuchi.afkag.repositorys.RankRepository;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name="Ранги", description="Соотношения id ранга с его названием")
@Hidden
public class RankController {
    @Autowired
    private RankRepository rankRepository;

    @GetMapping(path = "/ranks")
    public @ResponseBody List<HeroRank> getAllRanks() {
        return rankRepository.getAll();
    }
}
