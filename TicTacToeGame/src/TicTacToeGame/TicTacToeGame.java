/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeGame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SystemBilgisayar
 */
public class TicTacToeGame extends javax.swing.JFrame {

    private String startGame = "X" ;
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public TicTacToeGame() {
        initComponents();
    }

    private void gameScore()
    {
        lbl_playerx.setText(String.valueOf(xCount));
        lbl_playero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void winningGame()
    {
        String b1 = btnTic1.getText();
        String b2 = btnTic2.getText();
        String b3 = btnTic3.getText();
        String b4 = btnTic4.getText();
        String b5 = btnTic5.getText();
        String b6 = btnTic6.getText();
        String b7 = btnTic7.getText();
        String b8 = btnTic8.getText();
        String b9 = btnTic9.getText();
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic1.setBackground(Color.ORANGE);
             btnTic2.setBackground(Color.ORANGE);
             btnTic3.setBackground(Color.ORANGE);
             xCount++;
             gameScore();
        }
        
         if (b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic4.setBackground(Color.CYAN);
             btnTic5.setBackground(Color.CYAN);
             btnTic6.setBackground(Color.CYAN);
             xCount++;
             gameScore();
        }
         
          if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic7.setBackground(Color.GREEN);
             btnTic8.setBackground(Color.GREEN);
             btnTic9.setBackground(Color.GREEN);
             xCount++;
             gameScore();
        }
          
