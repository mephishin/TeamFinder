package com.example.teamfinder.data;

import com.example.teamfinder.models.Ad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends CrudRepository<Ad, Long> {
    Iterable<Ad> findAdsByName(String name);
}
