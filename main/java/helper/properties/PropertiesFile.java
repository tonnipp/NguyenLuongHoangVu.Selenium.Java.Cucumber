package helper.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {
    private static Properties properties;
    private static FileInputStream fileIn;
    private static FileOutputStream fileOut;

    //Get the path to the current project
    static String projectPath = System.getProperty("user.dir") + "/";
    //Create path to default configs.properties file
    private static String propertiesFilePathRoot = "src/test/resources/configs.properties";

    public static void setPropertiesFile() {
        properties = new Properties();
        try {
            //Initialize values ​​for objects of class FileInputStream
            fileIn = new FileInputStream(projectPath + propertiesFilePathRoot);
            //Load properties file
            properties.load(fileIn);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
    }

    //Build the Get Value function from the Key of the properties file set up above
    public static String getPropValue(String KeyProp) {
        String value = null;
        try {
            //get values from properties file
            value = properties.getProperty(KeyProp);
            System.out.println(value);
            return value;
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return value;
    }

    //Build the Set Value function with the corresponding Key into the properties file set up above.
    public static void setPropValue(String KeyProp, String Value) {
        try {
            //Initialize values ​​for objects of class FileOutputStream
            fileOut = new FileOutputStream(projectPath + propertiesFilePathRoot);
            //Load the current properties file and map the value to the corresponding key
            properties.setProperty(KeyProp, Value);
            //Save key and value to properties file
            properties.store(fileOut, "Set new value in properties file");
            System.out.println("Set new value in file properties success.");
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
    }
}
