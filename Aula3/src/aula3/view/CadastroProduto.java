package aula3.view;
import aula3.controller.Categoria;
import aula3.controller.Produto;
import aula3.models.DAOCategoria;
import aula3.models.DAOProduto;
import javax.swing.JOptionPane;

public class CadastroProduto extends javax.swing.JFrame {

    public CadastroProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtCadastroProdutoDescricao = new javax.swing.JTextField();
        jlCadastroProdutoDescricao = new javax.swing.JLabel();
        jlCadastroProdutoPreco = new javax.swing.JLabel();
        jtCadastroProdutoPreco = new javax.swing.JTextField();
        jlCadastroProdutoEstoque = new javax.swing.JLabel();
        jtCadastroProdutoEstoque = new javax.swing.JTextField();
        jlCadastroProdutoCategoria = new javax.swing.JLabel();
        jcCadastroProdutoCategoria = new javax.swing.JComboBox<>();
        jbCadastroProdutoSalvar = new javax.swing.JButton();
        jbCadastroProdutoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos");

        jlCadastroProdutoDescricao.setText("Descrição");

        jlCadastroProdutoPreco.setText("Preço");

        jlCadastroProdutoEstoque.setText("Estoque");

        jlCadastroProdutoCategoria.setText("Categoria");

        jcCadastroProdutoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a categoria" }));

        jbCadastroProdutoSalvar.setText("Salvar");
        jbCadastroProdutoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroProdutoSalvarActionPerformed(evt);
            }
        });

        jbCadastroProdutoLimpar.setText("Limpar");
        jbCadastroProdutoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroProdutoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCadastroProdutoCategoria)
                    .addComponent(jlCadastroProdutoEstoque)
                    .addComponent(jlCadastroProdutoPreco)
                    .addComponent(jtCadastroProdutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCadastroProdutoDescricao)
                    .addComponent(jtCadastroProdutoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCadastroProdutoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCadastroProdutoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcCadastroProdutoCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtCadastroProdutoEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCadastroProdutoDescricao)
                .addGap(4, 4, 4)
                .addComponent(jtCadastroProdutoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCadastroProdutoPreco)
                .addGap(4, 4, 4)
                .addComponent(jtCadastroProdutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCadastroProdutoEstoque)
                .addGap(4, 4, 4)
                .addComponent(jtCadastroProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCadastroProdutoCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcCadastroProdutoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastroProdutoSalvar)
                    .addComponent(jbCadastroProdutoLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencheCategorias();
    }//GEN-LAST:event_formWindowOpened

    private void jbCadastroProdutoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroProdutoSalvarActionPerformed
        if (VerificaCampos())
        {
            Produto produto = new Produto(0);

            produto.setDescricao(jtCadastroProdutoDescricao.getText());
            produto.setPreco(Float.parseFloat(jtCadastroProdutoPreco.getText()));
            produto.setEstoque(Float.parseFloat(jtCadastroProdutoEstoque.getText()));
            
            Categoria categoria = new Categoria(jcCadastroProdutoCategoria.getSelectedIndex());
            produto.setCategoria(categoria);
            
            if (DAOProduto.salvar(produto))
            {
                JOptionPane.showMessageDialog(rootPane, "Produto salvo com sucesso!");
                LimpaCampos();
            }
            else
               JOptionPane.showMessageDialog(rootPane, "Erro ao salvar produto."); 
        }
    }//GEN-LAST:event_jbCadastroProdutoSalvarActionPerformed

    private void preencheCategorias()
    {
        jcCadastroProdutoCategoria.removeAllItems();
        jcCadastroProdutoCategoria.addItem("Selecione a categoria");
        for (Categoria categoria : DAOCategoria.getCategorias())
            jcCadastroProdutoCategoria.addItem(categoria.getDescricao());
    }
    
    private void jbCadastroProdutoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroProdutoLimparActionPerformed
        LimpaCampos();
    }//GEN-LAST:event_jbCadastroProdutoLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    private boolean VerificaCampos()
    {
        if (jtCadastroProdutoDescricao.getText().isEmpty())
        {
            jtCadastroProdutoDescricao.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário informar descrição!");
            return false;
        }
        
        try {
            Float.parseFloat(jtCadastroProdutoPreco.getText());
        } catch (NumberFormatException e) {
            jtCadastroProdutoPreco.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário informar preço!");
            return false;
        }
        
        if (Float.parseFloat(jtCadastroProdutoPreco.getText()) <= 0)
        {
            jtCadastroProdutoPreco.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário informar preço!");
            return false;
        }
        
        try {
            Float.parseFloat(jtCadastroProdutoEstoque.getText());
        } catch (NumberFormatException e) {
            jtCadastroProdutoEstoque.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário informar estoque!");
            return false;
        }
        
        if (Float.parseFloat(jtCadastroProdutoEstoque.getText()) <= 0)
        {
            jtCadastroProdutoEstoque.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário informar estoque!");
            return false;
        }
        
        if (jcCadastroProdutoCategoria.getSelectedIndex() == 0)
        {
            jcCadastroProdutoCategoria.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Necessário selecionar a categoria!");
            return false;
        }
        return true;
    }
    
    private void LimpaCampos()
    {
        jtCadastroProdutoDescricao.setText("");
        jtCadastroProdutoPreco.setText("");
        jtCadastroProdutoEstoque.setText("");
        jcCadastroProdutoCategoria.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCadastroProdutoLimpar;
    private javax.swing.JButton jbCadastroProdutoSalvar;
    private javax.swing.JComboBox<String> jcCadastroProdutoCategoria;
    private javax.swing.JLabel jlCadastroProdutoCategoria;
    private javax.swing.JLabel jlCadastroProdutoDescricao;
    private javax.swing.JLabel jlCadastroProdutoEstoque;
    private javax.swing.JLabel jlCadastroProdutoPreco;
    private javax.swing.JTextField jtCadastroProdutoDescricao;
    private javax.swing.JTextField jtCadastroProdutoEstoque;
    private javax.swing.JTextField jtCadastroProdutoPreco;
    // End of variables declaration//GEN-END:variables
}
