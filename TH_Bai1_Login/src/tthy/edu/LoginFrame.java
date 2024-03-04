package tthy.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTENDANGNHAP;
	private JPasswordField txtMATKHAU;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setForeground(new Color(255, 192, 203));
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 182, 193));
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(34, 38, 147, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(34, 99, 147, 29);
		contentPane.add(lblMtKhu);
		
		txtTENDANGNHAP = new JTextField();
		txtTENDANGNHAP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTENDANGNHAP.setBounds(186, 27, 197, 37);
		contentPane.add(txtTENDANGNHAP);
		txtTENDANGNHAP.setColumns(10);
		
		txtMATKHAU = new JPasswordField();
		txtMATKHAU.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMATKHAU.setBounds(186, 97, 197, 37);
		contentPane.add(txtMATKHAU);
		
		JButton btnDANGNHAP = new JButton("ĐĂNG NHẬP");
		btnDANGNHAP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDANGNHAP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDANGNHAP.setBounds(163, 181, 127, 37);
		contentPane.add(btnDANGNHAP);
		// chính giữa màn hình
		setLocationRelativeTo(null);
	}
	void XuLyDangNhap() {
		//Lấy về tên ĐN và MK
		String strTen = txtTENDANGNHAP.getText();
		String strMK = txtMATKHAU.getText();
		//xử lý
		if (strTen.equals("63CNTT")&& strMK.equals("123")) {
			//hiện trang chủ
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			//Ẩn from đăng nhập
			this.setVisible(false);
		}else { // báo lỗi
			//xóa dữ liệu nhập
			txtTENDANGNHAP.setText("");
			txtMATKHAU.setText("");
			//hiện thống báo
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
			
		}

	}
	
}
