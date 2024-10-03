/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logs;

import complaintmanagementsystem.ComplaintManagementSystem;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class loggWriter {
    String workingDir;
    FileWriter writer = null;
    Calendar cal = Calendar.getInstance();
    public loggWriter() {
        workingDir = System.getProperty("user.dir");
   }

    public loggWriter(String string,boolean whichOne) {
        workingDir = System.getProperty("user.dir");
        if(whichOne==true)write1(string);
        else write2(string);
    }
    public void write1(String text){
                try {
                    
                    writer = new FileWriter(workingDir+"\\src\\logs\\log1.txt", true);
                    writer.write("******************************\n\n"+cal.getTime()+"\n");
                    writer.write(text);
                    writer.write("\r\n");   // write new line
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(ComplaintManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(ComplaintManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }}
    public void write2(String text){
                try {
                    
                    writer = new FileWriter(workingDir+"\\src\\logs\\log2.txt", true);
                    writer.write("******************************\n\n"+cal.getTime()+"\n");
                    writer.write(text);
                    writer.write("\r\n");   // write new line
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(ComplaintManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(ComplaintManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }}
}
