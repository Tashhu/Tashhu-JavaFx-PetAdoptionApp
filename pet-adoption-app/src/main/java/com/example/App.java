package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import javafx.scene.text.Text.*;
import javafx.scene.text.*;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Dog Adoption Search ");

        // create a tile pane
        // TilePane r = new TilePane();

        // create a label for sort list
        Text toggleLabel = new Text("See Critical list or All ");

        // create radiobuttons
        // Toggle group of radio buttons
        ToggleGroup cral = new ToggleGroup();
        RadioButton CriList = new RadioButton("Critical");
        CriList.setToggleGroup(cral);
        RadioButton all = new RadioButton("All");
        all.setToggleGroup(cral);

        // Label for sorting list by
        Text sortLabel = new Text("Sort By");

        // Label for dog breed
        Text breedLabel = new Text("Dog by Breed");
        // Choice box for dogbreed
        ChoiceBox dogBreedBox = new ChoiceBox();
        dogBreedBox.getItems().addAll("German Shepard", "Doberman", "Puddle", "Golden Retriever", "Rotwieler");

        // Label for distance
        Text distanceLabel = new Text("Dogs by Distance");
        // Choice box for distance
        ChoiceBox distanceBox = new ChoiceBox();
        distanceBox.getItems().addAll("5", "10", "15", "20", "25", "30");

        // Label for age
        Text ageLabel = new Text("Dogs By Age");
        // Choice box for dogbreed
        ChoiceBox ageBox = new ChoiceBox();
        ageBox.getItems().addAll("6 months", "8 months", "1 year", " 2 years", "Greate than 2 years");

        // Creating a Grid Pane
        GridPane gridPane = new GridPane();

        // Setting size for the pane
        gridPane.setMinSize(500, 500);

        // Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        // Setting the Grid alignment
        gridPane.setAlignment(Pos.TOP_CENTER);

        // Arranging all the nodes in the grid
        gridPane.add(toggleLabel, 1, 0);
        gridPane.add(CriList, 0, 1);
        gridPane.add(all, 1, 1);
        gridPane.add(sortLabel, 1, 2);
        gridPane.add(breedLabel, 0, 3);
        gridPane.add(distanceLabel, 1, 3);
        gridPane.add(ageLabel, 2, 3);
        gridPane.add(dogBreedBox, 0, 4);
        gridPane.add(distanceBox, 1, 4);
        gridPane.add(ageBox, 2, 4);

        // gridPane.add(technologiesLabel, 0, 4);
        // gridPane.add(javaCheckBox, 1, 4);
        // gridPane.add(dotnetCheckBox, 2, 4);

        // gridPane.add(educationLabel, 0, 5);
        // gridPane.add(educationListView, 1, 5);

        // gridPane.add(locationLabel, 0, 6);
        // gridPane.add(locationchoiceBox, 1, 6);

        // gridPane.add(buttonRegister, 2, 8);

        // Setting the back ground color
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // Creating a scene object
        Scene scene = new Scene(gridPane);

        // Setting title to the Stage
        stage.setTitle("Dog Adoption App");

        // Adding scene to the stage
        stage.setScene(scene);

        // Displaying the contents of the stage
        stage.show();

        // scene = new Scene(loadFXML("primary"), 640, 480);
        // scene = new Scene(r, 640, 480);
        // stage.setScene(scene);
        // stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}