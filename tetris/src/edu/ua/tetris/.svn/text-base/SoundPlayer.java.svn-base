/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ua.tetris;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public class SoundPlayer {
    private Clip clip,clipScore;
    
    
    private AudioInputStream audioInputStream, audioInputStream2;
    URL url,urlScore;
    
    String soundName = "sound-1.wav";
    
    String soundScore = "score.wav";
    
    public SoundPlayer(){
       init();
       load();
    }
   
    private void load(){
       try{
        if(clip != null && clip.isRunning())
            clip.stop();
        url = this.getClass().getClassLoader().getResource("sounds/"+soundName);
        audioInputStream = AudioSystem.getAudioInputStream(url);
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
       
       }catch(Exception ex){ex.printStackTrace();}
      
    }
    
    private void init(){
       try{
            urlScore = this.getClass().getClassLoader().getResource("sounds/"+soundScore);
            audioInputStream2 = AudioSystem.getAudioInputStream(urlScore);
            clipScore = AudioSystem.getClip();
            clipScore.open(audioInputStream2);
       
       }catch(Exception ex){ex.printStackTrace();}
    }
    
    public void updateSound(String name){
        //if(clip.isRunning())
        //    clip.stop();
        soundName = name;
        load();
    }
    
   
    public void playScore(){
         
          try{
            urlScore = this.getClass().getClassLoader().getResource("sounds/"+soundScore);
            audioInputStream2 = AudioSystem.getAudioInputStream(urlScore);
            clipScore = AudioSystem.getClip();
            clipScore.open(audioInputStream2);
            clipScore.start();
       }catch(Exception ex){ex.printStackTrace();}
        
         
    }
    
    public void play(){
        //if(!clip.isRunning())
        load(); 
        clip.start();
   
    }
    
    public void playLoop(){
        load();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop(){
        if(clip.isRunning())
            clip.stop();
    }
}
