package aula3.view;

import aula3.controller.Carro;
import aula3.models.DAOCarro;
import javax.swing.JOptionPane;

public class CadastroCarro extends javax.swing.JFrame implements ICadastro
{
    DAOCarro dao;
    private static CadastroCarro instance = null;
    
    public CadastroCarro() 
    {
        dao = new DAOCarro();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtMarca = new javax.swing.JTextField();
        jbLimpar = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jtModelo = new javax.swing.JTextField();
        jlPlaca = new javax.swing.JLabel();
        jtPlaca = new javax.swing.JTextField();
        jlCor = new javax.swing.JLabel();
        jtCor = new javax.swing.JTextField();
        jlCapacidadeTanque = new javax.swing.JLabel();
        jtCapacidadeTanque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carro");

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastro de Carro");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlMarca.setText("Marca");

        jlModelo.setText("Modelo");

        jlPlaca.setText("Placa");

        jlCor.setText("Cor");

        jlCapacidadeTanque.setText("Capacidade Tanque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMarca)
                            .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCapacidadeTanque)
                            .addComponent(jtCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCor)
                            .addComponent(jtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPlaca)
                            .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlModelo)
                            .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCapacidadeTanque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (verificaCampos())
        {
            Carro carro = new Carro();

            carro.setModelo(jtModelo.getText());
            carro.setMarca(jtMarca.getText());
            carro.setPlaca(jtPlaca.getText());
            carro.setCor(jtCor.getText());
            carro.setCapacidadeTanque(Integer.parseInt(jtCapacidadeTanque.getText()));
            
            if (dao.save(carro))
            {
                JOptionPane.showMessageDialog(rootPane, "Carro salvo com sucesso!");
                limpaCampos();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar carro.");
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                CadastroCarro.getInstance().setVisible(true);
            }
        });
    }

    public static CadastroCarro getInstance()
    {
        if(instance == null)
            instance =  new CadastroCarro();  

        return instance;
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCapacidadeTanque;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtCapacidadeTanque;
    private javax.swing.JTextField jtCor;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtPlaca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpaCampos()
    {
        jtMarca.setText("");
        jtModelo.setText("");
        jtPlaca.setText("");
        jtCor.setText("");
        jtCapacidadeTanque.setText("");
    }

    @Override
    public boolean verificaCampos() 
    {
        if (!CadastroUtil.VerificaCampoTexto(jtMarca))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a marca");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtModelo))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe o modelo");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoTexto(jtPlaca))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a placa");
            return false;
        }

        if (!CadastroUtil.VerificaCampoTexto(jtCor))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a cor");
            return false;
        }
        
        if (!CadastroUtil.VerificaCampoInt(jtCapacidadeTanque))
        {
            JOptionPane.showMessageDialog(rootPane, "Informe a capacidade do tanque");
            return false;
        }
        
        return true;
    }
}
