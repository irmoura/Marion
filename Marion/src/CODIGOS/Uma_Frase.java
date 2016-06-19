/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Tres_Frases.type;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ibyte
 */
public class Uma_Frase {
    
public static void programa(String comando){
        try {
            Process p = Runtime.getRuntime().exec ("cmd.exe /c start "+comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader (new InputStreamReader (is));
            String aux = br.readLine();
            while (aux!=null){
                System.out.println (aux);
                aux = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Uma_Frase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public void Uma_Frase(String p1) throws AWTException{
    if((p1.equals("enter"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
    }
    else
    if((p1.equals("colar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_CONTROL); 
    }
    else
    if((p1.equals("copiar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_C);
        bot.keyRelease(KeyEvent.VK_C);
        bot.keyRelease(KeyEvent.VK_CONTROL); 
    }
    else
    if((p1.equals("direita"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_RIGHT);
        bot.keyRelease(KeyEvent.VK_RIGHT);
    }
    else
    if((p1.equals("esquerda"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_LEFT);
        bot.keyRelease(KeyEvent.VK_LEFT);
    }
    else
    if((p1.equals("cima"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_UP);
        bot.keyRelease(KeyEvent.VK_UP);
        bot.delay(1000);
    }
    else
    if((p1.equals("baixo"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_DOWN);
        bot.keyRelease(KeyEvent.VK_DOWN);
    }
    else
    if((p1.equals("exclamacao"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_1);
        bot.keyRelease(KeyEvent.VK_1);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("arroba"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_2);
        bot.keyRelease(KeyEvent.VK_2);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("cerquilha"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_3);
        bot.keyRelease(KeyEvent.VK_3);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("cifrao")) || (p1.equals("sifrao"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_4);
        bot.keyRelease(KeyEvent.VK_4);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("porcentagem"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_5);
        bot.keyRelease(KeyEvent.VK_5);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("asterisco"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_8);
        bot.keyRelease(KeyEvent.VK_8);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("anderline"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_SHIFT);
        bot.keyPress(KeyEvent.VK_MINUS);
        bot.keyRelease(KeyEvent.VK_MINUS);
        bot.keyRelease(KeyEvent.VK_SHIFT); 
    }
    else
    if((p1.equals("executar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyPress(KeyEvent.VK_R);
        bot.keyRelease(KeyEvent.VK_R);
        bot.keyRelease(KeyEvent.VK_WINDOWS); 
    }
    else
    if((p1.equals("explorar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyPress(KeyEvent.VK_E);
        bot.keyRelease(KeyEvent.VK_E);
        bot.keyRelease(KeyEvent.VK_WINDOWS); 
    }
    else
    if((p1.equals("notepad"))){
        programa(p1); 
    }
    else
    if((p1.equals("chrome"))){
        programa(p1); 
    }
    else
    if((p1.equals("control"))){
        programa(p1); 
    }
    else
    if((p1.equals("calc")) || (p1.equals("calculadora"))){
        programa("calc"); 
    }
    else
    if(p1.equals("cmd")){
        programa("cmd"); 
    }
    else
    if(p1.equals("Taskmgr")){
        programa(p1); 
    }
    else
    if((p1.equals("iniciar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyRelease(KeyEvent.VK_WINDOWS);
        bot.delay(1000);
    }
    else
    if((p1.equals("backspace"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_BACK_SPACE);
        bot.keyRelease(KeyEvent.VK_BACK_SPACE);
    }
    else
    if((p1.equals("paint"))){
        programa("mspaint");
    }
    else
    if((p1.equals("desligar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyPress(KeyEvent.VK_R);
        bot.keyRelease(KeyEvent.VK_R);
        bot.keyRelease(KeyEvent.VK_WINDOWS);
        type("shutdown ");
        bot.keyPress(KeyEvent.VK_MINUS);
        bot.keyRelease(KeyEvent.VK_MINUS);
        type("p");
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
    }
    else
    if((p1.equals("showinputdialog"))){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String text = JOptionPane.showInputDialog(null,"Digite a informação: ","Informação",JOptionPane.WARNING_MESSAGE);
        StringSelection selection = new StringSelection(text);
        clipboard.setContents(selection, null);
    }
}
   
}