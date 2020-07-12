
package postogasolina;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import postogasolina.ValidaCPF;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import awtextra.AbsoluteConstraints;
import awtextra.AbsoluteLayout;

public class HomeFrame extends JFrame{

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAbastecer;
    private JButton btnAtualizarA;
    private JButton btnAtualizarEstoque;
    private JButton btnCadCliente;
    private JButton btnCadUsuario;
    private JButton btnRegVenda;
    private JButton btnAbastecerGA;
    private JButton btnAbastecerGC;
    private JButton btnAbastecerGNV;
    private JButton btnAbastecerGP;
    private JButton btnAbastecerS10;
    private JButton btnAbastecerS50;
    private JButton btnUsuariosCad;
    private JComboBox<String> cbCombustivel;
    private JComboBox<String> cbNvAcesso;
    private JComboBox<String> cbPagamentoVender;
    private JComboBox<String> cbProdutoVender;
    private JComboBox<String> cbSexo;
    private JComboBox<String> cbClienteVender;
    private JComboBox<String> cbVendedorVender;
    private Box.Filler filler1;
    private JMenuItem itemSair;
    private JMenuItem itemTrocar;
    private JMenuBar menuBar;
    private JScrollPane scrollPane;
    private JLabel lbClienteVender;
    private JLabel lbCombAbastecer;
    private JLabel lbCpfCliente;
    private JLabel lbCpfUsuario;
    private JLabel lbDataCliente;
    private JLabel lbDataUsuario;
    private JLabel lbDataVender;
    private JLabel lbMatricUsuario;
    private JLabel lbNivelComb;
    private JLabel lbNomeCliente;
    private JLabel lbNomeUsuario;
    private JLabel lbNvAcessoUsuario;
    private JLabel lbPagamentoVender;
    private JLabel lbProdutoVender;
    private JLabel lbQtdeAbastecer;
    private JLabel lbQtdGA;
    private JLabel lbQtdGC;
    private JLabel lbQtdGNV;
    private JLabel lbQtdGP;
    private JLabel lbQtdS10;
    private JLabel lbQtdS50;
    private JLabel lbQtdeVender;
    private JLabel lbSenhaUsuario;
    private JLabel lbSexo;
    private JLabel lbVendedorVender;
    private JMenu menuOpcoes;
    private JPanel panelAbastecer;
    private JPanel panelClientes;
    private JPanel panelD50;
    private JPanel panelEstoque;
    private JPanel panelGA;
    private JPanel panelGC;
    private JPanel panelGNV;
    private JPanel panelGP;
    private JPanel panelS10;
    private JPanel panelUsuarios;
    private JPanel panelVender;
    private JProgressBar pbNivelComb;
    private JTabbedPane tabbedPane;
    private JTable tableVender;
    private JTable tableUsuarios;
    private JTable tableClientes;
    private JFormattedTextField txtCpfCliente;
    private JFormattedTextField txtCpfUsuario;
    private JFormattedTextField txtDataCliente;
    private JFormattedTextField txtDataUsuario;
    private JFormattedTextField txtDataVender;
    private JTextField txtMatricUsuario;
    private JTextField txtNomeCliente;
    private JTextField txtNomeUsuario;
    private JTextField txtQtdeAbastecer;
    private JTextField txtQtdeVender;
    private JPasswordField txtSenhaUsuario;
    
    private ResultSet rs;
    private byte[] imgperfil;
    private JButton btnClientesCad;
    private JFormattedTextField txtGcEstoque;
    private JFormattedTextField txtGaEstoque;
    private JFormattedTextField txtGpEstoque;
    private JFormattedTextField txtS10Estoque;
    private JFormattedTextField txtS50Estoque;
    private JFormattedTextField txtGnvEstoque;
    private JPasswordField txtSenhaUsuario2;
    private JTextField txtprecods10;
    private JTextField txtprecods50;
    private JTextField txtprecognv;
    private JTextField txtprecoga;
    private JLabel label_3;
    private JTextField txtprecogp;
    private JLabel label_4;
    private JTextField txtprecogc;
    private JLabel label_2;
    // End of variables declaration//GEN-END:variables

	
    public HomeFrame() {
    	setPreferredSize(new Dimension(602, 420));
       initComponents();
       setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(new Color(255, 255, 255));
        tabbedPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        tableUsuarios = new JTable();
        new JScrollPane();
        //panelClientes variables
        panelClientes = new JPanel();
        lbNomeCliente = new JLabel();
        lbDataCliente = new JLabel();
        lbCpfCliente = new JLabel();
        txtNomeCliente = new JTextField();
        txtNomeCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        txtCpfCliente = new JFormattedTextField();
        txtCpfCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        btnCadCliente = new JButton();
        txtDataCliente = new JFormattedTextField();
        txtDataCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        tableClientes = new JTable();
        //panelVender variables
        panelVender = new JPanel();
        lbQtdeVender = new JLabel();
        lbClienteVender = new JLabel();
        lbProdutoVender = new JLabel();
        lbVendedorVender = new JLabel();
        lbPagamentoVender = new JLabel();
        txtQtdeVender = new JTextField();
        txtQtdeVender.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        cbClienteVender = new JComboBox<>();
        cbProdutoVender = new JComboBox<>();
        cbVendedorVender = new JComboBox<>();
        cbPagamentoVender = new JComboBox<>();
        scrollPane = new JScrollPane();
        tableVender = new JTable();
        btnRegVenda = new JButton();
        lbDataVender = new JLabel();
        txtDataVender = new JFormattedTextField();
        txtDataVender.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        //panelAbastecer variables
        panelAbastecer = new JPanel();
        cbCombustivel = new JComboBox<>();
        lbNivelComb = new JLabel();
        lbQtdeAbastecer = new JLabel();
        txtQtdeAbastecer = new JTextField();
        btnAbastecer = new JButton();
        lbCombAbastecer = new JLabel();
        pbNivelComb = new JProgressBar();
        btnAtualizarA = new JButton();
        //panelEstoque variables
        panelEstoque = new JPanel();
        btnAtualizarEstoque = new JButton();
        panelGC = new JPanel();
        btnAbastecerGC = new JButton();
        lbQtdGC = new JLabel();
        panelGA = new JPanel();
        lbQtdGA = new JLabel();
        btnAbastecerGA = new JButton();
        panelGP = new JPanel();
        lbQtdGP = new JLabel();
        btnAbastecerGP = new JButton();
        panelS10 = new JPanel();
        lbQtdS10 = new JLabel();
        btnAbastecerS10 = new JButton();
        panelD50 = new JPanel();
        lbQtdS50 = new JLabel();
        btnAbastecerS50 = new JButton();
        panelGNV = new JPanel();
        btnAbastecerGNV = new JButton();
        lbQtdGNV = new JLabel();
        //menu variables
        filler1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        menuBar = new JMenuBar();
        menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
        menuOpcoes = new JMenu();
        menuOpcoes.setFont(UIManager.getFont("MenuBar.font"));
        itemTrocar = new JMenuItem();
        itemTrocar.setBorder(null);
        itemTrocar.setFont(UIManager.getFont("MenuItem.font"));
        itemSair = new JMenuItem();
        itemSair.setBorder(null);
        itemSair.setFont(UIManager.getFont("MenuItem.font"));
 

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());
        
