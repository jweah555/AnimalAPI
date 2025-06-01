package com.example.demo.Bird;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BirdService {
    
    @Autowired
    private BirdRepository birdRepository;

    //Get All Birds
   /**
   * Method to get all students
   *
   *  @return List of all students
   */

    public Object getAllBirds() {
        return birdRepository.findAll();
    }

    //Get Birds by their ID
    /**
   * Method to get a student by ID
   *
   * @param birdId The ID of the student to retrieve
   * @return The student with the specified ID
   */
    
    
    public Bird getBirdById(@PathVariable long birdId) {
        return birdRepository.findById(birdId).orElse(null);
    }
    
    //Get Birds by Name
     /**
     * 
     *  @param name
     *  @return 
     */
    public Object getBirdsByName(String name){
        return birdRepository.getBirdsByName(name);
    }


    //Get bird by Description
    /**
     * 
     * @param description
     * @return
     */

    public Object getBirdsByDescription(String description) {
        return birdRepository.getBirdsByDescription(description);
    }

    //Get bird by breed
    /**
     * 
     * @param breed
     * @return
     */

    public Object getBirdsByBreed(String breed) {
        return birdRepository.getBirdsByBreed(breed);
    }

    /**
     * Get all birds with age above x value.
     * 
     * @param age
     * @return
     */
    public Object getBirdsAtCertainAge(int minAge, int maxAge){
        return birdRepository.getBirdsAtCertainAge(minAge, maxAge);
    }

    //Add bird

    /**
     *  @param bird
     */
    public Bird addBird(Bird bird) {
        return birdRepository.save(bird);
    }

    //Update Student
    /**
     * 
     * @param birdId
     * @param bird
     */

    public Bird updateBird(Long birdId, Bird bird) {
        return birdRepository.save(bird);
    }

    //Get Bird by age
    /**
     * @param age
     * @return
     */
    public Object getBirdsByAge(int age) {
        return birdRepository.getBirdsByAge(age);
    }

    //Delete bird
    /**
     * 
     * @param birdId
     */
    public void deleteBird(Long birdId) {
        birdRepository.deleteById(birdId);
    }


    //Method to write a bird ID to a JSON file
    /**
     * 
     * @param bird
     */

    public String writeJson(Bird bird) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("students.json"), bird);
            return "Student written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing student to JSON file";
        }

    }

    /**
     * 
     * @return
     */
    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("studens.json"), Bird.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}

