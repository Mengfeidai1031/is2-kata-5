package software.ulpgc.apps.windows;

import software.ulpgc.architecture.io.ApiPokemonAdapter;
import software.ulpgc.architecture.io.PokemonResponseDeserializer;
import software.ulpgc.architecture.io.PokemonResponseReader;
import software.ulpgc.architecture.model.Pokemon;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String read = new PokemonResponseReader().read();
        Object deserialized = new PokemonResponseDeserializer().deserialize(read);
        Pokemon pokemon = new ApiPokemonAdapter().adapt(deserialized);
        System.out.println(pokemon);

    }
}
