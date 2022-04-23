package lect27;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame implements ActionListener {
	public static int BOARDSIZE = 3;

	public static enum GameStatus {
		Incompelete, XWins, Ywins, Tie
	}

	private JButton[][] buttons = new JButton[BOARDSIZE][BOARDSIZE];
	boolean crossturn = true;

	public TicTacToe() {

		super.setTitle("TicTacToe");
		super.setSize(800, 800);
		GridLayout grid = new GridLayout(BOARDSIZE, BOARDSIZE);
		super.setLayout(grid);
		Font font = new Font("Comic Sans", 1, 150);
		for (int row = 0; row < BOARDSIZE; row++) {
			for (int col = 0; col < BOARDSIZE; col++) {
				JButton button = new JButton();
				buttons[row][col] = button;
				button.setFont(font);
				button.addActionListener(this);
				super.add(button);
			}
		}
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedbutton = (JButton) e.getSource();
		makemove(clickedbutton);
		GameStatus gs = this.getGameStatus();
		if (gs == GameStatus.Incompelete) {
			return;
		}
		declareWinner(gs);
		int choice = JOptionPane.showConfirmDialog(this, "DO YOU WANT TO RESTART?");
		if (choice == JOptionPane.YES_OPTION) {
			for (int row = 0; row < BOARDSIZE; row++) {
				for (int col = 0; col < BOARDSIZE; col++) {
					buttons[row][col].setText("");
				}
			}
			crossturn = true;
		} else {
			super.dispose();
		}
	}

	private void declareWinner(GameStatus gs) {
		// TODO Auto-generated method stub
		if (gs == GameStatus.XWins) {
			JOptionPane.showMessageDialog(this, "X Wins");
		} else if (gs == GameStatus.Ywins) {
			JOptionPane.showMessageDialog(this, "Y Wins");
		} else {
			JOptionPane.showMessageDialog(this, "ITS A DRAW");
		}
	}

	private void makemove(JButton clickedbutton) {
		// TODO Auto-generated method stub
		String btntext = clickedbutton.getText();
		if (btntext.length() > 0) {
			JOptionPane.showMessageDialog(this, "Invalid Move");
		} else {
			if (crossturn) {
				clickedbutton.setText("X");
			} else {
				clickedbutton.setText("0");
			}
			crossturn = !crossturn;
		}
	}

	private GameStatus getGameStatus() {
		// TODO Auto-generated method stub
		String text1 = "", text2 = "";
		int row = 0, col = 0;

		// test inside rows
		row = 0;
		while (row < BOARDSIZE) {
			col = 0;
			while (col < BOARDSIZE - 1) {
				text1 = buttons[row][col].getText();
				text2 = buttons[row][col + 1].getText();
				if (!text1.equals(text2) || text1.length() == 0) {
					break;
				}
				col++;
			}
			if (col == BOARDSIZE - 1) {
				if (text1.equals("X")) {
					return GameStatus.XWins;
				} else {
					return GameStatus.Ywins;
				}
			}
			row++;
		}

		// test inside col
		col = 0;
		while (col < BOARDSIZE) {
			row = 0;
			while (row < BOARDSIZE - 1) {
				text1 = buttons[row][col].getText();
				text2 = buttons[row + 1][col].getText();
				if (!text1.equals(text2) || text1.length() == 0) {
					break;
				}
				row++;
			}
			if (row == BOARDSIZE - 1) {
				if (text1.equals("X")) {
					return GameStatus.XWins;
				} else {
					return GameStatus.Ywins;
				}
			}
			col++;
		}

		// test in diagonal 1
		row = 0;
		col = 0;
		while (row < BOARDSIZE - 1) {
			text1 = buttons[row][col].getText();
			text2 = buttons[row + 1][col + 1].getText();
			if (!text1.equals(text2) || text1.length() == 0) {
				break;
			}
			row++;
			col++;
		}
		if (row == BOARDSIZE - 1) {
			if (text1.equals("X")) {
				return GameStatus.XWins;
			} else {
				return GameStatus.Ywins;
			}
		}

		// test in diagonal 2
		row = BOARDSIZE - 1;
		col = 0;
		while (row > 0) {
			text1 = buttons[row][col].getText();
			text2 = buttons[row - 1][col + 1].getText();
			if (!text1.equals(text2) || text1.length() == 0) {
				break;
			}
			row--;
			col++;
		}
		if (row == 0) {
			if (text1.equals("X")) {
				return GameStatus.XWins;
			} else {
				return GameStatus.Ywins;
			}
		}

		String txt = "";
		for (row = 0; row < BOARDSIZE; row++) {
			for (col = 0; col < BOARDSIZE; col++) {
				txt = buttons[row][col].getText();
				if (txt.length() == 0) {
					return GameStatus.Incompelete;
				}
			}
		}

		return GameStatus.Tie;
	}
}
