package com.example.demo.Bird;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<Bird, Long> {
    
    @Query(value = "select * from birds s where s.lifeSpan >= 5", nativeQuery = true)
    List<Bird> getBirdsLifeSpan(int lifeSpan);

}
