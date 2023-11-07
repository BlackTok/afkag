package com.takemikazuchi.afkag.repositorys;

import com.takemikazuchi.afkag.entitys.Fraction;
import com.takemikazuchi.afkag.entitys.HeroRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FractionRepository extends JpaRepository<Fraction, Integer> {
    default List<Fraction> getAll() {
        return this.findAll();
    }
}
