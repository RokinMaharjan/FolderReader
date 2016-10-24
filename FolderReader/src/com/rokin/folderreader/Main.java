/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.folderreader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rokin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            File folder = new File("/home/rokin/Desktop/Subtitles");
            writer = new FileWriter("/home/rokin/Desktop/ListOfFilenames");
            for(File file : folder.listFiles())
            {
                writer.append(file.getName()).append("\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
