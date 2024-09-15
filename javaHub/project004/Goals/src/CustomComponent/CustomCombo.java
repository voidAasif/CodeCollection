package CustomComponent;

import javax.swing.*;
import java.awt.*;

public class CustomCombo extends JLabel implements ListCellRenderer<Object> {

    public CustomCombo() {
        setOpaque(true);
        setHorizontalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.toString());
        setBackground(isSelected ? Color.BLUE : Color.WHITE);
        setForeground(isSelected ? Color.WHITE : Color.BLACK);
        return this;
    }
}


//USE;
// String[] items = {"Option 1", "Option 2", "Option 3"};
//             JComboBox<String> comboBox = new JComboBox<>(items);

//             // Set custom renderer
//             comboBox.setRenderer(new CustomCombo());  // Correct usage
