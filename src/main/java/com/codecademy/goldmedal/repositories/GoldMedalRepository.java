package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
    public List<GoldMedal> findByCountryOrderByYearAsc(String country);
    public List<GoldMedal> findByCountryOrderByYearDesc(String country);

    public List<GoldMedal> findByCountryOrderBySeasonAsc(String country);
    public List<GoldMedal> findByCountryOrderBySeasonDesc(String country);

    public List<GoldMedal> findByCountryOrderByCityAsc(String country);
    public List<GoldMedal> findByCountryOrderByCityDesc(String country);

    public List<GoldMedal> findByCountryOrderByNameAsc(String country);
    public List<GoldMedal> findByCountryOrderByNameDesc(String country);

    public List<GoldMedal> findByCountryOrderByEventAsc(String country);
    public List<GoldMedal> findByCountryOrderByEventDesc(String country);

    public List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String country, String season);

    public List<GoldMedal> findByCountry(String country);
    public List<GoldMedal> findBySeason(String season);

    public List<GoldMedal> findByCountryAndSeason(String country, String season);

    public List<GoldMedal> findByCountryAndGender(String country, String gender);

}
