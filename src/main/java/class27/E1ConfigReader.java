package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
//        System.out.println(path);
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));
    }
}
