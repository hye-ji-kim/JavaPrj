package netio.multi.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChatClientWindow extends JFrame implements Runnable {

	private Socket socket;
	private PrintStream nout;
	private Scanner nscan;

	/* 메뉴 객체의 구조 */
	
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem miExit;
	private JMenu mnTool;
	private JMenuItem miConnect;
	private JMenuItem miSetting;

	private JButton btnsend;
	private JPanel panel;
	private JTextArea textInput;
	private JTextArea textOutput;

	public ChatClientWindow() {

		setSize(500, 700);

		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		menuBar = new JMenuBar();
		mnFile = new JMenu("File");
		miExit = new JMenuItem("Exit");
		
		mnTool = new JMenu("Tool");
		miConnect = new JMenuItem("Connect");
		miSetting = new JMenuItem("Setting");

		miConnect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					socket = new Socket("211.238.142.156", 10000);
					if (socket.isConnected()) {
						textOutput.setText("connected to");

						InputStream is = socket.getInputStream();
						OutputStream os = socket.getOutputStream();

						nout = new PrintStream(os, true);
						nscan = new Scanner(is);
						
						new Thread(ChatClientWindow.this).start();

					}
					// textInput.enable(true);

					//socket.getInputStream().read();

				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/* JOptionPane.showConfirmDialog(null, "Hello"); */
			}
		});

		mnFile.add(miExit);
		menuBar.add(mnFile);

		mnTool.add(miConnect);
		mnTool.add(miSetting);
		menuBar.add(mnTool);

		setJMenuBar(menuBar);

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createLineBorder(Color.black));

		btnsend = new JButton("send");
		btnsend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = textInput.getText();
								
				nout.println(msg);
				

				// 네트워크 전달하기
				/*
				 * if(msg.isEmpty()) msg +=textInput.getText(); else msg +=
				 * "\n"+textInput.getText();
				 * 
				 * textOutput.setText(msg);
				 */
				textOutput.setText(textOutput.getText() + "\n" + textInput.getText());

			}
		});
		panel.add(btnsend, BorderLayout.LINE_END); // 버튼의 크기와 위치를 지정하지 않았다, :
													// 크기+위치 : 레이아웃

		textInput = new JTextArea();
		textInput.setPreferredSize(new Dimension(100, 100));
		// textInput.setEnable(false);

		textInput.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(textInput, BorderLayout.CENTER);

		this.add(panel, BorderLayout.PAGE_END);

		textOutput = new JTextArea();
		textOutput.setBorder(BorderFactory.createLineBorder(Color.black));
		//textOutput.setEditable(false);
		this.add(textOutput, BorderLayout.CENTER);

	}
	// 네트워크로 입력되는 값을 처리하는 함수

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			String msg = nscan.nextLine();
			textOutput.setText(msg);
			
		}
	}
}
