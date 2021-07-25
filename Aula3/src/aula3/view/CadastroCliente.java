package aula3.view;

import aula3.controller.Cliente;
import aula3.controller.Contato;
import aula3.controller.Endereco;
import aula3.controller.Estados;
import aula3.models.DAOCliente;
import javax.swing.JOptionPane;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente()
    {
        initComponents();
        populaEstados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtCidade = new javax.swing.JTextField();
        jbCidade = new javax.swing.JLabel();
        jbUF = new javax.swing.JLabel();
        jcUF = new javax.swing.JComboBox<>();
        jbSalvar = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlCPF = new javax.swing.JLabel();
        jtCPF = new javax.swing.JTextField();
        jbFone = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jtFone = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jbEmail = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        jbRua = new javax.swing.JLabel();
        jbNumero = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jbBairro = new javax.swing.JLabel();
        jbCEP = new javax.swing.JLabel();
        jtCEP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jbCidade.setText("Cidade");

        jbUF.setText("UF");

        jcUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a UF" }));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlNome.setText("Nome");

        jlCPF.setText("CPF");

        jbFone.setText("Fone");

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbEmail.setText("Email");

        jbRua.setText("Rua");

        jbNumero.setText("Número");

        jbBairro.setText("Bairro");

        jbCEP.setText("CEP");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbFone)
                                .addComponent(jlCPF)
                                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlNome)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                            .addComponent(jtRua, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jbRua))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbNumero)
                                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbCidade))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbUF)
                                        .addComponent(jcUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbBairro))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbCEP)
                                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbFone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbRua)
                            .addComponent(jbNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbUF)
                        .addGap(26, 26, 26)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (verificaCampos())
        {
            Cliente cliente = new Cliente(0);
            Endereco endereco = new Endereco();
            Contato contato = new Contato();
            
            cliente.setNome(jtNome.getText());
            cliente.setCpf(jtCPF.getText());
            
            contato.setFone(jtFone.getText());
            contato.setEmail(jtEmail.getText());
            cliente.setContato(contato);
            
            endereco.setRua(jtRua.getText());
            endereco.setNumero(Integer.parseInt(jtNumero.getText()));
            endereco.setCidade(jtCidade.getText());
            endereco.setBairro(jtBairro.getText());
            endereco.setCep(jtCEP.getText());
            endereco.setEstado(Estados.values()[jcUF.getSelectedIndex() - 1].name());
            cliente.setEndereco(endereco);
            
            if (DAOCliente.salvar(cliente))
            {
                JOptionPane.showMessageDialog(rootPane, "Cliente salvo com sucesso!");
                limparCampos();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar cliente.");
        }
        
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }
    
    private void limparCampos()
    {
        jtNome.setText("");
        jtCPF.setText("");
        
        jtFone.setText("");
        jtEmail.setText("");
        
        jtRua.setText("");
        jtNumero.setText("");
        jtBairro.setText("");
        jtCEP.setText("");
        jtCidade.setText("");
        jcUF.setSelectedIndex(0);
    }
    
    private boolean verificaCampos()
    {
        if (jtNome.getText().isEmpty())
        {
            jtNome.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o nome");
            return false;
        }
        
        if (jtCPF.getText().isEmpty())
        {
            jtCPF.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o CPF");
            return false;
        }
        
        if (jtFone.getText().isEmpty())
        {
            jtFone.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o telefone");
            return false;
        }
        
        if (jtEmail.getText().isEmpty())
        {
            jtEmail.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o email");
            return false;
        }
        
        if (jtRua.getText().isEmpty())
        {
            jtRua.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe a rua");
            return false;
        }

        try {
            Integer.parseInt(jtNumero.getText());
        } catch (NumberFormatException e) {
            jtNumero.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o número da rua");
            return false;
        }
        
        if (jtBairro.getText().isEmpty())
        {
            jtBairro.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o bairro");
            return false;
        }
        
        if (jtCEP.getText().isEmpty())
        {
            jtCEP.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe o CEP");
            return false;
        }
        
        if (jtCidade.getText().isEmpty())
        {
            jtCidade.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Informe a cidade");
            return false;
        }
        
        if (jcUF.getSelectedIndex() <= 0)
        {
            jcUF.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Selecione a UF");
            return false;
        }
        
        return true;
    }

    private void populaEstados()
    {
        jcUF.removeAllItems();
        
        jcUF.addItem("Selecione a UF");
        
        for (Estados estado : Estados.values())
            jcUF.addItem(estado.name());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jbBairro;
    private javax.swing.JLabel jbCEP;
    private javax.swing.JLabel jbCidade;
    private javax.swing.JLabel jbEmail;
    private javax.swing.JLabel jbFone;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jbNumero;
    private javax.swing.JLabel jbRua;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jbUF;
    private javax.swing.JComboBox<String> jcUF;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlNome;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCEP;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtFone;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtRua;
    // End of variables declaration//GEN-END:variables
}
