package exerciciocarro.view;

import exerciciocarro.model.Carro;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.table.AbstractTableModel;

public class CarroTableModel extends AbstractTableModel
{
    
    protected static String[] COLUMN_NAMES = {"Placa", "Marca", "Modelo", "Cap. Tanque", "L Abastecido", "Km Percorrido", "Km/L"};
    protected static Class[] COLUMN_CLASSES = {String.class, String.class, String.class, String.class, String.class, String.class, String.class};        
    
    private Set<Integer> selected;
    private List<Carro> carros;

    public CarroTableModel() {
        carros = new ArrayList<>(25);
        selected = new TreeSet<Integer>();
    }
    
    @Override
    public int getRowCount() {
        return carros.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return COLUMN_CLASSES[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carro carro = carros.get(rowIndex);
        switch (columnIndex) {
            case 0: return carro.getPlaca();
            case 1: return carro.getMarca();
            case 2: return carro.getModelo();
            case 3: return carro.getCapacidadeTanque();
            case 4: return carro.getLitrosAbastecidos();
            case 5: return carro.getKm();
            case 6: return carro.getConsumo();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        /*if (columnIndex != 4) {
            return;
        }
        if (!(aValue instanceof Boolean)) {
            return;
        }
        boolean isSelected = (Boolean)aValue;
        if (isSelected) {
            selected.add(rowIndex);
        } else {
            selected.remove(rowIndex);
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);*/
    }
    
    public void add(Carro carro) {
        int index = carros.size();
        carros.add(carro);
        fireTableRowsInserted(index, index);
    }

    public Carro cardAt(int rowIndex) {
        return carros.get(rowIndex);
    }
    
}