package ma.enset.conferenceservice.web;


import lombok.AllArgsConstructor;
import ma.enset.conferenceservice.entities.Conference;
import ma.enset.conferenceservice.service.ConferenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/conference")
public class ConferenceController {
   private ConferenceService conferenceService;
    @GetMapping("/all")
    public List<Conference> conferences(){
        return this.conferenceService.getAllConference();
    }
    @PostMapping("/add/{id}")
    public Conference addConference(@RequestBody Conference conference){
        return this.conferenceService.addConference(conference);
    }
}
