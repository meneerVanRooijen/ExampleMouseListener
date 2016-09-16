/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemouselistener;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author vanrooijen
 */
class PanelMain extends JPanel {
    
    PanelRectangles pnlRectangles = new PanelRectangles();
    PanelButtons pnlButtons = new PanelButtons();

    public PanelMain() {
        setLayout(null);
        setBackground(Color.WHITE);
        add(pnlRectangles);
        add(pnlButtons);
    }   
}