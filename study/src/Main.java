
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 명품자바 9장 실습문제 7번
public class Main extends JFrame {
	public Main() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		c.add(new NorthPane(), BorderLayout.NORTH);
		c.add(new CenterPane(), BorderLayout.CENTER);
		c.add(new SouthPane(), BorderLayout.SOUTH);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}

class NorthPane extends JPanel {
	public NorthPane() {
		JButton a = new JButton("1");
		JButton b = new JButton("2");
		JButton c = new JButton("3");
		setBackground(Color.cyan);

		setLayout(null);
		a.setSize(30, 30);
		add(a);
	}
}

class CenterPane extends JPanel {
	public CenterPane() {
		GridLayout grid = new GridLayout(4, 4, 10, 10);
		setLayout(grid);
		setBackground(Color.white);

		for (int i = 0; i < 10; i++) {
			add(new Button(i + ""));
		}
		add(new Button("CE"));
		add(new Button("계산"));
		add(new Button("+"));
		add(new Button("-"));
		add(new Button("*"));
		add(new Button("/"));
	}
}

class SouthPane extends JPanel {
	public SouthPane() {
		setBackground(Color.YELLOW);
		add(new JLabel("계산결과"));
		add(new JTextField(20));
	}
}