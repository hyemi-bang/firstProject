package pj.choice;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ChoiceFrameBuyList extends JPanel {

	ImageIcon apple;
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JPanel pan1 = new JPanel();

	ChoiceSelectIce choiceSelectIce;

	public ChoiceFrameBuyList(ChoiceFrame mainFrame) {

		CardLayout card = new CardLayout(10, 10);

		JLabel test = new JLabel();
		test.setIcon(new ImageIcon("img/daseul/cat.gif"));

		setLayout(card);
		// add(test);

		GridLayout grid = new GridLayout(1, 3);
		grid.setVgap(20);
		grid.setHgap(20);
		JPanel pan2 = new JPanel(new GridLayout(1, 2));
		JButton but1 = new JButton("x");
		JButton but2 = new JButton("x");
		JButton but3 = new JButton("prev");
		JButton but4 = new JButton("next");

		but4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(ChoiceFrameBuyList.this);

			}
		});

		but3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.previous(ChoiceFrameBuyList.this);
			}
		});

		pan1.setLayout(grid);

		// add(pan2);
		add(pan1);
		pan2.add(test);
		pan2.add(but4);
		pan1.add(label1);
		pan1.add(test);
		pan1.add(but3);
		pan1.setBackground(new Color(255, 255, 255));
		pan2.setBackground(new Color(255, 255, 255));
		// 팬2는 날릴 생각으로 test랑 같이 붙여놓은거임
		label1.setText("외않되");
		// label1.setText("ddd");
		label1.setText("22");
	}

	public void showImg() {
		System.out.println("showImg 잘굴러가는중");
		SwingUtilities.invokeLater(() -> {
			label1.setText("dd");
			System.out.println(label1.getText());
		});
		label1.validate();
		label1.repaint();
		// System.out.println(label1.getText());
		// label1.setText("dd");

	}
}
