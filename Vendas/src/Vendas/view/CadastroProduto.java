package Vendas.view;
import Vendas.controller.Categoria;
import Vendas.controller.FiltroCategoria;
import Vendas.controller.Produto;
import Vendas.models.DAOCategoria;
import Vendas.models.DAOProduto;
import java.util.List;
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
        jtId = new javax.swing.JTextField();
        jlDescricao1 = new javax.swing.JLabel();
        jbPesquisa = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

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

        jtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdFocusLost(evt);
            }
        });

        jlDescricao1.setText("Id");

        jbPesquisa.setText("...");
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlDescricao1)
                    .addComponent(jlCategoria)
                    .addComponent(jlEstoque)
                    .addComponent(jlPreco)
                    .addComponent(jlDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPesquisa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpar))
                    .addComponent(jtDescricao)
                    .addComponent(jtPreco)
                    .addComponent(jtEstoque)
                    .addComponent(jcCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDescricao1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar)
                    .addComponent(jbAlterar))
                .addContainerGap())
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
            
            if (dao.insert(produto))
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
        preencheCategorias(0);
    }
    
    private void preencheCategorias(int indexSelecionado)
    {
        jcCategoria.removeAllItems();
        jcCategoria.addItem("Selecione a categoria");
        
        for (Categoria categoria : new DAOCategoria().getAll())
            jcCategoria.addItem(categoria.getDescricao());
        
        if (indexSelecionado > jcCategoria.getItemCount())
            jcCategoria.setSelectedIndex(0);
        else
            jcCategoria.setSelectedIndex(indexSelecionado);
    }
    
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        LimpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdFocusLost
        if (!CadastroUtil.VerificaCampoInt(jtId))
            return;
        
        int id = Integer.parseInt(jtId.getText());
        if (id <= 0)
            return;

        Produto produto = dao.getById(id);

        if (produto == null)
            JOptionPane.showMessageDialog(rootPane, "Produto não existe"); 
        else
        {
            PreencheCampos(produto);
            habilitaBotaoAlterar(true);
            return;
        }
    }//GEN-LAST:event_jtIdFocusLost

    private void habilitaBotaoAlterar(boolean habilita)
    {
        jbAlterar.setEnabled(habilita);
    }
    
    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        ConsultaProdutos consultaProdutos = ConsultaProdutos.getInstance();
        consultaProdutos.setVisible(true);
        Produto produto = consultaProdutos.getProdutoSelecionado();
        if (produto == null)
            LimpaCampos();
        else
        {
            FiltroCategoria filtroCategoria = new FiltroCategoria(produto.getCategoria().getDescricao());
            List<Categoria> categorias = new DAOCategoria().findByILike(filtroCategoria);
            if (categorias.size() > 0)
                produto.setCategoria(categorias.get(0));
            else
                produto.setCategoria(new Categoria(0, ""));
            PreencheCampos(produto);
            habilitaBotaoAlterar(true);
        }
        jtDescricao.requestFocus();
    }//GEN-LAST:event_jbPesquisaActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

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
    
    private void PreencheCampos(Produto produto)
    {
        jtId.setText(Integer.toString(produto.getId()));
        jtDescricao.setText(produto.getDescricao());
        jtPreco.setText(Float.toString(produto.getPreco()));
        jtEstoque.setText(Float.toString(produto.getEstoque()));
        preencheCategorias(produto.getCategoria().getId());
    }
    
    private void LimpaCampos()
    {
        jtId.setText("0");
        jtDescricao.setText("");
        jtPreco.setText("");
        jtEstoque.setText("");
        preencheCategorias();
        habilitaBotaoAlterar(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlDescricao1;
    private javax.swing.JLabel jlEstoque;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtEstoque;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtPreco;
    // End of variables declaration//GEN-END:variables
}
