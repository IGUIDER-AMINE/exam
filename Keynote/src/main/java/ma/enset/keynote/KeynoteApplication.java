package ma.enset.keynote;

import ma.enset.keynote.entities.Keynote;
import ma.enset.keynote.repositories.KeynoteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class KeynoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepo keynoteRepo){
        return args->{
            Stream.of("aa","bb","cc").forEach(name->{
                Keynote keynote=Keynote.builder().nom(name).email(name+"@gmail.com").prenom("rr").build();
                keynoteRepo.save(keynote);
            });
        };
    }

}

