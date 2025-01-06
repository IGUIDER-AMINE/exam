package ma.enset.keynote.dto;


import ma.enset.keynote.entities.Keynote;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
public class KeynoteMapper {
    private final ModelMapper modelMapper=new ModelMapper();
    public KeynoteRequest toKeynoteRequest(Keynote keynote){
        return this.modelMapper.map(keynote,KeynoteRequest.class);
    }
    public Keynote toKeynote(KeynoteRequest keynote){
        return this.modelMapper.map(keynote,Keynote.class);
    }
}
