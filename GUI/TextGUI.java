package GUI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextGUI {
    private JFrame mainFrame;//the main frame that holds everything
    private JPanel mainPanel;//the panel that sits on the frame and holds everything else
    private JTextField textField; //this will be where user text is entered
    private JTextArea textArea;//this will be where old text is appended and responses are lsited
    private JScrollPane scrollPane;//scroll pane for the text area
    private GridBagLayout gridBagLayout;//the layout thats applied to the panel
    private Dimension minSize;//the min size of the frame
    
    public TextGUI()
    {
        //instantiating stuff
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        textField = new JTextField();
        textArea = new JTextArea();
        minSize = new Dimension(640,480);
        gridBagLayout = new GridBagLayout();
        
    }
}
