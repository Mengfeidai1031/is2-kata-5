package software.ulpgc.architecture.io;

import software.ulpgc.architecture.model.Pokemon;
import software.ulpgc.architecture.model.PokemonResponse;

public class ApiPokemonAdapter implements PokemonAdapter {
    @Override
    public Pokemon adapt(Object o) {
        PokemonResponse response = (PokemonResponse) o;
        return new Pokemon(
                nameFrom(response),
                primaryTypeFrom(response),
                abilityFrom(response)
        );
    }

    private String abilityFrom(PokemonResponse response) {
        return response.abilities().get(2).ability().name();
    }

    private String primaryTypeFrom(PokemonResponse response) {
        return response.types().getFirst().type().name();
    }

    private String nameFrom(PokemonResponse response) {
        return response.name();
    }
}
