package GUI.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class TextFieldListener implements ActionListener, KeyListener {
    private JTextField textField;
    private JTextArea textArea;
    

    
    public TextFieldListener(JTextField textField,
                             JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //so on enter this will append the the text from the text field to the text area
        String currentTextFieldText = textField.getText();
        textArea.append(currentTextFieldText);
        textField.setText(" ");
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
