/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author kisha
 */
public class App extends javax.swing.JFrame {
int turn =2;
int buttonUsed[]={0,0,0,0,0,0,0,0,0};
int pxwon[]={0,0,0,0,0,0,0,0,0};
int powon[]={0,0,0,0,0,0,0,0,0};

int pxwon()
{
    if(pxwon[0]==1 && pxwon[1]==1 && pxwon[2]==1)
    {
        return 1;
    }
      if(pxwon[0]==1 && pxwon[4]==1 && pxwon[8]==1)
    {
        return 1;
    }
      if(pxwon[3]==1 && pxwon[4]==1 && pxwon[5]==1)
    {
        return 1;
    }
      if(pxwon[6]==1 && pxwon[7]==1 && pxwon[8]==1)
    {
        return 1;
    }
      
       if(pxwon[0]==1 && pxwon[3]==1 && pxwon[6]==1)
    {
        return 1;
    }
      if(pxwon[1]==1 && pxwon[4]==1 && pxwon[7]==1)
    {
        return 1;
    }
      if(pxwon[2]==1 && pxwon[5]==1 && pxwon[8]==1)
    {
        return 1;
    }
          if(pxwon[2]==1 && pxwon[4]==1 && pxwon[6]==1)
    {
        return 1;
    }
     return 0;
}
    int powon()
{
    if(powon[0]==1 && powon[1]==1 && powon[2]==1)
    {
        return 1;
    }
      if(powon[0]==1 && powon[4]==1 && powon[8]==1)
    {
        return 1;
    }
      if(powon[3]==1 && powon[4]==1 && powon[5]==1)
    {
        return 1;
    }
      
       if(powon[6]==1 && powon[7]==1 && powon[8]==1)
    {
        return 1;
    }
      if(powon[0]==1 &&powon[3]==1 && powon[6]==1)
    {
        return 1;
    }
      if(powon[1]==1 && powon[4]==1 && powon[7]==1)
    {
        return 1;
    }
          if(powon[2]==1 && powon[5]==1 && powon[8]==1)
    {
        return 1;
    }
                 if(powon[2]==1 && powon[4]==1 && powon[6]==1)
    {
        return 1;
    }
     return 0;
}
  

    /**
     * Creates new form Tic
     */
    public App() {
        initComponents();
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
        matteBorder1 = new javax.swing.border.MatteBorder(null);
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        b4.setBackground(new java.awt.Color(0, 153, 153));
        b4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 153, 153));
        b7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 153, 153));
        b3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(0, 153, 153));
        b0.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(0, 153, 153));
        b5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 153, 153));
        b2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 153, 153));
        b8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 153, 153));
        b6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(0, 153, 153));
        b1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jButton1.setText("Play Again");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField2.setText("            Tic-Tac-Toe");
        jTextField2.setAutoscrolls(false);
        jTextField2.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed

 if(buttonUsed[0]==0)
        {
  if(turn%2==0)
{
    turn++;
    b0.setText("X");
    buttonUsed[0]=1;
    pxwon[0]=1;
    int result1=pxwon();
     int result2=powon();
    
 if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    turn++;
      b0.setText("O");
     buttonUsed[0]=1;
    powon[0]=1;
     int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
    
    
}
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane,"This is used");
        
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     if(buttonUsed[1]==0)
        {
  if(turn%2==0)
{
    turn++;
    b1.setText("X");
    buttonUsed[1]=1;
    pxwon[1]=1;
    int result1=pxwon();
   int result2=powon();
    
    if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
      powon[1]=1;
      b1.setText("O");
     buttonUsed[1]=1;
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
     if(buttonUsed[2]==0)
        {
  if(turn%2==0)
{
    turn++;
    b2.setText("X");
    buttonUsed[2]=1;
    pxwon[2]=1;
    int result1=pxwon();
     int result2=powon();
    
   if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
      powon[2]=1;
      b2.setText("O");
     buttonUsed[2]=1;
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed



     if(buttonUsed[3]==0)
        {
  if(turn%2==0)
{
    turn++;
    b3.setText("X");
    buttonUsed[3]=1;
    pxwon[3]=1;
    int result1=pxwon();
     int result2=powon();
    
   if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
        powon[3]=1;
      b3.setText("O");
     buttonUsed[3]=1;
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }











        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
     if(buttonUsed[4]==0)
        {
  if(turn%2==0)
{
    turn++;
    b4.setText("X");
    buttonUsed[4]=1;
    pxwon[4]=1;
    int result1=pxwon();
     int result2=powon();
    
 if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
    powon[4]=1;
      b4.setText("O");
     buttonUsed[4]=1;
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
     if(buttonUsed[5]==0)
        {
  if(turn%2==0)
{
    turn++;
    b5.setText("X");
    buttonUsed[5]=1;
    pxwon[5]=1;
    int result1=pxwon();
     int result2=powon();
    
    if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
        powon[5]=1;
      b5.setText("O");
     buttonUsed[5]=1;
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
     if(buttonUsed[6]==0)
        {
  if(turn%2==0)
{
    turn++;
    b6.setText("X");
    buttonUsed[6]=1;
    pxwon[6]=1;
    int result1=pxwon();
     int result2=powon();
    
  if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
        powon[6]=1;
      b6.setText("O");
     buttonUsed[6]=1;
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     if(buttonUsed[7]==0)
        {
  if(turn%2==0)
{
    turn++;
    b7.setText("X");
    buttonUsed[7]=1;
    pxwon[7]=1;
    int result1=pxwon();
     int result2=powon();
    
   if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
        powon[7]=1;
      b7.setText("O");
     buttonUsed[7]=1;
     
     
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
     
     
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
     if(buttonUsed[8]==0)
        {
  if(turn%2==0)
{
    turn++;
    b8.setText("X");
    buttonUsed[8]=1;
    pxwon[8]=1;
    int result1=pxwon();
     int result2=powon();
    
    if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
    
}
 else
{// TODO add your handling code here:
    
    turn++;
        powon[8]=1;
      b8.setText("O");
     buttonUsed[8]=1;
     
     
     
     
      int result1=pxwon();
     int result2=powon();
    
     if(result1==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player X won");
    }
       else if(result2==1)
    {
        JOptionPane.showMessageDialog(rootPane,"Player O won");
    }
    
     
     
     
     
    
}
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane,"tihs is used");   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
b0.setText("");
b1.setText("");// TODO add your handling code here:
b2.setText("");
b3.setText("");
b4.setText("");
b5.setText("");
b6.setText("");
b7.setText("");
b8.setText("");
turn =2;
for(int i=0;i<9;i++)
{
    buttonUsed[i]=0;
}

for(int i=0;i<9;i++)
{
   pxwon[i]=0;
}
for(int i=0;i<9;i++)
{
    powon[i]=0;
}


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.border.MatteBorder matteBorder1;
    // End of variables declaration//GEN-END:variables
}
