package com.takemikazuchi.afkag.entitys;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "fractions")
public class Fraction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name, pic;

    @OneToMany(mappedBy="fraction")
    private Set<Hero> heroes;

    public Integer getFraction_id() {
        return id;
    }

    public void setFraction_id(Integer id) {
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
