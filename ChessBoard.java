
import java.awt.Color; 
import java.awt.Graphics; 
import javax.swing.JFrame;
import javax.swing.JPanel; 

public class ChessBoard extends JPanel {
	
	public void paint(Graphics g){
		g.fillRect(100, 100, 400, 400);
		for (int i = 100; i <= 400; i += 100) {
			for (int j = 100; j <= 400; j += 100) {
				g.clearRect(i,j , 50, 50);
			}
		} for (int i = 150; i <= 450; i += 100) {
			for (int j = 150; j <= 450; j += 100 ){
				g.clearRect(i, j, 50, 50);
			}
		}
		
	}
	public static void main(String[] args) {
		JFrame Frame = new JFrame(); 
		Frame.setSize(600,600); 
		Frame.getContentPane().add(new ChessBoard()).setBackground(Color.blue);;
		Frame.setLocationRelativeTo(null);
		Frame.setBackground(Color.blue);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setVisible(true);

	}

}
