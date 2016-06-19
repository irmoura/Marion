/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Janela_Principal.frase;
import static CODIGOS.Janela_Principal.frase_completa;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibyte
 */
public class Tres_Frases {

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
            Logger.getLogger(Tres_Frases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public static void type(int i) throws AWTException{
    Robot robot = new Robot();
      
    robot.delay(40);
    robot.keyPress(i);
    robot.keyRelease(i);
}
 
public static void type(String s) throws AWTException{
      
    Robot robot = new Robot();
      
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int code = b;
      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
      if (code > 96 && code < 123) code = code - 32;
      robot.delay(40);
      robot.keyPress(code);
      robot.keyRelease(code);
    }
}

public static void click(int x, int y) throws AWTException{
    Robot bot = new Robot();
    bot.mouseMove(x, y);    
    bot.mousePress(InputEvent.BUTTON1_MASK);
    bot.mouseRelease(InputEvent.BUTTON1_MASK);
}    
    
public void Tres_Frases(String p1, String p2, String p3) throws AWTException{
    if((p1.equals("mouse"))){
        
        Robot bot = new Robot();
        
        bot.delay(1000);
        
        int X = Integer.parseInt(p2);
        int Y = Integer.parseInt(p3);
        
        bot.mouseMove(X, Y);
        
    }
    else
    if((p1.equals("clique"))){
        
        Robot bot = new Robot();
        
        bot.delay(1000);
        
        int X = Integer.parseInt(p2);
        int Y = Integer.parseInt(p3);
        
        click(X, Y);
        
    }
    else
    if((p1.equals("digite")) && (p2.equals("isso"))){
        
        Robot bot = new Robot();
        
        bot.delay(1000);
        
        frase_completa = frase_completa.replace("digite isso ", "");
        
        type(frase_completa); 
        
    }
    else
    if((p1.equals("painel")) && (p2.equals("de"))&& (p3.equals("controle"))){
        programa("control");
    }
    else
    if((p1.equals("gerenciador")) && (p2.equals("de"))&& (p3.equals("tarefas"))){
        programa("Taskmgr");
    }
}
    
}