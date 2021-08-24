package Vendas.view;

import Vendas.controller.Cliente;
import Vendas.controller.ItemPedido;
import Vendas.controller.Pedido;
import Vendas.controller.PedidoTableModel;
import Vendas.controller.Produto;
import Vendas.models.DAOCliente;
import Vendas.models.DAOProduto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CadastroVendas extends javax.swing.JFrame {

    DAOProduto daoProduto;
    DAOCliente daoCliente;
    private static CadastroVendas instance = null;
    private Produto produtoAtual;
    private PedidoTableModel modelo;
    
    public CadastroVendas()
    {
        initComponents();
        daoProduto = new DAOProduto();
        daoCliente = new DAOCliente();
        jtData.setText(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDate.now()));
        jtTotal.setText("0.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlInformeCliente = new javax.swing.JLabel();
        jtIdCliente = new javax.swing.JTextField();
        jlData = new javax.swing.JLabel();
        jtData = new javax.swing.JTextField();
        jbConsultaCliente = new javax.swing.JButton();
        jtNomeCliente = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlInformeProduto = new javax.swing.JLabel();
        jtIdProduto = new javax.swing.JTextField();
        jlQuatidade = new javax.swing.JLabel();
        jtQuantidade = new javax.swing.JTextField();
        jbAdicionaProduto = new javax.swing.JButton();
        jlTotal = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jbFinalizarPedido = new javax.swing.JButton();
        jbConsultaProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(modelo);
        jtDescricao = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jlDescricaoProduto = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jlInformeCliente.setText("Informe o cliente");

        jtIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdClienteFocusLost(evt);
            }
        });

        jlData.setText("Informe a data");

        jbConsultaCliente.setText("...");
        jbConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaClienteActionPerformed(evt);
            }
        });

        jtNomeCliente.setEditable(false);

        jlNome.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlInformeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtIdCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNomeCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlData)
                    .addComponent(jtData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInformeCliente)
                    .addComponent(jlData)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultaCliente)
                    .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlInformeProduto.setText("Infome o produto");

        jtIdProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdProdutoFocusLost(evt);
            }
        });

        jlQuatidade.setText("Informe quantidade");

        jtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQuantidadeActionPerformed(evt);
            }
        });

        jbAdicionaProduto.setText("+");
        jbAdicionaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionaProdutoActionPerformed(evt);
            }
        });

        jlTotal.setText("Total Pedido");

        jtTotal.setEditable(false);

        jbFinalizarPedido.setText("Finalizar Pedido");
        jbFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarPedidoActionPerformed(evt);
            }
        });

        jbConsultaProduto.setText("...");
        jbConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaProdutoActionPerformed(evt);
            }
        });

        modelo = new PedidoTableModel(new Pedido());
        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jtDescricao.setEditable(false);

        jtPreco.setEditable(false);

        jlDescricaoProduto.setText("Descrição");

        jlPreco.setText("Preço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbFinalizarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlInformeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtIdProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbConsultaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDescricaoProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlPreco)
                                .addGap(0, 43, Short.MAX_VALUE))
                            .addComponent(jtPreco))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlQuatidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbAdicionaProduto)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlInformeProduto)
                                .addComponent(jlDescricaoProduto))
                            .addComponent(jlPreco, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsultaProduto)
                            .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlQuatidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAdicionaProduto))))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTotal)
                    .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFinalizarPedido))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQuantidadeActionPerformed

    private void jbConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaProdutoActionPerformed
        limpaCamposProduto();
        ConsultaProdutos tela = ConsultaProdutos.getInstance();
        tela.fechaAoSelecionar = true;
        tela.setVisible(true);
        
        produtoAtual = tela.getProdutoSelecionado();
        
        preencheInfosProduto();
    }//GEN-LAST:event_jbConsultaProdutoActionPerformed

    private void limpaCamposProduto()
    {
        jtIdProduto.setText("");
        jtDescricao.setText("");
        jtPreco.setText(""); 
        jtQuantidade.setText("");
        
        jtIdProduto.requestFocus();
    }
    
    private void limpaCamposCliente()
    {
        jtIdCliente.setText("");
        jtNomeCliente.setText("");
        
        jtIdCliente.requestFocus();
    }
    
    private boolean preencheInfosProduto()
    {
        if (produtoAtual == null)
            return false;
        
        jtIdProduto.setText(Integer.toString(produtoAtual.getId()));
        jtDescricao.setText(produtoAtual.getDescricao());
        jtPreco.setText(Float.toString(produtoAtual.getPreco()));
        
        return true;
    }
    
    private boolean preencheInfosCliente(Cliente cliente)
    {
        if (cliente == null)
            return false;
        
        jtIdCliente.setText(Integer.toString(cliente.getId()));
        jtNomeCliente.setText(cliente.getNome());
        
        return true;
    }
    
    private void jtIdProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdProdutoFocusLost
        //if (CadastroUtil.VerificaCampoInt(jtIdProduto))
        if (!jtIdProduto.getText().equals("") && CadastroUtil.VerificaCampoInt(jtIdProduto))
        {
            produtoAtual = daoProduto.getById(Integer.parseInt(jtIdProduto.getText()));
            if (preencheInfosProduto())
                return;
            
            limpaCamposProduto();
            JOptionPane.showMessageDialog(this, "Produto não existe");
            jtIdProduto.requestFocus();
        }
    }//GEN-LAST:event_jtIdProdutoFocusLost

    private void jbConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaClienteActionPerformed
        limpaCamposCliente();
        ConsultaClientes tela = ConsultaClientes.getInstance();
        tela.fechaAoSelecionar = true;
        tela.setVisible(true);
        
        Cliente clienteSelecionado = daoCliente.getById(tela.idClienteSelecionado);
        if (clienteSelecionado == null)
            return;
        
        preencheInfosCliente(clienteSelecionado);
    }//GEN-LAST:event_jbConsultaClienteActionPerformed

    private void jtIdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdClienteFocusLost
        //if (CadastroUtil.VerificaCampoInt(jtIdCliente))
        if (!jtIdCliente.getText().isEmpty() && CadastroUtil.VerificaCampoInt(jtIdCliente))
        {
            Cliente cliente = daoCliente.getById(Integer.parseInt(jtIdCliente.getText()));
            if (preencheInfosCliente(cliente))
                return;

            limpaCamposCliente();
            JOptionPane.showMessageDialog(this, "Cliente não existe");
            jtIdCliente.requestFocus();
        }
    }//GEN-LAST:event_jtIdClienteFocusLost

    private void jbAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionaProdutoActionPerformed
        if (!verificaCamposProduto())
            return;
        
        PedidoTableModel modelo = (PedidoTableModel)jTable1.getModel();
        
        float quantidadeEscolhida = Float.parseFloat(jtQuantidade.getText());
        
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produtoAtual);
        
        itemPedido.adicionaQuantidade(quantidadeEscolhida);
        
        if (modelo.getPedido().possuiItemPedido(itemPedido.getProduto().getId()))
        {
            int opcaoEscolhida = JOptionPane.showConfirmDialog(this, "Esse produto já foi adicionado ao pedido.\nDeseja acrescentar à quantidade já adicionada?",
                    "Produto já adicionado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcaoEscolhida != 0)
                return;
        }
        
        if (!itemPedido.temEstoque())
        {
            JOptionPane.showMessageDialog(this, "Quantidade é superior ao estoque disponível.\nEstoque disponível: " + produtoAtual.getEstoque());
            jtQuantidade.requestFocus();
            return;
        }
        
        modelo.addItemPedido(itemPedido);
        
        jtTotal.setText(Float.toString(modelo.getPedido().getTotal()));
        
        limpaCamposProduto();
    }//GEN-LAST:event_jbAdicionaProdutoActionPerformed

    private void jbFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarPedidoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        Pedido pedido = new Pedido();
        
        for (int idx = 0; idx < modelo.getRowCount(); idx++)
        {
            ItemPedido itemPedido = new ItemPedido();
            Produto produto = new Produto();
            
            produto.setId(Integer.parseInt(modelo.getValueAt(idx, 0).toString()));
            produto.setDescricao(modelo.getValueAt(idx, 1).toString());
            produto.setPreco(Float.parseFloat(modelo.getValueAt(idx, 2).toString()));
            
            itemPedido.setProduto(produto);
            itemPedido.adicionaQuantidade(Float.parseFloat(modelo.getValueAt(idx, 3).toString()));
            
            pedido.adicionaItem(itemPedido);
        }
    }//GEN-LAST:event_jbFinalizarPedidoActionPerformed
    
    private boolean verificaCamposProduto()
    {
        if (!CadastroUtil.VerificaCampoInt(jtIdProduto))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o produto");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoFloat(jtQuantidade, true))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a quantidade");
            return false;
        }
        
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                CadastroVendas.getInstance().setVisible(true);
            }
        });
    }
    
    public static CadastroVendas getInstance()
    {
        if(instance == null)
            instance =  new CadastroVendas();  

        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdicionaProduto;
    private javax.swing.JButton jbConsultaCliente;
    private javax.swing.JButton jbConsultaProduto;
    private javax.swing.JButton jbFinalizarPedido;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDescricaoProduto;
    private javax.swing.JLabel jlInformeCliente;
    private javax.swing.JLabel jlInformeProduto;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlQuatidade;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTextField jtData;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtIdProduto;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables
}
