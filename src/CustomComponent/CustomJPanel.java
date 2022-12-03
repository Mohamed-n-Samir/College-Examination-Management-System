package CustomComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CustomJPanel {
    public static JPanel CustomPanel(ImageIcon image,String message,Color color){
        JLabel icon = new JLabel(image);
        JLabel text = new JLabel(message);
        text.setBackground(color);
        icon.setBackground(color);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.WEST);
        panel.add(text,BorderLayout.EAST);
        panel.setBackground(color);
        return panel;
        
    }
}
