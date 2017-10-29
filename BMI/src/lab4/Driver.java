/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 * this class drives the object of BMI class to show 
 * the main UI of the Application 
 * @author AFRAZ
 */
public class Driver {
    /**
     * this is the main of the Driver class which initiates an object of 
     * BMI class according to desired layout of BMI frame
     * @param args 
     */
    public static void main(String args[])
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                    .UIManager.getInstalledLookAndFeels()) {
                /**
                 * you can choose any of the layouts for jFrame below in if 
                 * statement for first argument
                 */
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI().setVisible(true);
            }
        });
    }
}
   
    

