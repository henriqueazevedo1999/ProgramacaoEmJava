package aula3.view;

import aula3.controller.FiltroProduto;
import aula3.controller.Produto;
import aula3.models.DAOProduto;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ConsultaProdutos extends javax.swing.JFrame
{
    DAOProduto dao;
    private static ConsultaProdutos instance = null;
    
    public ConsultaProdutos() 
    {
        dao = new DAOProduto();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableConsultaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jlConsultaProdutoDigiteDescricao = new javax.swing.JLabel();
        jtConsultaProdutoDescricaoPesquisar = new javax.swing.JTextField();
        jbConsultaProdutoPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TableConsultaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Estoque", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableConsultaProdutos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Produtos");

        jlConsultaProdutoDigiteDescricao.setText("Digite parte da descrição do produto");

        jbConsultaProdutoPesquisar.setText("Pesquisar");
        jbConsultaProdutoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaProdutoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlConsultaProdutoDigiteDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtConsultaProdutoDescricaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbConsultaProdutoPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jlConsultaProdutoDigiteDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtConsultaProdutoDescricaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultaProdutoPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConsultaProdutoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaProdutoPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TableConsultaProdutos.getModel();
        
        modelo.setNumRows(0);
        
        List<Produto> produtos;
        FiltroProduto filtroProduto = new FiltroProduto();
        filtroProduto.setDescricao(jtConsultaProdutoDescricaoPesquisar.getText());
        
        produtos = dao.findByILike(filtroProduto);
        
        for (Produto produto : produtos)
        {
            modelo.addRow(new Object[]
            {
                produto.getId(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getEstoque(),
                produto.getCategoria().getDescricao()
            });
        }
    }//GEN-LAST:event_jbConsultaProdutoPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                ConsultaProdutos.getInstance().setVisible(true);
            }
        });
    }
    
    public static ConsultaProdutos getInstance()
    {
        if(instance == null)
            instance =  new ConsultaProdutos();  

        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableConsultaProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConsultaProdutoPesquisar;
    private javax.swing.JLabel jlConsultaProdutoDigiteDescricao;
    private javax.swing.JTextField jtConsultaProdutoDescricaoPesquisar;
    // End of variables declaration//GEN-END:variables
}
