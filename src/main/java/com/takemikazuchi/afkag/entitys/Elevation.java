package com.takemikazuchi.afkag.entitys;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "elevations")
public class Elevation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name, pic;

    @OneToMany(mappedBy = "elevationMin")
    private Set<Hero> heroesMinE;

    @OneToMany(mappedBy = "elevationOpt")
    private Set<Hero> heroesOptE;

    @OneToMany(mappedBy = "elevationMax")
    private Set<Hero> heroesMaxE;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
