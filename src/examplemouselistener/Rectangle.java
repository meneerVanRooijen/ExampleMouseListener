/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemouselistener;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author vanrooijen
 */
class Rectangle {
    
    private Graphics g;
    private Color color;
    private int positionX;
    private int positionY;
    private final int width = 50;
    private final int height = 50;

    public Rectangle(int initPositionX, int initPositionY, Color initColor) {
        positionX = initPositionX;
        positionY = initPositionY;
        color = initColor;
    }

    public void drawRectangle(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    public boolean collision(int x, int y) {
        if ((x >= positionX) && (x <= positionX + width) && (y >= positionY) && (y <= positionY + height)) {
            return true;
        } else {
            return false;
        }
    }
}