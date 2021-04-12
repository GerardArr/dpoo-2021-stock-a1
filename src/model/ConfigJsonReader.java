package model;
import java.io.File;
import java.io.FileReader;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class ConfigJsonReader {

    public ConfigJsonReader() {

    }

    public void readDatabase() {

        File input = new File("config.json");

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject databaseInfo = fileElement.getAsJsonObject();

            int port = databaseInfo.get("port").getAsInt();
            String ip = databaseInfo.get("ip").getAsString();
            String database = databaseInfo.get("database").getAsString();
            String username = databaseInfo.get("username").getAsString();
            String password = databaseInfo.get("password").getAsString();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int readDataPort() {

        File input = new File("config.json");
        int port = 0;

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject databaseInfo = fileElement.getAsJsonObject();

            port = databaseInfo.get("port").getAsInt();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return port;
    }

    public String readDataIP() {

        File input = new File("config.json");
        String ip = null;

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject databaseInfo = fileElement.getAsJsonObject();

            ip = databaseInfo.get("ip").getAsString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ip;
    }

    public String readDataName() {

        File input = new File("config.json");
        String name = null;

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject databaseInfo = fileElement.getAsJsonObject();

            name = databaseInfo.get("database").getAsString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return name;
    }

    public String readDataUsername() {

        File input = new File("config.json");
        String username = null;

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject databaseInfo = fileElement.getAsJsonObject();

            username = databaseInfo.get("username").getAsString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return username;
    }

    public String readDataPassword() {

        File input = new File("config.json");
        String password = null;

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject databaseInfo = fileElement.getAsJsonObject();

            password = databaseInfo.get("password").getAsString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return password;
    }




}
