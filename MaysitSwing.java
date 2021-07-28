import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.SystemColor;

public class MaysitSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingSample frame = new SwingSample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
			String uriString0 = "http://www.google.co.jp";
	       String uriString1 = "https://www.youtube.com/";
	       String uriString2 = "https://www.google.com/maps/@36.9370426,139.9059505,14z";
	       String uriString3 = "https://calendar.google.com/calendar/u/0/r?pli=1";
	       String uriString4 = "https://mail.google.com/mail/u/0/#inbox";
	       String uriString5 = "https://chrome.google.com/webstore/category/extensions?hl=ja";
	       String uriString6 = "https://drive.google.com/drive/my-drive";
	       String uriString7 = "https://docs.google.com/spreadsheets/u/0/";
	       String uriString8 = "https://docs.google.com/document/u/0/";
	       String uriString9 = "https://github.com/";
			Desktop desktop = Desktop.getDesktop();
	        System.out.println("利用したいサービスを数字キーで選択し、Enterキーで決定してください。");
	        System.out.println("0:GoogleChrome" + " " + "1:Youtube" + " " + "2:GoogleMap" + " " + "3:Googleカレンダー" + " " + "4:Gmail" + " " + "5:Chromeウェブストア" + " " + "6:Googleドライブ" + " " + "7:Googleスプレッドシート" + " " + "8:Googleドキュメント" + " " + "9:GitHub");
	        int input = new java.util.Scanner(System.in).nextInt(10);
	        if(input == 0){
			try{
				URI uri0 = new URI(uriString0);
				desktop.browse(uri0);
			}catch(URISyntaxException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
	            }else if(input == 1){
	                try{
	                    URI uri1 = new URI(uriString1);
	                    desktop.browse(uri1);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 2){
	                try{
	                    URI uri2 = new URI(uriString2);
	                    desktop.browse(uri2);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 3){
	                try{
	                    URI uri3 = new URI(uriString3);
	                    desktop.browse(uri3);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 4){
	                try{
	                    URI uri4 = new URI(uriString4);
	                    desktop.browse(uri4);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 5){
	                try{
	                    URI uri5 = new URI(uriString5);
	                    desktop.browse(uri5);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 6){
	                try{
	                    URI uri6 = new URI(uriString6);
	                    desktop.browse(uri6);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 7){
	                try{
	                    URI uri7 = new URI(uriString7);
	                    desktop.browse(uri7);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 8){
	                try{
	                    URI uri8 = new URI(uriString8);
	                    desktop.browse(uri8);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }else if(input == 9){
	                try{
	                    URI uri9 = new URI(uriString9);
	                    desktop.browse(uri9);
	                }catch(URISyntaxException e){
	                    e.printStackTrace();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
	            }
	}

	/**
	 * Create the frame.
	 */
	public MaysitSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 366);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("コンソールウィンドウから利用したいサービスの数字を入力");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(43, 34, 480, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnter = new JLabel("Enterキーで決定");
		lblEnter.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEnter.setBounds(223, 118, 139, 64);
		contentPane.add(lblEnter);
		
		JLabel label = new JLabel("※ウィンドウを閉じるとプログラムが終了されます");
		label.setFont(new Font("Dialog", Font.BOLD, 16));
		label.setBounds(92, 218, 392, 24);
		contentPane.add(label);
	}
}
