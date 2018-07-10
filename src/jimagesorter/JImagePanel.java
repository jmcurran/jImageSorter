/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimagesorter;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author James
 */
public class JImagePanel extends JPanel {

    private BufferedImage img;

    public JImagePanel(BufferedImage img) {
        this.img = img;
    }

    public void drawImage(BufferedImage img) {
        this.img = img;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            int imageWidth = img.getWidth();
            int imageHeight = img.getHeight();
            int panelWidth = getWidth();
            int panelHeight = getHeight();
            
            if(imageWidth > panelWidth || imageHeight > panelHeight){
                int newWidth, newHeight;
                
                // rescale the height then change the width to pre
                if(imageWidth > imageHeight){
                    double widthScaleFactor = (double)panelWidth / (double)imageWidth;
                    newWidth = panelWidth;
                    newHeight = (int)(widthScaleFactor * imageHeight);
                }else{
                    double heightScaleFactor = (double)panelHeight / (double)imageHeight;
                    newHeight = panelHeight;
                    newWidth = (int)(heightScaleFactor * imageWidth);
                }
                
                if(newHeight > panelHeight || newWidth > panelWidth){
                    if(newHeight > panelHeight){
                        double heightScaleFactor = (double)panelHeight / (double)newHeight;
                        newHeight = panelHeight;
                        newWidth = (int)(heightScaleFactor * newWidth);
                    }
                    
                    if(newWidth > panelWidth){
                        double widthScaleFactor = (double)panelWidth / (double)newWidth;
                        newWidth = panelWidth;
                        newHeight = (int)(widthScaleFactor * imageHeight);
                    }
                }
                
                Image scaledImage = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                int x = (panelWidth - newWidth) / 2;
                int y = (panelHeight - newHeight) / 2;
                
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.drawImage(scaledImage, x, y, this);
                g2d.dispose();
            }else{
                int x = (getWidth() - img.getWidth()) / 2;
                int y = (getHeight() - img.getHeight()) / 2;
                
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.drawImage(img, x, y, this);
                g2d.dispose();
            }
        }
    }
}
