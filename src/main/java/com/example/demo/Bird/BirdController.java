package com.example.demo.Bird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class BirdController {
    
    @Autowired
    private BirdService birdService;

    //Endpoint to get birds
    /**
     * 
     * @return
     */
    @GetMapping("/birds")
    public Object getAllBirds(Model model) {
        model.addAttribute("birdsList", birdService.getAllBirds());
        model.addAttribute("title", "All Birds");
        return "animal-list";
    }

   
    
    //Endpoint to get bird by ID
    /**
     * @param id
     * @return
     */
     @GetMapping("/birds/{id}")
     public Object getBirdById(@PathVariable long id, Model model) {
       model.addAttribute("bird", birdService.getBirdById(id));
       model.addAttribute("title", "Bird #:" + id);
        return "animal-details";
     }



    


     //Endpoint to get bird by name
     /**
      * 
      * @param name
      * @return
      */

     @GetMapping("/birds/name")
     public Object getBirdsByName(@RequestParam String name, Model model) {
        if (name != null) {
            model.addAttribute("birdsList", birdService.getBirdsByName(name));
            model.addAttribute("title", "Birds by Name: " + name);
            return "animal-list";
        } else {
            return "redirect:/birds/";
        }
     }

    //  //Endpoint to get bird by description
    //  /**
    //   * @param description
    //   * @return
    //   */
    //   @GetMapping("/birds/description/{description}")
    //   public Object getBirdsByDescription(@PathVariable String description) {
    //     return birdService.getBirdsByDescription(description);
    //   }

    //   //Endpoint to get bird by breed
    //   /**
    //   * @param breed
    //   * @return
    //   */
    //   @GetMapping("/birds/breed/{breed}")
    //   public Object getBirdsByBreed(@PathVariable String breed) {
    //     return birdService.getBirdsByBreed(breed);
    //   }

    //    //Endpoint to get bird by breed
    //   /**
    //   * @param age
    //   * @return
    //   */
 
    //   @GetMapping("/birds/age/{age}")
    //   public Object getBirdsByAge(@PathVariable int age) {
    //     return birdService.getBirdsByAge(age);
    //   }

    //   //Endpoint to get birds based on certain age
    //   /**
    //    * 
    //    * 
    //    * @return
    //    */
    //   @GetMapping("/birds/ageRange")
    //   public Object getBirdsAtCertainAge(@RequestParam(name="minAge", defaultValue = "5") int minAge, @RequestParam(name="maxAge", defaultValue = "9") int maxAge) {
    //       return new ResponseEntity<>(birdService.getBirdsAtCertainAge(minAge, maxAge), HttpStatus.OK);
    //   }
      

    /**
     * Enpoint to show the create form for a new bird
     * @param bird
     * @return
     */

    @GetMapping("/birds/createForm")
    public Object showCreateForm(Model model) {
        Bird bird = new Bird();
        model.addAttribute("bird", bird);
        model.addAttribute("title", "Create New Bird");
        return "animal-create";
    }
    


    //   //Enpoint to get birds based on Age

      //Endpoint to add Birds
      /**
       * @param bird
       * @return
       */
      @PostMapping("/birds")
      public Object addBirds(Bird bird) {
        Bird newBird = birdService.addBird(bird);
        return "redirect:/birds/" + newBird.getBirdId();
      }

     //Update Bird by id
     /**
      * @param id
      * @param model
      * @return
      */
      @GetMapping("/birds/updateForm/{id}")
      public Object showUpdateForm(@PathVariable Long id, Model model ) {
        Bird bird = birdService.getBirdById(id);
        model.addAttribute("bird", bird);
        model.addAttribute("title", "Update Student: " + id);
        return "animal-update";
      }


      /**
       * Endpoint to update a student
       * 
       * @param id
       * @param bird
       * @return
       */

       @PostMapping("/birds/update/{id}")
       public Object updateBird(@PathVariable Long id, Bird bird) {
        bird.setBirdId(id);
        birdService.updateBird(id, bird);
        return "redirect:/birds/" + id;
       }

       /**
        * Endpoint to delete a student
        * @param id
        * @return
        */
       //
       @GetMapping("/birds/delete/{id}")
       public Object deleteBird(@PathVariable Long id) {
           birdService.deleteBird(id);
           return "redirect:/birds/";
       }
       

      //Delete Bird by Id
      // @DeleteMapping("/birds/{id}")
      // public Object deleteBird(@PathVariable Long id){
      //   birdService.deleteBird(id);
      //   return birdService.getAllBirds();
      // }

      

      




    
}
