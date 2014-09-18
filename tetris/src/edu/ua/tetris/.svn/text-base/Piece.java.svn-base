
package edu.ua.tetris;

import java.awt.Color;
import java.awt.Graphics;

public class Piece implements IPiece{
    private int x[];
    private int y[];
    private Color color;
    private int figtype;
    
    public static final int MOVE_DOWN  = 40;
    public static final int MOVE_RIGHT = 39;
    public static final int MOVE_LEFT = 37;
    public static final int MOVE_ROTATE = 38;
    public static final int MOVE_PAUSE = 1000;
    public static final int MOVE_DOWN_SPEED = 50;
    
    int maxheight = 37; //orignal = 30
    int dec = 7; //original = 0
    
    private boolean speed = false;
    
    public Piece(int type){
        switch(type){
            case 1:
                x = new int[4];
                y = new int[4];
                x[0] = 7;
                y[0] = 29+dec;
                x[1] = 7;
                y[1] = 28+dec;
                x[2] = 8;
                y[2] = 28+dec;
                x[3] = 8;
                y[3] = 27+dec;
                color = Color.BLUE;
                figtype = 1;
                break;
            case 2:
                x = new int[4];
                y = new int[4];
                x[0] = 7;
                y[0] = 29+dec;
                x[1] = 8;
                y[1] = 29+dec;
                x[2] = 8;
                y[2] = 28+dec;
                x[3] = 9;
                y[3] = 28+dec;
                figtype = 2;
                color = Color.GREEN;
                break;
            
            case 3:
                x = new int[4];
                y = new int[4];
                x[0] = 7;
                y[0] = 29+dec;
                x[1] = 7;
                y[1] = 28+dec;
                x[2] = 8;
                y[2] = 28+dec;
                x[3] = 9;
                y[3] = 28+dec;
                figtype = 3;
                color = Color.red;
                break;
            
            case 4:
                x = new int[4];
                y = new int[4];
                x[0] = 7;
                y[0] = 28+dec;
                x[1] = 8;
                y[1] = 28+dec;
                
                x[2] = 9;
                y[2] = 28+dec;
                x[3] = 9;
                y[3] = 29+dec;
                figtype = 4;
                color = Color.orange;
                break;
             
            case 5:
                x = new int[4];
                y = new int[4];
                x[0] = 7;
                y[0] = 29+dec;
                x[1] = 8;
                y[1] = 29+dec;
                x[2] = 7;
                y[2] = 28+dec;
                x[3] = 8;
                y[3] = 28+dec;
                figtype = 5;
                color = Color.PINK;
                break;
             
            case 6: 
                x = new int[4];
                y = new int[4];
                x[0] = 6;
                y[0] = 29+dec;
                x[1] = 7;
                y[1] = 29+dec;
                x[2] = 8;
                y[2] = 29+dec;
                x[3] = 9;
                y[3] = 29+dec;
                figtype = 6;
                color = Color.CYAN;
                break;
                
            case 7:
                x = new int[4];
                y = new int[4];
                x[0] = 7;
                y[0] = 28+dec;
                x[1] = 8;
                y[1] = 28+dec;
                x[2] = 9;
                y[2] = 28+dec;
                x[3] = 8;
                y[3] = 29+dec;
                figtype = 7;
                color = Color.DARK_GRAY;
                break;               
        }
    }
    
    
    
    public int getFigureType(){
        return figtype;
    }
    
    public Graphics getGraphic(Graphics g){
        
        switch(figtype){
            case 6 :
              //cyan
               g.setColor(Color.cyan);
               g.fillRect(20, 20, 10,10);
               g.fillRect(30, 20, 10,10);
               g.fillRect(40, 20, 10,10);
               g.fillRect(50, 20, 10,10);
               break;
           
            case 5 : 
               //pink
               g.setColor(Color.pink);
               g.fillRect(20, 20, 10, 10);
               g.fillRect(30, 20, 10, 10);
               g.fillRect(20, 30, 10,10);
               g.fillRect(30, 30, 10, 10);
               break;
       
            case 3 :
               //Red
               g.setColor(Color.red);
                g.fillRect(20, 30, 10, 10);
               g.fillRect(20, 20, 10, 10);
               g.fillRect(30, 20, 10, 10);
               g.fillRect(40, 20, 10, 10);
               break;
               
            case 7 :
       
               //Gray
               g.setColor(Color.darkGray);
               g.fillRect(20, 20, 10, 10);
               g.fillRect(30, 20, 10, 10);
               g.fillRect(30, 10, 10, 10);
               g.fillRect(40, 20,10,10);
               break;
       
            case 1:
                
               //blue
               g.setColor(Color.blue);
               g.fillRect(20, 20, 10, 10);
               g.fillRect(20, 30, 10, 10);
               g.fillRect(30, 30, 10, 10);
               g.fillRect(30, 40, 10, 10);
               break;
            
            case 2:
               //Green
               g.setColor(Color.green);
               g.fillRect(20, 20, 10, 10);
               g.fillRect(30, 30, 10, 10);
               g.fillRect(30, 20, 10,10);
               g.fillRect(40, 30, 10,10);
               break;
       
            case 4:
               //orange
               g.setColor(Color.orange);
               g.fillRect(20, 30, 10, 10);
               g.fillRect(30, 30, 10, 10);
               g.fillRect(40, 30, 10, 10);
               g.fillRect(40, 20, 10, 10);
               break;
        }
       return g;
    }
    
    
    
