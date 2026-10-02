/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breduck.store;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.event.*;

/**
 *
 * @author bhilario
 */
public class Main extends JFrame{
    
    public static JPanel STORE;
    public static JPanel SIDEBAR;
    public static JPanel BOTTOMBAR;
    
    public static ArrayList<StoreItem> STOREITEMS = new ArrayList<>();
    
    public static HashMap<String, Integer> ITEMS = new HashMap(Map.of(
    "Alejandro", 1000,
    "Samantha", 2000,
    "Aegis", 67,
    "Vandal", 2900,
    "Glock", 420,
    "End Rod", 10000,
    "Cantrip", 1234,
    "Museum", 30,
    "Biko", 50
    ));

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        Main mp = new Main();
    });
    }
    
    public Main() throws HeadlessException{
        setSize(800, 500);
        setPreferredSize(new Dimension(800, 500));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        STORE = new Store();
        SIDEBAR = new SideBar();
        BOTTOMBAR = new BottomBar();
        
        add(STORE);
        add(SIDEBAR, BorderLayout.EAST);
        add(BOTTOMBAR, BorderLayout.SOUTH);
        
        setStoreUp();
    }
    
    public static void setStoreUp(){
        for(String s: ITEMS.keySet()){
            STOREITEMS.add(new StoreItem(s, ITEMS.get(s)));
        }
        for (StoreItem si : STOREITEMS){
            STORE.add(si);
        }
    }
}
