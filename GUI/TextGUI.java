package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextGUI {
    private final JFrame mainFrame;//the main frame that holds everything
    private final JPanel mainPanel;//the panel that sits on the frame and holds everything else
    private final JTextField textField; //this will be where user text is entered
    private final JTextArea textArea;//this will be where old text is appended and responses are lsited
    private final JScrollPane scrollPane;//scroll pane for the text area
    private final GridBagLayout gridBagLayout;//the layout thats applied to the panel
    private final GridBagConstraints textFieldConstraint;//the size constraint to be used for the gridbaglayout
    private final GridBagConstraints textAreaConstraint;
    private final Dimension minSize;//the min size of the frame
    
    public TextGUI()
    {
        //instantiating stuff
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        textField = new JTextField();
        textArea = new JTextArea();
        minSize = new Dimension(640,480);
        scrollPane = new JScrollPane(textArea);//adds the scroll pane to the text area
        gridBagLayout = new GridBagLayout();
        textFieldConstraint = new GridBagConstraints();//each component should have its own constraint size when added to it's panel unless you want them to act the same at all times 
        textAreaConstraint = new GridBagConstraints();
        

        //GridBagConstraint stuff
        
        //textField stuff
        
        
        //textArea stuff
        textArea.setEditable(false);

        
        //frame stuff
        mainFrame.add(mainPanel);
        mainFrame.setMinimumSize(minSize);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.getContentPane().setBackground(Color.BLACK);
        mainFrame.setVisible(true);
        mainFrame.setTitle("Text Engine");
        
        //panel stuff
        //mainPanel.setLayout(gridBagLayout);
        mainPanel.add(textField, textFieldConstraint);
        mainPanel.add(textArea, textAreaConstraint);
        
    }
}
