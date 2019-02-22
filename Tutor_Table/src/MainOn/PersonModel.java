package MainOn;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PersonModel implements TableModel {

	//MainWindow mW = new MainWindow();
	private ArrayList<TableModelListener> listeners; 
	
	public PersonModel()
	{
		listeners = new ArrayList<TableModelListener>();
	}
	@Override
 	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		listeners.add(l);
	}
 
	@Override 
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
		//return null;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getColumnName(int index) {
		// TODO Auto-generated method stub
//		return null;
		String returns = "" ;
		switch(index)
		{
		case 0: returns = "Name"; break;
		case 1: returns = "Surname"; break;
		
		}
		return returns;  
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		//if(Main.persons.size() == 0) {return ;}
		return Main.persons.size();
	
			
	}

	@Override 
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		Object returns = null;
		switch(col)
		{
		case 0: returns = Main.persons.get(row).getName();
		break;
		case 1: returns = Main.persons.get(row).getSurname();
		break;
		}
		return returns;
	}

	@Override
	public boolean isCellEditable(int row, int col) {
		// TODO Auto-generated method stub 
		return true;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		listeners.remove(l);
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		// TODO Auto-generated method stub
		//Main.persons.get(row).
		switch(col)
		{
			case 0: Main.persons.get(row).setName((String) value);
				break;
			case 1: Main.persons.get(row).setSurname((String) value);
				break;
		}
	}

}
