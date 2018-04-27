package helloworldmvc.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadText {
	public void testReadText() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/helloworldmvc.model/src/main/resources/Untitled 1"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            
        }
    }
}}