        tableUsuarios.setModel(new DefaultTableModel(
                new Object [][] {  
                    //{null, null, null, null, null, null, null},
                    //{null, null, null, null, null, null, null}
                },
                new String [] {
                    "Matricula", "NvAcesso", "Nome", "CPF", "DataNasc", "Sexo"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, true, true, true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });

        lbNomeCliente.setText("Nome Completo");

        lbDataCliente.setText("Data de Nascimento");

        lbCpfCliente.setText("CPF");

        btnCadCliente.setText("Cadastrar");
        btnCadCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadClienteActionPerformed(e);
			}
        	
        });

        try {
            txtDataCliente.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        try {
            txtCpfCliente.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        
        btnClientesCad = new JButton("Clientes Cadastrados");
        btnClientesCad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnClientesCad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btnClientesCadActionPerformed(e);
				
			}
        	
        });

        tableClientes.setModel(new DefaultTableModel(
                new Object [][] {
                    //{null, null, null, null, null, null, null},
                    //{null, null, null, null, null, null, null}
                },
                new String [] {
                    "Matricula", "Nome", "CPF", "DataNasc", "Abastecimentos"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, true, true, true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        //panelUsuario variables
        panelUsuarios = new JPanel();
        btnCadUsuario = new JButton();
        btnUsuariosCad = new JButton();
        btnUsuariosCad.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtNomeUsuario = new JTextField();
        txtNomeUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        lbNomeUsuario = new JLabel();
        lbDataUsuario = new JLabel();
        lbCpfUsuario = new JLabel();
        lbMatricUsuario = new JLabel();
        cbNvAcesso = new JComboBox<>();
        txtCpfUsuario = new JFormattedTextField();
        txtCpfUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        txtMatricUsuario = new JTextField();
        txtMatricUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        lbNvAcessoUsuario = new JLabel();
        lbSenhaUsuario = new JLabel();
        txtSenhaUsuario = new JPasswordField();
        txtSenhaUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        lbSexo = new JLabel();
        cbSexo = new JComboBox<>();
        cbSexo.setBorder(new EmptyBorder(0, 0, 0, 0));
        txtDataUsuario = new JFormattedTextField();
        txtDataUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        
        btnCadUsuario.setText("Cadastrar");
        btnCadUsuario.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadUsuarioActionPerformed(e);
				
			}
        });
                
        lbNomeUsuario.setText("Nome Completo");
        lbDataUsuario.setText("Data de Nascimento");
        lbCpfUsuario.setText("CPF");
        lbMatricUsuario.setText("Matricula");
        cbNvAcesso.setModel(new DefaultComboBoxModel<>(new String[] { "Funcionário", "Administrador", "Gerente" }));
        cbNvAcesso.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lbNvAcessoUsuario.setText("Nível de acesso");
                                                                                        
        lbSenhaUsuario.setText("Senha");
        
                lbSexo.setText("Sexo");
                
                        cbSexo.setModel(new DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
                        cbSexo.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        try {
							txtDataUsuario.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                        try {
							txtCpfUsuario.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                        
                                //tableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(200);
                                
                                btnUsuariosCad.setText("Usuários Cadastrados");
                                btnUsuariosCad.addActionListener(new ActionListener() {
                                	
                                	public void actionPerformed(ActionEvent e) {
                                		btnUsuariosCadActionPerformed(e);
                                		
                                	}
                                });
                                
                                JLabel lbSenhaUsuario2 = new JLabel("Confirme a senha");
                                
                                txtSenhaUsuario2 = new JPasswordField();
                                txtSenhaUsuario2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
                                
                                        GroupLayout panelUsuariosLayout = new GroupLayout(panelUsuarios);
                                        panelUsuariosLayout.setHorizontalGroup(
                                        	panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        		.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        			.addContainerGap()
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        				.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        						.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        							.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        								.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        									.addComponent(txtSenhaUsuario, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        									.addComponent(lbNomeUsuario)
                                        									.addComponent(txtNomeUsuario, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        									.addComponent(lbDataUsuario)
                                        									.addComponent(txtDataUsuario, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        								.addGap(31))
                                        							.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        								.addComponent(cbNvAcesso, 0, 107, Short.MAX_VALUE)
                                        								.addGap(39)))
                                        						.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        							.addComponent(lbNvAcessoUsuario)
                                        							.addGap(57)))
                                        					.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        						.addComponent(lbSenhaUsuario)
                                        						.addPreferredGap(ComponentPlacement.RELATED)))
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addComponent(btnCadUsuario, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        					.addGap(48)))
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        				.addComponent(lbSexo)
                                        				.addComponent(cbSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        				.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING, false)
                                        					.addComponent(txtSenhaUsuario2)
                                        					.addComponent(txtCpfUsuario, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        					.addComponent(lbMatricUsuario)
                                        					.addComponent(txtMatricUsuario, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        					.addComponent(lbSenhaUsuario2))
                                        				.addComponent(lbCpfUsuario)
                                        				.addComponent(btnUsuariosCad))
                                        			.addContainerGap(302, Short.MAX_VALUE))
                                        );
                                        panelUsuariosLayout.setVerticalGroup(
                                        	panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        		.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        			.addContainerGap()
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        				.addComponent(lbNomeUsuario)
                                        				.addComponent(lbCpfUsuario))
                                        			.addGap(6)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        				.addComponent(txtCpfUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        				.addComponent(txtNomeUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addGap(11)
                                        					.addComponent(lbMatricUsuario))
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                        					.addComponent(lbDataUsuario)))
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addGap(6)
                                        					.addComponent(txtMatricUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                        					.addComponent(txtDataUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        			.addGap(23)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                        					.addComponent(lbSenhaUsuario)
                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        						.addComponent(txtSenhaUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        						.addComponent(txtSenhaUsuario2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        				.addComponent(lbSenhaUsuario2))
                                        			.addGap(5)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        				.addComponent(lbNvAcessoUsuario)
                                        				.addComponent(lbSexo))
                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        				.addComponent(cbNvAcesso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        				.addComponent(cbSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        			.addGap(64)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        				.addComponent(btnCadUsuario)
                                        				.addComponent(btnUsuariosCad))
                                        			.addContainerGap(81, Short.MAX_VALUE))
                                        );
                                        panelUsuarios.setLayout(panelUsuariosLayout);
                                        
                                                tabbedPane.addTab("Usuários", panelUsuarios);

        GroupLayout panelClientesLayout = new GroupLayout(panelClientes);
        panelClientesLayout.setHorizontalGroup(
        	panelClientesLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelClientesLayout.createSequentialGroup()
        			.addGroup(panelClientesLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelClientesLayout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(panelClientesLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(lbNomeCliente)
        						.addComponent(txtNomeCliente, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        						.addComponent(lbDataCliente)
        						.addComponent(lbCpfCliente)
        						.addComponent(txtCpfCliente, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        						.addComponent(btnCadCliente, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        					.addGap(35)
        					.addComponent(btnClientesCad))
        				.addGroup(panelClientesLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(txtDataCliente, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(287, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
        	panelClientesLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelClientesLayout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(lbNomeCliente)
        			.addGap(6)
        			.addComponent(txtNomeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(lbDataCliente)
        			.addGap(6)
        			.addComponent(txtDataCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lbCpfCliente)
        			.addGap(4)
        			.addComponent(txtCpfCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(64)
        			.addGroup(panelClientesLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCadCliente)
        				.addComponent(btnClientesCad))
        			.addContainerGap(49, Short.MAX_VALUE))
        );
        panelClientes.setLayout(panelClientesLayout);

        tabbedPane.addTab("Clientes", panelClientes);

        lbQtdeVender.setText("Quantidade");

        lbClienteVender.setText("Cliente");

        lbProdutoVender.setText("Produto");

        lbVendedorVender.setText("Vendedor");

        lbPagamentoVender.setText("Forma de Pagamento");

        //cbProdutoVender.setModel(new DefaultComboBoxModel(new String[] {"Gasolina Comum", "Gasolina Aditivada", "Gasolina Premium", "Álcool Hidratado", "Diesel S10", "Diesel S50", "Gás Natural Veicular"}));
        cbProdutoVender.setModel(new DefaultComboBoxModel(new String[] {"GC", "GA", "GP", "AH", "DS10", "DS50", "GNV"}));
        cbProdutoVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        cbVendedorVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        DefaultComboBoxModel dftm = (DefaultComboBoxModel)cbVendedorVender.getModel();
        ArrayList<Funcionario> vendedores = vendedorList();
        Object[] row2 = new Object[1];
        for (int i = 0; i < vendedores.size(); i++) {
            row2[0] = vendedores.get(i).getNome();
            dftm.addElement(row2);
        }

        cbPagamentoVender.setModel(new DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão de crédito", "Cartão de débito" }));
        cbPagamentoVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        cbClienteVender.setModel(new DefaultComboBoxModel<>(new String[] { "Não cadastrado"}));
        cbClienteVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        DefaultComboBoxModel dftm2 = (DefaultComboBoxModel)cbVendedorVender.getModel();
        ArrayList<Cliente> clientes = clienteList();
        Object[] row3 = new Object[1];
        for (int i = 0; i < clientes.size(); i++) {
            row3[0] = clientes.get(i).getNome();
            dftm2.addElement(row3);
        }

        tableVender.setModel(new DefaultTableModel(
            new Object [][] {
                //{null, null, null, null, null, null},
                //{null, null, null, null, null, null}
            },
            new String [] {
                "Vendedor", "Cliente", "Produto", "Qtd", "Forma Pagamento", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        atualizarVendas();
        
        scrollPane.setViewportView(tableVender);

        btnRegVenda.setText("Registrar Venda");
        btnRegVenda.setFont(new Font("Monospace", 1, 10));
        btnRegVenda.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btnRegVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent par) {
				btnRegVendaActionPerformed(par);
				
			}
		});

        lbDataVender.setText("Data");

        try {
            txtDataVender.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        GroupLayout panelVenderLayout = new GroupLayout(panelVender);
        panelVenderLayout.setHorizontalGroup(
        	panelVenderLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelVenderLayout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelVenderLayout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(cbClienteVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(cbProdutoVender, 0, GroupLayout.DEFAULT_SIZE, 122))
        				.addComponent(lbProdutoVender)
        				.addComponent(lbClienteVender))
        			.addGap(15)
        			.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelVenderLayout.createSequentialGroup()
        					.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtQtdeVender, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbQtdeVender, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        					.addGap(31)
        					.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtDataVender, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbDataVender)))
        				.addGroup(panelVenderLayout.createSequentialGroup()
        					.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(cbPagamentoVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbPagamentoVender, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
        					.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbVendedorVender)
        						.addGroup(panelVenderLayout.createSequentialGroup()
        							.addComponent(cbVendedorVender, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        							.addGap(15)
        							.addComponent(btnRegVenda, 120, 120, 120)))))
        			.addContainerGap(63, Short.MAX_VALUE))
        		.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        panelVenderLayout.setVerticalGroup(
        	panelVenderLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelVenderLayout.createSequentialGroup()
        			.addGap(12)
        			.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lbClienteVender)
        				.addGroup(panelVenderLayout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(lbQtdeVender)
        					.addComponent(lbDataVender)))
        			.addGap(6)
        			.addGroup(panelVenderLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbClienteVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtQtdeVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtDataVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(panelVenderLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelVenderLayout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(lbPagamentoVender)
        					.addComponent(lbVendedorVender))
        				.addComponent(lbProdutoVender))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelVenderLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cbProdutoVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbPagamentoVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cbVendedorVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnRegVenda))
        			.addGap(31)
        			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        			.addContainerGap())
        );
        panelVender.setLayout(panelVenderLayout);

        tabbedPane.addTab("Vender", panelVender);

        cbCombustivel.setModel(new DefaultComboBoxModel<>(new String[] { "Gasolina Comum", "Gasolina Aditivada", "Gasolina Premium", "Diesel S10", "Diesel S50", "Gás Natural Veicular" }));
       
        cbCombustivel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lbNivelComb.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        lbNivelComb.setText("Nível de Combustível: 0% de 0%");

        lbQtdeAbastecer.setText("Quantidade");

        btnAbastecer.setText("Abastecer");
        btnAbastecer.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lbCombAbastecer.setText("Combustível");

        btnAtualizarA.setText("Atualizar");
        btnAtualizarA.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //
        GroupLayout panelAbastecerLayout = new GroupLayout(panelAbastecer);
        panelAbastecer.setLayout(panelAbastecerLayout);
        panelAbastecerLayout.setHorizontalGroup(
            panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelAbastecerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAbastecerLayout.createSequentialGroup()
                        .addComponent(lbNivelComb)
                        .addGap(97, 97, 97)
                        .addComponent(lbCombAbastecer, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCombustivel, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelAbastecerLayout.createSequentialGroup()
                            .addComponent(btnAtualizarA)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAbastecer, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panelAbastecerLayout.createSequentialGroup()
                            .addComponent(pbNivelComb, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(lbQtdeAbastecer, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQtdeAbastecer, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelAbastecerLayout.setVerticalGroup(
            panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelAbastecerLayout.createSequentialGroup()
                .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelAbastecerLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbNivelComb))
                    .addGroup(panelAbastecerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCombAbastecer)
                            .addComponent(cbCombustivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pbNivelComb, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQtdeAbastecer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbQtdeAbastecer)))
                .addGap(18, 18, 18)
                .addGroup(panelAbastecerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbastecer)
                    .addComponent(btnAtualizarA)))
        );
       
        btnAtualizarEstoque.setText("Atualizar Estoque");
        btnAtualizarEstoque.setCursor(new Cursor(Cursor.HAND_CURSOR));

        panelGC.setBorder(BorderFactory.createTitledBorder("Gasolina Comum"));

        btnAbastecerGC.setText("Abastecer");
        btnAbastecerGC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btnAbastecerGC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAbastecerGCActionPerformed(e);
				
			}
        });
        
        btnAbastecerGA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnAbastecerGAActionPerformed(e);
				
			}
        });
        
        btnAbastecerGP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAbastecerGPActionPerformed(e);
				
			}
        });
        
        btnAbastecerS10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnAbastecerS10ActionPerformed(e);
				
			}
        });
        
        btnAbastecerS50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnAbastecerS50ActionPerformed(e);
				
			}
        });
        
        btnAbastecerGNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnAbastecerGNVActionPerformed(e);
				
			}
        });

        lbQtdGC.setText("Litros");
        
        txtGcEstoque = new JFormattedTextField();
        txtGcEstoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGcEstoque.setText("Atualize");
        txtGcEstoque.setEditable(false);
        
        JButton btnPrecoGC = new JButton("Atualizar preço");
        btnPrecoGC.setPreferredSize(new Dimension(105, 20));
        
        txtprecogc = new JTextField();
        txtprecogc.setText("Atualize");
        txtprecogc.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprecogc.setEditable(false);
        txtprecogc.setColumns(10);
        
        label_2 = new JLabel("Preço");
        
        btnPrecoGC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				btnPrecoGCActionPerformed(e);
				
			}	
        });

        GroupLayout panelGCLayout = new GroupLayout(panelGC);
        panelGCLayout.setHorizontalGroup(
        	panelGCLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGCLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGCLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelGCLayout.createSequentialGroup()
        					.addComponent(txtGcEstoque, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        					.addGap(10)
        					.addComponent(lbQtdGC)
        					.addGap(27))
        				.addGroup(panelGCLayout.createSequentialGroup()
        					.addComponent(txtprecogc, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addGap(4)
        					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(23, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, panelGCLayout.createSequentialGroup()
        					.addGroup(panelGCLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btnPrecoGC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        						.addComponent(btnAbastecerGC, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        					.addGap(31))))
        );
        panelGCLayout.setVerticalGroup(
        	panelGCLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGCLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGCLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGcEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGC))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelGCLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtprecogc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGCLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(label_2)))
        			.addGap(18, 18, Short.MAX_VALUE)
        			.addComponent(btnAbastecerGC, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnPrecoGC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        panelGC.setLayout(panelGCLayout);

        panelGA.setBorder(BorderFactory.createTitledBorder("Gasolina Aditivada"));
        panelGA.setPreferredSize(new Dimension(170, 110));

        lbQtdGA.setText("Litros");

        btnAbastecerGA.setText("Abastecer");
        btnAbastecerGA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        txtGaEstoque = new JFormattedTextField();
        txtGaEstoque.setText("Atualize");
        txtGaEstoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGaEstoque.setEditable(false);
        
        JButton btnPrecoGA = new JButton("Atualizar preço");
        btnPrecoGA.setPreferredSize(new Dimension(105, 20));
        
        txtprecoga = new JTextField();
        txtprecoga.setText("Atualize");
        txtprecoga.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprecoga.setEditable(false);
        txtprecoga.setColumns(10);
        
        label_3 = new JLabel("Preço");
        
        btnPrecoGA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				btnPrecoGAActionPerformed(e);
				
			}	
        });

        GroupLayout panelGALayout = new GroupLayout(panelGA);
        panelGALayout.setHorizontalGroup(
        	panelGALayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGALayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGALayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnAbastecerGA, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPrecoGA, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGALayout.createSequentialGroup()
        					.addGroup(panelGALayout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(txtprecoga)
        						.addComponent(txtGaEstoque, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelGALayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbQtdGA))))
        			.addContainerGap(49, Short.MAX_VALUE))
        );
        panelGALayout.setVerticalGroup(
        	panelGALayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGALayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGALayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGaEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGA))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelGALayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtprecoga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label_3))
        			.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
        			.addComponent(btnAbastecerGA, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnPrecoGA, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        panelGA.setLayout(panelGALayout);

        panelGP.setBorder(BorderFactory.createTitledBorder("Gasolina Premium"));

        lbQtdGP.setText("Litros");

        btnAbastecerGP.setText("Abastecer");
        btnAbastecerGP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        txtGpEstoque = new JFormattedTextField();
        txtGpEstoque.setText("Atualize");
        txtGpEstoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGpEstoque.setEditable(false);
        
        JButton btnPrecoGP = new JButton("Atualizar preço");
        btnPrecoGP.setPreferredSize(new Dimension(105, 20));
        
        txtprecogp = new JTextField();
        txtprecogp.setText("Atualize");
        txtprecogp.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprecogp.setEditable(false);
        txtprecogp.setColumns(10);
        
        label_4 = new JLabel("Preço");
        
        btnPrecoGP.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				btnPrecoGPActionPerformed(e);
				
			}	
        });

        GroupLayout panelGPLayout = new GroupLayout(panelGP);
        panelGPLayout.setHorizontalGroup(
        	panelGPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGPLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(btnPrecoGP, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnAbastecerGP, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGPLayout.createSequentialGroup()
        					.addGroup(panelGPLayout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(txtprecogp)
        						.addComponent(txtGpEstoque, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelGPLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbQtdGP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        			.addContainerGap(36, Short.MAX_VALUE))
        );
        panelGPLayout.setVerticalGroup(
        	panelGPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGPLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGpEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGP))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelGPLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtprecogp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label_4))
        			.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
        			.addComponent(btnAbastecerGP, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnPrecoGP, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        panelGP.setLayout(panelGPLayout);

        panelS10.setBorder(BorderFactory.createTitledBorder("Diesel S10"));

        lbQtdS10.setText("Litros");

        btnAbastecerS10.setText("Abastecer");
        btnAbastecerS10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        txtS10Estoque = new JFormattedTextField();
        txtS10Estoque.setText("Atualize");
        txtS10Estoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtS10Estoque.setEditable(false);
        
        JButton btnPrecoDS10 = new JButton("Atualizar preço");
        btnPrecoDS10.setPreferredSize(new Dimension(105, 20));
        
        txtprecods10 = new JTextField();
        txtprecods10.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprecods10.setEditable(false);
        txtprecods10.setText("Atualize");
        txtprecods10.setColumns(10);
        
        JLabel lbPrecoGC = new JLabel("Preço");
        
        btnPrecoDS10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				btnPrecoDS10ActionPerformed(e);
				
			}	
        });

        GroupLayout panelS10Layout = new GroupLayout(panelS10);
        panelS10Layout.setHorizontalGroup(
        	panelS10Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelS10Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelS10Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnPrecoDS10, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelS10Layout.createSequentialGroup()
        					.addGroup(panelS10Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txtprecods10, 0, 0, Short.MAX_VALUE)
        						.addComponent(txtS10Estoque, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        					.addGap(5)
        					.addGroup(panelS10Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lbQtdS10)
        						.addGroup(panelS10Layout.createSequentialGroup()
        							.addComponent(lbPrecoGC)
        							.addPreferredGap(ComponentPlacement.UNRELATED))))
        							//.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        				.addComponent(btnAbastecerS10, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(36, Short.MAX_VALUE))
        );
        panelS10Layout.setVerticalGroup(
        	panelS10Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelS10Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelS10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtS10Estoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdS10))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelS10Layout.createParallelGroup(Alignment.BASELINE)
        				//.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtprecods10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbPrecoGC))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnAbastecerS10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        			.addComponent(btnPrecoDS10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        panelS10.setLayout(panelS10Layout);

        panelD50.setBorder(BorderFactory.createTitledBorder("Diesel S50"));

        lbQtdS50.setText("Litros");

        btnAbastecerS50.setText("Abastecer");
        btnAbastecerS50.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        txtS50Estoque = new JFormattedTextField();
        txtS50Estoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtS50Estoque.setText("Atualize");
        txtS50Estoque.setEditable(false);
        
        JButton btnPrecoDS50 = new JButton("Atualizar preço");
        btnPrecoDS50.setPreferredSize(new Dimension(105, 20));
        
        txtprecods50 = new JTextField();
        txtprecods50.setText("Atualize");
        txtprecods50.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprecods50.setEditable(false);
        txtprecods50.setColumns(10);
        
        JLabel label = new JLabel("Preço");
        
        btnPrecoDS50.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				btnPrecoDS50ActionPerformed(e);
				
			}	
        });

        GroupLayout panelD50Layout = new GroupLayout(panelD50);
        panelD50Layout.setHorizontalGroup(
        	panelD50Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelD50Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelD50Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnAbastecerS50, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPrecoDS50, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelD50Layout.createSequentialGroup()
        					.addGroup(panelD50Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(txtS50Estoque)
        						.addComponent(txtprecods50, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelD50Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(label, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        						.addComponent(lbQtdS50))))
        			.addGap(52))
        );
        panelD50Layout.setVerticalGroup(
        	panelD50Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelD50Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelD50Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtS50Estoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdS50))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelD50Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtprecods50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label))
        			.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
        			.addComponent(btnAbastecerS50, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnPrecoDS50, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        panelD50.setLayout(panelD50Layout);

        panelGNV.setBorder(BorderFactory.createTitledBorder("Gás Natural Veicular"));

        btnAbastecerGNV.setText("Abastecer");
        btnAbastecerGNV.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lbQtdGNV.setText("Kg");
        
        txtGnvEstoque = new JFormattedTextField();
        txtGnvEstoque.setText("Atualize");
        txtGnvEstoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGnvEstoque.setEditable(false);
        
        JButton btnPrecoGNV = new JButton("Atualizar preço");
        btnPrecoGNV.setPreferredSize(new Dimension(105, 20));
        
        txtprecognv = new JTextField();
        txtprecognv.setText("Atualize");
        txtprecognv.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprecognv.setEditable(false);
        txtprecognv.setColumns(10);
        
        JLabel label_1 = new JLabel("Preço");
        
        btnPrecoGNV.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				btnPrecoGNVActionPerformed(e);
				
			}	
        });

        GroupLayout panelGNVLayout = new GroupLayout(panelGNV);
        panelGNVLayout.setHorizontalGroup(
        	panelGNVLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGNVLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGNVLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(btnAbastecerGNV, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPrecoGNV, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGNVLayout.createSequentialGroup()
        					.addGroup(panelGNVLayout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(txtGnvEstoque)
        						.addComponent(txtprecognv, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelGNVLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lbQtdGNV))))
        			.addContainerGap(44, Short.MAX_VALUE))
        );
        panelGNVLayout.setVerticalGroup(
        	panelGNVLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGNVLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGNVLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGnvEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGNV))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelGNVLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtprecognv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(label_1))
        			.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
        			.addComponent(btnAbastecerGNV, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnPrecoGNV, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        panelGNV.setLayout(panelGNVLayout);
        
        btnAtualizarEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BancoPosto Conexao = new BancoPosto();
		    	
		    	if (!Conexao.getConnection()) {
					JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
					System.exit(0);
				}else {
					try {
				        		
				        PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT SUM(Qtd) AS SUMGC FROM Estoque WHERE Combustivel = 'GC'");
				        rs = st.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGC");
				        	txtGcEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(Qtd) AS SUMGA FROM Estoque WHERE Combustivel = 'GA'");
				        rs = st2.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGA");
				        	txtGaEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st3 = BancoPosto.connection.prepareStatement("SELECT SUM(Qtd) AS SUMGP FROM Estoque WHERE Combustivel = 'GP'");
				        rs = st3.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGP");
				        	txtGpEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st4 = BancoPosto.connection.prepareStatement("SELECT SUM(Qtd) AS SUMDS10 FROM Estoque WHERE Combustivel = 'DS10'");
				        rs = st4.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMDS10");
				        	txtS10Estoque.setText(""+soma);
				        }
				        
				        PreparedStatement st5 = BancoPosto.connection.prepareStatement("SELECT SUM(Qtd) AS SUMDS50 FROM Estoque WHERE Combustivel = 'DS50'");
				        rs = st5.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMDS50");
				        	txtS50Estoque.setText(""+soma);
				        }
				        
				        PreparedStatement st6 = BancoPosto.connection.prepareStatement("SELECT SUM(Qtd) AS SUMGNV FROM Estoque WHERE Combustivel = 'GNV'");
				        rs = st6.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGNV");
				        	txtGnvEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st7 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GC'");
				        rs = st7.executeQuery();

				        if(rs.next()) {
				        	txtprecogc.setText(""+rs.getFloat("Preco"));
				        }
				        
				        PreparedStatement st8 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GA'");
				        rs = st8.executeQuery();

				        if(rs.next()) {
				        	txtprecoga.setText(""+rs.getFloat("Preco"));
				        }
				        
				        PreparedStatement st9 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GP'");
				        rs = st9.executeQuery();

				        if(rs.next()) {
				        	txtprecogp.setText(""+rs.getFloat("Preco"));
				        }
				        
				        PreparedStatement st10 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'DS10'");
				        rs = st10.executeQuery();

				        if(rs.next()) {
				        	txtprecods10.setText(""+rs.getFloat("Preco"));
				        }
				        
				        PreparedStatement st11 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'DS50'");
				        rs = st11.executeQuery();

				        if(rs.next()) {
				        	txtprecods50.setText(""+rs.getFloat("Preco"));
				        }
				        
				        PreparedStatement st12 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GNV'");
				        rs = st12.executeQuery();

				        if(rs.next()) {
				        	txtprecognv.setText(""+rs.getFloat("Preco"));
				        }
				        
				        JOptionPane.showMessageDialog(null, "Estoque atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				        		
				    }catch(Exception f) {
				        f.printStackTrace();
				        JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
				    }
				}	
			}	
        });

        GroupLayout panelEstoqueLayout = new GroupLayout(panelEstoque);
        panelEstoqueLayout.setHorizontalGroup(
        	panelEstoqueLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelEstoqueLayout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(panelEstoqueLayout.createSequentialGroup()
        					.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(panelEstoqueLayout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
        							.addComponent(panelGC, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
        						.addComponent(panelS10, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(panelD50, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
        						.addComponent(panelGA, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(panelEstoqueLayout.createSequentialGroup()
        							.addGap(2)
        							.addComponent(panelGNV, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
        						.addGroup(panelEstoqueLayout.createSequentialGroup()
        							.addGap(6)
        							.addComponent(panelGP, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
        					.addGap(16))
        				.addGroup(panelEstoqueLayout.createSequentialGroup()
        					.addComponent(btnAtualizarEstoque)
        					.addGap(36))))
        );
        panelEstoqueLayout.setVerticalGroup(
        	panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelEstoqueLayout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.BASELINE, false)
        				.addComponent(panelGC, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelGA, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelGP, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
        			.addGap(11)
        			.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(panelGNV, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelD50, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelS10, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(btnAtualizarEstoque)
        			.addGap(18))
        );
        
        panelEstoque.setLayout(panelEstoqueLayout);

        tabbedPane.addTab("Estoque", panelEstoque);

        //getContentPane().add(tabbedPane, new AbsoluteConstraints(0, 0, 570, 310));
        getContentPane().add(tabbedPane, new AbsoluteConstraints(0, 0, 600, 400));
        getContentPane().add(filler1, new AbsoluteConstraints(0, 0, -1, -1));

        menuBar.add(Box.createHorizontalGlue());

        menuOpcoes.setText("Opções");

        itemTrocar.setText("Trocar de usuário");
        itemTrocar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                itemTrocarActionPerformed(evt);
            }
        });
        menuOpcoes.add(itemTrocar);

        itemSair.setText("Sair");
        itemSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(itemSair);

        menuBar.add(menuOpcoes);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCadUsuarioActionPerformed(ActionEvent e) {
    	
    	if(txtNomeUsuario.getText().equals("")||txtCpfUsuario.getText().equals("")||txtDataUsuario.getText().contentEquals("  /  /    ")||txtSenhaUsuario.getText().equals("")||txtSenhaUsuario2.getText().equals("")||txtMatricUsuario.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe todos os campos, não pode haver campo nulo","Erro", JOptionPane.ERROR_MESSAGE);
		}else if(ValidaCPF.valida(txtCpfUsuario.getText()) == "valido"){
			if(txtSenhaUsuario.getText().equals(txtSenhaUsuario2.getText()) == true){
				if((JOptionPane.showConfirmDialog(null, "Deseja cadastrar esse usuário?","Cadastro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
				
					BancoPosto Conexao = new BancoPosto();

					if (!Conexao.getConnection()) {
						JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
						System.exit(0);
					}else {
						try {

							PreparedStatement st2 = null;
							st2 = BancoPosto.connection.prepareStatement("INSERT INTO Funcionarios(Matricula, NvAcesso, Nome, Senha, CPF, DataNasc, Sexo, ImgPerfil) VALUES(?,?,?,?,?,?,?,?)");
						
							st2.setInt(1, Integer.parseInt(txtMatricUsuario.getText()));
							st2.setString(2, cbNvAcesso.getItemAt(cbNvAcesso.getSelectedIndex()));
							st2.setString(3, txtNomeUsuario.getText());
							st2.setString(4, txtSenhaUsuario.getText());
							st2.setString(5, txtCpfUsuario.getText());
							st2.setString(6, txtDataUsuario.getText());
							st2.setString(7, cbSexo.getItemAt(cbSexo.getSelectedIndex()));
							st2.setBytes(8, imgperfil);
							st2.executeUpdate();
						
							JOptionPane.showMessageDialog(null, "Usuário incluído com sucesso!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
					
							txtMatricUsuario.setText("");
							txtNomeUsuario.setText("");
							txtSenhaUsuario.setText("");
							txtDataUsuario.setText("");
							txtCpfUsuario.setText("");
						
							vendedorList();
					
						}catch (Exception f){
							f.printStackTrace();
							JOptionPane.showMessageDialog(null, "Não foi possível incluir o usuário, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "As senhas não coincidem", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "CPF inválido", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
    }
    
    private void btnUsuariosCadActionPerformed(ActionEvent e) {
    	ArrayList<Funcionario> funcionarioList = new ArrayList<>();
		
		BancoPosto Conexao = new BancoPosto();
		
		if(!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Funcionarios");
				rs = st.executeQuery();
				
				while(rs.next()) {
					Funcionario funcionario = new Funcionario(rs.getInt("Matricula"), rs.getString("NvAcesso"), rs.getString("Nome"), rs.getString("CPF"), rs.getString("DataNasc"), rs.getString("Sexo"));
					funcionarioList.add(funcionario);
				}
				
				DefaultTableModel model = (DefaultTableModel)tableUsuarios.getModel();
        		
        		Object[] row =  new Object[6];
        		for(int i=0; i < funcionarioList.size(); i++) {
        			row[0]=funcionarioList.get(i).getMatric();
        			row[1]=funcionarioList.get(i).getNvacesso();
        			row[2]=funcionarioList.get(i).getNome();
        			row[3]=funcionarioList.get(i).getCpf();
        			row[4]=funcionarioList.get(i).getData();
        			row[5]=funcionarioList.get(i).getSexo();
        			model.addRow(row);
        		}
        		tableUsuarios.addRowSelectionInterval(0, 0);
			
        		Object[] options = {"Fechar sem salvar","Salvar alterações","Excluir"};
				int result = JOptionPane.showOptionDialog(null, new JScrollPane(tableUsuarios), "Usuários Cadastrados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,null);
				
				if(result == JOptionPane.YES_OPTION) {
				//Button Fechar sem salvar
					model.getDataVector().removeAllElements();
					
				}else if(result == JOptionPane.NO_OPTION ){
				//Button Salvar alterações
						
						try {
							if(tableUsuarios.isEditing() == false) {
								st = BancoPosto.connection.prepareStatement("UPDATE Funcionarios SET Matricula = ?, NvAcesso = ?, Nome = ?, CPF = ?, DataNasc = ?, Sexo = ? WHERE Matricula = ?");
						
								st.setInt(1, (int)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 0));
								st.setString(2, (String)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 1));
								st.setString(3, (String)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 2));
								st.setString(4, (String)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 3));
								st.setString(5, (String)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 4));
								st.setString(6, (String)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 5));
								st.setInt(7, (int)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 0));
								st.executeUpdate();
				
								JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
								
								Object[] options2 = {"OK"};
								JOptionPane.showOptionDialog(null, "Reiniciando o programa para atualizar os registros de funcionários", "Reiniciando", JOptionPane.OK_CANCEL_OPTION ,JOptionPane.WARNING_MESSAGE, null, options2, null);
								this.dispose();
								new HomeFrame().setVisible(true);
							}else {
								do {
									JOptionPane.showMessageDialog(null, "Confirme a edição usando ENTER para salvá-la", "Aviso", JOptionPane.WARNING_MESSAGE);
									JOptionPane.showOptionDialog(null, new JScrollPane(tableUsuarios), "Usuários Cadastrados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,null);			 
									}while(tableUsuarios.isEditing() == true);
								}
							}catch(Exception f) {
								JOptionPane.showMessageDialog(null, "Valor inválido "+f.getMessage());
							}
							model.getDataVector().removeAllElements();
						
				}else if(result == JOptionPane.CANCEL_OPTION){
				//Button Excluir
					if(tableUsuarios.getSelectedRow() == -1){
						do {
							JOptionPane.showMessageDialog(null, "Selecione um linha da tabela para poder excluí-la", "Aviso", JOptionPane.WARNING_MESSAGE);
							JOptionPane.showOptionDialog(null, new JScrollPane(tableUsuarios), "Usuários Cadastrados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,null);			 
						}while(tableUsuarios.getSelectedRow() == -1);
					}else {
						try {
							st = BancoPosto.connection.prepareStatement("DELETE FROM Funcionarios WHERE Matricula = ?");
					
							st.setInt(1, (int)tableUsuarios.getModel().getValueAt(tableUsuarios.getSelectedRow(), 0));
							st.executeUpdate();
							
							JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
							
							Object[] options2 = {"OK"};
							JOptionPane.showOptionDialog(null, "Reiniciando o programa para atualizar os registros de funcionários", "Reiniciando", JOptionPane.OK_CANCEL_OPTION ,JOptionPane.WARNING_MESSAGE, null, options2, null);
							this.dispose();
							new HomeFrame().setVisible(true);
							
						}catch(Exception f) {
							JOptionPane.showMessageDialog(null, "Erro, não foi possível excluir o usuário "+f.getMessage());
						}
						model.getDataVector().removeAllElements();
					}
					model.getDataVector().removeAllElements();
				}else {
				//Button close of the window
					model.getDataVector().removeAllElements();
				}
			}catch(Exception f) {
				JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados");
			}
		}
    }
    
    private void btnCadClienteActionPerformed(ActionEvent e) {
    	
    	if(txtNomeCliente.getText().equals("")||txtDataCliente.getText().contentEquals("  /  /    ")||txtCpfCliente.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe todos os campos, não pode haver campo nulo","Erro", JOptionPane.ERROR_MESSAGE);
		}else if(ValidaCPF.valida(txtCpfCliente.getText()) == "valido"){
			if((JOptionPane.showConfirmDialog(null, "Deseja cadastrar esse cliente?","Cadastro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)) {
				
				BancoPosto Conexao = new BancoPosto();

				if (!Conexao.getConnection()) {
					JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
					System.exit(0);
				}else {
					try {

						PreparedStatement st2 = BancoPosto.connection.prepareStatement("SET IDENTITY_INSERT Clientes OFF INSERT INTO Clientes VALUES('"+txtNomeCliente.getText()+"', '"+txtCpfCliente.getText()+"', '"+txtDataCliente.getText()+"', "+0+")");
						st2.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Cliente incluído com sucesso!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
						
						txtNomeCliente.setText("");
						txtDataCliente.setText("");
						txtCpfCliente.setText("");
					
					}catch (Exception f){
						f.printStackTrace();
						JOptionPane.showMessageDialog(null, "Não foi possível incluir o cliente, há campos inválidos! "+f.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "CPF Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
		}
    }
    
    private void btnClientesCadActionPerformed(ActionEvent evt) {
    	ArrayList<Cliente> clienteList = new ArrayList<>();
		
		BancoPosto Conexao = new BancoPosto();
		
		if(!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Clientes");
				rs = st.executeQuery();
				
				while(rs.next()) {
					Cliente cliente = new Cliente(rs.getInt("Matricula"), rs.getString("Nome"), rs.getString("CPF"), rs.getString("DataNasc"), rs.getInt("Abastecimentos"));
					clienteList.add(cliente);
				}
				
				DefaultTableModel model = (DefaultTableModel)tableClientes.getModel();
        		
        		Object[] row =  new Object[5];
        		for(int i=0; i < clienteList.size(); i++) {
        			row[0]=clienteList.get(i).getMatric();
        			row[1]=clienteList.get(i).getNome();
        			row[2]=clienteList.get(i).getCpf();
        			row[3]=clienteList.get(i).getData();
        			row[4]=clienteList.get(i).getAbastecimentos();
        			model.addRow(row);
        		}
        		tableClientes.addRowSelectionInterval(0, 0);
			
        		Object[] options = {"Fechar sem salvar","Salvar alterações","Excluir"};
				int result = JOptionPane.showOptionDialog(null, new JScrollPane(tableClientes), "Clientes Cadastrados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,null);
				
				if(result == JOptionPane.YES_OPTION) {
				//Button Fechar sem salvar
					model.getDataVector().removeAllElements();
					
				}else if(result == JOptionPane.NO_OPTION ){
				//Button Salvar alterações
						
						try {
							if(tableClientes.isEditing() == false) {
								st = BancoPosto.connection.prepareStatement("SET IDENTITY_INSERT Clientes OFF UPDATE Clientes SET Nome = ?, CPF = ?, DataNasc = ?, Abastecimentos = ? WHERE Matricula = ?");
						
								st.setString(1, (String)tableClientes.getModel().getValueAt(tableClientes.getSelectedRow(), 1));
								st.setString(2, (String)tableClientes.getModel().getValueAt(tableClientes.getSelectedRow(), 2));
								st.setString(3, (String)tableClientes.getModel().getValueAt(tableClientes.getSelectedRow(), 3));
								st.setInt(4, (int)tableClientes.getModel().getValueAt(tableClientes.getSelectedRow(), 4));
								st.setInt(5, (int)tableClientes.getModel().getValueAt(tableClientes.getSelectedRow(), 0));
								st.executeUpdate();
				
								JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
								
								Object[] options2 = {"OK"};
								JOptionPane.showOptionDialog(null, "Reiniciando o programa para atualizar os registros de clientes", "Reiniciando", JOptionPane.OK_CANCEL_OPTION ,JOptionPane.WARNING_MESSAGE, null, options2, null);
								this.dispose();
								new HomeFrame().setVisible(true);
									
							}else {
								do {
									JOptionPane.showMessageDialog(null, "Confirme a edição usando ENTER para salvá-la", "Aviso", JOptionPane.WARNING_MESSAGE);
									JOptionPane.showOptionDialog(null, new JScrollPane(tableClientes), "Clientes Cadastrados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,null);			 
									}while(tableClientes.isEditing() == true);
								}
							}catch(Exception f) {
								JOptionPane.showMessageDialog(null, "Valor inválido "+f.getMessage());
							}
							model.getDataVector().removeAllElements();
						
				}else if(result == JOptionPane.CANCEL_OPTION){
				//Button Excluir
					if(tableClientes.getSelectedRow() == -1){
						do {
							JOptionPane.showMessageDialog(null, "Selecione um linha da tabela para poder excluí-la", "Aviso", JOptionPane.WARNING_MESSAGE);
							JOptionPane.showOptionDialog(null, new JScrollPane(tableClientes), "Clientes Cadastrados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,options,null);			 
						}while(tableClientes.getSelectedRow() == -1);
					}else {
						try {
							st = BancoPosto.connection.prepareStatement("DELETE FROM Clientes WHERE Matricula = ?");
					
							st.setInt(1, (int)tableClientes.getModel().getValueAt(tableClientes.getSelectedRow(), 0));
							st.executeUpdate();
				
							JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
							
							Object[] options2 = {"OK"};
							JOptionPane.showOptionDialog(null, "Reiniciando o programa para atualizar os registros de clientes", "Reiniciando", JOptionPane.OK_CANCEL_OPTION ,JOptionPane.WARNING_MESSAGE, null, options2, null);
							this.dispose();
							new HomeFrame().setVisible(true);
		
						}catch(Exception f) {
							JOptionPane.showMessageDialog(null, "Erro, não foi possível excluir o cliente "+f.getMessage());
						}
						model.getDataVector().removeAllElements();
					}
					model.getDataVector().removeAllElements();
				}else {
				//Button close of the window
					model.getDataVector().removeAllElements();
				}
			}catch(Exception f) {
				JOptionPane.showMessageDialog(null, "Não há clientes cadastrados");
			}
		}
    }
    
    private void btnAbastecerGCActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelGC = new JPanel();
		        JTextField txtQtdGC = new JTextField(15);
		        panelGC.add(txtQtdGC);
		        
		        int resultGC = JOptionPane.showOptionDialog(null, panelGC, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultGC == JOptionPane.OK_OPTION && !txtQtdGC.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Estoque WHERE Combustivel = 'GC' IF @@ROWCOUNT > 0 UPDATE Estoque SET Qtd = Qtd +"+Double.parseDouble(txtQtdGC.getText())+" WHERE Combustivel = 'GC' ELSE INSERT INTO Estoque (Combustivel, Qtd, Preco) VALUES('GC', 0, 0)");
		        		st.executeQuery();
		        		
		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGC.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = 'GC'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtGcEstoque.setText(""+rs.getDouble("Qtd"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnAbastecerGAActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelGA = new JPanel();
		        JTextField txtQtdGA = new JTextField(15);
		        panelGA.add(txtQtdGA);
		        
		        int resultGA = JOptionPane.showOptionDialog(null, panelGA, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultGA == JOptionPane.OK_OPTION && !txtQtdGA.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Estoque WHERE Combustivel = 'GA' IF @@ROWCOUNT > 0 UPDATE Estoque SET Qtd = Qtd +"+Double.parseDouble(txtQtdGA.getText())+" WHERE Combustivel = 'GA' ELSE INSERT INTO Estoque (Combustivel, Qtd, Preco) VALUES('GA', 0, 0)");
		        		st.executeQuery();
		        		
		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGA.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = 'GA'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtGaEstoque.setText(""+rs.getDouble("Qtd"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnAbastecerGPActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelGP = new JPanel();
		        JTextField txtQtdGP = new JTextField(15);
		        panelGP.add(txtQtdGP);
		        
		        int resultGP = JOptionPane.showOptionDialog(null, panelGP, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultGP == JOptionPane.OK_OPTION && !txtQtdGP.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Estoque WHERE Combustivel = 'GP' IF @@ROWCOUNT > 0 UPDATE Estoque SET Qtd = Qtd +"+Double.parseDouble(txtQtdGP.getText())+" WHERE Combustivel = 'GP' ELSE INSERT INTO Estoque (Combustivel, Qtd, Preco) VALUES('GP', 0, 0)");
		        		st.executeQuery();
		        		
		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGP.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = 'GP'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtGpEstoque.setText(""+rs.getDouble("Qtd"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnAbastecerS10ActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelS10 = new JPanel();
		        JTextField txtQtdS10 = new JTextField(15);
		        panelS10.add(txtQtdS10);
		        
		        int resultS10 = JOptionPane.showOptionDialog(null, panelS10, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultS10 == JOptionPane.OK_OPTION && !txtQtdS10.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Estoque WHERE Combustivel = 'DS10' IF @@ROWCOUNT > 0 UPDATE Estoque SET Qtd = Qtd +"+Double.parseDouble(txtQtdS10.getText())+" WHERE Combustivel = 'DS10' ELSE INSERT INTO Estoque (Combustivel, Qtd, Preco) VALUES('DS10', 0, 0)");
		        		st.executeQuery();
		        		
		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdS10.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = 'DS10'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtS10Estoque.setText(""+rs.getDouble("Qtd"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnAbastecerS50ActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelS50 = new JPanel();
		        JTextField txtQtdS50 = new JTextField(15);
		        panelS50.add(txtQtdS50);
		        
		        int resultS50= JOptionPane.showOptionDialog(null, panelS50, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultS50 == JOptionPane.OK_OPTION && !txtQtdS50.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Estoque WHERE Combustivel = 'DS50' IF @@ROWCOUNT > 0 UPDATE Estoque SET Qtd = Qtd +"+Double.parseDouble(txtQtdS50.getText())+" WHERE Combustivel = 'DS50' ELSE INSERT INTO Estoque (Combustivel, Qtd, Preco) VALUES('DS50', 0, 0)");
		        		st.executeQuery();
		        		
		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdS50.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = 'DS50'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtS50Estoque.setText(""+rs.getDouble("Qtd"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnAbastecerGNVActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelGNV = new JPanel();
		        JTextField txtQtdGNV = new JTextField(15);
		        panelGNV.add(txtQtdGNV);
		        
		        int resultGNV = JOptionPane.showOptionDialog(null, panelGNV, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultGNV == JOptionPane.OK_OPTION && !txtQtdGNV.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Estoque WHERE Combustivel = 'GNV' IF @@ROWCOUNT > 0 UPDATE Estoque SET Qtd = Qtd +"+Double.parseDouble(txtQtdGNV.getText())+" WHERE Combustivel = 'GNV' ELSE INSERT INTO Estoque (Combustivel, Qtd, Preco) VALUES('GNV', 0, 0)");
		        		st.executeQuery();
		        		
		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGNV.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = 'GNV'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtGnvEstoque.setText(""+rs.getDouble("Qtd"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnPrecoGCActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelPGC = new JPanel();
		        JTextField txtPrecoGC = new JTextField(15);
		        panelPGC.add(txtPrecoGC);
		        
		        int resultPGC = JOptionPane.showOptionDialog(null, panelPGC, "Informe o valor",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultPGC == JOptionPane.OK_OPTION && !txtPrecoGC.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Preco = "+Float.parseFloat(txtPrecoGC.getText())+" WHERE Combustivel = 'GC'");
		        		st.executeUpdate();
		        		
		        		JOptionPane.showMessageDialog(null, "Preço atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GC'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtprecogc.setText(""+rs.getFloat("Preco"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar o preço, campo inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnPrecoGAActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelPGA = new JPanel();
		        JTextField txtPrecoGA = new JTextField(15);
		        panelPGA.add(txtPrecoGA);
		        
		        int resultPGA = JOptionPane.showOptionDialog(null, panelPGA, "Informe o valor",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultPGA == JOptionPane.OK_OPTION && !txtPrecoGA.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Preco = "+Float.parseFloat(txtPrecoGA.getText())+" WHERE Combustivel = 'GA'");
		        		st.executeUpdate();
		        		
		        		JOptionPane.showMessageDialog(null, "Preço atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GA'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtprecoga.setText(""+rs.getFloat("Preco"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar o preço, campo inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnPrecoGPActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelPGP = new JPanel();
		        JTextField txtPrecoGP = new JTextField(15);
		        panelPGP.add(txtPrecoGP);
		        
		        int resultPGP = JOptionPane.showOptionDialog(null, panelPGP, "Informe o valor",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultPGP == JOptionPane.OK_OPTION && !txtPrecoGP.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Preco = "+Float.parseFloat(txtPrecoGP.getText())+" WHERE Combustivel = 'GP'");
		        		st.executeUpdate();
		        		
		        		JOptionPane.showMessageDialog(null, "Preço atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GP'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtprecogp.setText(""+rs.getFloat("Preco"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar o preço, campo inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnPrecoDS10ActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelPDS10 = new JPanel();
		        JTextField txtPrecoDS10 = new JTextField(15);
		        panelPDS10.add(txtPrecoDS10);
		        
		        int resultPDS10 = JOptionPane.showOptionDialog(null, panelPDS10, "Informe o valor",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultPDS10 == JOptionPane.OK_OPTION && !txtPrecoDS10.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Preco = "+Float.parseFloat(txtPrecoDS10.getText())+" WHERE Combustivel = 'DS10'");
		        		st.executeUpdate();
		        		
		        		JOptionPane.showMessageDialog(null, "Preço atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'DS10'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtprecods10.setText(""+rs.getFloat("Preco"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar o preço, campo inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnPrecoDS50ActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelPDS50 = new JPanel();
		        JTextField txtPrecoDS50 = new JTextField(15);
		        panelPDS50.add(txtPrecoDS50);
		        
		        int resultPDS50 = JOptionPane.showOptionDialog(null, panelPDS50, "Informe o valor",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultPDS50 == JOptionPane.OK_OPTION && !txtPrecoDS50.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Preco = "+Float.parseFloat(txtPrecoDS50.getText())+" WHERE Combustivel = 'DS50'");
		        		st.executeUpdate();
		        		
		        		JOptionPane.showMessageDialog(null, "Preço atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'DS50'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtprecods50.setText(""+rs.getFloat("Preco"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar o preço, campo inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private void btnPrecoGNVActionPerformed(ActionEvent e) {
    	BancoPosto Conexao = new BancoPosto();
    	
    	if (!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
			try {
				JPanel panelPGNV = new JPanel();
		        JTextField txtPrecoGNV= new JTextField(15);
		        panelPGNV.add(txtPrecoGNV);
		        
		        int resultPGNV = JOptionPane.showOptionDialog(null, panelPGNV, "Informe o valor",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
		        if (resultPGNV == JOptionPane.OK_OPTION && !txtPrecoGNV.getText().equals("")){
		        	
		        	try {
		        		
		        		PreparedStatement st = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Preco = "+Float.parseFloat(txtPrecoGNV.getText())+" WHERE Combustivel = 'GNV'");
		        		st.executeUpdate();
		        		
		        		JOptionPane.showMessageDialog(null, "Preço atualizado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        		
		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT Preco FROM Estoque WHERE Combustivel = 'GNV'");
		        		rs = st2.executeQuery();
		        		
		        		if(rs.next()) {
		        			txtprecognv.setText(""+rs.getFloat("Preco"));
		        		}
		        		
		        	}catch(Exception f) {
		        		f.printStackTrace();
		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
		        	}
		        	
		        }
				
			}catch(Exception f) {
				f.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não foi possível atualizar o preço, campo inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
    }
    
    private ArrayList<Funcionario> vendedorList() {
    	ArrayList<Funcionario> vendedorList = new ArrayList<>();
    	
		BancoPosto Conexao = new BancoPosto();
		
		if(!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
		
		try {

			PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT Nome FROM Funcionarios WHERE NvAcesso = 'func' OR NvAcesso = 'adm'");

			rs=st.executeQuery();

			 while (rs.next()) {  
				 cbVendedorVender.addItem(rs.getString("Nome"));
			 }
			} catch (Exception e) {  
				JOptionPane.showMessageDialog(null,"Nenhum funcionário válido","Erro", JOptionPane.ERROR_MESSAGE);  
				System.exit(0);  
			}
			return vendedorList;
    	}
		return null;
    }

    private ArrayList<Cliente> clienteList() {
    	ArrayList<Cliente> clienteList = new ArrayList<>();
    	
		BancoPosto Conexao = new BancoPosto();
		
		if(!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
		
		try {

			PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT Nome FROM Clientes");

			rs=st.executeQuery();

			 while (rs.next()) {  
				 cbClienteVender.addItem(rs.getString("Nome"));
			 }
			} catch (Exception e) {  
				JOptionPane.showMessageDialog(null,"Nenhum cliente válido","Erro", JOptionPane.ERROR_MESSAGE);  
				System.exit(0);  
			}
			return clienteList;
    	}
		return null;
    }
    
    private void itemSairActionPerformed(ActionEvent evt) {
       System.exit(0);
    }

    private void itemTrocarActionPerformed(ActionEvent evt) {
       new LoginFrame().setVisible(true);
       this.dispose();
    }
    
    private void btnRegVendaActionPerformed(ActionEvent evt) {   
    	if(txtQtdeVender.getText().equals("")||txtDataVender.getText().contentEquals("  /  /    ")||cbVendedorVender.getItemAt(cbVendedorVender.getSelectedIndex()).isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Informe todos os campos, não pode haver campo nulo","Erro", JOptionPane.ERROR_MESSAGE);
    	}else{
    		
    		BancoPosto Conexao = new BancoPosto();
    	
    		if(!Conexao.getConnection())
    		{
    			JOptionPane.showMessageDialog(null, "Falha ao Conectar");
    			System.exit(0);
    		}else
    			try {

    				PreparedStatement stmt = BancoPosto.connection.prepareStatement("INSERT INTO Abastecimento (Nome_Vendedor, Nome_Cliente, Combustivel, Qtd, Forma_Pag, Data_Abs) VALUES(?,?,?,?,?,?)");
						
	    			stmt.setString(1, cbVendedorVender.getItemAt(cbVendedorVender.getSelectedIndex()));
	    			stmt.setString(2, cbClienteVender.getItemAt(cbClienteVender.getSelectedIndex()));
	    			stmt.setString(3, cbCombustivel.getItemAt(cbCombustivel.getSelectedIndex()));
	    			stmt.setInt(4, Integer.parseInt(txtQtdeVender.getText()));
	    			stmt.setString(5, cbPagamentoVender.getItemAt(cbPagamentoVender.getSelectedIndex()));
	    			stmt.setString(6, txtDataVender.getText());
	    			stmt.executeUpdate();
	    		
	    			
	    			PreparedStatement stm = BancoPosto.connection.prepareStatement("SELECT Qtd FROM Estoque WHERE Combustivel = '"+cbProdutoVender.getItemAt(cbProdutoVender.getSelectedIndex())+"'");
    				
    				rs = stm.executeQuery();
    				
    				if(rs.next())
    				{
    					
    					PreparedStatement stUpdate = BancoPosto.connection.prepareStatement("UPDATE Estoque SET Qtd = "+Float.parseFloat(rs.getString("Qtd")) + " - " +Float.parseFloat(txtQtdeVender.getText())+" WHERE Combustivel = '"+cbProdutoVender.getItemAt(cbProdutoVender.getSelectedIndex())+"'");
    					System.out.println("GC");
    					
    					stUpdate.executeUpdate();
    					
    				}
    						
    				JOptionPane.showMessageDialog(null, "Venda Registrada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			
    			}catch (SQLException erro) {
    				JOptionPane.showMessageDialog(null, "Erro! " + erro.getMessage());
    			}
    				atualizarVendas();
    		}
    }
    private void atualizarVendas() {
    	
    	ArrayList<Abastecimento> abastecimentoList = new ArrayList<>();
		
		BancoPosto Conexao = new BancoPosto();
	
		if(!Conexao.getConnection())
		{
			JOptionPane.showMessageDialog(null, "Falha ao Conectar");
			System.exit(0);
		}else
			try {
				
				PreparedStatement stmt = BancoPosto.connection.prepareStatement("SELECT * FROM Abastecimento ORDER BY Data_Abs");
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					Abastecimento abastecimento = new Abastecimento(rs.getString("Nome_Vendedor"), rs.getString("Nome_Cliente"), rs.getString("Combustivel"), rs.getDouble("Qtd"), rs.getString("Forma_Pag"), rs.getString("Data_Abs"));
					abastecimentoList.add(abastecimento);
				}
				
				DefaultTableModel tmodel = (DefaultTableModel)tableVender.getModel();
				
				tmodel.getDataVector().removeAllElements();
				
				Object[] row =  new Object[6];
        		for(int i=0; i < abastecimentoList.size(); i++) {
        			row[0]=abastecimentoList.get(i).getNome_Vendedor();
        			row[1]=abastecimentoList.get(i).getNome_Cliente();
        			row[2]=abastecimentoList.get(i).getCombustivel();
        			row[3]=String.format("%.3f", abastecimentoList.get(i).getQtd());
        			row[4]=abastecimentoList.get(i).getForma_Pag();
        			row[5]=abastecimentoList.get(i).getData_Abs();
        			//tmodel.addRow(row);
        			tmodel.insertRow(0, row);
        		}
		
			}catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, "Erro! " + erro.getMessage());
			}
    }
}
