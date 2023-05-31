package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.apache.logging.log4j.util.PropertiesUtil.getProperties;

public class ConfigReader {
    public static Properties getProperties(String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties;

    }

    public static String getProperty(String key) throws IOException {
        Properties properties = getProperties(Constants.ConfigReaderPath);
        String value=properties.getProperty(key);
        return value;
    }
}