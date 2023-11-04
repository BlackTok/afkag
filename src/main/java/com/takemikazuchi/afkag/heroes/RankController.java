package com.takemikazuchi.afkag.heroes;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.entitys.HeroRank;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import com.takemikazuchi.afkag.repositorys.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankController {
    @Autowired
    private RankRepository rankRepository;

    @GetMapping(path = "/ranks")
    public @ResponseBody List<HeroRank> getAllRanks() {
        return rankRepository.getAll();
    }
}
