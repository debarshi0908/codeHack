
package edu.ua.tetris;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyController extends KeyAdapter{
    Tetris tetris;
   //By Default
    private int KEY_LEFT = KeyEvent.VK_LEFT;
    private int KEY_RIGHT = KeyEvent.VK_RIGHT;
    private int KEY_ROTATE = KeyEvent.VK_UP;
    private int KEY_DOWN = KeyEvent.VK_DOWN;
    
    public KeyController(Tetris t){
        super();
        tetris = t;
        
    }
    
    @Override
    public void keyReleased(KeyEvent event){
        int k = event.getKeyCode();
         if( k == KEY_DOWN){
             tetris.getCommand(Piece.MOVE_DOWN);
         }
        
    }
    
    @Override
    public void keyPressed (KeyEvent e){
       // System.out.println("Key pressed");
            int k = e.getKeyCode();
            

        //    char z = e.getKeyChar();

            if( k == KEY_LEFT){
                 tetris.getCommand(Piece.MOVE_LEFT);
            }else if(k == KEY_RIGHT){
                 tetris.getCommand(Piece.MOVE_RIGHT);
            }else if(k == KEY_ROTATE){
                tetris.getCommand(Piece.MOVE_ROTATE);
            }else if(k == KEY_DOWN){
                tetris.getCommand(Piece.MOVE_DOWN_SPEED);
            }
        
    }
        
    public void setKeyLeft(int k){
        KEY_LEFT = k;
        
    }
    
    public int getKeyLeft(){
        return KEY_LEFT;
    }
    
    public void setKeyRight(int k){
        KEY_RIGHT = k;
    }
    
    public int getKeyRight(){
        return KEY_RIGHT;
    }
    
    public void setKeyRotate(int k){
        KEY_ROTATE = k;
    } 
    
    public int getKeyRotate(){
        return KEY_ROTATE;
    }
    
    public void setKeyDown(int k){
        KEY_DOWN = k;
    }
    
    public int getKeyDown(){
        return KEY_DOWN;
    }
    
}
