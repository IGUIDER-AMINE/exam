package ma.enset.conferenceservice.repositories;

import ma.enset.conferenceservice.model.KeyNote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="keyNote-service")
public interface KeynoteRepo {
    @GetMapping("/keynote/id/{id}")
    public KeyNote keyNote (@PathVariable long id);
}
