

/*
 * Tetris.java
 *
 * Created on Sep 20, 2011, 8:50:38 PM
 */
package edu.ua.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class Tetris extends javax.swing.JFrame {

    private PieceMover mover;
    private KeyController keycontrol;
    OptionFrame f;
    SoundPlayer sound;
    int currentScore = 0;
   
    
    private boolean pause = false;
    private boolean activateSound = false;
    
    private int currentCommand = Piece.MOVE_DOWN;
    
    /** Creates new form Tetris */
    public Tetris() {
        initComponents();
        
        boardPanel.setFocusable(true);
        keycontrol = new KeyController(this);
        boardPanel.addKeyListener(keycontrol);
        boardPanel.setBackground(Color.white);
        
        sound = new SoundPlayer();
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nextPiecePanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        scorelbl = new javax.swing.JLabel();
        boardPanel = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        levellbl = new javax.swing.JLabel();
        optionButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        soundControlButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Score:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 139, -1, -1));

        nextPiecePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout nextPiecePanelLayout = new javax.swing.GroupLayout(nextPiecePanel);
        nextPiecePanel.setLayout(nextPiecePanelLayout);
        nextPiecePanelLayout.setHorizontalGroup(
            nextPiecePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        nextPiecePanelLayout.setVerticalGroup(
            nextPiecePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        getContentPane().add(nextPiecePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 20, -1, -1));

        startButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 217, 90, -1));

        pauseButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pauseButton.setLabel("Pause");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, -1));

        scorelbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        scorelbl.setForeground(new java.awt.Color(255, 51, 51));
        scorelbl.setText("0");
        getContentPane().add(scorelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 139, 30, -1));

        boardPanel.setBackground(new java.awt.Color(204, 255, 204));
        boardPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(boardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 360));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Level:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 164, -1, -1));

        levellbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        levellbl.setForeground(new java.awt.Color(255, 51, 51));
        levellbl.setText("1");
        getContentPane().add(levellbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 164, -1, -1));

        optionButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        optionButton.setText("Options");
        optionButton.setActionCommand("Options");
        optionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(optionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, -1));

        soundControlButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soundControlButton.setText("Sound Off");
        soundControlButton.setEnabled(false);
        soundControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundControlButtonActionPerformed(evt);
            }
        });
        getContentPane().add(soundControlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 90, -1));

        pack();
    }// </editor-fold>

private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
 // TODO add your handling code here:
    //System.out.println("Start the game");
    currentScore = 0;
    mover = new PieceMover(this);
    updateScore(0,1);
    pause = false;
    this.pauseButton.setText("Pause");
    this.jLabel2.setText("Click the mouse on the white zone");
    
    //Start sound

    sound.playLoop();
    this.soundControlButton.setText("Sound Off");
    this.soundControlButton.setEnabled(true);
    this.activateSound = true;
    //End of sound part
    mover.start();
    
}                                           

private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
            
              if(pause == true){
                   getCommand(Piece.MOVE_DOWN);
                   pause = false;
                   this.pauseButton.setText("Pause");
              }else{
                   getCommand(Piece.MOVE_PAUSE);
                   pause = true;
                   this.pauseButton.setText("Resume");
              }
       
}                                           

    private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
        sound.stop();
        this.activateSound = false;
        if(this.soundControlButton.isEnabled())
         this.soundControlButton.setText("Sound On");
        
        
        if(f == null)
            f = new OptionFrame();
        
        f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        f.setKeyController(keycontrol);
        f.setVisible(true);
        f.setSoundPlayer(sound);
        
        
            
    }                                            

private void soundControlButtonActionPerformed(java.awt.event.ActionEvent evt) {
 // TODO add your handling code here:
    if(sound != null){
        
        if(activateSound == false){
            sound.playLoop();
            this.soundControlButton.setText("Sound Off");
            activateSound = true;
        }else{
            sound.stop();
            this.soundControlButton.setText("Sound On");
            activateSound = false;
        }
    }
    
    
    
    
}

public boolean isPaused(){
   return pause;
}

public synchronized int getCommand(int command){
    
    int oldCommand = currentCommand;
    currentCommand = command;
    return oldCommand;
}

public void over(){
    sound.stop();
}

public void updateScore(int score,int level){
   
    this.scorelbl.setText(""+score);
    this.levellbl.setText(""+level);
    if(currentScore != score){
        System.out.println("call sound");
        sound.playScore();
    }
        
    this.currentScore = score;
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tetris().setVisible(true);
            }
        });
    }
    @Override
    public void repaint(){
        mover.changeBackground(this.boardPanel.getGraphics());
        
       
        mover.changeShowNextPiece(this.nextPiecePanel.getGraphics());
    }
    
    @Override
    public void update(Graphics g){
       
        mover.changeBackground(this.boardPanel.getGraphics());
    }
 
    // Variables declaration - do not modify
    private java.awt.Panel boardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel levellbl;
    private javax.swing.JPanel nextPiecePanel;
    private javax.swing.JButton optionButton;
    private javax.swing.JButton pauseButton;
    private javax.swing.JLabel scorelbl;
    private javax.swing.JButton soundControlButton;
    private javax.swing.JButton startButton;
    // End of variables declaration
}
