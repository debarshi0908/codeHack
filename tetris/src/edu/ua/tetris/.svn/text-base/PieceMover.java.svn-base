package edu.ua.tetris;

import java.awt.Color;
import java.awt.Graphics;

class PieceMover extends Thread{
    private Tetris tetris;
    private Color board[][];
    private IPiece piece;
    private IPiece showPiece;
    private ILevel iLevel;
    private int score = 0;
    private int level = 1;
    
    private PieceFactory factory;
    
    private int maxheight = 37; // original  = 30
    
    //private int currentpos = 0;
    
    public PieceMover(Tetris t){
        tetris = t;
        board = new Color[15][maxheight];
        iLevel = new Level1();
        if(factory == null)
            factory = new PieceFactory();
        newGame();
    }
    
    @Override
    public void run(){
        
        while(dropPiece()){
           
         
            
        }
        tetris.over();
    }
    
    public IPiece showNextPiece(){
        return showPiece;
    }
    
    public void newGame(){
        for(int i=0;i < maxheight;i++){
            for(int j=0;j < 15; j++){
                board[j][i] = Color.white;
            }
        }
    }
    
    //paint
    public void changeBackground(Graphics g){
       
        for(int i=0; i < maxheight; i++){
       
            for(int j=0; j < 15; j++){
                g.setColor(board[j][i]);
                g.fillRect(20+10*j, 350-10*i, 10, 10);
            }
        }
        //currentpos = 0;
        
    }
    
    public void changeShowNextPiece(Graphics g){
       
       if(showPiece == null)
           showPiece = piece;
       
        g.setColor(Color.white);
        g.fillRect(0,0,75,50);
        showPiece.getGraphic(g);
       
    }
    
    private boolean dropPiece(){
        int speed = 300;
        if(level == 1){
            speed = 290;
        }else if(level == 2){
            speed = 260;
        }else if(level == 3){
            speed = 240;
        }
        
        if(showPiece != null)
            piece = showPiece;
        else
            piece = getNextPiece();
        
        showPiece = getNextPiece();
       
        if(!piece.move(Piece.MOVE_DOWN, board))
            return false;
        
        int command = tetris.getCommand(Piece.MOVE_DOWN);
        
       
        while(piece.move(command, board)){
                int fastspeed = 0;
                if(command == Piece.MOVE_DOWN_SPEED)
                    fastspeed = 60;
                else
                    fastspeed = speed;
           
                
                tetris.repaint();
                yield();
                try{
                    //sleep(300);
                    sleep(fastspeed);
                }catch(InterruptedException e){e.printStackTrace();}
                
                
                if(tetris.isPaused()){
       
                    command = tetris.getCommand(Piece.MOVE_PAUSE);
                }else{
                    command = tetris.getCommand(Piece.MOVE_DOWN);
                }
            
            
        }
        
        keepScore();
        return true;
        
    }
    
    private void keepScore(){
        for(int i=0; i < maxheight;i++){
            boolean isScore = true;
            for(int j=0;j < 15;j++)
                if(board[j][i] == Color.WHITE)
                    isScore = false;
            if(isScore){
                //Add sound method here (when the line is filled
                
                //End of sound method
                score += 10;
                moveDown(i);
                i = i - 1;
            }
           
        }
        
        if(score > 200 && score < 300){
            level = 2;
        }else if(score > 300){
            level = 3;
        }
        
        tetris.updateScore(score, level);
    }
    
    private void moveDown(int start){
        for(int i=start; i < maxheight; i++)
            for(int j=0;j<15;j++)
                if(i < maxheight-1)
                    board[j][i] = board[j][i+1];
                else
                    board[j][i] = Color.white;
    }
    
    private IPiece getNextPiece(){
        
       // PieceChooser c = new PieceChooser();
        //int piecetype = c.choosePiece(level);
        
        
        if(level == 1){
            iLevel = new Level1();
            //Background sound
        }else if(level == 2){
            iLevel = new Level2();
            //Background sound
        }else if(level == 3){
            iLevel = new Level3();
            //Background sound
            
        }
        
        int piecetype = iLevel.choosePiece(); 
        
       // Piece p = new Piece(piecetype);
        
        factory = new PieceFactory();
        IPiece p = factory.getPiece(piecetype);
        return p;
    }
}