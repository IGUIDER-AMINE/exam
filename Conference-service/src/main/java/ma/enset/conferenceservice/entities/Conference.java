package ma.enset.conferenceservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.conferenceservice.enums.TypeConference;
import ma.enset.conferenceservice.model.KeyNote;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private TypeConference typeConference;
    private Date date;
    private long duree;
    private double score;
    private int nb_inscrit;
    private int id_keynote;
    @Transient
    private KeyNote keyNoteList;
}
