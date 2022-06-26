package GUI.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class TextFieldListener{
    private JTextField textField;
    private JTextArea textArea;
    

    
    public TextFieldListener(JTextField textField,
                             JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
        }
    
    public void doTheThing(JTextField textField, JTextArea textArea){
        textField.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), textArea);
        //need an action map for textField and an action that will contain the code to do things in the text area
    }
    
    /*public void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String currentTextFieldText = textField.getText();
            textArea.append(currentTextFieldText);
            textField.setText(" ");
        }
    }*/
}
