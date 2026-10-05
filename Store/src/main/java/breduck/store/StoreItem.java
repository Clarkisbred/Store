/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breduck.store;
import static breduck.store.Store.BACKGROUND;
import static breduck.store.Store.HOVERCOLOR;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author bhilario
 */
public class StoreItem extends JPanel{
    public static final Color BG = Color.decode("#31AAA9");
    public static final Color HBG = Color.decode("#F6E0A4");
    
    public StoreItem(String name, int price){
        setPreferredSize(new Dimension(150, 150));
        setBackground(BG);
        setBorder(BorderFactory.createLineBorder(Color.RED, 10));
        
        JLabel label = new JLabel(name);
        label.setFont(new Font("SansSerif", Font.BOLD, 20));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel amount = new JLabel("$" + price);
        amount.setFont(new Font("SansSerif", Font.ITALIC, 15));
        amount.setAlignmentX(CENTER_ALIGNMENT);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        
        add(label);
        add(amount);
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println(name + "!");
            }
            @Override
            public void mouseEntered(MouseEvent e){
                setBackground(HBG);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                setBackground(BG);
            }
        });
    }
}
