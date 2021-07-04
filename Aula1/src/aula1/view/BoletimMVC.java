package aula1.view;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BoletimMVC extends javax.swing.JFrame {

    public BoletimMVC() {
        initComponents();
        LimpaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtName = new javax.swing.JTextField();
        jlName = new javax.swing.JLabel();
        jtN1 = new javax.swing.JTextField();
        jlN1 = new javax.swing.JLabel();
        jtN2 = new javax.swing.JTextField();
        jlN2 = new javax.swing.JLabel();
        jtN3 = new javax.swing.JTextField();
        jlN3 = new javax.swing.JLabel();
        jtN4 = new javax.swing.JTextField();
        jlN4 = new javax.swing.JLabel();
        jtFrequency = new javax.swing.JTextField();
        jlFrequency = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSituation = new javax.swing.JTextArea();
        jlSituation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNameFocusLost(evt);
            }
        });

        jlName.setText("Nome:");

        jtN1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtN1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtN1FocusLost(evt);
            }
        });

        jlN1.setText("N1:");

        jtN2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtN2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtN2FocusLost(evt);
            }
        });

        jlN2.setText("N2:");

        jtN3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtN3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtN3FocusLost(evt);
            }
        });

        jlN3.setText("N3:");

        jtN4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtN4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtN4FocusLost(evt);
            }
        });

        jlN4.setText("N4:");

        jtFrequency.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtFrequencyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtFrequencyFocusLost(evt);
            }
        });

        jlFrequency.setText("Frequência %:");

        jtaSituation.setColumns(20);
        jtaSituation.setRows(5);
        jScrollPane1.setViewportView(jtaSituation);

        jlSituation.setText("Situação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlName)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlN1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlN2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlN3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtN4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlN4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFrequency)))
                    .addComponent(jtName)
                    .addComponent(jlSituation)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlN2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlN3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlN4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFrequency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jlSituation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNameFocusLost
        if (jtName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Informe o nome");
            LimpaCampos();
            return;
        }
        else
        {
            jtN1.setEnabled(true);
            jtN2.setEnabled(true);
            jtN3.setEnabled(true);
            jtN4.setEnabled(true);
            jtFrequency.setEnabled(true);
            jtN1.requestFocus();
        }
        OnUpdate();
    }//GEN-LAST:event_jtNameFocusLost

    private void jtN1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN1FocusLost
        ValidaNota(jtN1);
    }//GEN-LAST:event_jtN1FocusLost

    private void jtN2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN2FocusLost
        ValidaNota(jtN2);
    }//GEN-LAST:event_jtN2FocusLost

    private void jtN3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN3FocusLost
        ValidaNota(jtN3);
    }//GEN-LAST:event_jtN3FocusLost

    private void jtN4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN4FocusLost
        ValidaNota(jtN4);
    }//GEN-LAST:event_jtN4FocusLost

    private void jtFrequencyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFrequencyFocusLost
        ValidaFrequencia(jtFrequency);
    }//GEN-LAST:event_jtFrequencyFocusLost

    private void jtN1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN1FocusGained
       jtN1.selectAll();
    }//GEN-LAST:event_jtN1FocusGained

    private void jtN2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN2FocusGained
       jtN2.selectAll();
    }//GEN-LAST:event_jtN2FocusGained

    private void jtN3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN3FocusGained
       jtN3.selectAll();
    }//GEN-LAST:event_jtN3FocusGained

    private void jtN4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtN4FocusGained
        jtN4.selectAll();
    }//GEN-LAST:event_jtN4FocusGained

    private void jtFrequencyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFrequencyFocusGained
        jtFrequency.selectAll();
    }//GEN-LAST:event_jtFrequencyFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlFrequency;
    private javax.swing.JLabel jlN1;
    private javax.swing.JLabel jlN2;
    private javax.swing.JLabel jlN3;
    private javax.swing.JLabel jlN4;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlSituation;
    private javax.swing.JTextField jtFrequency;
    private javax.swing.JTextField jtN1;
    private javax.swing.JTextField jtN2;
    private javax.swing.JTextField jtN3;
    private javax.swing.JTextField jtN4;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextArea jtaSituation;
    // End of variables declaration//GEN-END:variables

    private void OnUpdate()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        
        String name = jtName.getText();
        
        double N1 = Double.parseDouble(jtN1.getText());
        double N2 = Double.parseDouble(jtN2.getText());
        double N3 = Double.parseDouble(jtN3.getText());
        double N4 = Double.parseDouble(jtN4.getText());
        
        int Frequency = Integer.parseInt(jtFrequency.getText());
        
        boolean Passou = false;
        
        double Media = (N1 + N2 + N3 + N4) / 4.0;
        
        if ((Media >= 7.0) && (Frequency >= 70))
            Passou = true;
        
        sb.append("Aluno: ");
        sb.append(name);
        sb.append("\n");
        
        sb.append("Média: ");
        sb.append(df.format(Media));
        sb.append("\n");
        
        sb.append("\n");
        if (Passou)
            sb.append("Aluno aprovado.");
        else
            sb.append("Aluno reprovado.");
        
        jtaSituation.setText(sb.toString());
    }
    private void LimpaCampos()
    {
        jtN1.setEnabled(false);
        jtN2.setEnabled(false);
        jtN3.setEnabled(false);
        jtN4.setEnabled(false);
        jtFrequency.setEnabled(false);
        
        jtN1.setText("0.00");
        jtN2.setText("0.00");
        jtN3.setText("0.00");
        jtN4.setText("0.00");
        jtFrequency.setText("0");
        
        jtaSituation.setText("");
        jtaSituation.setEditable(false);
        jtName.requestFocus();
    }
    
    private void ValidaNota(javax.swing.JTextField text)
    {
        boolean EhValida = false;
        double Nota = 0.0;
        
        EhValida = !(text.getText().isEmpty());
        if (EhValida)
        {
            Nota = Double.parseDouble(text.getText());
            EhValida = (Nota >= 0 ) && (Nota <= 10);
        }
        if (!EhValida)
        {
            JOptionPane.showMessageDialog(null, "A nota deve estar entre 0 e 10!");
            text.requestFocus();
            text.setText("0.00");
            text.selectAll();
        }
        else
            OnUpdate();
    }
    
    private void ValidaFrequencia(javax.swing.JTextField text)
    {
        boolean EhValida = false;
        int Frequencia = 0;
        
        EhValida = !(text.getText().isEmpty());
        if (EhValida)
        {
            Frequencia = Integer.parseInt(text.getText());
            EhValida = (Frequencia >= 0 ) && (Frequencia <= 100);
        }
        if (!EhValida)
        {
            JOptionPane.showMessageDialog(null, "A frequência deve estar entre 0 e 100!");
            text.requestFocus();
            text.setText("0");
            text.selectAll();
        }
        else
            OnUpdate();
    }
}
