/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kafil
 */
public class Bll {
    public static int toSecond(int h, int m, int s){
        return s+m*60+h*3600;
    }
    
    public static void shutdown(int seconds){
        cancelShutDown();
        String cmd = "shutdown -s -t "+seconds;
        //TODO: Execute the command 
        executeCmd(cmd);
    }
    
    public static void cancelShutDown(){
        executeCmd("shutdown -a");
    }
    
    public static void executeCmd(String cmd){
        try {
            //System.out.println(cmd);
            Process p = Runtime.getRuntime().exec(cmd);
            //System.out.println(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Bll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
