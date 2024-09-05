import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class j028_dialog {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "plain msg", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "info msg", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "ques msg", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "warning msg", "title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "error msg", "title", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "default Option msg", "title", JOptionPane.DEFAULT_OPTION);
        // JOptionPane.showConfirmDialog(null, "close Option msg", "title", JOptionPane.CLOSED_OPTION);
        // JOptionPane.showConfirmDialog(null, "cancel Option msg", "title", JOptionPane.CANCEL_OPTION);
        // JOptionPane.showConfirmDialog(null, "no Option msg", "title", JOptionPane.NO_OPTION);   

        //custom dialog;
        ImageIcon icon = new ImageIcon("FrameSwing/res/icon2.png");
        String[] opt = {"Haa", "Na", "yes", "no"}; 

        int a = JOptionPane.showOptionDialog(
                                        null,
                                        "msg",
                                        "title",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.INFORMATION_MESSAGE,
                                        icon,
                                        opt,
                                        0); //pre selected value of array;

            System.out.println(a);

    }
}
