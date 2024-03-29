import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Aes_Demo extends javax.swing.JFrame {

   /**
    * Creates new form GUI
    */
   public Aes_Demo() {
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form
    */

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

       jFileChooser1 = new javax.swing.JFileChooser();
       jFileChooser2 = new javax.swing.JFileChooser();
       jPanel1 = new javax.swing.JPanel();
       jTextField1 = new javax.swing.JTextField();
       jButton1 = new javax.swing.JButton();
       jPanel2 = new javax.swing.JPanel();
       jTextField2 = new javax.swing.JTextField();
       jLabel1 = new javax.swing.JLabel();
       jTextField3 = new javax.swing.JTextField();
       jLabel2 = new javax.swing.JLabel();
       jLabel3 = new javax.swing.JLabel();
       jButton2 = new javax.swing.JButton();
       jTextField4 = new javax.swing.JTextField();
       jButton3 = new javax.swing.JButton();
       jRadioButton1 = new javax.swing.JRadioButton();
       jRadioButton2 = new javax.swing.JRadioButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       setTitle("AES");

       jButton1.setText("Browse Files");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

       jLabel1.setText("Decryption Time (ms)");/**Time taken to decrypt image*/

       jLabel2.setText("Encryption Time (ms)");/**Time taken to encrypt image*/


       jLabel3.setText("Encryption and Decryption");

       jRadioButton2.setText("4 Round AES");

       jButton2.setText("Begin AES");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jTextField4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jTextField4ActionPerformed(evt);
           }
       });

       jButton3.setText("Choose Save Directory");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
       jPanel2.setLayout(jPanel2Layout);
       jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                               .addGap(100,100,100)
                               .addComponent(jLabel2)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                               .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                               .addComponent(jLabel1)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                               .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(32, Short.MAX_VALUE))
                       .addGroup(jPanel2Layout.createSequentialGroup()
                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                       .addGroup(jPanel2Layout.createSequentialGroup()
                                               .addGap(17, 17, 17)
                                               .addComponent(jButton3)
                                               .addContainerGap()
                                               .addComponent(jTextField4))
                                       .addGroup(jPanel2Layout.createSequentialGroup()
                                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                       .addGroup(jPanel2Layout.createSequentialGroup()
                                                               .addGap(200,200,200)
                                                               .addComponent(jButton2).addGap(20,20,20).addComponent(jRadioButton2))
                                                       .addGroup(jPanel2Layout.createSequentialGroup()
                                                               .addContainerGap()
                                                               .addComponent(jLabel3)))
                                               .addGap(0, 0, Short.MAX_VALUE)))
                               .addContainerGap())
       );
       jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                               .addContainerGap()
                               .addComponent(jLabel3)
                               .addGap(17, 17, 17)
                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                       .addComponent(jButton3)
                                       .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                       .addComponent(jButton2).addComponent(jRadioButton2))
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                               .addGap(30, 30, 30)
                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                       .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addComponent(jLabel1)
                                       .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addComponent(jLabel2))
                               .addGap(20, 20, 20))
       );

       jRadioButton1.setText("Preserve Image Header");

       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       jPanel1.setLayout(jPanel1Layout);
       jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(jPanel1Layout.createSequentialGroup()
                               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                       .addGroup(jPanel1Layout.createSequentialGroup()
                                               .addGap(200, 200, 200)
                                               .addComponent(jRadioButton1))

                                       .addGroup(jPanel1Layout.createSequentialGroup()
                                               .addGap(95, 95, 95)
                                               .addComponent(jButton1)
                                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                               .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                               .addContainerGap(11, Short.MAX_VALUE)
                               .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(11, Short.MAX_VALUE))
       );
       jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(37, Short.MAX_VALUE)
                               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                       .addGap(40,40,40)
                                       .addComponent(jButton1)
                                       .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                               .addComponent(jRadioButton1)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                               .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap())
       );

       jPanel2.getAccessibleContext().setAccessibleName("Encryption");

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );

       pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
