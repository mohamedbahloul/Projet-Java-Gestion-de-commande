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
	private JTextField nomClient;
	private JTextField prenomClient;
	private JTextField matClient;
	private JTextField datecmd;
	private JTextField refpdcmd;
	private JTextField libelleproduit;
	private JTextField refproduit;
	private JTextField taxe;
	private JTextField prixhorstaxe;
	private JTextField quantité;
	private JTextField taux_de_reduction;
	private JTextField id_client;
	private JTextField nom_client;
	private JTextField id_commande;
	private JTextField date_commande;
	private JTextField ref_produit;
	private JTextField libelle_produit;
	private JTextField prix_min;
	private JTextField prix_max;
	private JTextField date_min;
	private JTextField date_max;
	private JTable table_affichage_client;
	private JTable table_affichage_commande_1;
	private JTable table_affichage_produit;
	private JTextField prixfinal;
	private JTextField qtpdcmd;
	private JTable table_affichage_commande_2;

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
		
		nomClient = new JTextField();
		nomClient.setBounds(156, 15, 102, 27);
		panel.add(nomClient);
		nomClient.setColumns(10);
		
		prenomClient = new JTextField();
		prenomClient.setBounds(156, 59, 102, 27);
		prenomClient.setColumns(10);
		panel.add(prenomClient);
		
		matClient = new JTextField();
		matClient.setBounds(156, 101, 102, 27);
		matClient.setColumns(10);
		panel.add(matClient);
		
		datecmd = new JTextField();
		datecmd.setBounds(156, 148, 102, 27);
		datecmd.setColumns(10);
		panel.add(datecmd);
		
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
		
		refpdcmd = new JTextField();
		refpdcmd.setBounds(20, 265, 69, 31);
		panel.add(refpdcmd);
		refpdcmd.setColumns(10);
		
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
		
		prixfinal = new JTextField();
		prixfinal.setColumns(10);
		prixfinal.setBounds(156, 307, 102, 27);
		panel.add(prixfinal);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBounds(99, 228, 69, 31);
		panel.add(panel_3_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("qte produit\r\n");
		lblNewLabel_5.setBounds(10, 11, 59, 14);
		panel_3_1_2.add(lblNewLabel_5);
		
		qtpdcmd = new JTextField();
		qtpdcmd.setColumns(10);
		qtpdcmd.setBounds(99, 265, 69, 31);
		panel.add(qtpdcmd);
		
		JButton ajoutgestionproduit = new JButton("ajouter");
		ajoutgestionproduit.setBounds(178, 228, 89, 31);
		panel.add(ajoutgestionproduit);
		
		JButton suppressiongestionproduit = new JButton("supprimer");
		suppressiongestionproduit.setBounds(178, 269, 89, 31);
		panel.add(suppressiongestionproduit);
		
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
		
		libelleproduit = new JTextField();
		libelleproduit.setColumns(10);
		libelleproduit.setBounds(156, 53, 102, 27);
		panel_3.add(libelleproduit);
		
		refproduit = new JTextField();
		refproduit.setColumns(10);
		refproduit.setBounds(156, 11, 102, 27);
		panel_3.add(refproduit);
		
		taxe = new JTextField();
		taxe.setColumns(10);
		taxe.setBounds(156, 140, 102, 27);
		panel_3.add(taxe);
		
		prixhorstaxe = new JTextField();
		prixhorstaxe.setColumns(10);
		prixhorstaxe.setBounds(156, 98, 102, 27);
		panel_3.add(prixhorstaxe);
		
		quantité = new JTextField();
		quantité.setColumns(10);
		quantité.setBounds(156, 182, 102, 27);
		panel_3.add(quantité);
		
		taux_de_reduction = new JTextField();
		taux_de_reduction.setColumns(10);
		taux_de_reduction.setBounds(156, 224, 102, 27);
		panel_3.add(taux_de_reduction);
		
		JButton ajouter_une_Commande = new JButton("Ajouter une Commande ");
		ajouter_une_Commande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ajouter_une_Commande.setForeground(new Color(255, 255, 255));
		ajouter_une_Commande.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		ajouter_une_Commande.setBackground(new Color(128, 128, 128));
		ajouter_une_Commande.setBounds(288, 46, 202, 89);
		contentPane.add(ajouter_une_Commande);
		
		JButton supprimer_la_commande = new JButton("Supprimer la Commande ");
		supprimer_la_commande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		supprimer_la_commande.setForeground(new Color(245, 255, 250));
		supprimer_la_commande.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		supprimer_la_commande.setBackground(new Color(128, 128, 128));
		supprimer_la_commande.setBounds(288, 253, 202, 89);
		contentPane.add(supprimer_la_commande);
		
		JButton modifier_la_commande = new JButton("Modifier la  Commande ");
		modifier_la_commande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		modifier_la_commande.setForeground(new Color(245, 255, 250));
		modifier_la_commande.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		modifier_la_commande.setBackground(new Color(128, 128, 128));
		modifier_la_commande.setBounds(288, 146, 202, 89);
		contentPane.add(modifier_la_commande);
		
		JButton ajouter_un_produit = new JButton("Ajouter un produit");
		ajouter_un_produit.setForeground(Color.WHITE);
		ajouter_un_produit.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		ajouter_un_produit.setBackground(Color.GRAY);
		ajouter_un_produit.setBounds(288, 400, 202, 89);
		contentPane.add(ajouter_un_produit);
		
		JButton modifier_le_produit = new JButton("Modifier le produit");
		modifier_le_produit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		modifier_le_produit.setForeground(new Color(245, 255, 250));
		modifier_le_produit.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		modifier_le_produit.setBackground(Color.GRAY);
		modifier_le_produit.setBounds(288, 496, 202, 89);
		contentPane.add(modifier_le_produit);
		
		JButton supprimer_le_produit = new JButton("Supprimer le produit");
		supprimer_le_produit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		supprimer_le_produit.setForeground(new Color(245, 255, 250));
		supprimer_le_produit.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		supprimer_le_produit.setBackground(Color.GRAY);
		supprimer_le_produit.setBounds(288, 596, 202, 89);
		contentPane.add(supprimer_le_produit);
		
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
		
		id_client = new JTextField();
		id_client.setBounds(114, 11, 86, 33);
		panel_4.add(id_client);
		id_client.setColumns(10);
		
		nom_client = new JTextField();
		nom_client.setColumns(10);
		nom_client.setBounds(114, 63, 86, 33);
		panel_4.add(nom_client);
		
		JButton valider_recherche_client = new JButton("Valider");
		valider_recherche_client.setForeground(Color.WHITE);
		valider_recherche_client.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		valider_recherche_client.setBackground(Color.GRAY);
		valider_recherche_client.setBounds(500, 189, 202, 89);
		contentPane.add(valider_recherche_client);
		
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
		
		id_commande = new JTextField();
		id_commande.setColumns(10);
		id_commande.setBounds(127, 11, 86, 33);
		panel_4_1.add(id_commande);
		
		date_commande = new JTextField();
		date_commande.setColumns(10);
		date_commande.setBounds(127, 63, 86, 33);
		panel_4_1.add(date_commande);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Date Commande:");
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1_1.setBounds(0, 63, 141, 28);
		panel_4_1.add(lblNewLabel_6_1_1);
		
		JButton bouton_recherche_commande = new JButton("Valider");
		bouton_recherche_commande.setForeground(Color.WHITE);
		bouton_recherche_commande.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		bouton_recherche_commande.setBackground(Color.GRAY);
		bouton_recherche_commande.setBounds(712, 189, 223, 89);
		contentPane.add(bouton_recherche_commande);
		
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
		
		ref_produit = new JTextField();
		ref_produit.setColumns(10);
		ref_produit.setBounds(114, 11, 86, 33);
		panel_4_2.add(ref_produit);
		
		libelle_produit = new JTextField();
		libelle_produit.setColumns(10);
		libelle_produit.setBounds(114, 55, 86, 33);
		panel_4_2.add(libelle_produit);
		
		prix_min = new JTextField();
		prix_min.setColumns(10);
		prix_min.setBounds(114, 99, 86, 33);
		panel_4_2.add(prix_min);
		
		prix_max = new JTextField();
		prix_max.setColumns(10);
		prix_max.setBounds(114, 144, 86, 33);
		panel_4_2.add(prix_max);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("prix min:");
		lblNewLabel_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_3_1.setBounds(10, 104, 94, 28);
		panel_4_2.add(lblNewLabel_6_3_1);
		
		JButton bouton_recherche_produit = new JButton("Valider");
		bouton_recherche_produit.setForeground(Color.WHITE);
		bouton_recherche_produit.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		bouton_recherche_produit.setBackground(Color.GRAY);
		bouton_recherche_produit.setBounds(498, 596, 202, 89);
		contentPane.add(bouton_recherche_produit);
		
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
		
		date_min = new JTextField();
		date_min.setColumns(10);
		date_min.setBounds(114, 11, 86, 33);
		panel_4_3.add(date_min);
		
		date_max = new JTextField();
		date_max.setColumns(10);
		date_max.setBounds(114, 63, 86, 33);
		panel_4_3.add(date_max);
		
		JButton bouton_valider_total_produit = new JButton("Valider");
		bouton_valider_total_produit.setForeground(Color.WHITE);
		bouton_valider_total_produit.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 15));
		bouton_valider_total_produit.setBackground(Color.GRAY);
		bouton_valider_total_produit.setBounds(710, 596, 225, 89);
		contentPane.add(bouton_valider_total_produit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(941, 43, 429, 149);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		table_affichage_client = new JTable();
		table_affichage_client.setModel(new DefaultTableModel(
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
		table_affichage_client.setSurrendersFocusOnKeystroke(true);
		table_affichage_client.setFillsViewportHeight(true);
		table_affichage_client.setColumnSelectionAllowed(true);
		table_affichage_client.setCellSelectionEnabled(true);
		table_affichage_client.setBounds(0, 33, 429, 127);
		panel_5.add(table_affichage_client);
		
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
		
		table_affichage_commande_1 = new JTable();
		table_affichage_commande_1.setModel(new DefaultTableModel(
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
		table_affichage_commande_1.setSurrendersFocusOnKeystroke(true);
		table_affichage_commande_1.setFillsViewportHeight(true);
		table_affichage_commande_1.setColumnSelectionAllowed(true);
		table_affichage_commande_1.setCellSelectionEnabled(true);
		table_affichage_commande_1.setBounds(0, 33, 194, 127);
		panel_5_1.add(table_affichage_commande_1);
		
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
		
		table_affichage_commande_2 = new JTable();
		table_affichage_commande_2.setModel(new DefaultTableModel(
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
		table_affichage_commande_2.setSurrendersFocusOnKeystroke(true);
		table_affichage_commande_2.setFillsViewportHeight(true);
		table_affichage_commande_2.setColumnSelectionAllowed(true);
		table_affichage_commande_2.setCellSelectionEnabled(true);
		table_affichage_commande_2.setBounds(227, 33, 194, 127);
		panel_5_1.add(table_affichage_commande_2);
		
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
		
		table_affichage_produit = new JTable();
		table_affichage_produit.setModel(new DefaultTableModel(
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
		table_affichage_produit.setSurrendersFocusOnKeystroke(true);
		table_affichage_produit.setFillsViewportHeight(true);
		table_affichage_produit.setColumnSelectionAllowed(true);
		table_affichage_produit.setCellSelectionEnabled(true);
		table_affichage_produit.setBounds(0, 33, 419, 127);
		panel_5_2.add(table_affichage_produit);
		
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
