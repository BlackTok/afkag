package com.takemikazuchi.afkag.dto;

import com.takemikazuchi.afkag.entitys.Elevation;
import com.takemikazuchi.afkag.entitys.Hero;
import com.takemikazuchi.afkag.entitys.HeroRank;
import com.takemikazuchi.afkag.heroes.ElevationController;
import com.takemikazuchi.afkag.heroes.RankController;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import com.takemikazuchi.afkag.repositorys.RankRepository;
import com.takemikazuchi.afkag.services.ElevationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Component
public class HeroDtoToEntity {
    @Autowired
    private ElevationService elevationService;

    @Autowired
    private RankController rankController;

    public Hero dtoToEntity(HeroDto heroDto) {
        Elevation minElevation = null;
        Elevation optElevation = null;
        Elevation maxElevation = null;
        HeroRank camp = null;
        HeroRank tower = null;
        HeroRank pm = null;
        HeroRank kk = null;
        HeroRank im = null;
        HeroRank vr = null;
        HeroRank hunt = null;

        List<Elevation> elevations = elevationService.getAllElevations();
        for (Elevation value : elevations) {
            String elevation = value.getName();
            int elevationId = value.getId();
            if (elevation.equals(heroDto.getMinElevation())) {
                minElevation = value;
            }
            if (elevation.equals(heroDto.getOptElevation())) {
                optElevation = value;
            }
            if (elevation.equals(heroDto.getMaxElevation())) {
                maxElevation = value;
            }
        }

        List<HeroRank> ranks = rankController.getAllRanks();
        for (HeroRank rank : ranks) {
            if (rank.getName().equals(heroDto.getCamp())) {
                camp = rank;
            }
            if (rank.getName().equals(heroDto.getTower())) {
                tower = rank;
            }
            if (rank.getName().equals(heroDto.getHunt())) {
                hunt = rank;
            }
            if (rank.getName().equals(heroDto.getKk())) {
                kk = rank;
            }
            if (rank.getName().equals(heroDto.getVr())) {
                vr = rank;
            }
            if (rank.getName().equals(heroDto.getIm())) {
                im = rank;
            }
            if (rank.getName().equals(heroDto.getPm())) {
                pm = rank;
            }
        }

        Hero hero = new Hero();
        hero.setId(heroDto.getId());
        hero.setAvatar(heroDto.getAvatar());
        hero.setName(heroDto.getName());
        hero.setAnotherName(heroDto.getAnotherName());
        hero.setInfo(heroDto.getInfo());
        hero.setElevationMin(minElevation);
        hero.setElevationOpt(optElevation);
        hero.setElevationMax(maxElevation);
        hero.setMinIi(heroDto.getMinIi());
        hero.setOptIi(heroDto.getOptIi());
        hero.setMaxIi(heroDto.getMaxIi());
        hero.setMinFurniture(heroDto.getMinFurniture());
        hero.setOptFurniture(heroDto.getOptFurniture());
        hero.setMaxFurniture(heroDto.getMaxFurniture());
        hero.setMinEngrave(heroDto.getMinEngrave());
        hero.setOptEngrave(heroDto.getOptEngrave());
        hero.setMaxEngrave(heroDto.getMaxEngrave());
        hero.setMin_f_info(heroDto.getMinFinfo());
        hero.setOpt_f_info(heroDto.getOptFinfo());
        hero.setMax_f_info(heroDto.getMaxFinfo());
        hero.setMin_e_info(heroDto.getMinEinfo());
        hero.setCampRank(camp);
        hero.setTowerRank(tower);
        hero.setImRank(im);
        hero.setHuntRank(hunt);
        hero.setVrRank(vr);
        hero.setKkRank(kk);
        hero.setPmRank(pm);
        hero.setRank(heroDto.getRank());

        return hero;
    }

    public Hero dtoToEntityUpdate(Hero hero, HeroDto heroDto) {
        Elevation minElevation = null;
        Elevation optElevation = null;
        Elevation maxElevation = null;
        HeroRank camp = null;
        HeroRank tower = null;
        HeroRank pm = null;
        HeroRank kk = null;
        HeroRank im = null;
        HeroRank vr = null;
        HeroRank hunt = null;

        List<Elevation> elevations = elevationService.getAllElevations();
        for (Elevation value : elevations) {
            String elevation = value.getName();
            int elevationId = value.getId();
            if (elevation.equals(heroDto.getMinElevation())) {
                minElevation = value;
            }
            if (elevation.equals(heroDto.getOptElevation())) {
                optElevation = value;
            }
            if (elevation.equals(heroDto.getMaxElevation())) {
                maxElevation = value;
            }
        }

        List<HeroRank> ranks = rankController.getAllRanks();
        for (HeroRank rank : ranks) {
            if (rank.getName().equals(heroDto.getCamp())) {
                camp = rank;
            }
            if (rank.getName().equals(heroDto.getTower())) {
                tower = rank;
            }
            if (rank.getName().equals(heroDto.getHunt())) {
                hunt = rank;
            }
            if (rank.getName().equals(heroDto.getKk())) {
                kk = rank;
            }
            if (rank.getName().equals(heroDto.getVr())) {
                vr = rank;
            }
            if (rank.getName().equals(heroDto.getIm())) {
                im = rank;
            }
            if (rank.getName().equals(heroDto.getPm())) {
                pm = rank;
            }
        }

        hero.setAvatar(heroDto.getAvatar());
        hero.setName(heroDto.getName());
        hero.setAnotherName(heroDto.getAnotherName());
        hero.setInfo(heroDto.getInfo());
        hero.setElevationMin(minElevation);
        hero.setElevationOpt(optElevation);
        hero.setElevationMax(maxElevation);
        hero.setMinIi(heroDto.getMinIi());
        hero.setOptIi(heroDto.getOptIi());
        hero.setMaxIi(heroDto.getMaxIi());
        hero.setMinFurniture(heroDto.getMinFurniture());
        hero.setOptFurniture(heroDto.getOptFurniture());
        hero.setMaxFurniture(heroDto.getMaxFurniture());
        hero.setMinEngrave(heroDto.getMinEngrave());
        hero.setOptEngrave(heroDto.getOptEngrave());
        hero.setMaxEngrave(heroDto.getMaxEngrave());
        hero.setMin_f_info(heroDto.getMinFinfo());
        hero.setOpt_f_info(heroDto.getOptFinfo());
        hero.setMax_f_info(heroDto.getMaxFinfo());
        hero.setMin_e_info(heroDto.getMinEinfo());
        hero.setCampRank(camp);
        hero.setTowerRank(tower);
        hero.setImRank(im);
        hero.setHuntRank(hunt);
        hero.setVrRank(vr);
        hero.setKkRank(kk);
        hero.setPmRank(pm);
        hero.setRank(heroDto.getRank());

        return hero;
    }
}
