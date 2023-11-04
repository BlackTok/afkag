package com.takemikazuchi.afkag.repositorys;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.entitys.HeroRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankRepository extends JpaRepository<HeroRank, Integer> {
    default List<HeroRank> getAll() {
        return this.findAll().stream().toList();
    }
}
