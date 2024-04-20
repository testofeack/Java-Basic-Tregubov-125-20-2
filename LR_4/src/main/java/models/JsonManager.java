package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void writeToJsonFile(Object object, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(object, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T readFromJsonFile(String filename, Class<T> classOfT) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, classOfT);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
