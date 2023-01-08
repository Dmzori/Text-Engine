package GUI.ActionListeners;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import GUI.TextReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;


public class TextFieldAction extends AbstractAction{
    private JTextField textField;
    private JTextArea textArea;
    private TextReader textReader = new TextReader(textArea);
    private int gameState = 0;

    
    public TextFieldAction(JTextField textField,
                             JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
        
        }
    
    public void mapSetUp(JTextField textField, JTextArea textArea){
        textField.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "enterAction");
        textField.getActionMap().put("enterAction", this);
        }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        String currentTextFieldText = textField.getText();
        textArea.append(currentTextFieldText + "\n"); // \n forces new text to be placed on a new line
        textField.setText(" ");
        try {
            textReader.lastLineOfTextAction(textArea, gameState);
        } catch (BadLocationException ex) {
            Logger.getLogger(TextFieldAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
