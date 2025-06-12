package com.example.__1_12.repository;

import com.example.__1_12.entity.Websites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsitesRepository extends JpaRepository<Websites, Long> {
}
