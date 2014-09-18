/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ua.tetris;


public class Level2 implements ILevel {

    @Override
    public int choosePiece() {
                int choice = 0;
                int rand = 1 + (int)(Math.random()* ((100-1)+1));
                        if(rand <= 16){
				choice = 1;						
			}
			if (rand > 16 && rand <= 32){
				choice = 2;
			}
			if (rand > 32 && rand <= 48){
				choice = 3;				
			}
			if (rand > 48 && rand <= 64){
				choice = 4;			
			}
			if (rand > 64 && rand <= 74){
				choice = 5;
			}
			if(rand > 74 && rand <= 84){
				choice = 6;				
			}
			if (rand > 84 && rand <= 100){
				choice = 7;
			}
                        return choice;
    }
                   
		
}
