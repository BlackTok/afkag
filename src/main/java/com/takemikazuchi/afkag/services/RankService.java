package com.takemikazuchi.afkag.services;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.entitys.HeroRank;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import com.takemikazuchi.afkag.repositorys.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    private final RankRepository rankRepository;

    @Autowired
    public RankService(RankRepository rankRepository) {
        this.rankRepository = rankRepository;
    }


    public List<HeroRank> getAllRanks() {
        return rankRepository.findAll();
    }
}
