import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory; //imports;

public class LeftPanel extends JPanel implements ActionListener { // actionListener used to add action on buttons;
                                        
    ImageIcon logoIcon = new ImageIcon("aboutSys/src/res/software.png"); //software logo on top of left panel;

    JPanel topPanel, bottomPanel; // initialize top and bottom panel into leftPanel;

    int width = 150; // set height and width of the buttons;
    int height = 50;
    int backColor = 0xe6fbff; // default background color;

    JLabel logo; //use label to add logo and then add logo into topPanel;
    JButton home, osName, processor, memory, battery, display; //buttons;

    Logic logic = new Logic(); //call logic class;
    RightPanel displayData; //initialize RightPanel;

    public LeftPanel(RightPanel rightPanel) { // constructor, catch RightPanel;
        this.displayData = rightPanel; // and set rightPanel into RightPanel; it's required to control RightPanel from LeftPanel;

        this.setLayout(new BorderLayout()); // set Border layout to set top Panel on top and bottom panel on center;
        this.setBackground(Color.lightGray);

        // Top panel setup
        topPanel = new JPanel(); //initialize top Panel
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25)); //flow layout to center the label which contains software logo;
        topPanel.setPreferredSize(new Dimension(200, 150)); //set dimensions of topPanel;
        
        logo = new JLabel(logoIcon); //initialize logo;
        logo.setPreferredSize(new Dimension(width, height*2)); //set dimensions, width same as button but height is mul of 2;
        logo.setOpaque(true); //set true to display bg color;
        logo.setHorizontalAlignment(JLabel.CENTER); // layout is FlowLayout so we use alignment properties to center the label;
        logo.setVerticalAlignment(JLabel.CENTER);

        // Bottom panel setup
        bottomPanel = new JPanel(); //initialize bottom panel;
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15)); //set flowLayout to wrap buttons in bottomPanel;
        bottomPanel.setPreferredSize(new Dimension(200, 200));

        Border buttonBorder = BorderFactory.createLineBorder(Color.WHITE , 2); // border for buttons;
        Font buttonFont = new Font("Arial", Font.BOLD, 12); //font for buttons;

        // Buttons setup
        home = createButton("Home", buttonFont, buttonBorder);
        osName = createButton("OS Name", buttonFont, buttonBorder);
        processor = createButton("Processor", buttonFont, buttonBorder);
        memory = createButton("Memory", buttonFont, buttonBorder);
        battery = createButton("Battery", buttonFont, buttonBorder);
        display = createButton("Display", buttonFont, buttonBorder);

        // Action listeners for buttons
        home.addActionListener(this);
        osName.addActionListener(this);
        processor.addActionListener(this);
        memory.addActionListener(this);
        battery.addActionListener(this);
        display.addActionListener(this);

        // Add components to panels
        topPanel.add(logo);
        bottomPanel.add(home);
        bottomPanel.add(osName);
        bottomPanel.add(processor);
        bottomPanel.add(memory);
        bottomPanel.add(battery);
        bottomPanel.add(display);

        // add topPanel and bottomPanel into leftPanel, in left panel we use borderLayout so we also set directions;
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.CENTER);
    }

    private JButton createButton(String text, Font font, Border border) { //method used to create button;
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(width, height));
        button.setFocusable(false);
        button.setBorder(border);
        button.setBackground(new Color(backColor));
        button.setFont(font);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) { // add action on button;

        //reminder: RightPanel = displayData;
        //here single line call three methods, two methods from RightPanel class and one method from Logic class;
        //RightPanel: 1. setAboutIcon(pass path of icon);
        //            2. setData(set text on textPane)
        //Logic;      3. getHome(return default text)
        //            3. getOs(return os name, version etc)
        //            3. getProcessor(return processor details)
        //            3. getMemory(return memory details)
        //            3. getBattery(return battery details)
        //            3. getDisplay(return display details)

        if (e.getSource() == home) {
            System.out.println("home"); //log;
            displayData.setAboutIcon("aboutSys/src/res/me.png").setData(logic.getHome());
        }
        if (e.getSource() == osName) {
            System.out.println("osName"); //log;
            
            if(logic.getOs().toLowerCase().contains("linux")){
                displayData.setAboutIcon("aboutSys/src/res/linux.png").setData(logic.getOs());
            }
            if(logic.getOs().toLowerCase().contains("window")){
                displayData.setAboutIcon("aboutSys/src/res/windows.png").setData(logic.getOs());
            }
            if(logic.getOs().toLowerCase().contains("mac")){
                displayData.setAboutIcon("aboutSys/src/res/mac.png").setData(logic.getOs());
            }
        }
        if (e.getSource() == processor) {
            System.out.println("processor"); //log;
            displayData.setAboutIcon("aboutSys/src/res/processor.png").setData(logic.getProcessor());
        }
        if (e.getSource() == memory) {
            System.out.println("memory"); //log;
            displayData.setAboutIcon("aboutSys/src/res/memory.png").setData(logic.getMemory());
        }
        if (e.getSource() == battery) {
            System.out.println("battery"); //log;
            displayData.setAboutIcon("aboutSys/src/res/battery.png").setData(logic.getBattery());
        }
        if (e.getSource() == display) {
            System.out.println("display"); //log;
            displayData.setAboutIcon("aboutSys/src/res/display.png").setData(logic.getDisplay());
        }
    }
}
