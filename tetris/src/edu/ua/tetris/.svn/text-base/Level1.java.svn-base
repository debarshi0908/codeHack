/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ua.tetris;

public class Level1 implements ILevel{

    @Override
    public int choosePiece() {
                int choice = 0;
                int rand = 1 + (int)(Math.random()* ((100-1)+1));
		
			if(rand <= 12){
				choice = 1;				
			}
			if (rand > 12 && rand <= 24){
				choice = 2;
			}
			if (rand > 24 && rand <= 36){
				choice = 3;				
			}
			if (rand > 36 && rand <= 48){
				choice = 4;			
			}
			if (rand > 48 && rand <= 68){
				choice = 5;
			}
			if(rand > 68 && rand <= 88){
				choice = 6;				
			}
			if (rand > 88 && rand <= 100){
				choice = 7;
			}
		
                return choice;
        }
    
}
