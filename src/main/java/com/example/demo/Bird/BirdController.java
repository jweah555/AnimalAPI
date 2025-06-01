package com.example.demo.Bird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirdController {
    
    @Autowired
    private BirdService birdService;

    //Endpoint to get birds
    /**
     * 
     * @return
     */
    @GetMapping("/birds")
    public Object getAllStudents() {
        return birdService.getAllBirds();
    }

    //Endpoint to get bird by ID
    /**
     * @param id
     * @return
     */
     @GetMapping("/birds/{id}")
     public Bird getBirdById(@PathVariable long id) {
        return birdService.getBirdById(id);
     }

     //Endpoint to get bird by name
     /**
      * 
      * @param name
      * @return
      */

     @GetMapping("/birds/name")
     public Object getBirdsByName(@RequestParam String key) {
        if (key != null) {
            return birdService.getBirdsByName(key);
        } else {
            return birdService.getAllBirds();
        }

     }

     //Endpoint to get bird by description
     /**
      * @param description
      * @return
      */
      @GetMapping("/birds/description/{description}")
      public Object getBirdsByDescription(@PathVariable String description) {
        return birdService.getBirdsByDescription(description);
      }

      //Endpoint to get bird by breed
      /**
      * @param breed
      * @return
      */
      @GetMapping("/birds/breed/{breed}")
      public Object getBirdsByBreed(@PathVariable String breed) {
        return birdService.getBirdsByBreed(breed);
      }

       //Endpoint to get bird by breed
      /**
      * @param age
      * @return
      */
 
      @GetMapping("/birds/age/{age}")
      public Object getBirdsByAge(@PathVariable int age) {
        return birdService.getBirdsByAge(age);
      }

      //Endpoint to get birds based on certain age
      /**
       * 
       * 
       * @return
       */
      @GetMapping("/birds/ageRange")
      public Object getBirdsAtCertainAge(@RequestParam(name="minAge", defaultValue = "5") int minAge, @RequestParam(name="maxAge", defaultValue = "9") int maxAge) {
          return new ResponseEntity<>(birdService.getBirdsAtCertainAge(minAge, maxAge), HttpStatus.OK);
      }
      



      //Enpoint to get birds based on Age

      //Endpoint to add Birds
      /**
       * @param bird
       * @return
       */
      @PostMapping("/birds")
      public Object addBirds(@RequestBody Bird bird) {
        return birdService.addBird(bird);
      }

     //Update Bird by id
     /**
      * @param id
      * @param bird
      * @return
      */
      @PutMapping("/birds/{id}")
      public Bird updateBird(@PathVariable Long id, @RequestBody Bird bird ) {
        birdService.updateBird(id, bird);
        return birdService.getBirdById(id);
      }

      //Delete Bird by Id
      @DeleteMapping("/birds/{id}")
      public Object deleteBird(@PathVariable Long id){
        birdService.deleteBird(id);
        return birdService.getAllBirds();
      }

      

      




    
}
