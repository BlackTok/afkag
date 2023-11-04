package com.takemikazuchi.afkag.dto;

import com.takemikazuchi.afkag.entitys.Hero;

public class HeroDto {
    private int id, minIi, optIi, maxIi, minFurniture, optFurniture, maxFurniture, minEngrave, optEngrave, maxEngrave;
    private String avatar, name, anotherName, info, optElevationPic, maxElevationPic, optElevation, maxElevation, minFinfo, optFinfo, maxFinfo, minEinfo, optEinfo, maxEinfo, fraction, fractionPic, minElevation, minElevationPic, camp, tower, pm, hunt, kk, im, vr;
    private double rank;

    public HeroDto() {
    }

    public HeroDto (Hero hero) {
        this.id = hero.getId();
        this.fraction = hero.getFraction().getName();
        this.fractionPic = hero.getFraction().getPic();
        this.minElevation = hero.getElevationMin().getName();
        this.minElevationPic = hero.getElevationMin().getPic();
        this.optElevation = hero.getElevationOpt().getName();
        this.optElevationPic = hero.getElevationOpt().getPic();
        this.maxElevation = hero.getElevationMax().getName();
        this.maxElevationPic = hero.getElevationMax().getPic();
        this.minIi = hero.getMinIi();
        this.optIi = hero.getOptIi();
        this.maxIi = hero.getMaxIi();
        this.minFurniture = hero.getMinFurniture();
        this.optFurniture = hero.getOptFurniture();
        this.maxFurniture = hero.getMaxFurniture();
        this.minEngrave = hero.getMinEngrave();
        this.optEngrave = hero.getOptEngrave();
        this.maxEngrave = hero.getMaxEngrave();
        this.camp = hero.getCampRank().getName();
        this.tower = hero.getTowerRank().getName();
        this.pm = hero.getPmRank().getName();
        this.hunt = hero.getHuntRank().getName();
        this.kk = hero.getKkRank().getName();
        this.im = hero.getImRank().getName();
        this.vr = hero.getVrRank().getName();
        this.avatar = hero.getAvatar();
        this.name = hero.getName();
        this.anotherName = hero.getAnotherName();
        this.info = hero.getInfo();
        this.minFinfo = hero.getMin_f_info();
        this.optFinfo = hero.getOpt_f_info();
        this.maxFinfo = hero.getMax_f_info();
        this.minEinfo = hero.getMin_e_info();
        this.optEinfo = hero.getOpt_e_info();
        this.maxEinfo = hero.getMax_e_info();
        this.rank = hero.getRank();
    }

    public int getId() {
        return id;
    }

    public int getMinIi() {
        return minIi;
    }

    public int getOptIi() {
        return optIi;
    }

    public int getMaxIi() {
        return maxIi;
    }

    public int getMinFurniture() {
        return minFurniture;
    }

    public int getOptFurniture() {
        return optFurniture;
    }

    public int getMaxFurniture() {
        return maxFurniture;
    }

    public int getMinEngrave() {
        return minEngrave;
    }

    public int getOptEngrave() {
        return optEngrave;
    }

    public int getMaxEngrave() {
        return maxEngrave;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public String getInfo() {
        return info;
    }

    public String getOptElevationPic() {
        return optElevationPic;
    }

    public String getMaxElevationPic() {
        return maxElevationPic;
    }

    public String getOptElevation() {
        return optElevation;
    }

    public String getMaxElevation() {
        return maxElevation;
    }

    public String getMinFinfo() {
        return minFinfo;
    }

    public String getOptFinfo() {
        return optFinfo;
    }

    public String getMaxFinfo() {
        return maxFinfo;
    }

    public String getMinEinfo() {
        return minEinfo;
    }

    public String getOptEinfo() {
        return optEinfo;
    }

    public String getMaxEinfo() {
        return maxEinfo;
    }

    public String getFraction() {
        return fraction;
    }

    public String getFractionPic() {
        return fractionPic;
    }

    public String getMinElevation() {
        return minElevation;
    }

    public String getMinElevationPic() {
        return minElevationPic;
    }

    public String getCamp() {
        return camp;
    }

    public String getTower() {
        return tower;
    }

    public String getPm() {
        return pm;
    }

    public String getHunt() {
        return hunt;
    }

    public String getKk() {
        return kk;
    }

    public String getIm() {
        return im;
    }

    public String getVr() {
        return vr;
    }

    public double getRank() {
        return rank;
    }
}
