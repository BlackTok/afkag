package com.takemikazuchi.afkag.entitys;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "ranks")
public class HeroRank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "campRank")
    private Set<Hero> heroesCamp;

    @OneToMany(mappedBy = "towerRank")
    private Set<Hero> heroesTower;

    @OneToMany(mappedBy = "pmRank")
    private Set<Hero> heroesPm;

    @OneToMany(mappedBy = "huntRank")
    private Set<Hero> heroesHunt;

    @OneToMany(mappedBy = "kkRank")
    private Set<Hero> heroesKk;

    @OneToMany(mappedBy = "imRank")
    private Set<Hero> heroesIm;

    @OneToMany(mappedBy = "vrRank")
    private Set<Hero> heroesVr;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
