import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vlad on 11.06.2015.
 */
public class MyTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private List<Employee> employeeList;

    public MyTableModel(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public int getRowCount() {
        return employeeList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Имя ";
            case 1:
                return "Hомер телефона  ";
            case 2:
                return "Возраст ";
            case 3 :
                return "Пол ";
            case 4 :
                return "Адресс ";

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
        Employee employee = employeeList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return employee.getName();
            case 1:
                return employee.getMobile();
            case 2:
                return employee.getAge();
            case 3:
                return employee.getSex();
            case 4:
                return employee.getAddress();

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
