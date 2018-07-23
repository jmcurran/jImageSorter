/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimagesorter;

import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author jcur002
 */
public class SetSourceDirectoryDlg extends javax.swing.JDialog {

    String strImageSourceDirectory;
    String strFiledImageDirectory;
    boolean bFileImages;

    public enum DialogResult {
        OK_OPTION,
        CANCEL_OPTION
    }

    DialogResult result;

    /**
     * Creates new form SetSourceDirectoryDlg
     */
    public SetSourceDirectoryDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public SetSourceDirectoryDlg(String strImageSourceDirectory, String strFiledImageDirectory, boolean bFileImages, Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.strImageSourceDirectory = strImageSourceDirectory;
        this.strFiledImageDirectory = strFiledImageDirectory;
        this.bFileImages = bFileImages;
        
        this.setTitle("Set the directories...");

        jLabelImageSourceDir.setText(this.strImageSourceDirectory);
        jLabelFiledImageDir.setText(this.strFiledImageDirectory);
        jCheckBoxFileImages.setSelected(this.bFileImages);

        if (!bFileImages) {
            jLabelFiledImageDir.setEnabled(false);
            jButtonSetFiledImageDirectory.setEnabled(false);
        }else{
            jLabelFiledImageDir.setEnabled(true);
            jButtonSetFiledImageDirectory.setEnabled(true);
        }

        result = DialogResult.CANCEL_OPTION;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImageSourceDir = new javax.swing.JLabel();
        jButtonSetImageSourceDirectory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxFileImages = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabelFiledImageDir = new javax.swing.JLabel();
        jButtonSetFiledImageDirectory = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSetImageSourceDirectory.setText("Set...");
        jButtonSetImageSourceDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetImageSourceDirectoryActionPerformed(evt);
            }
        });

        jLabel2.setText("Image Source Directory:");

        jCheckBoxFileImages.setText("File images after categorization?");
        jCheckBoxFileImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFileImagesActionPerformed(evt);
            }
        });

        jLabel3.setText("Filed Image Directory:");

        jButtonSetFiledImageDirectory.setText("Set...");
        jButtonSetFiledImageDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetFiledImageDirectoryActionPerformed(evt);
            }
        });

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxFileImages)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelImageSourceDir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonSetImageSourceDirectory))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelFiledImageDir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonSetFiledImageDirectory))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImageSourceDir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetImageSourceDirectory))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxFileImages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFiledImageDir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetFiledImageDirectory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.setVisible(false);
        result = DialogResult.CANCEL_OPTION;
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        this.setVisible(false);
        result = DialogResult.OK_OPTION;
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonSetFiledImageDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetFiledImageDirectoryActionPerformed
        JFileChooser fc;

        fc = new JFileChooser();
        fc.setCurrentDirectory(new File(strFiledImageDirectory));
        fc.setDialogTitle("Select the directory for filed images");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Any folder";
            }

        });

        fc.setDialogType(JFileChooser.SAVE_DIALOG);
        fc.setApproveButtonText("Select");
        //    
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String theDir = fc.getSelectedFile().getAbsolutePath();
            strFiledImageDirectory = theDir;
            jLabelFiledImageDir.setText(strFiledImageDirectory);
        }
    }//GEN-LAST:event_jButtonSetFiledImageDirectoryActionPerformed

    private void jButtonSetImageSourceDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetImageSourceDirectoryActionPerformed
        JFileChooser fc;

        fc = new JFileChooser();
        fc.setCurrentDirectory(new File(strImageSourceDirectory));
        fc.setDialogTitle("Select the directory for unclassified images");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Any folder";
            }

        });

        fc.setDialogType(JFileChooser.SAVE_DIALOG);
        fc.setApproveButtonText("Select");
        //    
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String theDir = fc.getSelectedFile().getAbsolutePath();
            this.strImageSourceDirectory = theDir;
            jLabelImageSourceDir.setText(strImageSourceDirectory);
        }
    }//GEN-LAST:event_jButtonSetImageSourceDirectoryActionPerformed

    private void jCheckBoxFileImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFileImagesActionPerformed
        bFileImages = !bFileImages;
        
        if (!bFileImages) {
            jLabelFiledImageDir.setEnabled(false);
            jButtonSetFiledImageDirectory.setEnabled(false);
        }else{
            jLabelFiledImageDir.setEnabled(true);
            jButtonSetFiledImageDirectory.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxFileImagesActionPerformed

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
            java.util.logging.Logger.getLogger(SetSourceDirectoryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetSourceDirectoryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetSourceDirectoryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetSourceDirectoryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SetSourceDirectoryDlg dialog = new SetSourceDirectoryDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonSetFiledImageDirectory;
    private javax.swing.JButton jButtonSetImageSourceDirectory;
    private javax.swing.JCheckBox jCheckBoxFileImages;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFiledImageDir;
    private javax.swing.JLabel jLabelImageSourceDir;
    // End of variables declaration//GEN-END:variables
}
