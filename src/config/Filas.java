
package config;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class Filas extends DefaultTableCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(null);

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
super.setHorizontalAlignment(SwingConstants.CENTER);
        boolean par = (row % 2 == 0);

       // Color c = new Color(57,105,138);

       
        if (par) {
            //setBackground(c);
            //setForeground(Color.WHITE);
        }
        return this;
    }

}
