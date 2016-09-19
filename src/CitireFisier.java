import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 19.09.2016.
 */
public class CitireFisier {
    public static String read(String tmp) {
        BufferedReader bufIn = null;
        String text = "a";
        try {
            bufIn = new BufferedReader(new FileReader(tmp));

            String e;
            while ((e = bufIn.readLine()) != null) {
             //   System.out.println(e);
                //text = text.concat(e);
                text = text + e;
             //   text = text + "sd";
               // System.out.println(text);
            }
        } catch (IOException var11) {
            System.err.println(var11);
        } finally {
            if (bufIn != null) {
                try {
                    bufIn.close();
                } catch (IOException var10) {
                    System.err.println(var10);
                }
            }


            return text;

        }

    }

}
