import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/*
These files are located in the "Classpath", or /target/classes/app.properties & catalog
 */
public class LoadPropertiesFromFile {
    public static void main(String[] args) throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "app.properties";
        String catalogConfigPath = rootPath + "catalog";

        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        Properties catalogProps = new Properties();
        catalogProps.load(new FileInputStream(catalogConfigPath));
        String appVersion = appProps.getProperty("version");
        System.out.println("appVersion = " + appVersion);
        System.out.println("Catalog c1 option: " + catalogProps.get("c1"));

    }

    private class ConfigOptions {
        public ConfigOptions() {
        }

    }
}
