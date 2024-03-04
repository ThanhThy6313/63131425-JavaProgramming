import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MHTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	/**
	 * Create the frame.
	 */
	public MHTinhToan() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(A):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(49, 38, 199, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai(B):");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(49, 100, 199, 30);
		contentPane.add(lblNhpSTh);
		
		JLabel lblNhpSTh_1 = new JLabel("Nhập số thứ ba(C):");
		lblNhpSTh_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh_1.setBounds(49, 158, 199, 30);
		contentPane.add(lblNhpSTh_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(10);
		txtA.setBounds(258, 39, 247, 29);
		contentPane.add(txtA);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(258, 100, 247, 29);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(258, 158, 247, 29);
		contentPane.add(txtC);
		
		JButton btnGiai = new JButton("GIẢI");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyPTbac2();
			}
		});
		btnGiai.setFont(new Font("Arial", Font.PLAIN, 16));
		btnGiai.setBounds(245, 254, 103, 34);
		contentPane.add(btnGiai);
		
		JLabel lblNhpSTh_1_1 = new JLabel("KẾT QUẢ:");
		lblNhpSTh_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh_1_1.setBounds(49, 345, 199, 30);
		contentPane.add(lblNhpSTh_1_1);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Arial", Font.PLAIN, 16));
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(258, 346, 247, 30);
		contentPane.add(txtKQ);
		setLocationRelativeTo(null);
	}
	void HamXuLyPTbac2() {
		//Lấy dữ liệu từ điều khiển
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		String str_C = txtC.getText();
		//chuyển kiểu
		double A = Double.parseDouble(str_A);
		double B = Double.parseDouble(str_B);
		double C = Double.parseDouble(str_C);
		double tong= B*B-4*A*C;
		double x1,x2;
		//tính nghiệm
		if (tong>0) {
			x1=(double)((-B+ Math.sqrt(tong))/(2*A));
			x2=(double)((-B- Math.sqrt(tong))/(2*A));
			txtKQ.setText(("x1= "+ x1 + " và x2= "+ x2));
		}
		else if(tong==0) {
			{
				x1=(-B/(2*A));
				txtKQ.setText("x1=x2"+x1);
			}
		}
		else { // báo lỗi
			//xóa dữ liệu nhập
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtKQ.setText("Phương trình vô nghiệm");
			//hiện thống báo
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Nhập không hợp lệ");
		}
	}
}

