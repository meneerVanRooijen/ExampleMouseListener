/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemouselistener;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author vanrooijen
 */
class PanelButtons extends JPanel {
    
    public PanelButtons() {
        setBackground(Color.GRAY);
        setBounds(150, 10, 200, 40);
        JButton knop = new JButton("Dummy button");
        knop.setBounds(200, 275, 120, 40);
        add(knop);
    }   
}