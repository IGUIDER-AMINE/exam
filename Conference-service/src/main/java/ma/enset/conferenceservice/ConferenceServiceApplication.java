package ma.enset.conferenceservice;

import ma.enset.conferenceservice.entities.Conference;
import ma.enset.conferenceservice.enums.TypeConference;
import ma.enset.conferenceservice.service.ConferenceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
@EnableFeignClients
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ConferenceService conferenceService) {
        return args -> {
            Stream.of("feu", "air").forEach(nom -> {
                Conference conference = Conference.builder()
                        .date(new Date()).duree(1212)
                        .typeConference(TypeConference.ACADEMIQUE).titre(nom)
                        .score(12).nb_inscrit(14)
                        .id_keynote(1)
                        .build();
                conferenceService.addConference(conference);
            });
        };

    }
}