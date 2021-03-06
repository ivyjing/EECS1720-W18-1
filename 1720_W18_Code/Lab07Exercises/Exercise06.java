package Lab07Exercises;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This app launches a basic JavaFX app which displays some graphics.
 * 
 * @author mb
 *
 */
public class Exercise06 extends Application {
	private int SCENE_WIDTH = 800;
	private int SCENE_HEIGHT = 600;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		/*
		 * Here are the statements required to configure the Window and its
		 * contents.
		 */
		primaryStage.setTitle(this.getClass().toString());
		Group root = new Group();
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();

		/*
		 * Task 01: Cut and paste the helper method from Exercise04 here. Invoke
		 * the method to obtain an array of File objects.
		 */

		/*
		 * Task 02: Construct an javafx.scene.image.ImageView for each file in
		 * the image directory. Use a List to contain all of the images.
		 */

		/*
		 * Task 03: Add the List of ImageView objects to the root's children.
		 * Use the method addAll(Collection<E>)
		 */
		

		/*
		 * Task 04: Determine the number of images. Resize the width of each
		 * image to get an equal portion of the screen width. Use
		 * setPreserveRatio() to ensure the width_height ratio is reserved.The
		 * heights will vary. Position the images so that they appear in a
		 * single row.
		 */

	}

	public static File[] getImageFiles(String thePath) {
		File[] theFiles = null;
		
		// put your code in here

		return theFiles;

	}

}