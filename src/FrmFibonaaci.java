/*
Created by Conner Recoskie
Date: May 23rd 2023
Purpose: This program calculates the fibonacci number of a number. It allows the
user to enter the value of the fibonacci number they want to find and the program
calculates and returns the corresponding fibonacci number.
*/
public class FrmFibonaaci extends javax.swing.JFrame {
    // Creating an array that will be used in optimization
    private static long[] fibonacciCache;
    /* 
    Function: fibonacci
    Purpose: This method calculates the fibonacci value of the number passed to it
    Parameters: int n, it repersents the user input
    Returns: integer
    */
    public static long fibonacci(int n) 
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        
        if (fibonacciCache[n] != 0)
        {
            return fibonacciCache[n];
        }
        
        long nthFibonacciNum = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNum;
        return nthFibonacciNum;
    }
    public FrmFibonaaci() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblEnterTerm = new javax.swing.JLabel();
        txtFibonacciNum = new javax.swing.JTextField();
        btnFindNum = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        lblInstructions2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 0, 255));
        lblTitle.setText("<html><u>Fibonacci Numbers</u></html>");

        lblInstructions.setText("The first ten fibonacci numbers are");

        lblInstructions1.setText("listed as follows: 1, 1, 2, 3, 5, 8, 13,");

        lblEnterTerm.setText("Enter a Fibonacci Term:");

        btnFindNum.setText("Find the Fibonacci Number");
        btnFindNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindNumActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblInstructions2.setText("21, 34, 55... ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstructions1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEnterTerm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFibonacciNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFindNum, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstructions2)
                            .addComponent(lblInstructions)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions)
                .addGap(4, 4, 4)
                .addComponent(lblInstructions1)
                .addGap(2, 2, 2)
                .addComponent(lblInstructions2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFibonacciNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterTerm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindNumActionPerformed
        // Declaring a variable to hold the user input for the Fibonacci number
        int fibonacciNum;
        
        // Declaring a variable to hold the result of the Fibonacci calculation
        long result;
        
        // Error-checking the user-input
        try 
        {
            // Parse the user input
            fibonacciNum = Integer.parseInt(txtFibonacciNum.getText());
            
            // Checking if input is negative
            if (fibonacciNum < 0) 
            {
                lblOutput.setText("Error: The value must be non-negative");
                return;
            }
            
            // Checking if input is larger than 92 (the highest input that the program can withstand)
            if (fibonacciNum > 92)
            {
                lblOutput.setText("Error: Values can not exceed 92.");
                return;
            }
        }
        // If the user input is not a valid number, catch it
        catch (NumberFormatException e)
        {
            // Set the text of lblOutput to indicate an invalid input
            lblOutput.setText("Invalid Input");
            return;
        }
        
        // Initializing the size of the array
        fibonacciCache = new long[fibonacciNum + 1];

        // Calculate the Fibonacci number by passing the user input to the recursive method
        result = fibonacci(fibonacciNum);
        
        // Displaying the result in lblOutput
        lblOutput.setText("Fibonacci number " + fibonacciNum + " is " + result + ".");
    }//GEN-LAST:event_btnFindNumActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFibonaaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFibonaaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFibonaaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFibonaaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFibonaaci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindNum;
    private javax.swing.JLabel lblEnterTerm;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFibonacciNum;
    // End of variables declaration//GEN-END:variables
}