    //erase
    private void clear(Color[][] board){
        for (int i=0; i < x.length; i++){
            board[x[i]][y[i]] = Color.white;
        }
    }
    
    private void draw(Color[][] board){
        for (int i=0; i < x.length; i++){
         
            board[x[i]][y[i]] = color;
        }
    }
    
    //testPosition
    private boolean isInside(int x,int y, Color[][] board){
        if((x < 0) || (x > 14))
            return false;
        if((y < 0) || (y > maxheight-1))
            return false;
        
        if(board[x][y] != Color.white)
            return false;
        return true;
            
    }
    
    private boolean isDown(Color[][] board){
        for(int i=0; i < x.length;i++)
            if(!isInside(x[i], y[i]-1,board))
                return false;
        return true;
        
    }
    
    private boolean isAbleToRight(Color[][] board){
        for(int i=0; i < x.length;i++){
            if(!isInside(x[i]+1,y[i],board))
                return false;
        }
        return true;
    }
    
    private boolean isAbleToLeft(Color[][] board){
        for(int i=0; i < x.length; i++){
            if(!isInside(x[i]-1, y[i], board))
                return false;
        }
        return true;
    }
    
    private boolean isAbleToRotate(Color[][] board){
        for(int i=0;i < x.length; i++){
            int dx = x[i] - x[1];
            int dy = y[i] - y[1];
            int newx = x[1] + dy;
            int newy = y[1] - dx;
            if(!isInside(newx,newy,board)){
                return false;
            }
        }
        return true;
    }
    private void moveDown(){
        for(int i = 0; i < x.length;i++){
            y[i] = y[i] - 1;
            
        }
        
    }
    
    private void moveDownSpeed(){
             for(int i=0; i < x.length;i++){
                y[i] = y[i] - 1;
             }     
    }
    
    private void moveRight(){
        for(int i=0; i < x.length; i++){
            x[i] = x[i] + 1;
        }
    }
    
    private void moveLeft(){
        for(int i=0;i<x.length;i++){
            x[i] = x[i] - 1;
        }
    }
    
    private void moveRotate(){
        for(int i=0; i < x.length; i++){
            int dx = x[i] - x[1];
            int dy = y[i] - y[1];
            x[i] = x[1] + dy;
            y[i] = y[1] - dx;
        }
    }
    
    public boolean move(int command, Color[][] board){
        clear(board);
        
        boolean isEnable = true;
        
       
        if(isEnable)
            switch(command){
                case Piece.MOVE_DOWN: isEnable = isDown(board); break;
                case Piece.MOVE_RIGHT: isEnable = isAbleToRight(board); break;
                case Piece.MOVE_LEFT: isEnable = isAbleToLeft(board); break;
                case Piece.MOVE_ROTATE: isEnable = isAbleToRotate(board); break;  
                case Piece.MOVE_PAUSE: isEnable = false; break;
                case Piece.MOVE_DOWN_SPEED: isEnable = isDown(board);break;
            }
        if(isEnable)
            switch(command){
                case Piece.MOVE_DOWN : moveDown(); break;
                case Piece.MOVE_RIGHT : moveRight(); break;
                case Piece.MOVE_LEFT : moveLeft(); break;
                case Piece.MOVE_ROTATE: moveRotate(); break;
                case Piece.MOVE_DOWN_SPEED : moveDownSpeed(); break;
            }
        //if(command != Piece.MOVE_PAUSE)
            draw(board);
        
        if(command == Piece.MOVE_DOWN)
            return isEnable;
       
        return true;
    }
    
    
}
