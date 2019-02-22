package MainOn;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame{
	private JTable table;
	public PersonModel pM;

	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640,480);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 380, 429);
		getContentPane().add(scrollPane);
		
		pM = new PersonModel();
		table = new JTable();

		table.setModel(pM);
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Person pR = new Person();
				pR.setName(JOptionPane.showInputDialog("Enter name: "));
				pR.setSurname(JOptionPane.showInputDialog("Enter surname: "));
				Main.persons.add(pR);
				table.updateUI();
				
			}
		});
		btnAdd.setBounds(397, 11, 89, 23);
		getContentPane().add(btnAdd);
		
		
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()==-1) {return;}
				Person pR = new Person();
				Main.persons.remove(table.getSelectedRow());
				table.updateUI();
			}
		});
		btnRemove.setBounds(397, 43, 89, 23);
		getContentPane().add(btnRemove);
		
		setVisible(true);
	}
}
