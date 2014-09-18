/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ua.tetris;

/**
 *
 * @author ananthaamornphong
 */
public class PieceFactory {
    private IPiece[] pieces;
   
    
    public PieceFactory(){
        pieces = new IPiece[7];
    }
    
    
    public IPiece getPiece(int type){
        int pieceno = type - 1;
        if(pieces[pieceno] == null)
            pieces[pieceno] = new Piece(type);
        return pieces[pieceno];
    }
}
