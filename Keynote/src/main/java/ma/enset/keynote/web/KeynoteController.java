package ma.enset.keynote.web;


import lombok.AllArgsConstructor;

import ma.enset.keynote.dto.KeynoteMapper;
import ma.enset.keynote.dto.KeynoteRequest;
import ma.enset.keynote.repositories.KeynoteRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/keynote")
public class KeynoteController {
    private KeynoteRepo keynoteRepo;
    private KeynoteMapper keynoteMapper;

    @GetMapping("/all")
    public List<KeynoteRequest> keyTokenList(){
        return this.keynoteRepo.findAll().stream().map(s->this.keynoteMapper.toKeynoteRequest(s)).collect(Collectors.toList());
    }
    @GetMapping("/id/{id}")
    public KeynoteRequest request(@PathVariable long id){
        return this.keynoteMapper.toKeynoteRequest(this.keynoteRepo.findById(id).orElse(null));
    }

    @PostMapping("/add")
    public KeynoteRequest addKeynote(@RequestBody KeynoteRequest request){
        return this.keynoteMapper.toKeynoteRequest(this.keynoteRepo.save(this.keynoteMapper.toKeynote(request)));
    }
}
