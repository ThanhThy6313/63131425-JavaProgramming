import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	
	public ManHinhTinhToan() {
		setTitle("Chương Trình Tính Toán Đơn Giản ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 49, 167, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ nhất (b)");
		lblNhpSTh.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNhpSTh.setBounds(35, 111, 167, 34);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Arial", Font.PLAIN, 16));
		txtA.setBounds(212, 54, 247, 29);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Arial", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(212, 111, 247, 29);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý cộng
				//Viết lệnh ở một thủ tục/hàm, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCong.setBounds(35, 197, 103, 34);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý trừ
				HamXuLyTru();

			}
		});
		btnTru.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTru.setBounds(159, 197, 103, 34);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNhan.setBounds(287, 197, 103, 34);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Arial", Font.PLAIN, 16));
		btnChia.setBounds(419, 197, 103, 34);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Arial", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(35, 276, 167, 34);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Arial", Font.PLAIN, 16));
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(212, 276, 247, 29);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}// hết hàm tạo
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//chuyển kiểu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tính toán
		double tong= soA + soB;
		// dưda ra hiển thị lên điều khiển 
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//Tính toán
				double tong= soA - soB;
				// dưda ra hiển thị lên điều khiển 
				txtKetQua.setText(String.valueOf(tong));
			}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//Tính toán
				double tong= soA * soB;
				// dưda ra hiển thị lên điều khiển 
				txtKetQua.setText(String.valueOf(tong));
			}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				//chuyển kiểu
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//Tính toán
				double tong= soA / soB;
				// dưda ra hiển thị lên điều khiển 
				txtKetQua.setText(String.valueOf(tong));
			}
	}
