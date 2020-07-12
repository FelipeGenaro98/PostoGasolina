
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

public class HomeFunc extends JFrame{

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
    // End of variables declaration//GEN-END:variables

	
    public HomeFunc() {
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
        scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
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
                                        				.addComponent(lbSenhaUsuario)
                                        				.addComponent(txtSenhaUsuario, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        				.addComponent(btnCadUsuario, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                        				.addComponent(lbNomeUsuario)
                                        				.addComponent(txtNomeUsuario, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        				.addComponent(lbDataUsuario)
                                        				.addComponent(txtDataUsuario, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        			.addGap(31)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addComponent(btnUsuariosCad)
                                        					.addContainerGap())
                                        				.addGroup(panelUsuariosLayout.createSequentialGroup()
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        						.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING, false)
                                        							.addComponent(txtSenhaUsuario2)
                                        							.addComponent(txtCpfUsuario, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        							.addComponent(lbMatricUsuario)
                                        							.addComponent(txtMatricUsuario, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        							.addComponent(lbSenhaUsuario2))
                                        						.addComponent(lbCpfUsuario))
                                        					.addGap(76)
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING, false)
                                        						.addComponent(lbNvAcessoUsuario)
                                        						.addComponent(cbNvAcesso, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        					.addGap(18)
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        						.addComponent(cbSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        						.addComponent(lbSexo))
                                        					.addContainerGap(68, Short.MAX_VALUE))))
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
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        						.addComponent(lbSenhaUsuario)
                                        						.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        							.addComponent(lbNvAcessoUsuario)
                                        							.addComponent(lbSexo)))
                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                        					.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.LEADING)
                                        						.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        							.addComponent(txtSenhaUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        							.addComponent(txtSenhaUsuario2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        						.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        							.addComponent(cbNvAcesso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        							.addComponent(cbSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                        				.addComponent(lbSenhaUsuario2))
                                        			.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                        			.addGroup(panelUsuariosLayout.createParallelGroup(Alignment.BASELINE)
                                        				.addComponent(btnUsuariosCad)
                                        				.addComponent(btnCadUsuario))
                                        			.addContainerGap())
                                        );
                                        panelUsuarios.setLayout(panelUsuariosLayout);
                                        
                                                //tabbedPane.addTab("Usuários", panelUsuarios);

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

        cbProdutoVender.setModel(new DefaultComboBoxModel(new String[] {"Gasolina Comum", "Gasolina Aditivada", "Gasolina Premium", "Álcool Hidratado", "Diesel S10", "Diesel S50", "Gás Natural Veicular"}));
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
        panelVender.setLayout(panelVenderLayout);
        panelVenderLayout.setHorizontalGroup(
            panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelVenderLayout.createSequentialGroup()
                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelVenderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbClienteVender)
                                .addComponent(cbProdutoVender, 0, GroupLayout.DEFAULT_SIZE, 122))
                            .addComponent(lbProdutoVender)
                            .addComponent(lbClienteVender))
                        .addGap(15, 15, 15)
                        .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panelVenderLayout.createSequentialGroup()
                                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtdeVender, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbQtdeVender, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataVender, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDataVender)
                                    ))
                            .addGroup(panelVenderLayout.createSequentialGroup()
                                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPagamentoVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPagamentoVender, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lbVendedorVender)
                                    .addGroup(panelVenderLayout.createSequentialGroup()
                                        .addComponent(cbVendedorVender, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(btnRegVenda, 23,23,120)
                                        )))))
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVenderLayout.setVerticalGroup(
            panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelVenderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lbClienteVender)
                    .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbQtdeVender)
                        .addComponent(lbDataVender)))
                .addGap(6, 6, 6)
                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbClienteVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdeVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPagamentoVender)
                        .addComponent(lbVendedorVender))
                    .addComponent(lbProdutoVender))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVenderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProdutoVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPagamentoVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVendedorVender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegVenda))
                .addGap(31, 31, 31)
                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
        );

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
        
//        btnAbastecerGC.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				btnAbastecerGCActionPerformed(e);
//				
//			}
//        });
        
