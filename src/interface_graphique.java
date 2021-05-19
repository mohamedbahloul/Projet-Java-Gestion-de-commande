import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class interface_graphique extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_23;
	private JTextField textField_5;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interface_graphique frame = new interface_graphique();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interface_graphique() {
		setTitle("Gestion des commandes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1404, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(10, 43, 268, 346);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom Client:");
		lblNewLabel.setBounds(10, 11, 102, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblNewLabel);
		
		JLabel lblPrnomClient = new JLabel("Pr\u00E9nom Client:");
		lblPrnomClient.setBounds(10, 55, 122, 31);
		lblPrnomClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblPrnomClient);
		
		JLabel lblMatriculeFiscale = new JLabel("Matricule fiscale:");
		lblMatriculeFiscale.setBounds(10, 97, 139, 31);
		lblMatriculeFiscale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblMatriculeFiscale);
		
		JLabel lblDateDeLa = new JLabel("date :");
		lblDateDeLa.setBounds(10, 144, 186, 31);
		lblDateDeLa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblDateDeLa);
		
		textField = new JTextField();
		textField.setBounds(156, 15, 102, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 59, 102, 27);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 101, 102, 27);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 148, 102, 27);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 186, 248, 31);
		panel_2.setBackground(new Color(233, 150, 122));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("gestion de produit");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 0, 238, 25);
		panel_2.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(20, 265, 69, 31);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBounds(20, 228, 69, 31);
		panel.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("ref produit");
		lblNewLabel_3.setBounds(10, 11, 59, 14);
		panel_3_1_1_1.add(lblNewLabel_3);
		
		JLabel lblPrixFinalCmd = new JLabel("prix final :");
		lblPrixFinalCmd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPrixFinalCmd.setBounds(10, 307, 139, 31);
		panel.add(lblPrixFinalCmd);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(156, 307, 102, 27);
		panel.add(textField_23);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBounds(99, 228, 69, 31);
		panel.add(panel_3_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("qte produit\r\n");
		lblNewLabel_5.setBounds(10, 11, 59, 14);
		panel_3_1_2.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(99, 265, 69, 31);
		panel.add(textField_5);
		
		JButton btnNewButton_3 = new JButton("ajouter");
		btnNewButton_3.setBounds(178, 228, 89, 31);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("supprimer");
		btnNewButton_3_1.setBounds(178, 269, 89, 31);
		panel.add(btnNewButton_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 196));
		panel_1.setBounds(10, 11, 268, 27);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ajout de Commande :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(24, 0, 223, 25);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(211, 211, 211));
		panel_1_1.setBounds(10, 400, 268, 27);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ajout de Produit :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(35, 0, 223, 25);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(10, 438, 268, 259);
		contentPane.add(panel_3);
		
		JLabel lblPrixHorsTaxe = new JLabel("Prix hors taxe:");
		lblPrixHorsTaxe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPrixHorsTaxe.setBounds(10, 91, 128, 31);
		panel_3.add(lblPrixHorsTaxe);
		
		JLabel lblTaxe = new JLabel("Taxe:");
		lblTaxe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblTaxe.setBounds(10, 133, 102, 31);
		panel_3.add(lblTaxe);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9:");
		lblQuantit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblQuantit.setBounds(10, 175, 102, 31);
		panel_3.add(lblQuantit);
		
		JLabel lblTauxDeRduction = new JLabel("Taux de r\u00E9duction:");
		lblTauxDeRduction.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblTauxDeRduction.setBounds(0, 220, 154, 31);
		panel_3.add(lblTauxDeRduction);
		
		JLabel lblRefProduit = new JLabel("Ref produit:");
		lblRefProduit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblRefProduit.setBounds(10, 11, 102, 31);
		panel_3.add(lblRefProduit);
		
		JLabel lblLibelleProduit = new JLabel("Libelle produit");
		lblLibelleProduit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblLibelleProduit.setBounds(10, 53, 128, 31);
		panel_3.add(lblLibelleProduit);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(156, 53, 102, 27);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(156, 11, 102, 27);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(156, 140, 102, 27);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(156, 98, 102, 27);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(156, 182, 102, 27);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(156, 224, 102, 27);
		panel_3.add(textField_11);
		
		JButton btnNewButton = new JButton("Ajouter une Commande ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(288, 46, 202, 89);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("Supprimer la Commande ");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1_1.setBounds(288, 253, 202, 89);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Modifier la  Commande ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setBounds(288, 146, 202, 89);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ajouter un produit");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(288, 400, 202, 89);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("Modifier le produit");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setForeground(new Color(245, 255, 250));
		btnNewButton_1_2.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_2.setBackground(Color.GRAY);
		btnNewButton_1_2.setBounds(288, 496, 202, 89);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Supprimer le produit");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1_2_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_2_1.setBackground(Color.GRAY);
		btnNewButton_1_2_1.setBounds(288, 596, 202, 89);
		contentPane.add(btnNewButton_1_2_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(255, 228, 181));
		panel_1_2.setBounds(498, 11, 202, 27);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Recherche Client :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_2.setBounds(10, 0, 192, 25);
		panel_1_2.add(lblNewLabel_1_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 228, 181));
		panel_4.setBounds(500, 45, 202, 133);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("id Client:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(10, 11, 94, 28);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Nom Client:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(10, 63, 94, 28);
		panel_4.add(lblNewLabel_6_1);
		
		textField_12 = new JTextField();
		textField_12.setBounds(114, 11, 86, 33);
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(114, 63, 86, 33);
		panel_4.add(textField_14);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(Color.WHITE);
		btnValider.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnValider.setBackground(Color.GRAY);
		btnValider.setBounds(500, 189, 202, 89);
		contentPane.add(btnValider);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(new Color(255, 228, 225));
		panel_1_3.setBounds(710, 11, 225, 27);
		contentPane.add(panel_1_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Recherche Commande :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_3.setBackground(new Color(255, 228, 225));
		lblNewLabel_1_3.setBounds(0, 0, 225, 25);
		panel_1_3.add(lblNewLabel_1_3);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(250, 240, 230));
		panel_4_1.setBounds(712, 43, 223, 133);
		contentPane.add(panel_4_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("id Commande:");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(10, 11, 119, 28);
		panel_4_1.add(lblNewLabel_6_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(127, 11, 86, 33);
		panel_4_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(127, 63, 86, 33);
		panel_4_1.add(textField_16);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Date Commande:");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1_1.setBounds(0, 63, 141, 28);
		panel_4_1.add(lblNewLabel_6_1_1);
		
		JButton btnValider_1 = new JButton("Valider");
		btnValider_1.setForeground(Color.WHITE);
		btnValider_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnValider_1.setBackground(Color.GRAY);
		btnValider_1.setBounds(712, 189, 223, 89);
		contentPane.add(btnValider_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(new Color(240, 230, 140));
		panel_4_2.setBounds(498, 401, 202, 182);
		contentPane.add(panel_4_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("ref produit:");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_3.setBounds(10, 11, 94, 28);
		panel_4_2.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("libelle produit:");
		lblNewLabel_6_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1_2.setBounds(0, 55, 120, 28);
		panel_4_2.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_3_2 = new JLabel("prix max:");
		lblNewLabel_6_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_3_2.setBounds(10, 149, 94, 28);
		panel_4_2.add(lblNewLabel_6_3_2);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(114, 11, 86, 33);
		panel_4_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(114, 55, 86, 33);
		panel_4_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(114, 99, 86, 33);
		panel_4_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(114, 144, 86, 33);
		panel_4_2.add(textField_20);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("prix min:");
		lblNewLabel_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_3_1.setBounds(10, 104, 94, 28);
		panel_4_2.add(lblNewLabel_6_3_1);
		
		JButton btnValider_2 = new JButton("Valider");
		btnValider_2.setForeground(Color.WHITE);
		btnValider_2.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnValider_2.setBackground(Color.GRAY);
		btnValider_2.setBounds(498, 596, 202, 89);
		contentPane.add(btnValider_2);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(new Color(240, 230, 140));
		panel_1_2_1.setBounds(498, 362, 202, 27);
		contentPane.add(panel_1_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Recherche produit :");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_2_1.setBounds(10, 0, 192, 25);
		panel_1_2_1.add(lblNewLabel_1_2_1);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBackground(new Color(255, 228, 181));
		panel_1_2_2.setBounds(710, 362, 225, 49);
		contentPane.add(panel_1_2_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Total produit");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_2_2.setBounds(10, 0, 205, 25);
		panel_1_2_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("par date:");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_2_2_1.setBounds(10, 24, 205, 25);
		panel_1_2_2.add(lblNewLabel_1_2_2_1);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setLayout(null);
		panel_4_3.setBackground(new Color(255, 228, 181));
		panel_4_3.setBounds(710, 425, 225, 160);
		contentPane.add(panel_4_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("date min:");
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_4.setBounds(10, 11, 94, 28);
		panel_4_3.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("date max:");
		lblNewLabel_6_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1_3.setBounds(10, 63, 94, 28);
		panel_4_3.add(lblNewLabel_6_1_3);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(114, 11, 86, 33);
		panel_4_3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(114, 63, 86, 33);
		panel_4_3.add(textField_22);
		
		JButton btnValider_2_1 = new JButton("Valider");
		btnValider_2_1.setForeground(Color.WHITE);
		btnValider_2_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		btnValider_2_1.setBackground(Color.GRAY);
		btnValider_2_1.setBounds(710, 596, 225, 89);
		contentPane.add(btnValider_2_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(941, 43, 429, 149);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"id commande", "id client", "nom", "New column"
			}
		));
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(0, 33, 429, 127);
		panel_5.add(table);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.BLACK);
		panel_6_1.setBounds(0, 11, 110, 20);
		panel_5.add(panel_6_1);
		
		JLabel lblNewLabel_9 = new JLabel("id client");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setForeground(Color.WHITE);
		panel_6_1.add(lblNewLabel_9);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.BLACK);
		panel_6_2.setBounds(107, 11, 110, 20);
		panel_5.add(panel_6_2);
		
		JLabel lblNewLabel_10 = new JLabel("nom client");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setForeground(Color.WHITE);
		panel_6_2.add(lblNewLabel_10);
		
		JPanel panel_6_3 = new JPanel();
		panel_6_3.setBackground(Color.BLACK);
		panel_6_3.setBounds(211, 11, 110, 20);
		panel_5.add(panel_6_3);
		
		JLabel lblNewLabel_11 = new JLabel("prenom client");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_6_3.add(lblNewLabel_11);
		
		JPanel panel_6_3_1 = new JPanel();
		panel_6_3_1.setBackground(Color.BLACK);
		panel_6_3_1.setBounds(319, 11, 110, 20);
		panel_5.add(panel_6_3_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("matricule fiscale");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_6_3_1.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_7 = new JLabel("Affichage client:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(981, 11, 343, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Affichage commande:");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_7_1.setBounds(981, 230, 343, 27);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Affichage produit:");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_7_1_1.setBounds(981, 479, 343, 27);
		contentPane.add(lblNewLabel_7_1_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(941, 262, 429, 149);
		contentPane.add(panel_5_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"id commande", "id client", "prix total", "date"
			}
		));
		table_1.setSurrendersFocusOnKeystroke(true);
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setBounds(0, 33, 194, 127);
		panel_5_1.add(table_1);
		
		JPanel panel_6_1_1_1_2 = new JPanel();
		panel_6_1_1_1_2.setBackground(Color.BLACK);
		panel_6_1_1_1_2.setBounds(0, 11, 45, 20);
		panel_5_1.add(panel_6_1_1_1_2);
		
		JLabel lblNewLabel_8 = new JLabel("id cmd");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setForeground(Color.WHITE);
		panel_6_1_1_1_2.add(lblNewLabel_8);
		
		JPanel panel_6_1_1_1_2_7 = new JPanel();
		panel_6_1_1_1_2_7.setBackground(Color.BLACK);
		panel_6_1_1_1_2_7.setBounds(148, 11, 46, 20);
		panel_5_1.add(panel_6_1_1_1_2_7);
		
		JLabel lblNewLabel_8_8 = new JLabel("date");
		lblNewLabel_8_8.setForeground(Color.WHITE);
		lblNewLabel_8_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6_1_1_1_2_7.add(lblNewLabel_8_8);
		
		JPanel panel_6_1_1_1_2_1 = new JPanel();
		panel_6_1_1_1_2_1.setBackground(Color.BLACK);
		panel_6_1_1_1_2_1.setBounds(44, 11, 46, 20);
		panel_5_1.add(panel_6_1_1_1_2_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("id client");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6_1_1_1_2_1.add(lblNewLabel_8_1);
		
		JPanel panel_6_1_1_1_2_6 = new JPanel();
		panel_6_1_1_1_2_6.setBackground(Color.BLACK);
		panel_6_1_1_1_2_6.setBounds(92, 11, 57, 20);
		panel_5_1.add(panel_6_1_1_1_2_6);
		
		JLabel lblNewLabel_8_7 = new JLabel("prix final");
		lblNewLabel_8_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_7.setForeground(Color.WHITE);
		lblNewLabel_8_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_6_1_1_1_2_6.add(lblNewLabel_8_7);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ref pd", "qte pd", "prixU", "prixfinal"
			}
		));
		table_3.setSurrendersFocusOnKeystroke(true);
		table_3.setFillsViewportHeight(true);
		table_3.setColumnSelectionAllowed(true);
		table_3.setCellSelectionEnabled(true);
		table_3.setBounds(227, 33, 194, 127);
		panel_5_1.add(table_3);
		
		JPanel panel_6_1_1_1_2_5 = new JPanel();
		panel_6_1_1_1_2_5.setBackground(Color.BLACK);
		panel_6_1_1_1_2_5.setBounds(321, 11, 56, 20);
		panel_5_1.add(panel_6_1_1_1_2_5);
		
		JLabel lblNewLabel_8_6 = new JLabel("prix unit");
		lblNewLabel_8_6.setForeground(Color.WHITE);
		lblNewLabel_8_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6_1_1_1_2_5.add(lblNewLabel_8_6);
		
		JPanel panel_6_1_1_1_2_4 = new JPanel();
		panel_6_1_1_1_2_4.setBackground(Color.BLACK);
		panel_6_1_1_1_2_4.setBounds(275, 11, 46, 20);
		panel_5_1.add(panel_6_1_1_1_2_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("qte pd");
		lblNewLabel_8_5.setForeground(Color.WHITE);
		lblNewLabel_8_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6_1_1_1_2_4.add(lblNewLabel_8_5);
		
		JPanel panel_6_1_1_1_2_3 = new JPanel();
		panel_6_1_1_1_2_3.setBackground(Color.BLACK);
		panel_6_1_1_1_2_3.setBounds(221, 11, 56, 20);
		panel_5_1.add(panel_6_1_1_1_2_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("libelle pd");
		lblNewLabel_8_4.setForeground(Color.WHITE);
		lblNewLabel_8_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_6_1_1_1_2_3.add(lblNewLabel_8_4);
		
		JPanel panel_6_1_1_1_2_6_1 = new JPanel();
		panel_6_1_1_1_2_6_1.setBackground(Color.BLACK);
		panel_6_1_1_1_2_6_1.setBounds(376, 11, 45, 20);
		panel_5_1.add(panel_6_1_1_1_2_6_1);
		
		JLabel lblNewLabel_8_7_1 = new JLabel("prix final");
		lblNewLabel_8_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_7_1.setForeground(Color.WHITE);
		lblNewLabel_8_7_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_6_1_1_1_2_6_1.add(lblNewLabel_8_7_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(941, 517, 419, 149);
		contentPane.add(panel_5_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ref produit", "libelle produit", "prix hors taxe", "taxe", "qte produit", "taux de red", "prix final"
			}
		));
		table_2.setSurrendersFocusOnKeystroke(true);
		table_2.setFillsViewportHeight(true);
		table_2.setColumnSelectionAllowed(true);
		table_2.setCellSelectionEnabled(true);
		table_2.setBounds(0, 33, 419, 127);
		panel_5_2.add(table_2);
		
		JPanel panel_6_7 = new JPanel();
		panel_6_7.setBackground(Color.BLACK);
		panel_6_7.setBounds(0, 11, 61, 20);
		panel_5_2.add(panel_6_7);
		
		JLabel lblNewLabel_8_2 = new JLabel("ref produit");
		lblNewLabel_8_2.setForeground(Color.WHITE);
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_6_7.add(lblNewLabel_8_2);
		
		JPanel panel_6_7_1 = new JPanel();
		panel_6_7_1.setBackground(Color.BLACK);
		panel_6_7_1.setBounds(60, 11, 61, 20);
		panel_5_2.add(panel_6_7_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("libelle produit");
		lblNewLabel_8_2_1.setForeground(Color.WHITE);
		lblNewLabel_8_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_6_7_1.add(lblNewLabel_8_2_1);
		
		JPanel panel_6_7_2 = new JPanel();
		panel_6_7_2.setBackground(Color.BLACK);
		panel_6_7_2.setBounds(120, 11, 61, 20);
		panel_5_2.add(panel_6_7_2);
		
		JLabel lblNewLabel_8_2_2 = new JLabel("prix hors taxe");
		lblNewLabel_8_2_2.setForeground(Color.WHITE);
		lblNewLabel_8_2_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		panel_6_7_2.add(lblNewLabel_8_2_2);
		
		JPanel panel_6_7_3 = new JPanel();
		panel_6_7_3.setBackground(Color.BLACK);
		panel_6_7_3.setBounds(179, 11, 64, 20);
		panel_5_2.add(panel_6_7_3);
		
		JLabel lblNewLabel_8_2_3 = new JLabel("taxe");
		lblNewLabel_8_2_3.setForeground(Color.WHITE);
		lblNewLabel_8_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6_7_3.add(lblNewLabel_8_2_3);
		
		JPanel panel_6_7_4 = new JPanel();
		panel_6_7_4.setBackground(Color.BLACK);
		panel_6_7_4.setBounds(240, 11, 61, 20);
		panel_5_2.add(panel_6_7_4);
		
		JLabel lblNewLabel_8_2_4 = new JLabel("qte produit");
		lblNewLabel_8_2_4.setForeground(Color.WHITE);
		lblNewLabel_8_2_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_6_7_4.add(lblNewLabel_8_2_4);
		
		JPanel panel_6_7_5 = new JPanel();
		panel_6_7_5.setBackground(Color.BLACK);
		panel_6_7_5.setBounds(300, 11, 61, 20);
		panel_5_2.add(panel_6_7_5);
		
		JLabel lblNewLabel_8_2_5 = new JLabel("taux de red");
		lblNewLabel_8_2_5.setForeground(Color.WHITE);
		lblNewLabel_8_2_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_6_7_5.add(lblNewLabel_8_2_5);
		
		JPanel panel_6_7_6 = new JPanel();
		panel_6_7_6.setBackground(Color.BLACK);
		panel_6_7_6.setBounds(358, 11, 61, 20);
		panel_5_2.add(panel_6_7_6);
		
		JLabel lblNewLabel_8_2_6 = new JLabel("prix final");
		lblNewLabel_8_2_6.setForeground(Color.WHITE);
		lblNewLabel_8_2_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel_6_7_6.add(lblNewLabel_8_2_6);
	}
}
