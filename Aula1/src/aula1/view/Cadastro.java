package aula1.view;

import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlName = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jlAge = new javax.swing.JLabel();
        jtAge = new javax.swing.JTextField();
        jlObservation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservation = new javax.swing.JTextArea();
        jbSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jlName.setText("Informe seu nome:");

        jtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNameFocusLost(evt);
            }
        });
        jtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNameActionPerformed(evt);
            }
        });

        jlAge.setText("Informe sua idade:");

        jtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtAgeFocusLost(evt);
            }
        });
        jtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAgeActionPerformed(evt);
            }
        });

        jlObservation.setText("Observação:");

        jtaObservation.setEditable(false);
        jtaObservation.setColumns(20);
        jtaObservation.setRows(5);
        jScrollPane1.setViewportView(jtaObservation);

        jbSave.setText("Salvar");
        jbSave.setEnabled(false);
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlObservation)
                        .addComponent(jlAge)
                        .addComponent(jtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addComponent(jlName)
                        .addComponent(jtName)
                        .addComponent(jScrollPane1)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlObservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSave)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNameActionPerformed

    private void jtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAgeActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        String name = "";
        int idade = 0;
        
        if (jtName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Informe seu nome");
            jtName.requestFocus();
            return;
        }
        else
            name = jtName.getText();
            
        if (jtAge.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Informe sua idade");            
            jtAge.requestFocus();
            return;
        }
        else
            idade = Integer.parseInt(jtAge.getText());
            
        boolean bMaiorIdade = !(idade < 18);
        
        String message = name + ", você possui " + idade + " anos.";
        if (bMaiorIdade)
            message += "\nVocê é maior de idade!";
        else
            message += "\nVocê é menor de idade!";
        
        jtaObservation.setText(message);
        
        
        
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNameFocusLost
        SaveButtonVerifyEnable();
    }//GEN-LAST:event_jtNameFocusLost

    private void jtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtAgeFocusLost
        SaveButtonVerifyEnable();
    }//GEN-LAST:event_jtAgeFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSave;
    private javax.swing.JLabel jlAge;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlObservation;
    private javax.swing.JTextField jtAge;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextArea jtaObservation;
    // End of variables declaration//GEN-END:variables

    private void SaveButtonVerifyEnable()
    {
        jbSave.setEnabled(!((jtName.getText().isEmpty()) || (jtAge.getText().isEmpty())));
    }
}

