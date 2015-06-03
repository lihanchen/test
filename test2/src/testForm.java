import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hanchenl on 6/2/15.
 */
public class testForm {
	private JButton button1;
	private JPanel panel1;
	private JRadioButton zxczxRadioButton;
	private JCheckBox checkBox1;
	private JTextField textField1;
	private JCheckBox checkBox2;


	public testForm() {
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("testForm");
		frame.setContentPane(new testForm().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
