package software.ulpgc.architecture.io;

import com.google.gson.Gson;
import software.ulpgc.architecture.model.PokemonResponse;

public class PokemonResponseDeserializer implements ResponseDeserializer{
    @Override
    public Object deserialize(String content) {
        return new Gson().fromJson(content, PokemonResponse.class);
    }
}
