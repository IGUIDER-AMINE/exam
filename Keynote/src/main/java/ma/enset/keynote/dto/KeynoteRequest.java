package ma.enset.keynote.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class KeynoteRequest {
    private String nom;
    private String prenom;
    private String email;
    private String fontion;
}
