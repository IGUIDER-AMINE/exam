package ma.enset.conferenceservice.service;



import ma.enset.conferenceservice.entities.Conference;

import java.util.List;

public interface ConferenceService {
    List<Conference> getAllConference();
    Conference addConference(Conference conference);
    Conference getById(long id);
}
