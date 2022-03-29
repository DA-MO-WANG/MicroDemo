package util;

import java.io.*;

public class FileUtil {
    public static void readToBuffer(StringBuffer buffer,String filePath) {
        String res = "";
        try {
            InputStream is = new FileInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            res = reader.readLine();
            while (res != null) {
               buffer.append(res);
               buffer.append("")
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
