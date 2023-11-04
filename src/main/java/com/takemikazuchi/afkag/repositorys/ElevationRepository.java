package com.takemikazuchi.afkag.repositorys;

import com.takemikazuchi.afkag.entitys.Elevation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElevationRepository extends JpaRepository<Elevation, Integer> {
    default List<Elevation> getAll() {
        return this.findAll().stream().toList();
    }
}
