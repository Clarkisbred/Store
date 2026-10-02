/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breduck.store;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
/**
 *
 * @author bhilario
 */
public class SideBar extends JPanel {
    public static final Color BACKGROUND = Color.decode("#000000");
    public static final Color HOVERCOLOR = Color.decode("#425B9A");
    
    public SideBar(){
        setPreferredSize(new Dimension(100, 500));
        setBackground(Color.decode("#000000"));
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Clicked");
            }
            @Override
            public void mouseEntered(MouseEvent e){
                setBackground(HOVERCOLOR);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                setBackground(BACKGROUND);
            }
        });
    }
}
