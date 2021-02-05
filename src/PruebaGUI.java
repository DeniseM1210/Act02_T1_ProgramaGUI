import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class LayoutNulo extends JFrame{
	public LayoutNulo() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 520);
		setTitle("Prueba GUI");
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel txtTexto1 = new JLabel("The clasic form includes all visible fields for this list");
		txtTexto1.setFont(getFont());
		txtTexto1.setBounds(0, 0, 300, 25);
		add(txtTexto1);
		
		JLabel txtTexto2 = new JLabel("Form Options");
		txtTexto2.setBounds(0, 0, 200, 70);
		add(txtTexto2);
		
		JLabel txtTexto3 = new JLabel("Include the following:");
		txtTexto3.setFont(getFont());
		txtTexto3.setBounds(0, 0, 250, 120);
		add(txtTexto3);
		
		JCheckBox check1 = new JCheckBox("a title for your form");;
		check1.setBounds(0, 70, 300, 20);
		add(check1);
		
		JTextField caja1 = new JTextField(10);
		caja1.setBounds(0, 96, 300, 27);
		add(caja1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton opcion1 = new JRadioButton("only required fields");
		opcion1.setBounds(0, 150, 300, 20);
		bg.add(opcion1);
		add(opcion1);
		JRadioButton opcion2 = new JRadioButton("all fields");
		opcion2.setBounds(0, 170, 300, 20);
		bg.add(opcion2);
		add(opcion2);
		
		JLabel txtTexto4 = new JLabel("(edit required fields in the form builder)");
		txtTexto4.setFont(getFont());
		txtTexto4.setBounds(30, 190, 300, 20);
		add(txtTexto4);
		
		JCheckBox check2 = new JCheckBox("interest group fields");
		check2.setBounds(0, 240, 300, 20);
		add(check2);
		
		JCheckBox check3 = new JCheckBox("required field indicators");
		check3.setBounds(0, 260, 300, 20);
		add(check3);
		
		JLabel txtTexto5 = new JLabel("Set form width");
		txtTexto5.setFont(getFont());
		txtTexto5.setBounds(0, 290, 300, 20);
		add(txtTexto5);
		
		JTextField caja2 = new JTextField(10);
		caja2.setBounds(0, 310, 300, 27);
		add(caja2);
		
		JLabel txtTexto6 = new JLabel("Enhance your form");
		txtTexto6.setFont(getFont());
		txtTexto6.setBounds(0, 350, 300, 20);
		add(txtTexto6);
		
		JCheckBox check4 = new JCheckBox("enable evil popup mode");
		check4.setBounds(0, 370,300,20);
		add(check4);
		JCheckBox check5 = new JCheckBox("disable all JavaScript");
		check5.setBounds(0, 395, 300, 20);
		add(check5);
		JCheckBox check6 = new JCheckBox("include archive link");
		check6.setBounds(0, 420, 300, 20);
		add(check6);
		JCheckBox check7 = new JCheckBox("include MonkeyRewards link");
		check7.setBounds(0, 445, 300, 20);
		add(check7);
		
		setVisible(true);
	}
}
public class PruebaGUI {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LayoutNulo();
				
			}
		});

	}

}