;;	
       /* To write code for  for encryption & decryption here */
       double t;
       byte[] k=new byte[16];
       try
       {
           k=AES.keygeneration();/*calling keygeneration method from aes class*/
       }
       catch(Exception e) { System.out.println(e.getMessage());  }
       try
       {
           // the line that reads the image file
           File inputFile = jFileChooser1.getSelectedFile();
           BufferedImage image = ImageIO.read(inputFile);
           ByteArrayOutputStream baos=new ByteArrayOutputStream();
           ImageIO.write(image, "jpg", baos );
           byte[] b = baos.toByteArray();
           byte[] b2 = new byte[b.length-620];
           byte[] b1 = new byte[0];
           if(jRadioButton1.isSelected()==true)//preserving the header
           {
               for(int i=0; i<(b2.length); i++)
                   b2[i]=b[i+620]; //encrypted image is supported
               if(jRadioButton2.isSelected()==true) b2=AES.encrypt(b2,k,4);//returning cipher with 4 rounds
               else b2=AES.encrypt(b2,k,10);//with 10 rounds
               t=Math.round((AES.t2-AES.t1)/(1000000));/*calculating time required for encryption in ms*/
               jTextField3.setText(String.valueOf(t)+"ms");
               b1=new byte[b2.length+620];
               for(int i=0; i<b1.length; i++) {
                   if(i<620) b1[i]=b[i];
                   else b1[i]=b2[i-620]; }/**encrypted image is not supported*/

               inputFile=new File(jFileChooser2.getSelectedFile()+"/encryptedimage.jpg");
               FileOutputStream fos = new FileOutputStream(inputFile);
               fos.write(b1);
               fos.flush();/**flushes the content of the buffer to the output stream*/
               fos.close();
               for(int i=0; i<b2.length; i++)
                   b2[i]=b1[i+620];
               if(jRadioButton2.isSelected()==true) b2=AES.decrypt(b2,k,4);//to decrypt the cipher of 4 rounds
               else b2=AES.decrypt(b2,k,10);//to decrypt the cipher of 10 rounds
               t=Math.round((AES.t2-AES.t1)/(1000000));/*calculating decryption time in ms
               jTextField2.setText(String.valueOf(t)+"ms");
               for(int i=0; i<b.length; i++) {
                   if(i<620) b[i]=b1[i];
                   else b[i]=b2[i-620]; }
               inputFile=new File(jFileChooser2.getSelectedFile()+"/decryptedimage.jpg");
               fos = new FileOutputStream(inputFile);
               fos.write(b);
               fos.flush();
               fos.close();
           }
           else
           {
               if(jRadioButton2.isSelected()==true) b1=AES.encrypt(b,k,4);
               else b1=AES.encrypt(b,k,10);
               t=Math.round((AES.t2-AES.t1)/(1000000));
               jTextField3.setText(String.valueOf(t)+"ms");
               inputFile=new File(jFileChooser2.getSelectedFile()+"/encryptedimage.jpg");
               FileOutputStream fos = new FileOutputStream(inputFile);
               fos.write(b1);
               fos.flush();
               fos.close();
               if(jRadioButton2.isSelected()==true) b1=AES.decrypt(b1,k,4);
               else b1=AES.decrypt(b1,k,10);
               t=Math.round((AES.t2-AES.t1)/(1000000));
               jTextField2.setText(String.valueOf(t)+"ms");
               inputFile=new File(jFileChooser2.getSelectedFile()+"/decryptedimage.jpg");
               fos = new FileOutputStream(inputFile);
               fos.write(b1);
               fos.flush();
               fos.close(); } }
       //work with the image here

       catch (IOException e)
       {
           System.out.println(e.getMessage());

       }
   }//GEN-LAST:event_jButton2ActionPerformed


   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // file chooser to choose image (Browse)
       int returnVal = jFileChooser1.showOpenDialog(this);
       if (returnVal == JFileChooser.APPROVE_OPTION)
       {
           File file = jFileChooser1.getSelectedFile();
           if (!file.canRead()) {
               file.setReadable(true);
           }

           // display file name in text field
           jTextField1.setText(file.getAbsolutePath());

       } else
       {
           System.out.println("You must choose a file.");
       }
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       // TODO add your handling code here:
   }//GEN-LAST:event_jTextField4ActionPerformed

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jFileChooser2.setCurrentDirectory(new java.io.File("."));
       jFileChooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       int returnVal = jFileChooser2.showOpenDialog(this);
       if (returnVal == JFileChooser.APPROVE_OPTION)
       {
           File file = jFileChooser2.getSelectedFile();
           if (!file.canRead()) {
               file.setReadable(true);
           }
           // display file name in text field
           jTextField4.setText(file.getAbsolutePath());

       } else
       {
           System.out.println("You must choose a save directory.");
       }
   }//GEN-LAST:event_jButton3ActionPerformed

     public static void main(String args[]) {
       /* Set the Nimbus look and feel */
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       /* Nimbus uses Java 2D vector graphics to draw the user interface*/
       
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(Aes_Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {/** exception when the specified class object cannot be instantiated*/
           java.util.logging.Logger.getLogger(Aes_Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {/** exception when executing method cannot access specified class*/ 
           java.util.logging.Logger.getLogger(Aes_Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {/** exception when the requested look not presented in user’s system*/
           java.util.logging.Logger.getLogger(Aes_Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new Aes_Demo().setVisible(true);
           }
       });
   }
   // Variables declaration  //GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JFileChooser jFileChooser1;
   private javax.swing.JFileChooser jFileChooser2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JRadioButton jRadioButton1;
   private javax.swing.JRadioButton jRadioButton2;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   // End of variables declaration//GEN-END:variables
}
