/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minor1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author reham
 */
public class MapGenerator {
        public int[][] map;
    // declaring brick width and height
    public int bricksWidth;
    public int bricksHeight;
   
    //mapgenerator constructor
    public MapGenerator(int rows,int cols)
    {
        map=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                map[i][j]=1;
            }
        }
        bricksWidth=540/cols;
        bricksHeight=150/rows;
    }
    
    //draw the bricks
    public void draw(Graphics2D g)
    {
        for(int i=0;i<map.length;i++)
        {
            for(int j=0;j<map[0].length;j++)
            {
                if(map[i][j]>0)//if the brick value is 1(not broke)
                {
                    //painting the bricks
                   g.setColor(Color.red);
                   g.fillRect(j*bricksWidth+80,i*bricksHeight+50,bricksWidth,bricksHeight);
                   //painting the separation lines(black) in between the bricks using Basic stroke class
                   g.setStroke(new BasicStroke(3));
                   g.setColor(Color.black);
                   g.drawRect(j*bricksWidth+80,i*bricksHeight+50,bricksWidth,bricksHeight);
                }
            }
        }
    }
    //function for setting the values for bricks
    public void setBrickValue(int row,int col,int value)
    {
        map[row][col]=value;
    }
    
}
