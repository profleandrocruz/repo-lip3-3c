import javax.swing.JOptionPane;

public class ExmploIF {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		if ( x > y ) {
			JOptionPane.showMessageDialog(null,
					x + " � maior que " + y);
		} else if ( x < y ) {
			JOptionPane.showMessageDialog(null,
					x + " � menor que " + y);
		} else {
			JOptionPane.showMessageDialog(null,     
					x + " � igual a " + y);
		}

	}

}
