package GUI;

import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

public class TextReader {
    private JTextArea textArea;
    
    public TextReader(JTextArea textArea){
        textArea = this.textArea;
    }
    
    public String getAllText(JTextArea textArea){
        String allTheText = textArea.getText();
        return allTheText;
    }
    
    public String getLastLineOfText(JTextArea textArea) throws BadLocationException{
        var end = textArea.getDocument().getLength();
        //could try textArea.getDocument().getEndPosition which returns a position object from which I can get an offset that could possibly be used to find start and end points
        int start = Utilities.getRowStart(textArea, end);//ide doesnt like this and needs the badlocexception 
        
        while (start == end)
        {
            end--;
            start = Utilities.getRowStart(textArea, end);
        }
        String text = textArea.getText(start, end);
        return text;
    }
}
