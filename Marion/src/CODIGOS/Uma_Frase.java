/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

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
    
public int tempo = 1000;

public int k1, k2;

public static Robot bot;
public static Teclas tecla;
    
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

public void uma_Tecla(String t1){
    switch(t1){
        case "backspace":
            k1 = tecla.backspace;
            break;
        case "baixo":
            k1 = tecla.baixo;
            break;
        case "direita":
            k1 = tecla.direita;
            break;
        case "cima":
            k1 = tecla.cima;
            break;
        case "esquerda":
            k1 = tecla.esquerda;
            break;
        case "enter":
            k1 = tecla.enter;
            break;
        case "iniciar":
            k1 = tecla.iniciar;
            break;
        case "tab":
            k1 = tecla.tab;
            break;
    default:
    }
    //bot.keyPress(KeyEvent.VK_ENTER);
    bot.keyPress(k1);
    bot.keyRelease(k1);
    bot.delay(tempo);
}

public void duas_Teclas(String t1, String t2){
    switch(t1){
        case "shift":
            k1 = tecla.shift;
            break;
        case "control":
            k1 = tecla.control;
            break;
        case "iniciar":
            k1 = tecla.iniciar;
            break;
    default:
    }
    switch(t2){
        case "-":
            k2 = tecla.traco;
            break;
        case "1":
            k2 = tecla.um;
            break;
        case "2":
            k2 = tecla.dois;
            break;
        case "3":
            k2 = tecla.tres;
            break;
        case "4":
            k2 = tecla.quatro;
            break;
        case "5":
            k2 = tecla.cinco;
            break;
        case "6":
            k2 = tecla.seis;
            break;
        case "7":
            k2 = tecla.sete;
            break;
        case "8":
            k2 = tecla.oito;
            break;
        case "9":
            k2 = tecla.nove;
            break;
        case "a":
            k2 = tecla.a;
            break;
        case "b":
            k2 = tecla.b;
            break;
        case "c":
            k2 = tecla.c;
            break;
        case "e":
            k2 = tecla.e;
            break;
        case "r":
            k2 = tecla.r;
            break;
        case "v":
            k2 = tecla.v;
            break;
    default:
    }
    bot.keyPress(k1);
    bot.keyPress(k2);
    bot.keyRelease(k2);
    bot.keyRelease(k1); 
    bot.delay(tempo);
}

public void Uma_Frase(String p1) throws AWTException{
    
    bot = new Robot();
    tecla = new Teclas();
    
    if((p1.equals("backspace"))){
        uma_Tecla(p1);
    }
    else
    if((p1.equals("iniciar"))){
        uma_Tecla(p1);
    }
    else
    if(p1.equals("cima")){
        uma_Tecla(p1);
    }
    else
    if(p1.equals("baixo")){
        uma_Tecla(p1);
    }
    else
    if(p1.equals("direita")){
        uma_Tecla(p1);
    }
    else
    if(p1.equals("esquerda")){
        uma_Tecla(p1);
    }
    else
    if(p1.equals("enter")){
        uma_Tecla(p1);
    }
    else
    if(p1.equals("colar")){
        duas_Teclas("control", "v");
    }
    else
    if((p1.equals("copiar"))){
        duas_Teclas("control", "c");
    }
    else
    if((p1.equals("exclamacao"))){
        duas_Teclas("shift", "1");
    }
    else
    if((p1.equals("arroba"))){
        duas_Teclas("shift", "2");
    }
    else
    if((p1.equals("cerquilha"))){
        duas_Teclas("shift", "3");
    }
    else
    if((p1.equals("cifrao")) || (p1.equals("sifrao"))){
        duas_Teclas("shift", "4");
    }
    else
    if((p1.equals("porcentagem"))){
        duas_Teclas("shift", "5");
    }
    else
    if((p1.equals("asterisco"))){
        duas_Teclas("shift", "8");
    }
    else
    if((p1.equals("anderline"))){
        duas_Teclas("shift", "-");
    }
    else
    if((p1.equals("executar"))){
        duas_Teclas("iniciar", "r");
    }
    else
    if((p1.equals("explorar"))){
        duas_Teclas("iniciar", "e");
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
    if((p1.equals("paint")) || (p1.equals("mspaint"))){
        programa("mspaint");
    }
    else
    if((p1.equals("desligar"))){
        programa("shutdown -p");
    }
    else
    if((p1.equals("reiniciar"))){
        programa("shutdown -r -f -t 0");
    }
    else
    if((p1.equals("logoff"))){
        programa("shutdown -l");
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