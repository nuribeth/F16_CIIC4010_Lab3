import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame nuribeth = new JFrame("Hello, Nuri!");
		nuribeth.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		nuribeth.setLocation(400, 250);
		nuribeth.setSize(200, 200);
		nuribeth.setVisible(true);
		
	     MyPanelClass myPanel = new MyPanelClass();
         nuribeth.getContentPane().add(myPanel);
	}
}