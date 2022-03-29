package util;

import java.io.*;

public class FileUtil {
    public static String readToBuffer(String filePath) {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = null;
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            reader = new BufferedReader(new InputStreamReader(is));
            String res = "";
            res = reader.readLine();
            while (res != null) {
               buffer.append(res);
               //buffer.append("")
               res = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffer.toString();
        }
    }
}
