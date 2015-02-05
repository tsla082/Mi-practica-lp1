package aplicaciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class FactoresdeEvaluacionPostulantes extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel df;
	private JTable tb;
	private JScrollPane scp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactoresdeEvaluacionPostulantes frame = new FactoresdeEvaluacionPostulantes();
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
	public FactoresdeEvaluacionPostulantes()throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setResizable(false);
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFactoresDeEvaluacion = new JLabel("Factores de Evaluaci\u00F3n");
		lblFactoresDeEvaluacion.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblFactoresDeEvaluacion.setBounds(136, 11, 346, 43);
		contentPane.add(lblFactoresDeEvaluacion);
		
		
		
		df = new DefaultTableModel();
	 	
		df.addColumn("Curso");
		df.addColumn("Factor");
		df.addColumn("Peso");
		df.addColumn("Escala puntaje");
		df.addColumn("Año");
		
		tb= new JTable(df);	

		scp= new JScrollPane(tb);
		scp.setBounds(10,89,609,112);
		contentPane.add(scp);
		
		JLabel lblSeleccioneUnaFila = new JLabel("Seleccione una fila que sera usada para evaluar .");
		lblSeleccioneUnaFila.setBounds(10, 64, 386, 14);
		contentPane.add(lblSeleccioneUnaFila);
		
		JButton btnUsar = new JButton("Usar");
		btnUsar.setBounds(10, 212, 89, 23);
		contentPane.add(btnUsar);
		
	}
}
