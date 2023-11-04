package com.takemikazuchi.afkag.repositorys;

import com.takemikazuchi.afkag.dto.HeroDto;
import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.entitys.Hero;
import com.takemikazuchi.afkag.entitys.HeroRank;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {
    default List<HeroDto> getAll() {
        Iterable<Hero> iterableHeroes = this.findAll();
        List<HeroDto> dtoHeroes = new ArrayList<>();

        iterableHeroes.forEach(hero -> dtoHeroes.add(new HeroDto(hero)));

        return dtoHeroes;
    }
}
