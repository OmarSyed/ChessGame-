import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.StackPane; 
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Main extends Application{
    final int rows = 8; 
    
	public static void main(String[] args) throws Exception{
            launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
                primaryStage.setTitle("Chess");
                Button start_button = new Button("Start game");
                start_button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){
                        createBoard(primaryStage);
                    }
                });
                Button exit_button = new Button("Exit game");
                exit_button.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        primaryStage.close();
                        System.exit(0);
                    }
                });
                VBox buttons = new VBox(); 
                buttons.getChildren().add(start_button);
                buttons.getChildren().add(exit_button);
                Scene start_menu = new Scene(buttons);
                primaryStage.setScene(start_menu);
                primaryStage.show(); 
        }
        
        public void createBoard(Stage primaryStage){
            int rowNum = 8;
            int colNum = 8;
            int color = 0;
            GridPane grid = new GridPane();
            Paint[] colors = {Paint.valueOf("black"), Paint.valueOf("white")};
            for (int row = 0; row < rowNum; row++) {
                for (int col = 0; col < colNum; col++) {
                    Rectangle rec = new Rectangle();
                    rec.setWidth(50);
                    rec.setHeight(50);
                    rec.setFill(colors[color++%2]);
                    GridPane.setRowIndex(rec, row);
                    GridPane.setColumnIndex(rec, col);
                    grid.getChildren().addAll(rec);
                }
                if (color % 2 == 0)
                    color = 1;
                else
                    color = 0;
            }
            Scene board = new Scene(grid);
            primaryStage.setScene(board); 
            primaryStage.show();
        }
}
