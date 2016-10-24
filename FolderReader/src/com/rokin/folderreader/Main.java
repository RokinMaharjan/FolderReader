/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.folderreader;

import java.io.File;

/**
 *
 * @author rokin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder = new File("/home/rokin/Desktop/Subtitles");
        for(File file : folder.listFiles())
        {
            System.out.println(file);
        }  
    }   
}
