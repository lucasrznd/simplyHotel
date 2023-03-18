/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author LucasPC
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelRodape = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logoHotel = new javax.swing.JLabel();
        labelNomeHotel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelHorario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuHospedes = new javax.swing.JMenu();
        hospedeCadastrar = new javax.swing.JMenuItem();
        hospedeConsultar = new javax.swing.JMenuItem();
        menuQuartos = new javax.swing.JMenu();
        quartosCadastrar = new javax.swing.JMenuItem();
        quartosConsultar = new javax.swing.JMenuItem();
        menuReservas = new javax.swing.JMenu();
        reservaCadastrar = new javax.swing.JMenu();
        reservaConsultar = new javax.swing.JMenu();
        reservaFinalizar = new javax.swing.JMenu();
        menuFinanceiro = new javax.swing.JMenu();
        menuContasPagar = new javax.swing.JMenu();
        contaspagarCadastrar = new javax.swing.JMenuItem();
        contaspagarConsultar = new javax.swing.JMenuItem();
        menuContasrReceber = new javax.swing.JMenu();
        menuBalanco = new javax.swing.JMenu();
        MenuRelatorios = new javax.swing.JMenu();
        menuRelatorioFinanceiro = new javax.swing.JMenu();
        menuRelatorioReserva = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRodape.setText("simplyHotel - Desenvolvido para o Projeto Integrador III");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(labelRodape)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelRodape)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        logoHotel.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\logohotelpequena.png")); // NOI18N

        labelNomeHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeHotel.setText("simplyHotel");

        labelHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHorario.setText("Horário do Sistema");

        jLabel2.setText("Nome");

        jLabel3.setText("Usuário");

        jLabel4.setText("Cargo");

        jLabel5.setText("texto");

        jLabel6.setText("Grau de acesso");

        jLabel7.setText("texto");

        jLabel8.setText("Check-in de hóspedes");

        jLabel9.setText("Check-out de hóspedes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logoHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNomeHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(76, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(labelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCalendar2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoHotel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomeHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        menuCadastros.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\cadastro.png")); // NOI18N
        menuCadastros.setText("Cadastros");

        menuHospedes.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\hospede.png")); // NOI18N
        menuHospedes.setText("Hóspedes");

        hospedeCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\cadastrarr.png")); // NOI18N
        hospedeCadastrar.setText("Cadastrar");
        menuHospedes.add(hospedeCadastrar);

        hospedeConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\consultar.png")); // NOI18N
        hospedeConsultar.setText("Consultar");
        menuHospedes.add(hospedeConsultar);

        menuCadastros.add(menuHospedes);

        menuQuartos.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\quartos.png")); // NOI18N
        menuQuartos.setText("Quartos");

        quartosCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\cadastrarr.png")); // NOI18N
        quartosCadastrar.setText("Cadastrar");
        menuQuartos.add(quartosCadastrar);

        quartosConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\consultar.png")); // NOI18N
        quartosConsultar.setText("Consultar");
        quartosConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartosConsultarActionPerformed(evt);
            }
        });
        menuQuartos.add(quartosConsultar);

        menuCadastros.add(menuQuartos);

        jMenuBar1.add(menuCadastros);

        menuReservas.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\reserva.png")); // NOI18N
        menuReservas.setText("Reservas");

        reservaCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\reserva_cadastrar.png")); // NOI18N
        reservaCadastrar.setText("Cadastrar Reserva");
        menuReservas.add(reservaCadastrar);

        reservaConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\reserva_consultar.png")); // NOI18N
        reservaConsultar.setText("Consultar Reserva");
        menuReservas.add(reservaConsultar);

        reservaFinalizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\reserva_finalizar.png")); // NOI18N
        reservaFinalizar.setText("Finalizar Reserva");
        menuReservas.add(reservaFinalizar);

        jMenuBar1.add(menuReservas);

        menuFinanceiro.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\financeiro.png")); // NOI18N
        menuFinanceiro.setText("Financeiro");

        menuContasPagar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\contas_pagar.png")); // NOI18N
        menuContasPagar.setText("Contas a pagar");

        contaspagarCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\cadastrarr.png")); // NOI18N
        contaspagarCadastrar.setText("Cadastrar");
        menuContasPagar.add(contaspagarCadastrar);

        contaspagarConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\consultar.png")); // NOI18N
        contaspagarConsultar.setText("Consultar");
        menuContasPagar.add(contaspagarConsultar);

        menuFinanceiro.add(menuContasPagar);

        menuContasrReceber.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\contas_receber.png")); // NOI18N
        menuContasrReceber.setText("Contas a receber");
        menuFinanceiro.add(menuContasrReceber);

        menuBalanco.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\contas_balanco.png")); // NOI18N
        menuBalanco.setText("Balanço");
        menuFinanceiro.add(menuBalanco);

        jMenuBar1.add(menuFinanceiro);

        MenuRelatorios.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\relatorios.png")); // NOI18N
        MenuRelatorios.setText("Relátorios");

        menuRelatorioFinanceiro.setText("Financeiro");
        MenuRelatorios.add(menuRelatorioFinanceiro);

        menuRelatorioReserva.setText("Reserva");
        MenuRelatorios.add(menuRelatorioReserva);

        jMenuBar1.add(MenuRelatorios);

        menuSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\LucasPC\\Desktop\\Imagens\\icons\\sair.png")); // NOI18N
        menuSair.setText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSair.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                menuSairMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(616, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quartosConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartosConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quartosConsultarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSairMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_menuSairMenuKeyPressed
        
        System.exit(0);
        
    }//GEN-LAST:event_menuSairMenuKeyPressed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenuItem contaspagarCadastrar;
    private javax.swing.JMenuItem contaspagarConsultar;
    private javax.swing.JMenuItem hospedeCadastrar;
    private javax.swing.JMenuItem hospedeConsultar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JLabel labelNomeHotel;
    private javax.swing.JLabel labelRodape;
    private javax.swing.JLabel logoHotel;
    private javax.swing.JMenu menuBalanco;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuContasPagar;
    private javax.swing.JMenu menuContasrReceber;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu menuHospedes;
    private javax.swing.JMenu menuQuartos;
    private javax.swing.JMenu menuRelatorioFinanceiro;
    private javax.swing.JMenu menuRelatorioReserva;
    private javax.swing.JMenu menuReservas;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem quartosCadastrar;
    private javax.swing.JMenuItem quartosConsultar;
    private javax.swing.JMenu reservaCadastrar;
    private javax.swing.JMenu reservaConsultar;
    private javax.swing.JMenu reservaFinalizar;
    // End of variables declaration//GEN-END:variables
}
