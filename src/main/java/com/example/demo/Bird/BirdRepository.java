package com.example.demo.Bird;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<Bird, Long> {
    
    @Query(value = "select * from birds s where s.age >= ?1 and s.age <= ?2", nativeQuery = true)
    List<Bird> getBirdsAtCertainAge(int minAge, int maxAge);

    List<Bird> getBirdsByAge(int age);
    List<Bird> getBirdsByName(String name);
    List<Bird> getBirdsByBreed(String breed);
    List<Bird> getBirdsByDescription(String description);
    
    

}
