package Postcodes;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Deserialiser {
    public DTO ratesMapped;
    public Deserialiser(String filename){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ratesMapped = objectMapper.readValue(new File(filename),DTO.class);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