//        btnAbastecerGA.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				btnAbastecerGAActionPerformed(e);
//				
//			}
//        });
//        
//        btnAbastecerGP.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				btnAbastecerGPActionPerformed(e);
//				
//			}
//        });
//        
//        btnAbastecerS10.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				btnAbastecerS10ActionPerformed(e);
//				
//			}
//        });
//        
//        btnAbastecerS50.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				btnAbastecerS50ActionPerformed(e);
//				
//			}
//        });
//        
//        btnAbastecerGNV.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				btnAbastecerGNVActionPerformed(e);
//				
//			}
//        });

        lbQtdGC.setText("Litros");
        
        txtGcEstoque = new JFormattedTextField();
        txtGcEstoque.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGcEstoque.setText("Atualize");
        txtGcEstoque.setEditable(false);

        GroupLayout panelGCLayout = new GroupLayout(panelGC);
        panelGCLayout.setHorizontalGroup(
        	panelGCLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGCLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGCLayout.createParallelGroup(Alignment.LEADING)
        				//.addComponent(btnAbastecerGC, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGCLayout.createSequentialGroup()
        					.addComponent(txtGcEstoque, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lbQtdGC)))
        			.addContainerGap(15, Short.MAX_VALUE))
        );
        panelGCLayout.setVerticalGroup(
        	panelGCLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelGCLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGCLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGcEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGC))
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			//.addComponent(btnAbastecerGC)
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

        GroupLayout panelGALayout = new GroupLayout(panelGA);
        panelGALayout.setHorizontalGroup(
        	panelGALayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGALayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGALayout.createParallelGroup(Alignment.LEADING)
        				//.addComponent(btnAbastecerGA, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGALayout.createSequentialGroup()
        					.addComponent(txtGaEstoque, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lbQtdGA)))
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        panelGALayout.setVerticalGroup(
        	panelGALayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelGALayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGALayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGaEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGA))
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			//.addComponent(btnAbastecerGA)
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

        GroupLayout panelGPLayout = new GroupLayout(panelGP);
        panelGPLayout.setHorizontalGroup(
        	panelGPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGPLayout.createParallelGroup(Alignment.LEADING)
        				//.addComponent(btnAbastecerGP, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGPLayout.createSequentialGroup()
        					.addComponent(txtGpEstoque, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lbQtdGP)))
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        panelGPLayout.setVerticalGroup(
        	panelGPLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelGPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGPLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGpEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGP))
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			//.addComponent(btnAbastecerGP)
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

        GroupLayout panelS10Layout = new GroupLayout(panelS10);
        panelS10Layout.setHorizontalGroup(
        	panelS10Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelS10Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(txtS10Estoque, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lbQtdS10)
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, panelS10Layout.createSequentialGroup()
        			.addContainerGap()
        			//.addComponent(btnAbastecerS10, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(19, Short.MAX_VALUE))
        );
        panelS10Layout.setVerticalGroup(
        	panelS10Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, panelS10Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelS10Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtS10Estoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdS10))
        			.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        			//.addComponent(btnAbastecerS10)
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

        GroupLayout panelD50Layout = new GroupLayout(panelD50);
        panelD50Layout.setHorizontalGroup(
        	panelD50Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelD50Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelD50Layout.createParallelGroup(Alignment.LEADING)
        				//.addComponent(btnAbastecerS50, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelD50Layout.createSequentialGroup()
        					.addComponent(txtS50Estoque, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lbQtdS50)))
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        panelD50Layout.setVerticalGroup(
        	panelD50Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelD50Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelD50Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtS50Estoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdS50))
        			.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        			//.addComponent(btnAbastecerS50)
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

        GroupLayout panelGNVLayout = new GroupLayout(panelGNV);
        panelGNVLayout.setHorizontalGroup(
        	panelGNVLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelGNVLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGNVLayout.createParallelGroup(Alignment.LEADING)
        				//.addComponent(btnAbastecerGNV, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelGNVLayout.createSequentialGroup()
        					.addComponent(txtGnvEstoque, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lbQtdGNV)))
        			.addContainerGap(30, Short.MAX_VALUE))
        );
        panelGNVLayout.setVerticalGroup(
        	panelGNVLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(panelGNVLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelGNVLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtGnvEstoque, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbQtdGNV))
        			.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        			//.addComponent(btnAbastecerGNV)
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
				        		
				        PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT SUM(GC) AS SUMGC FROM Estoque");
				        rs = st.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGC");
				        	txtGcEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(GA) AS SUMGA FROM Estoque");
				        rs = st2.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGA");
				        	txtGaEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st3 = BancoPosto.connection.prepareStatement("SELECT SUM(GP) AS SUMGP FROM Estoque");
				        rs = st3.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGP");
				        	txtGpEstoque.setText(""+soma);
				        }
				        
				        PreparedStatement st4 = BancoPosto.connection.prepareStatement("SELECT SUM(DS10) AS SUMDS10 FROM Estoque");
				        rs = st4.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMDS10");
				        	txtS10Estoque.setText(""+soma);
				        }
				        
				        PreparedStatement st5 = BancoPosto.connection.prepareStatement("SELECT SUM(DS50) AS SUMDS50 FROM Estoque");
				        rs = st5.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMDS50");
				        	txtS50Estoque.setText(""+soma);
				        }
				        
				        PreparedStatement st6 = BancoPosto.connection.prepareStatement("SELECT SUM(GNV) AS SUMGNV FROM Estoque");
				        rs = st6.executeQuery();

				        if(rs.next()) {
				        	double soma = rs.getDouble("SUMGNV");
				        	txtGnvEstoque.setText(""+soma);
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
        			.addContainerGap()
        			.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelEstoqueLayout.createSequentialGroup()
        					.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(panelS10, 0, 0, Short.MAX_VALUE)
        						.addComponent(panelGC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(panelD50, 0, 0, Short.MAX_VALUE)
        						.addComponent(panelGA, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
        					.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(panelGNV, 0, 0, Short.MAX_VALUE)
        						.addComponent(panelGP, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
        					.addGap(16))
        				.addGroup(Alignment.TRAILING, panelEstoqueLayout.createSequentialGroup()
        					.addComponent(btnAtualizarEstoque)
        					.addGap(24))))
        );
        panelEstoqueLayout.setVerticalGroup(
        	panelEstoqueLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelEstoqueLayout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.BASELINE, false)
        				.addComponent(panelGC, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelGP, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelGA, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelEstoqueLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(panelS10, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelGNV, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelD50, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnAtualizarEstoque)
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        panelEstoque.setLayout(panelEstoqueLayout);

        tabbedPane.addTab("Estoque", panelEstoque);

        getContentPane().add(tabbedPane, new AbsoluteConstraints(0, 0, 570, 310));
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
    	
    	if(txtNomeUsuario.getText().equals("")||txtCpfUsuario.getText().equals("")||txtDataUsuario.getText().equals("")||txtSenhaUsuario.getText().equals("")||txtSenhaUsuario2.getText().equals("")||txtMatricUsuario.getText().equals("")) {
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
								new HomeFunc().setVisible(true);
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
							new HomeFunc().setVisible(true);
							
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
    	
    	if(txtNomeCliente.getText().equals("")||txtDataCliente.getText().equals("")||txtCpfCliente.getText().equals("")) {
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
								new HomeFunc().setVisible(true);
									
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
							new HomeFunc().setVisible(true);
		
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
    
//    private void btnAbastecerGCActionPerformed(ActionEvent e) {
//    	BancoPosto Conexao = new BancoPosto();
//    	
//    	if (!Conexao.getConnection()) {
//			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
//			System.exit(0);
//		}else {
//			try {
//				JPanel panelGC = new JPanel();
//		        JTextField txtQtdGC = new JTextField(15);
//		        panelGC.add(txtQtdGC);
//		        
//		        int resultGC = JOptionPane.showOptionDialog(null, panelGC, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
//		        if (resultGC == JOptionPane.OK_OPTION && !txtQtdGC.getText().equals("")){
//		        	
//		        	try {
//		        		
//		        		PreparedStatement st = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
//		        		st.setDouble(1, Double.parseDouble(txtQtdGC.getText()));
//		        		st.setDouble(2, 0);
//		        		st.setDouble(3, 0);
//		        		st.setDouble(4, 0);
//		        		st.setDouble(5, 0);
//		        		st.setDouble(6, 0);
//		        		st.executeUpdate();
//		        		
//		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGC.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
//		        		
//		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(GC) AS SUMGC FROM Estoque");
//		        		rs = st2.executeQuery();
//
//		        		if(rs.next()) {
//		        			double soma = rs.getDouble("SUMGC");
//		        			txtGcEstoque.setText(""+soma);
//		        		}
//		        		
//		        	}catch(Exception f) {
//		        		f.printStackTrace();
//		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
//		        	}
//		        	
//		        	
//		        }
//				
//			}catch(Exception f) {
//				f.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
//			}
//		}
//    }
    
//    private void btnAbastecerGAActionPerformed(ActionEvent e) {
//    	BancoPosto Conexao = new BancoPosto();
//    	
//    	if (!Conexao.getConnection()) {
//			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
//			System.exit(0);
//		}else {
//			try {
//				JPanel panelGA = new JPanel();
//		        JTextField txtQtdGA = new JTextField(15);
//		        panelGA.add(txtQtdGA);
//		        
//		        int resultGA = JOptionPane.showOptionDialog(null, panelGA, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
//		        if (resultGA == JOptionPane.OK_OPTION && !txtQtdGA.getText().equals("")){
//		        	
//		        	try {
//		        		
//		        		PreparedStatement st = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
//		        		st.setDouble(1, 0);
//		        		st.setDouble(2, Double.parseDouble(txtQtdGA.getText()));
//		        		st.setDouble(3, 0);
//		        		st.setDouble(4, 0);
//		        		st.setDouble(5, 0);
//		        		st.setDouble(6, 0);
//		        		st.executeUpdate();
//		        		
//		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGA.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
//		        		
//		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(GA) AS SUMGA FROM Estoque");
//		        		rs = st2.executeQuery();
//
//		        		if(rs.next()) {
//		        			double soma = rs.getDouble("SUMGA");
//		        			txtGaEstoque.setText(""+soma);
//		        		}
//		        		
//		        	}catch(Exception f) {
//		        		f.printStackTrace();
//		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
//		        	}
//		        	
//		        }
//				
//			}catch(Exception f) {
//				f.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
//			}
//		}
//    }
//    
//    private void btnAbastecerGPActionPerformed(ActionEvent e) {
//    	BancoPosto Conexao = new BancoPosto();
//    	
//    	if (!Conexao.getConnection()) {
//			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
//			System.exit(0);
//		}else {
//			try {
//				JPanel panelGP = new JPanel();
//		        JTextField txtQtdGP = new JTextField(15);
//		        panelGP.add(txtQtdGP);
//		        
//		        int resultGP = JOptionPane.showOptionDialog(null, panelGP, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
//		        if (resultGP == JOptionPane.OK_OPTION && !txtQtdGP.getText().equals("")){
//		        	
//		        	try {
//		        		
//		        		PreparedStatement st = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
//		        		st.setDouble(1, 0);
//		        		st.setDouble(2, 0);
//		        		st.setDouble(3, Double.parseDouble(txtQtdGP.getText()));
//		        		st.setDouble(4, 0);
//		        		st.setDouble(5, 0);
//		        		st.setDouble(6, 0);
//		        		st.executeUpdate();
//		        		
//		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGP.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
//		        		
//		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(GP) AS SUMGP FROM Estoque");
//		        		rs = st2.executeQuery();
//
//		        		if(rs.next()) {
//		        			double soma = rs.getDouble("SUMGP");
//		        			txtGpEstoque.setText(""+soma);
//		        		}
//		        		
//		        	}catch(Exception f) {
//		        		f.printStackTrace();
//		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
//		        	}
//		        	
//		        }
//				
//			}catch(Exception f) {
//				f.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
//			}
//		}
//    }
//    
//    private void btnAbastecerS10ActionPerformed(ActionEvent e) {
//    	BancoPosto Conexao = new BancoPosto();
//    	
//    	if (!Conexao.getConnection()) {
//			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
//			System.exit(0);
//		}else {
//			try {
//				JPanel panelS10 = new JPanel();
//		        JTextField txtQtdS10 = new JTextField(15);
//		        panelS10.add(txtQtdS10);
//		        
//		        int resultS10 = JOptionPane.showOptionDialog(null, panelS10, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
//		        if (resultS10 == JOptionPane.OK_OPTION && !txtQtdS10.getText().equals("")){
//		        	
//		        	try {
//		        		
//		        		PreparedStatement st = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
//		        		st.setDouble(1, 0);
//		        		st.setDouble(2, 0);
//		        		st.setDouble(3, 0);
//		        		st.setDouble(4, Double.parseDouble(txtQtdS10.getText()));
//		        		st.setDouble(5, 0);
//		        		st.setDouble(6, 0);
//		        		st.executeUpdate();
//		        		
//		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdS10.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
//		        		
//		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(DS10) AS SUMDS10 FROM Estoque");
//		        		rs = st2.executeQuery();
//
//		        		if(rs.next()) {
//		        			double soma = rs.getDouble("SUMDS10");
//		        			txtS10Estoque.setText(""+soma);
//		        		}
//		        		
//		        	}catch(Exception f) {
//		        		f.printStackTrace();
//		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
//		        	}
//		        	
//		        }
//				
//			}catch(Exception f) {
//				f.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
//			}
//		}
//    }
//    
//    private void btnAbastecerS50ActionPerformed(ActionEvent e) {
//    	BancoPosto Conexao = new BancoPosto();
//    	
//    	if (!Conexao.getConnection()) {
//			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
//			System.exit(0);
//		}else {
//			try {
//				JPanel panelS50 = new JPanel();
//		        JTextField txtQtdS50 = new JTextField(15);
//		        panelS50.add(txtQtdS50);
//		        
//		        int resultS50= JOptionPane.showOptionDialog(null, panelS50, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
//		        if (resultS50 == JOptionPane.OK_OPTION && !txtQtdS50.getText().equals("")){
//		        	
//		        	try {
//		        		
//		        		PreparedStatement st = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
//		        		st.setDouble(1, 0);
//		        		st.setDouble(2, 0);
//		        		st.setDouble(3, 0);
//		        		st.setDouble(4, 0);
//		        		st.setDouble(5, Double.parseDouble(txtQtdS50.getText()));
//		        		st.setDouble(6, 0);
//		        		st.executeUpdate();
//		        		
//		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdS50.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
//		        		
//		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(DS50) AS SUMDS50 FROM Estoque");
//		        		rs = st2.executeQuery();
//
//		        		if(rs.next()) {
//		        			double soma = rs.getDouble("SUMDS50");
//		        			txtS50Estoque.setText(""+soma);
//		        		}
//		        		
//		        	}catch(Exception f) {
//		        		f.printStackTrace();
//		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
//		        	}
//		        	
//		        }
//				
//			}catch(Exception f) {
//				f.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
//			}
//		}
//    }
    
//    private void btnAbastecerGNVActionPerformed(ActionEvent e) {
//    	BancoPosto Conexao = new BancoPosto();
//    	
//    	if (!Conexao.getConnection()) {
//			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
//			System.exit(0);
//		}else {
//			try {
//				JPanel panelGNV = new JPanel();
//		        JTextField txtQtdGNV = new JTextField(15);
//		        panelGNV.add(txtQtdGNV);
//		        
//		        int resultGNV = JOptionPane.showOptionDialog(null, panelGNV, "Informe a quantidade",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null,null);
//		        if (resultGNV == JOptionPane.OK_OPTION && !txtQtdGNV.getText().equals("")){
//		        	
//		        	try {
//		        		
//		        		PreparedStatement st = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
//		        		st.setDouble(1, 0);
//		        		st.setDouble(2, 0);
//		        		st.setDouble(3, 0);
//		        		st.setDouble(4, 0);
//		        		st.setDouble(5, 0);
//		        		st.setDouble(6, Double.parseDouble(txtQtdGNV.getText()));
//		        		st.executeUpdate();
//		        		
//		        		JOptionPane.showMessageDialog(null, "Total abastecido: "+txtQtdGNV.getText(), "Abastecimento Concluído", JOptionPane.INFORMATION_MESSAGE);
//		        		
//		        		PreparedStatement st2 = BancoPosto.connection.prepareStatement("SELECT SUM(GNV) AS SUMGNV FROM Estoque");
//		        		rs = st2.executeQuery();
//
//		        		if(rs.next()) {
//		        			double soma = rs.getDouble("SUMGNV");
//		        			txtGnvEstoque.setText(""+soma);
//		        		}
//		        		
//		        	}catch(Exception f) {
//		        		f.printStackTrace();
//		        		JOptionPane.showMessageDialog(null, "Erro: "+f.getMessage());
//		        	}
//		        	
//		        }
//				
//			}catch(Exception f) {
//				f.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Não foi possível abastecer, há campos inválidos!", "Erro", JOptionPane.INFORMATION_MESSAGE);
//			}
//		}
//    }
//    
    private ArrayList<Funcionario> vendedorList() {
    	ArrayList<Funcionario> vendedorList = new ArrayList<>();
    	
		BancoPosto Conexao = new BancoPosto();
		
		if(!Conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados");
			System.exit(0);
		}else {
		
		try {

			PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT Nome FROM Funcionarios WHERE NvAcesso = 'Funcionário' OR NvAcesso = 'Administrador'");

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
    	if(txtQtdeVender.getText().equals("")||txtDataVender.getText().equals("")||cbVendedorVender.getItemAt(cbVendedorVender.getSelectedIndex()).isEmpty()) {
    		JOptionPane.showMessageDialog(null, "Informe todos os campos, não pode haver campo nulo","Erro", JOptionPane.ERROR_MESSAGE);
    	}else{
    		ArrayList<Abastecimento> abastecimentoList = new ArrayList<>();
    		
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
    				
    				PreparedStatement stmt2 = BancoPosto.connection.prepareStatement("INSERT INTO Estoque(GC,GA,GP,DS10,DS50,GNV) VALUES(?,?,?,?,?,?)");
				
    				JOptionPane.showMessageDialog(null, "Venda Registrada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    				
    				atualizarVendas();
			
    			}catch (SQLException erro) {
    				JOptionPane.showMessageDialog(null, "Erro! " + erro.getMessage());
    			}
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
				
				PreparedStatement stmt = BancoPosto.connection.prepareStatement("SELECT * FROM Abastecimento");
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
        			tmodel.addRow(row);
        		}
		
			}catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, "Erro! " + erro.getMessage());
			}
    }
}
