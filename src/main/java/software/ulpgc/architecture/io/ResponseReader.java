package software.ulpgc.architecture.io;

import java.io.IOException;

public interface ResponseReader {
    String read() throws IOException;
}
