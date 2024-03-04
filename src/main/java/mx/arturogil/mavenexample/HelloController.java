package mx.arturogil.mavenexample;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class HelloController {
    @FXML
    public void initialize() throws IOException {
        FileChooser fileChooser = new FileChooser();

        // Read single book
//        File jsonFile = fileChooser.showOpenDialog(null);
//        String json = FileUtils.readFileToString(jsonFile, StandardCharsets.UTF_8);
//        ObjectMapper objectMapper = new ObjectMapper();
//        Book book = objectMapper.readValue(json, Book.class);
//
//        System.out.println("json: " + json);
//        System.out.println("book: " + book);

        File jsonFile = fileChooser.showOpenDialog(null);
        String json = FileUtils.readFileToString(jsonFile, StandardCharsets.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();
        List<Book> books = objectMapper.readValue(json, new TypeReference<List<Book>>(){});

    }
}