package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    public Optional<Country> findByName(String name);

    public List<Country> findByOrderByNameAsc();
    public List<Country> findByOrderByNameDesc();

    public List<Country> findByOrderByGdpAsc();
    public List<Country> findByOrderByGdpDesc();

    public List<Country> findByOrderByPopulationAsc();
    public List<Country> findByOrderByPopulationDesc();
}
