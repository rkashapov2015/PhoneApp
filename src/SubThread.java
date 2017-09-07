/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rinat
 */
public class SubThread extends Thread {
   
    MainFrame mainFrame;
    public SubThread(MainFrame parent) {
        mainFrame = parent;
    }

    @Override
    public void run() {
        while (true) {
            try {
                
                //System.out.println("thread");
                mainFrame.rePaint();
                Thread.sleep(3000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(SubThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
