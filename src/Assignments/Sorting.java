package Assignments;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Sorting extends javax.swing.JFrame {

    int nums[] = new int[50000];
    DefaultListModel list;
    boolean sorted=false;

    public Sorting() {
        initComponents();
        list = new DefaultListModel();
        //connect to actual list
        lstNums.setModel(list);
        //print nums
    }

    public void printList() {
        list.clear();
        for (int i = 0; i < 50000; i++) {
            list.add(i, "" + nums[i]);
        }
    }

    public void shuffle() {
        Random r = new Random();
        sorted = false;
        for (int i = 0; i < 50000; i++) {
            nums[i] = r.nextInt(50000) + 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstNums = new javax.swing.JList<>();
        btnBubble = new javax.swing.JButton();
        btnSelection = new javax.swing.JButton();
        btnInsertion = new javax.swing.JButton();
        btnQuick = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstNums);

        btnBubble.setText("Bubble Sort");
        btnBubble.setToolTipText("");
        btnBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBubbleActionPerformed(evt);
            }
        });

        btnSelection.setText("Selection Sort");
        btnSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectionActionPerformed(evt);
            }
        });

        btnInsertion.setText("Insertion Sort");
        btnInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertionActionPerformed(evt);
            }
        });

        btnQuick.setText("Quick Sort");
        btnQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTime.setText("Time Lapsed =?");
        lblTime.setBorder(new javax.swing.border.MatteBorder(null));

        btnGenerate.setText("Generate Numbers");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTime)
                        .addComponent(btnBubble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelection, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(btnInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnGenerate)
                .addGap(24, 24, 24)
                .addComponent(btnBubble)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertion)
                .addGap(77, 77, 77)
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(btnQuick)
                .addGap(118, 118, 118))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBubbleActionPerformed
        //Start Timer
        if(sorted){
            JOptionPane.showMessageDialog(this, "The List is already sorted - generate new numbers first.");
            return; //don't do the sort, leave now instead
        }
        bubbleSort(nums);
        sorted=true;
        //End Timer
        printList();
        
    }//GEN-LAST:event_btnBubbleActionPerformed

    private void btnSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectionActionPerformed
        if(sorted){
            JOptionPane.showMessageDialog(this, "The List is already sorted - generate new numbers first.");
            return; //don't do the sort, leave now instead
        }
        selectionSort(nums);
        sorted=true;
        //End Timer
        printList();
    }//GEN-LAST:event_btnSelectionActionPerformed

    private void btnInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertionActionPerformed
        if(sorted){
            JOptionPane.showMessageDialog(this, "The List is already sorted - generate new numbers first.");
            return; //don't do the sort, leave now instead
        }
        insertionSort(nums);
        sorted=true;
        //End Timer
        printList();
    }//GEN-LAST:event_btnInsertionActionPerformed

    private void btnQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuickActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        shuffle();
        printList();
    }//GEN-LAST:event_btnGenerateActionPerformed

    public static void bubbleSort(int[] a) {
        int k = 0;
        boolean exchangeMade = true;
        // Make up to n - 1 passes through array, exit 
        //early if no exchanges are made on previous pass

        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }//end if
            }//end for
        }//end while
    }

//supporting swap method
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

////////////////////////////////////////////////////////////////
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

//supporting swap method (same as bubble sort swap)
/////////////////////////////////////////////////////////////
    public static void insertionSort(int a[]) {
        int itemToInsert, j;
        boolean stillLooking;

        //on the kth pass, pass item k upwards in list
        //and insert it in its proper place amoung the
        //first k entries in an array
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for
            //the right place to insert a[k];
            itemToInsert = a[k];
            j = k - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < a[j]) {
                    //move item higher
                    a[j + 1] = a[j];
                    j--;
                } else {
                    //we have found new home for a[k];
                    stillLooking = false;
                }//end else// j+1 is where the item goes
                a[j + 1] = itemToInsert;
            }//end while
        }//end for
    }//end method

///////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBubble;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnInsertion;
    private javax.swing.JButton btnQuick;
    private javax.swing.JButton btnSelection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JList<String> lstNums;
    // End of variables declaration//GEN-END:variables
}
