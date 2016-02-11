/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligo;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Kyle
 */
public class Panel3 extends javax.swing.JFrame {

    /**
     * Creates new form Panel3
     */
    public Panel3() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setBackground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setText("Back");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/danny/LIGOInterface/LIGO/images/LISA-waves.0.jpg")); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("A black hole is a place in space where gravity pulls so much that\n even light can not get out. The gravity is so strong because matter\n has been squeezed into a tiny space. This can happen when a star is\n dying. Because no light can get out, people can't see black holes. They\n are invisible. Space telescopes with special tools can help find black\n holes. The special tools can see how stars that are very close to black\n holes act differently than other stars.\n\nHow Big Are Black Holes?\nBlack holes can be big or small. Scientists think the smallest black\n holes are as small as just one atom. These black holes are very tiny\n but have the mass of a large mountain. Mass is the amount of matter,\n or \"stuff,\" in an object. Another kind of black hole is called \"stellar.\"\n Its mass can be up to 20 times more than the mass of the sun. There\n may be many, many stellar mass black holes in Earth's galaxy. Earth's\n galaxy is called the Milky Way.\n\nThe largest black holes are called \"supermassive.\" These black holes\n have masses that are more than 1 million suns together. Scientists\n have found proof that every large galaxy contains a supermassive\n black hole at its center. The supermassive black hole at the center\n of the Milky Way galaxy is called Sagittarius A. It has a mass equal\n to about 4 million suns and would fit inside a very large ball that\n could hold a few million Earths.\n\nHow Do Black Holes Form?\nScientists think the smallest black holes formed when the universe\n began. Stellar black holes are made when the center of a very big\n star falls in upon itself, or collapses. When this happens, it causes\n a supernova. A supernova is an exploding star that blasts part of the\n star into space. Scientists think supermassive black holes were made\n at the same time as the galaxy they are in.\n\nIf Black Holes Are \"Black,\" How Do Scientists Know They Are There?\nA black hole can not be seen because strong gravity pulls all of the\n light into the middle of the black hole. But scientists can see how\n the strong gravity affects the stars and gas around the black hole.\n Scientists can study stars to find out if they are flying around, or\n orbiting, a black hole. When a black hole and a star are close together,\n high-energy light is made. This kind of light can not be seen with\n human eyes. Scientists use satellites and telescopes in space to see\n the high-energy light.\n\n\nHow Is NASA Studying Black Holes?\nNASA is using satellites and telescopes that are traveling in space to\n learn more about black holes. These spacecraft help scientists answer\n questions about the universe.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 242, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Panel3().dispose();
        new Main_Menu().setVisible(true);
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
            java.util.logging.Logger.getLogger(Panel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
