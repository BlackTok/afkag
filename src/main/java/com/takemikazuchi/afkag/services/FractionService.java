package com.takemikazuchi.afkag.services;

import com.takemikazuchi.afkag.entitys.Fraction;
import com.takemikazuchi.afkag.entitys.HeroRank;
import com.takemikazuchi.afkag.repositorys.FractionRepository;
import com.takemikazuchi.afkag.repositorys.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FractionService {
    private final FractionRepository fractionRepository;

    @Autowired
    public FractionService(FractionRepository fractionRepository) {
        this.fractionRepository = fractionRepository;
    }


    public List<Fraction> getAllFractions() {
        return fractionRepository.findAll();
    }
}
