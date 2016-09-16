/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemouselistener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author vanrooijen
 */
class PanelRectangles extends JPanel implements MouseListener {
    
    Rectangle rectangle1 = new Rectangle(10, 10, Color.RED);
    Rectangle rectangle2 = new Rectangle(10, 90, Color.RED);

    public PanelRectangles() {
        setBackground(Color.YELLOW);
        setBounds(150, 50, 200, 200);
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        rectangle1.drawRectangle(g);
        rectangle2.drawRectangle(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (rectangle1.collision(e.getX(), e.getY())) {
            rectangle1.setColor(Color.BLUE);
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}