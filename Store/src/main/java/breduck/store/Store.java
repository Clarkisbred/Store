/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package breduck.store;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author bhilario
 */
public class Store extends JPanel {
    
    public static final Color BACKGROUND = Color.decode("#000000");
    public static final Color HOVERCOLOR = Color.decode("#425B9A");
    
    
    public Store(){
        setPreferredSize(new Dimension(600, 400));
        setBackground(BACKGROUND);
        setLayout(new GridLayout(3, 3, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
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
