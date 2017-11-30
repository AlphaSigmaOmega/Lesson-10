package Assignments;

import static arraylists.PersonArrayList.findInsertPoint;
import static arraylists.PersonArrayList.search;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PersonList extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();

    public PersonList() {
        initComponents();
        people.add(new Person("Big Boss", 26, "M"));
        people.add(new Person("Kazuhira", 26, "M"));
        people.add(new Person("Sunny", 26, "F"));
        people.add(new Person("Quiet", 26, "F"));
        lstpeople.setModel(list);
        for (Person p : people) {
            list.addElement(p.getName());
        }
    }

    public void clearForm() {
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lstpeople.clearSelection();
    }

    public void show(Person p) {
        txtname.setText(p.getName());
        txtage.setText("" + p.getAge());
        if (p.getGender() == "M") {
            optMale.setSelected(true);
        } else {
            optFemale.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        optMale = new javax.swing.JRadioButton();
        optFemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuClear = new javax.swing.JMenuItem();
        mnuAdd = new javax.swing.JMenuItem();
        mnuDel = new javax.swing.JMenuItem();
        mnuFilter = new javax.swing.JMenu();
        mnuAll = new javax.swing.JMenuItem();
        mnuMale = new javax.swing.JMenuItem();
        mnuFemale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstpeople.setToolTipText("");
        lstpeople.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstpeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstpeople);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(optMale);
        optMale.setText("Male");
        optMale.setActionCommand("M");
        optMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(optFemale);
        optFemale.setText("Female");
        optFemale.setActionCommand("F");
        optFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optMale)
                .addGap(18, 18, 18)
                .addComponent(optFemale)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optMale)
                    .addComponent(optFemale))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        mnuFile.setText("File");

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/exit.png"))); // NOI18N
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuExit);

        jMenuBar1.add(mnuFile);

        mnuEdit.setText("Edit");

        mnuClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/exit.png"))); // NOI18N
        mnuClear.setText("Clear");
        mnuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClearActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuClear);

        mnuAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/insert.png"))); // NOI18N
        mnuAdd.setText("Add");
        mnuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuAdd);

        mnuDel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnuDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/delete.png"))); // NOI18N
        mnuDel.setText("Delete");
        mnuDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDelActionPerformed(evt);
            }
        });
        mnuEdit.add(mnuDel);

        jMenuBar1.add(mnuEdit);

        mnuFilter.setText("Filter");

        mnuAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/all.png"))); // NOI18N
        mnuAll.setText("Show All");
        mnuAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAllActionPerformed(evt);
            }
        });
        mnuFilter.add(mnuAll);

        mnuMale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnuMale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/male.png"))); // NOI18N
        mnuMale.setText("Male");
        mnuMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMaleActionPerformed(evt);
            }
        });
        mnuFilter.add(mnuMale);

        mnuFemale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnuFemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assignments/icons/female.png"))); // NOI18N
        mnuFemale.setText("Female");
        mnuFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFemaleActionPerformed(evt);
            }
        });
        mnuFilter.add(mnuFemale);

        jMenuBar1.add(mnuFilter);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtage))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMaleActionPerformed
        list.clear();
        for (Person person : people) {
            if (person.getGender() == "M") {
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnuMaleActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void optMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optMaleActionPerformed

    private void mnuDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDelActionPerformed
        /*list.clear();
        for (Person person : people) {
            list.addElement(person.getName());
        }*/
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name, 0, ""));
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearForm();
    }//GEN-LAST:event_mnuDelActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void optFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optFemaleActionPerformed

    private void mnuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddActionPerformed
        /*list.clear();
        for (Person person : people) {
            list.addElement(person.getName());
        }*/
        String name = txtname.getText();
        int age = Integer.parseInt(txtage.getText());
        String gender = buttonGroup1.getSelection().getActionCommand();
        Person p = new Person(name, age, gender);
        int loc = findInsertPoint(people, p);
        people.add(loc, p);
        list.add(loc, p.getName());
        clearForm();
        
    }//GEN-LAST:event_mnuAddActionPerformed

    private void mnuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClearActionPerformed
        //Clear or delete all entries?
        list.clear();
        for (Person person : people) {
            list.removeElement(person.getName());
        }
        clearForm();
    }//GEN-LAST:event_mnuClearActionPerformed

    private void mnuAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAllActionPerformed
        list.clear();
        for (Person person : people) {
            list.addElement(person.getName());
        }
    }//GEN-LAST:event_mnuAllActionPerformed

    private void mnuFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFemaleActionPerformed
        list.clear();
        for (Person person : people) {
            if (person.getGender() == "F") {
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnuFemaleActionPerformed

    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpeopleMouseClicked
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name, 0, ""));
        show(people.get(loc));
    }//GEN-LAST:event_lstpeopleMouseClicked

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
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuAdd;
    private javax.swing.JMenuItem mnuAll;
    private javax.swing.JMenuItem mnuClear;
    private javax.swing.JMenuItem mnuDel;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFemale;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuFilter;
    private javax.swing.JMenuItem mnuMale;
    private javax.swing.JRadioButton optFemale;
    private javax.swing.JRadioButton optMale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
