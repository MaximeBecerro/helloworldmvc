/*
 *
 */
package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    private static String   filename = "HW.txt";
    private String          helloWorldMessage;
    private static ReadText instance;

    private ReadText() throws IOException {
        this.readFile(this.getHelloWorldMessage());
    }

    public static ReadText getInstance() {
        if (ReadText.instance == null) {
            try {
                ReadText.setInstance(new ReadText());
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
        return ReadText.instance;
    }

    public static void setInstance(final ReadText instance) {
        ReadText.instance = instance;
    }

    public String getHelloWorldMessage() {
        return this.helloWorldMessage;
    }

    public void setHelloWorldMessage(final String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    private void readFile(final String helloWorldMessage) throws IOException {
        final File file = new File(ReadText.filename);
        try {
            final FileReader fileReader = new FileReader(file);
            final BufferedReader bufferedReader = new BufferedReader(fileReader);
            this.setHelloWorldMessage(bufferedReader.readLine());
        } catch (final FileNotFoundException e) {
            System.err.println("Le fichier n'a pas été trouvé");
        } catch (final IOException e) {
            System.err.println("Impossible de lire");
        }
    }
}