package aula3.view;
import aula3.controller.Categoria;
import aula3.controller.Produto;
import aula3.models.DAOCategoria;
import aula3.models.DAOProduto;
import javax.swing.JOptionPane;

public class CadastroProduto extends javax.swing.JFrame
{
    DAOProduto dao;
    private static CadastroProduto instance = null;
    
    public CadastroProduto() 
    {
        dao = new DAOProduto();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jlDescricao = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jtPreco = new javax.swing.JTextField();
        jlEstoque = new javax.swing.JLabel();
        jtEstoque = new javax.swing.JTextField();
        jlCategoria = new javax.swing.JLabel();
        jcCategoria = new javax.swing.JComboBox<>();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastro de Produtos");

        jlDescricao.setText("Descrição");

        jlPreco.setText("Preço");

        jlEstoque.setText("Estoque");

        jlCategoria.setText("Categoria");

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a categoria" }));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCategoria)
                    .addComponent(jlEstoque)
                    .addComponent(jlPreco)
                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescricao)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDescricao)
                .addGap(4, 4, 4)
                .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPreco)
                .addGap(4, 4, 4)
                .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEstoque)
                .addGap(4, 4, 4)
                .addComponent(jtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencheCategorias();
    }//GEN-LAST:event_formWindowOpened

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (VerificaCampos())
        {
            Produto produto = new Produto(0);

            produto.setDescricao(jtDescricao.getText());
            produto.setPreco(Float.parseFloat(jtPreco.getText()));
            produto.setEstoque(Float.parseFloat(jtEstoque.getText()));
            
            Categoria categoria = new Categoria();
            
            categoria.setId(jcCategoria.getSelectedIndex());
            produto.setCategoria(categoria);
            
            if (dao.save(produto))
            {
                JOptionPane.showMessageDialog(rootPane, "Produto salvo com sucesso!");
                LimpaCampos();
            }
            else
               JOptionPane.showMessageDialog(rootPane, "Erro ao salvar produto."); 
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void preencheCategorias()
    {
        jcCategoria.removeAllItems();
        jcCategoria.addItem("Selecione a categoria");
        
        DAOCategoria daoCategoria = new DAOCategoria();
        for (Categoria categoria : daoCategoria.findAll())
            jcCategoria.addItem(categoria.getDescricao());
    }
    
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        LimpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

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
            public void run() 
            {
                CadastroProduto.getInstance().setVisible(true);
            }
        });
    }
    
    public static CadastroProduto getInstance()
    {
        if(instance == null)
            instance =  new CadastroProduto();  

        return instance;
    }

    private boolean VerificaCampos()
    {
        if (!CadastroUtil.VerificaCampoTexto(jtDescricao))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a descrição");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoFloat(jtPreco, true))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o preço");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoFloat(jtEstoque, true))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o estoque");
            return false;
        }
        
        if (!CadastroUtil.VerificaComboBox(jcCategoria))
        {
            JOptionPane.showMessageDialog(rootPane, "Selecione a categoria");
            return false;
        }
        
        return true;
    }
    
    private void LimpaCampos()
    {
        jtDescricao.setText("");
        jtPreco.setText("");
        jtEstoque.setText("");
        jcCategoria.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlEstoque;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtEstoque;
    private javax.swing.JTextField jtPreco;
    // End of variables declaration//GEN-END:variables
}
