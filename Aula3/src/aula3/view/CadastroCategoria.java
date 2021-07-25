package aula3.view;

import aula3.controller.Categoria;
import aula3.models.DAOCategoria;
import javax.swing.JOptionPane;

public class CadastroCategoria extends javax.swing.JFrame {

    public CadastroCategoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCadastroCategoriaDescricao = new javax.swing.JTextField();
        jbCadastroCategoriaSalvar = new javax.swing.JButton();
        jbCadastroCategoriaSalvar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Categoria");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Categoria");

        jLabel2.setText("Descrição:");

        jbCadastroCategoriaSalvar.setText("Salvar");
        jbCadastroCategoriaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroCategoriaSalvarActionPerformed(evt);
            }
        });

        jbCadastroCategoriaSalvar1.setText("Limpa");
        jbCadastroCategoriaSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroCategoriaSalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbCadastroCategoriaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCadastroCategoriaSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtCadastroCategoriaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCadastroCategoriaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastroCategoriaSalvar)
                    .addComponent(jbCadastroCategoriaSalvar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroCategoriaSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroCategoriaSalvar1ActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbCadastroCategoriaSalvar1ActionPerformed

    private void jbCadastroCategoriaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroCategoriaSalvarActionPerformed
        if (verificaCampos())
        {
            Categoria categoria = new Categoria(0);
            categoria.setDescricao(jtCadastroCategoriaDescricao.getText());
            
            if (DAOCategoria.salvar(categoria))
            {
                JOptionPane.showMessageDialog(rootPane, "Categoria salva com sucesso!");
                limpaCampos();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar categoria.");
            }
        }
    }//GEN-LAST:event_jbCadastroCategoriaSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCategoria().setVisible(true);
            }
        });
    }

    private void limpaCampos()
    {
        jtCadastroCategoriaDescricao.setText("");
    }
    
    private boolean verificaCampos()
    {
        if (jtCadastroCategoriaDescricao.getText().isEmpty())
        {
            jtCadastroCategoriaDescricao.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário informar descrição");
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbCadastroCategoriaSalvar;
    private javax.swing.JButton jbCadastroCategoriaSalvar1;
    private javax.swing.JTextField jtCadastroCategoriaDescricao;
    // End of variables declaration//GEN-END:variables
}