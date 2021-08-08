package aula3.view;

import aula3.controller.Categoria;
import aula3.models.DAOCategoria;
import javax.swing.JOptionPane;

public class CadastroCategoria extends javax.swing.JFrame implements ICadastro<CadastroCategoria>
{
    DAOCategoria dao;
    private static CadastroCategoria instance = null;
    
    public CadastroCategoria()
    {
        dao = new DAOCategoria();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jbCadastroCategoriaSalvar = new javax.swing.JButton();
        jbCadastroCategoriaLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Categoria");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastro de Categoria");

        jlDescricao.setText("Descrição:");

        jbCadastroCategoriaSalvar.setText("Salvar");
        jbCadastroCategoriaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroCategoriaSalvarActionPerformed(evt);
            }
        });

        jbCadastroCategoriaLimpar.setText("Limpar");
        jbCadastroCategoriaLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroCategoriaLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbCadastroCategoriaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCadastroCategoriaLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastroCategoriaSalvar)
                    .addComponent(jbCadastroCategoriaLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroCategoriaLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroCategoriaLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbCadastroCategoriaLimparActionPerformed

    private void jbCadastroCategoriaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroCategoriaSalvarActionPerformed
        if (verificaCampos())
        {
            Categoria categoria = new Categoria(jtDescricao.getText());
            
            if (dao.save(categoria))
            {
                JOptionPane.showMessageDialog(rootPane, "Categoria salva com sucesso!");
                limpaCampos();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar categoria.");
        }
    }//GEN-LAST:event_jbCadastroCategoriaSalvarActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                CadastroCategoria.getInstance().setVisible(true);
            }
        });
    }

    public static CadastroCategoria getInstance()
    {
        if(instance == null)
            instance =  new CadastroCategoria();  

        return instance;
    }
    
    @Override
    public void limpaCampos()
    {
        jtDescricao.setText("");
    }
    
    @Override
    public boolean verificaCampos()
    {
        if (!CadastroUtil.VerificaCampoTexto(jtDescricao))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a descrição");
            return false;
        }
        
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastroCategoriaLimpar;
    private javax.swing.JButton jbCadastroCategoriaSalvar;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtDescricao;
    // End of variables declaration//GEN-END:variables
}
