import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vlad on 11.06.2015.
 */
public class MyTableModel1 implements TableModel {
    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private List<Company> companyList;

    public MyTableModel1(List<Company> employeeList) {
        this.companyList = employeeList;
    }


    @Override//Метод getRowCount возвращает количество строк, которое будет отображаться в таблице
    public int getRowCount() {
        return companyList.size();
    }

    @Override//Метод getColumnName возвращает заголовок колонки по её индексу
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Название компании ";
            case 1:
                return "Адресс ";
            case 2:
                return "Количество сотрудников ";
        }
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Company company = companyList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return company.getName();
            case 1:
                return company.getAddress();
            case 2:
                return company.getNumOfEmployee();
        }
        return "";
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener listener) {
        listeners.add( listener);
    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove( listener);
    }
}
