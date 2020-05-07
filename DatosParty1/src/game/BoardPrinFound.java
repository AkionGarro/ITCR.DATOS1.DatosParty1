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

/**
 *
 * @author SantaMix728
 */
public class BoardPrinFound extends JPanel{
    
        private Image imageFound;
        @Override
        public void paint(Graphics g){
            imageFound = new ImageIcon(getClass().getResource("/images/Board/PrincipalBoard.png")).getImage();
            g.drawImage(imageFound,0,0,getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
        }
    }
    

