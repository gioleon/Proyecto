/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.create_txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class CreateFile {
    public void createTxt(String user, String contraseña) {
    try {
     BufferedWriter bw = new BufferedWriter(
             new FileWriter("C:\\Users\\pc\\Desktop\\Universidad\\Programacion\\Sistema tickets\\Proyecto\\info.txt")
     );     
     
     bw.write(user+"\n");
     bw.write(contraseña);
     bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
    
  public ArrayList<String> readerTxt(){
      ArrayList<String> info = new ArrayList<String>();
        try {
            BufferedReader rd = new BufferedReader(
                    new FileReader("C:\\Users\\pc\\Desktop\\Universidad\\Programacion\\Sistema tickets\\Proyecto\\info.txt"));
            String user;
            
            while ((user = rd.readLine()) != null){
                info.add(user);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    return info; 
  }
}
