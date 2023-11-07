package com.takemikazuchi.afkag.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "heroes")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "min_ii")
    private Integer minIi;
    @Column(name = "max_engrave")
    private Integer maxEngrave;
    @Column(name = "opt_engrave")
    private Integer optEngrave;
    @Column(name = "min_engrave")
    private Integer minEngrave;
    @Column(name = "max_furniture")
    private Integer maxFurniture;
    @Column(name = "opt_furniture")
    private Integer optFurniture;
    @Column(name = "min_furniture")
    private Integer minFurniture;
    @Column(name = "max_ii")
    private Integer maxIi;
    @Column(name = "opt_ii")
    private Integer optIi;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "name")
    private String name;
    @Column(name = "another_name")
    private String anotherName;
    @Column(name = "info")
    private String info;
    @Column(name = "min_f_info")
    private String min_f_info;
    @Column(name = "opt_f_info")
    private String opt_f_info;
    @Column(name = "max_f_info")
    private String max_f_info;
    @Column(name = "min_e_info")
    private String min_e_info;
    @Column(name = "opt_e_info")
    private String opt_e_info;
    @Column(name = "max_e_info")
    private String max_e_info;
    @Column(name = "rank")
    private Double rank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fraction_id")
    private Fraction fraction;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "min_elevation")
    private Elevation elevationMin;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "opt_elevation")
    private Elevation elevationOpt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "max_elevation")
    private Elevation elevationMax;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "camp")
    private HeroRank campRank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tower")
    private HeroRank towerRank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pm")
    private HeroRank pmRank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hunt")
    private HeroRank huntRank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kk")
    private HeroRank kkRank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "im")
    private HeroRank imRank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vr")
    private HeroRank vrRank;

    public HeroRank getCampRank() {
        return campRank;
    }

    public void setCampRank(HeroRank campRank) {
        this.campRank = campRank;
    }

    public HeroRank getTowerRank() {
        return towerRank;
    }

    public void setTowerRank(HeroRank towerRank) {
        this.towerRank = towerRank;
    }

    public HeroRank getPmRank() {
        return pmRank;
    }

    public void setPmRank(HeroRank pmRank) {
        this.pmRank = pmRank;
    }

    public HeroRank getHuntRank() {
        return huntRank;
    }

    public void setHuntRank(HeroRank huntRank) {
        this.huntRank = huntRank;
    }

    public HeroRank getKkRank() {
        return kkRank;
    }

    public void setKkRank(HeroRank kkRank) {
        this.kkRank = kkRank;
    }

    public HeroRank getImRank() {
        return imRank;
    }

    public void setImRank(HeroRank imRank) {
        this.imRank = imRank;
    }

    public HeroRank getVrRank() {
        return vrRank;
    }

    public void setVrRank(HeroRank vrRank) {
        this.vrRank = vrRank;
    }

    public Integer getId() {
        return id;
    }

    public Elevation getElevationMin() {
        return elevationMin;
    }

    public void setElevationMin(Elevation elevationMin) {
        this.elevationMin = elevationMin;
    }

    public Elevation getElevationOpt() {
        return elevationOpt;
    }

    public void setElevationOpt(Elevation elevationOpt) {
        this.elevationOpt = elevationOpt;
    }

    public Elevation getElevationMax() {
        return elevationMax;
    }

    public void setElevationMax(Elevation elevationMax) {
        this.elevationMax = elevationMax;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinIi() {
        return minIi;
    }

    public void setMinIi(Integer minIi) {
        this.minIi = minIi;
    }

    public Integer getOptIi() {
        return optIi;
    }

    public void setOptIi(Integer optIi) {
        this.optIi = optIi;
    }

    public Integer getMaxIi() {
        return maxIi;
    }

    public void setMaxIi(Integer maxIi) {
        this.maxIi = maxIi;
    }

    public Integer getMinFurniture() {
        return minFurniture;
    }

    public void setMinFurniture(Integer minFurniture) {
        this.minFurniture = minFurniture;
    }

    public Integer getOptFurniture() {
        return optFurniture;
    }

    public void setOptFurniture(Integer optFurniture) {
        this.optFurniture = optFurniture;
    }

    public Integer getMaxFurniture() {
        return maxFurniture;
    }

    public void setMaxFurniture(Integer maxFurniture) {
        this.maxFurniture = maxFurniture;
    }

    public Integer getMinEngrave() {
        return minEngrave;
    }

    public void setMinEngrave(Integer minEngrave) {
        this.minEngrave = minEngrave;
    }

    public Integer getOptEngrave() {
        return optEngrave;
    }

    public void setOptEngrave(Integer optEngrave) {
        this.optEngrave = optEngrave;
    }

    public Integer getMaxEngrave() {
        return maxEngrave;
    }

    public void setMaxEngrave(Integer maxEngrave) {
        this.maxEngrave = maxEngrave;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMin_f_info() {
        return min_f_info;
    }

    public void setMin_f_info(String min_f_info) {
        this.min_f_info = min_f_info;
    }

    public String getOpt_f_info() {
        return opt_f_info;
    }

    public void setOpt_f_info(String opt_f_info) {
        this.opt_f_info = opt_f_info;
    }

    public String getMax_f_info() {
        return max_f_info;
    }

    public void setMax_f_info(String max_f_info) {
        this.max_f_info = max_f_info;
    }

    public String getMin_e_info() {
        return min_e_info;
    }

    public void setMin_e_info(String min_e_info) {
        this.min_e_info = min_e_info;
    }

    public String getOpt_e_info() {
        return opt_e_info;
    }

    public void setOpt_e_info(String opt_e_info) {
        this.opt_e_info = opt_e_info;
    }

    public String getMax_e_info() {
        return max_e_info;
    }

    public void setMax_e_info(String max_e_info) {
        this.max_e_info = max_e_info;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", minIi=" + minIi +
                ", optIi=" + optIi +
                ", maxIi=" + maxIi +
                ", minFurniture=" + minFurniture +
                ", optFurniture=" + optFurniture +
                ", maxFurniture=" + maxFurniture +
                ", minEngrave=" + minEngrave +
                ", optEngrave=" + optEngrave +
                ", maxEngrave=" + maxEngrave +
                ", avatar='" + avatar + '\'' +
                ", name='" + name + '\'' +
                ", anotherName='" + anotherName + '\'' +
                ", info='" + info + '\'' +
                ", min_f_info='" + min_f_info + '\'' +
                ", opt_f_info='" + opt_f_info + '\'' +
                ", max_f_info='" + max_f_info + '\'' +
                ", min_e_info='" + min_e_info + '\'' +
                ", opt_e_info='" + opt_e_info + '\'' +
                ", max_e_info='" + max_e_info + '\'' +
                ", rank=" + rank +
                ", fraction=" + fraction +
                ", elevationMin=" + elevationMin +
                ", elevationOpt=" + elevationOpt +
                ", elevationMax=" + elevationMax +
                ", campRank=" + campRank +
                ", towerRank=" + towerRank +
                ", pmRank=" + pmRank +
                ", huntRank=" + huntRank +
                ", kkRank=" + kkRank +
                ", imRank=" + imRank +
                ", vrRank=" + vrRank +
                '}';
    }
}
