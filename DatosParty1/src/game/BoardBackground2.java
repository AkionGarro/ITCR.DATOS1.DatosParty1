/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class BoardBackground2 extends JPanel{
       
        private Image background2;
        @Override
        public void paint(Graphics g){
            
            background2 = new ImageIcon(getClass().getResource("/images/Board/SecundaryBoard.png")).getImage();
            g.drawImage(background2,0,0,getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
        }
    }

