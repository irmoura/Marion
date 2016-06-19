/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ismael Ribeiro
 */
public class Duas_Frases {
    public void Duas_Frases(String p1, String p2) throws AWTException{
        if(p1.equals("selecionar") && p2.equals("tudo")){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_A);
        bot.keyRelease(KeyEvent.VK_A);
        bot.keyRelease(KeyEvent.VK_CONTROL);
        }
        else
        if(p1.equals("delay")){
        Robot bot = new Robot();
        int delay = Integer.parseInt(p2);
        bot.delay(delay);
        }
        else
        if((p1.equals("menu")) && (p2.equals("iniciar"))){
        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyRelease(KeyEvent.VK_WINDOWS);
    }
    }
}
