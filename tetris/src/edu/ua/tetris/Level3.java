/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ua.tetris;

public class Level3 implements ILevel {

    @Override
    public int choosePiece() {
         int choice = 0;
         int rand = 1 + (int)(Math.random()* ((100-1)+1));
                        if(rand <= 18){
				choice = 1;						
			}
			if (rand > 18 && rand <= 36){
				choice = 2;
			}
			if (rand > 36 && rand <= 54){
				choice = 3;				
			}
			if (rand > 54 && rand <= 72){
				choice = 4;			
			}
			if (rand > 72 && rand <= 77){
				choice = 5;
			}
			if(rand > 77 && rand <= 82){
				choice = 6;				
			}
			if (rand > 82 && rand <= 100){
				choice = 7;
			}
                        return choice;
    }
    
}
