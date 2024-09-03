import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image; //imports;

public class RightPanel extends JPanel {

    JPanel topPanel, bottomPanel; //initialize two panel one for icon and second for text;
    JLabel aboutLabel; //label work as a container of icon;
    JTextPane textPane; //used to print text;
    JScrollPane textScrollContainer; //enable scrolling;

    ImageIcon aboutIcon; // icon for aboutLabel, change icon according to buttons;

    int logoWidth = 160; // label 160x160;
    int logoHeight = logoWidth;
    int backColor = 0xe6fbff; //background color;

    String iconPath = "aboutSys/src/res/me.png"; // set path for startup; default;

    Logic logic = new Logic(); //call logic class;

    public RightPanel() { //constructor;
        this.setLayout(new BorderLayout()); //borderLayout to set top panel on top and bottom panel on bottom;
        this.setBackground(new Color(backColor));

        aboutIcon = new ImageIcon(iconPath); // default path;
        aboutIcon.setImage(aboutIcon.getImage().getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH)); //160x160 icon;

        aboutLabel = new JLabel(aboutIcon); //create label;
        aboutLabel.setBackground(new Color(backColor));
        aboutLabel.setOpaque(true);

        setAboutIcon(iconPath); //call method to dynamically change the icons in topPanel of RightPanel;

        topPanel = new JPanel(); // top panel;
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20)); //use flow to center aboutLabel which contains icon;
        topPanel.setBackground(new Color(backColor));
        topPanel.add(aboutLabel); //add label into topLabel;

        textPane = new JTextPane();
        textPane.setText(logic.getHome()); //set Default text;

        textPane.setFont(new Font("Monospaced", Font.PLAIN, 16));
        textPane.setBackground(new Color(backColor));
        textPane.setCaretColor(new Color(backColor));
        textPane.setEditable(false);

        textCenter(); //align text on bottomPanel of RightPanel;

        textScrollContainer = new JScrollPane(textPane); // add textPane into scrollPane
        textScrollContainer.setBorder(null);

        JScrollBar verticalScrollBar = textScrollContainer.getVerticalScrollBar(); //customize vertical JScrollBar;
        verticalScrollBar.setPreferredSize(new Dimension(0, 0)); // hide vertical scrollbar;
        verticalScrollBar.setBackground(new Color(backColor));

        JScrollBar horizontalScrollBar = textScrollContainer.getHorizontalScrollBar() ; //customize horizontal JScrollBar;
        horizontalScrollBar.setPreferredSize(new Dimension(0, 10)); // hide vertical scrollbar;
        horizontalScrollBar.setBackground(new Color(backColor));

        bottomPanel = new JPanel(); //create bottom panel and add textScrollContainer into it; textScrollContainer contains textPane;
        bottomPanel.setLayout(new BorderLayout()); //use border layout to center the textPane into it;
        bottomPanel.add(textScrollContainer, BorderLayout.CENTER); //center here;

        this.add(topPanel, BorderLayout.NORTH); //add topPanel on top of RightPanel;
        this.add(bottomPanel, BorderLayout.CENTER); //add bottom panel on center of RightPane;
    } // constructor end;

    public RightPanel setAboutIcon(String newIconPath) { // set icon,  here the path of icon is passed by the methods in LeftPanel;
        aboutIcon = new ImageIcon(newIconPath);
        aboutIcon.setImage(aboutIcon.getImage().getScaledInstance(logoWidth, logoHeight, Image.SCALE_AREA_AVERAGING));
        aboutLabel.setIcon(aboutIcon);
        return this;
    }

    public RightPanel setData(String text) { // set data;
        textPane.setText(text);
        if (text.contains("Aasif") || text.contains("OS Name")) { //form home and osName text alignment is center and for other is left;
            textCenter();
        } else {
            textLeft();
        }
        textPane.setCaretPosition(0); //when data is changed courser set to 0 position to initially stay on top;
        return this; //return RightPanel to implement chain;
    }

    private void textCenter() { //align items in center;
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setLineSpacing(set, 0.5f);
        StyleConstants.setAlignment(set, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), set, false);
    }

    private void textLeft() { //align items in left;
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setLineSpacing(set, 0.5f);
        StyleConstants.setAlignment(set, StyleConstants.ALIGN_LEFT);
        doc.setParagraphAttributes(0, doc.getLength(), set, false);
    }
}
