package memberUI;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import core.Purchase;
import core.Individual_exercise_log;

public class MemPurchaseTableModel extends AbstractTableModel {
	
	public static final int OBJECT_COL = -1;
	private String[] columnNames = {"title","amount_paid","paid_date", "type"};
	private List<Purchase> purchases;
	
	public MemPurchaseTableModel(List<Purchase> purchases) {
		this.purchases = purchases;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return purchases.size();
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Class getColumnClass(int c) {
		Object column = getValueAt(0,c);
		if (column == null) {
			return new Object().getClass();
		} else {
			return column.getClass();
		}
	}

	@Override
	public Object getValueAt(int row, int col) {
		Purchase tempPurchase = purchases.get(row);

		switch (col) {
		case 0:
			return tempPurchase.getName();
		case 1:
			return tempPurchase.getAmt_paid();
		case 2:
			return tempPurchase.getPaid_date();
		case 3:
			return tempPurchase.getType();
		case OBJECT_COL:
			return tempPurchase;
		default:
			return tempPurchase.getName();
		}
	}
}
