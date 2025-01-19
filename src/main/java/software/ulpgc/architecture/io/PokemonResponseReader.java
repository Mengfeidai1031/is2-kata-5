package software.ulpgc.architecture.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class PokemonResponseReader implements ResponseReader {
    @Override
    public String read() throws IOException {
        Connection.Response response = Jsoup.connect("https://pokeapi.co/api/v2/pokemon/gardevoir")
                .method(Connection.Method.GET).ignoreContentType(true).execute();
        return response.body();
    }
}
