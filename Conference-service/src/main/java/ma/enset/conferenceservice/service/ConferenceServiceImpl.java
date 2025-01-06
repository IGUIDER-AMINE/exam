package ma.enset.conferenceservice.service;

import lombok.AllArgsConstructor;
import ma.enset.conferenceservice.entities.Conference;
import ma.enset.conferenceservice.repositories.ConferenceRepo;
import ma.enset.conferenceservice.repositories.KeynoteRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ConferenceServiceImpl implements ConferenceService {
    private ConferenceRepo conferenceRepo;
    private KeynoteRepo keynoteRepo;
    @Override
    public List<Conference> getAllConference() {
         List<Conference> conferences=this.conferenceRepo.findAll();
         conferences.forEach(conference->conference.setKeyNoteList(this.keynoteRepo.keyNote(conference.getId_keynote())));
         return conferences;
    }
    @Override
    public Conference addConference(Conference conference) {
        conference.setKeyNoteList(this.keynoteRepo.keyNote(conference.getId_keynote()));
      return this.conferenceRepo.save(conference);
    }
    @Override
    public Conference getById(long id) {
        return this.conferenceRepo.findById(id).orElse(null);
    }
}