          if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic1.setBackground(Color.blue);
             btnTic4.setBackground(Color.blue);
             btnTic7.setBackground(Color.blue);
             xCount++;
             gameScore();
        }
          
           if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic2.setBackground(Color.CYAN);
             btnTic5.setBackground(Color.CYAN);
             btnTic8.setBackground(Color.CYAN);
             xCount++;
             gameScore();
        }
           
            if (b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic3.setBackground(Color.red);
             btnTic6.setBackground(Color.red);
             btnTic9.setBackground(Color.red);
             xCount++;
             gameScore();
        }
            
             if (b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic1.setBackground(Color.ORANGE);
             btnTic5.setBackground(Color.ORANGE);
             btnTic9.setBackground(Color.ORANGE);
             xCount++;
             gameScore();
        }
             
              if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic3.setBackground(Color.magenta);
             btnTic5.setBackground(Color.magenta);
             btnTic7.setBackground(Color.magenta);
             xCount++;
             gameScore();
        }
          
          
          if (b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic7.setBackground(Color.PINK);
             btnTic8.setBackground(Color.PINK);
             btnTic9.setBackground(Color.PINK);
             oCount++;
             gameScore();
        }
          
           if (b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic4.setBackground(Color.RED);
             btnTic5.setBackground(Color.RED);
             btnTic6.setBackground(Color.RED);
             oCount++;
             gameScore();
        }
           
            if (b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic1.setBackground(Color.MAGENTA);
             btnTic2.setBackground(Color.MAGENTA);
             btnTic3.setBackground(Color.MAGENTA);
             oCount++;
             gameScore();
        }
            
             if (b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic2.setBackground(Color.cyan);
             btnTic5.setBackground(Color.cyan);
             btnTic8.setBackground(Color.cyan);
             oCount++;
             gameScore();
        }
            
             if (b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic1.setBackground(Color.MAGENTA);
             btnTic4.setBackground(Color.MAGENTA);
             btnTic7.setBackground(Color.MAGENTA);
             oCount++;
             gameScore();
        }
             
              if (b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic3.setBackground(Color.red);
             btnTic6.setBackground(Color.red);
             btnTic9.setBackground(Color.red);
             oCount++;
             gameScore();
        }
              
               if (b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic1.setBackground(Color.MAGENTA);
             btnTic5.setBackground(Color.MAGENTA);
             btnTic9.setBackground(Color.MAGENTA);
             oCount++;
             gameScore();
        }
               
               if (b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
             btnTic3.setBackground(Color.blue);
             btnTic5.setBackground(Color.blue);
             btnTic7.setBackground(Color.blue);
             oCount++;
             gameScore();
        }
          
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_exit = new javax.swing.JButton();
        btn_newGame = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_playerx = new javax.swing.JLabel();
        lbl_playero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTic1 = new javax.swing.JButton();
        btnTic3 = new javax.swing.JButton();
        btnTic4 = new javax.swing.JButton();
        btnTic5 = new javax.swing.JButton();
        btnTic2 = new javax.swing.JButton();
        btnTic7 = new javax.swing.JButton();
        btnTic8 = new javax.swing.JButton();
        btnTic9 = new javax.swing.JButton();
        btnTic6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));

        jPanel2.setBackground(new java.awt.Color(95, 158, 180));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(95, 158, 180));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_exit.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setMaximumSize(new java.awt.Dimension(200, 158));
        btn_exit.setMinimumSize(new java.awt.Dimension(200, 158));
        btn_exit.setPreferredSize(new java.awt.Dimension(200, 158));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_newGame.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn_newGame.setText("New Game");
        btn_newGame.setMaximumSize(new java.awt.Dimension(200, 158));
        btn_newGame.setMinimumSize(new java.awt.Dimension(200, 158));
        btn_newGame.setPreferredSize(new java.awt.Dimension(200, 158));
        btn_newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newGameActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setMaximumSize(new java.awt.Dimension(200, 158));
        btn_reset.setMinimumSize(new java.awt.Dimension(200, 158));
        btn_reset.setPreferredSize(new java.awt.Dimension(200, 158));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(95, 158, 180));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Player O :");

        lbl_playerx.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        lbl_playerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_playerx.setOpaque(true);
        lbl_playerx.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_playerxAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbl_playero.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        lbl_playero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_playero.setOpaque(true);
        lbl_playero.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbl_playeroAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setText("Player X :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_playero, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lbl_playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(lbl_playero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(95, 158, 180));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTic1.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic1ActionPerformed(evt);
            }
        });

        btnTic3.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic3ActionPerformed(evt);
            }
        });

        btnTic4.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic4ActionPerformed(evt);
            }
        });

        btnTic5.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic5ActionPerformed(evt);
            }
        });

        btnTic2.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic2ActionPerformed(evt);
            }
        });

        btnTic7.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic7ActionPerformed(evt);
            }
        });

        btnTic8.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic8ActionPerformed(evt);
            }
        });

        btnTic9.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic9ActionPerformed(evt);
            }
        });

        btnTic6.setFont(new java.awt.Font("Dialog", 1, 96)); // NOI18N
        btnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        btnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        btnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        btnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(btnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(95, 158, 180));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 66)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("TİC TAC TOE GAME");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1210, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private JFrame frame;
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true);
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.LIGHT_GRAY);
        btnTic2.setBackground(Color.LIGHT_GRAY);
        btnTic3.setBackground(Color.LIGHT_GRAY);
        btnTic4.setBackground(Color.LIGHT_GRAY);
        btnTic5.setBackground(Color.LIGHT_GRAY);
        btnTic6.setBackground(Color.LIGHT_GRAY);
        btnTic7.setBackground(Color.LIGHT_GRAY);
        btnTic8.setBackground(Color.LIGHT_GRAY);
        btnTic9.setBackground(Color.LIGHT_GRAY);
        
        
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newGameActionPerformed
      
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true);
        
        lbl_playerx.setText("0");
        lbl_playero.setText("0");
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.LIGHT_GRAY);
        btnTic2.setBackground(Color.LIGHT_GRAY);
        btnTic3.setBackground(Color.LIGHT_GRAY);
        btnTic4.setBackground(Color.LIGHT_GRAY);
        btnTic5.setBackground(Color.LIGHT_GRAY);
        btnTic6.setBackground(Color.LIGHT_GRAY);
        btnTic7.setBackground(Color.LIGHT_GRAY);
        btnTic8.setBackground(Color.LIGHT_GRAY);
        btnTic9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_btn_newGameActionPerformed

    private void btnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic1ActionPerformed
       btnTic1.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
    }//GEN-LAST:event_btnTic1ActionPerformed

    private void btnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic2ActionPerformed
        btnTic2.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic2ActionPerformed

    private void btnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic3ActionPerformed
        btnTic3.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic3ActionPerformed

    private void btnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic4ActionPerformed
         btnTic4.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic4ActionPerformed

    private void btnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic5ActionPerformed
         btnTic5.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic5ActionPerformed

    private void btnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic6ActionPerformed
        btnTic6.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic6ActionPerformed

    private void btnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic7ActionPerformed
        btnTic7.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic7ActionPerformed

    private void btnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic8ActionPerformed
         btnTic8.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic8ActionPerformed

    private void btnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic9ActionPerformed
         btnTic9.setText(startGame);
       
       if (startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       else
       {
           checker = true;
       }
       choose_a_player();
       winningGame();
                     
    }//GEN-LAST:event_btnTic9ActionPerformed

    private void lbl_playeroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_playeroAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_playeroAncestorAdded

    private void lbl_playerxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbl_playerxAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_playerxAncestorAdded

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
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTic1;
    private javax.swing.JButton btnTic2;
    private javax.swing.JButton btnTic3;
    private javax.swing.JButton btnTic4;
    private javax.swing.JButton btnTic5;
    private javax.swing.JButton btnTic6;
    private javax.swing.JButton btnTic7;
    private javax.swing.JButton btnTic8;
    private javax.swing.JButton btnTic9;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_newGame;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_playero;
    private javax.swing.JLabel lbl_playerx;
    // End of variables declaration//GEN-END:variables
}
