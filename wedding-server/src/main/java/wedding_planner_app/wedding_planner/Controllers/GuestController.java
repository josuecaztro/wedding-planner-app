package wedding_planner_app.wedding_planner.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wedding_planner_app.wedding_planner.Models.Guest;
import wedding_planner_app.wedding_planner.Repositories.GuestRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GuestController {

    @Autowired
    private GuestRepository repository;

    @PostMapping("/guests")
    public ResponseEntity<Guest> createGuest(@RequestBody Guest guest){
        Guest newGuest = repository.save(guest);
        return ResponseEntity.ok(newGuest);
    }

    @GetMapping("/guests")
    public List<Guest> getAllGuests(){
        return repository.findAll();
    }
}
