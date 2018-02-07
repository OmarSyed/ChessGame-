
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage; 

public class ChessBoard {
	
	public void makeBoard(){
		Stage primaryStage = new Stage();
		GridPane grid = new GridPane();
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Chess");
		Color[] color = {Color.BLACK,Color.GHOSTWHITE};  
		Rectangle square = new Rectangle(); 
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				square.setWidth(2);
				square.setHeight(2);
				square.setFill(color[j % 2]);
				GridPane.setRowIndex(square, i);
				GridPane.setColumnIndex(square, j);
				grid.getChildren().addAll(square);
			}
		}
		primaryStage.show();
	}
}
