
package postogasolina;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class LoginFrame extends JFrame implements MouseListener{

    private JButton buttonEntrar;
    private JLabel labelIcone;
    private JLabel labelImg;
    private JLabel labelLogo;
    private JLabel labelSair;
    private JLabel labelSenha;
    private JLabel labelUsuario;
    private JPanel painel1;
    private JPanel painel2;
    private JPanel painel3;
    private JPanel painelLogo;
    private JPasswordField passfieldSenha;
    private JSeparator separador1;
    private JSeparator separador2;
    private JTextField txtfieldNome;
    
    private ResultSet dados;
	
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        txtfieldNome = new JTextField();
        passfieldSenha = new JPasswordField();
        buttonEntrar = new JButton();
        separador1 = new JSeparator();
        separador2 = new JSeparator();
        labelUsuario = new JLabel();
        labelSenha = new JLabel();
        labelSair = new JLabel();
        labelIcone = new JLabel();
        painelLogo = new JPanel();
        labelLogo = new JLabel();
        labelImg = new JLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);

        painel1.setLayout(new awtextra.AbsoluteLayout());

        painel2.setBackground(new Color(0,0,0,200));

        painel3.setBackground(new Color(240,240,240));

        txtfieldNome.setBackground(new Color(240,240,240));
        txtfieldNome.setFont(new Font("Verdana", 0, 14));
        txtfieldNome.setBorder(null);
        txtfieldNome.setDisabledTextColor(new Color(51, 51, 51));
        txtfieldNome.setMargin(new Insets(1, 1, 1, 2));
        txtfieldNome.setText("admin");
        txtfieldNome.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                txtfieldNomeFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                txtfieldNomeFocusLost(evt);
            }
        });

        passfieldSenha.setBackground(new Color(240,240,240));
        passfieldSenha.setFont(new Font("Verdana", 0, 14));
        passfieldSenha.setBorder(null);
        passfieldSenha.setText("123");
        passfieldSenha.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                passfieldSenhaFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                passfieldSenhaFocusLost(evt);
            }
        });

        buttonEntrar.setBackground(new Color(0, 102, 255));
        buttonEntrar.setFont(new Font("Lucida Sans Unicode", 0, 14));
        buttonEntrar.setForeground(new Color(255, 255, 255));
        buttonEntrar.setText("ENTRAR");
        buttonEntrar.setBorder(null);
        buttonEntrar.setBorderPainted(false);
        buttonEntrar.setCursor(new Cursor(HAND_CURSOR));
        //buttonEntrar.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        buttonEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });

        separador1.setBackground(new Color(255, 255, 255));
        separador1.setForeground(new Color(100, 100, 100));
        separador1.setPreferredSize(new Dimension(50, 20));

        separador2.setBackground(new Color(255, 255, 255));
        separador2.setForeground(new Color(100, 100, 100));
        separador2.setPreferredSize(new Dimension(50, 20));

        labelUsuario.setFont(new Font("Lucida Sans Unicode", 0, 14));
        labelUsuario.setText("USUÁRIO");

        labelSenha.setFont(new Font("Lucida Sans Unicode", 0, 14));
        labelSenha.setText("SENHA");

        labelSair.setBackground(new Color(240,240,240));
        labelSair.setFont(new Font("Lucida Sans Unicode", 0, 14));
        labelSair.setText("SAIR");
        labelSair.setCursor(new Cursor(HAND_CURSOR));
        labelSair.addMouseListener(this);

        labelIcone.setIcon(new ImageIcon(getClass().getResource("/postogasolina/iconeusuario.png")));

        GroupLayout painel3Layout = new GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addGroup(painel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(labelSair))
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(painel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(separador1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passfieldSenha)
                            .addComponent(separador2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonEntrar, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtfieldNome)
                            .addComponent(labelSenha, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsuario, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(labelIcone)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelIcone)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelUsuario)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfieldSenha, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(buttonEntrar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSair)
                .addGap(46, 46, 46))
        );

        labelLogo.setIcon(new ImageIcon(getClass().getResource("/postogasolina/logo.jpg")));

        GroupLayout painelLogoLayout = new GroupLayout(painelLogo);
        painelLogo.setLayout(painelLogoLayout);
        painelLogoLayout.setHorizontalGroup(
            painelLogoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addComponent(labelLogo, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelLogoLayout.setVerticalGroup(
            painelLogoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(labelLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout painel2Layout = new GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(painelLogo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(painel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(painelLogo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addComponent(painel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        painel1.add(painel2, new awtextra.AbsoluteConstraints(0, 0, 750, 460));

        labelImg.setIcon(new ImageIcon(getClass().getResource("/postogasolina/posto.jpg")));
        painel1.add(labelImg, new awtextra.AbsoluteConstraints(0, 0, 750, 460));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(painel1, GroupLayout.PREFERRED_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(painel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void txtfieldNomeFocusGained(FocusEvent evt) {
        labelUsuario.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
    }

    private void txtfieldNomeFocusLost(FocusEvent evt) {
        labelUsuario.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
    }

    private void passfieldSenhaFocusGained(FocusEvent evt) {
        labelSenha.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
    }

    private void passfieldSenhaFocusLost(FocusEvent evt) {
        labelSenha.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
    }

    private void buttonEntrarActionPerformed(ActionEvent evt) {
    	
    	BancoPosto conexao = new BancoPosto();
    	
    	if(!conexao.getConnection()) {
			JOptionPane.showMessageDialog(null, "Banco de dados não conectado", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}else {
	    	if(txtfieldNome.getText().equals("")||passfieldSenha.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Preencha todos os campos vazios","Erro", JOptionPane.ERROR_MESSAGE);
			}else {
				
				try {
					PreparedStatement st = BancoPosto.connection.prepareStatement("SELECT * FROM Funcionarios WHERE Nome = ? AND Senha = ?");
					st.setString(1, txtfieldNome.getText());
					st.setString(2, new String(passfieldSenha.getPassword()));
					
					dados = st.executeQuery();

					
					if(dados.next()) {
						if(dados.getString("NvAcesso").equals("adm"))
						{
							new HomeFrame().setVisible(true);;
					        this.dispose();
							System.out.println("adm");
						}
						else if(dados.getString("NvAcesso").equals("func"))
						{
							new HomeFunc().setVisible(true);;
					        this.dispose();
							System.out.println("func");
						}
						JOptionPane.showMessageDialog(null, "Logado com sucesso!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorreto!","Erro", JOptionPane.ERROR_MESSAGE);
					}
					
					st.close();
					
				}catch (Exception f){
					f.printStackTrace();
					JOptionPane.showMessageDialog(null, "Falha de conexão, conecte-se ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		}
		
    }
    
    public void mouseEntered(MouseEvent e) {
    	labelSair.setForeground(Color.red);
    }
     
    public void mouseExited(MouseEvent e) {
    	labelSair.setForeground(Color.black);
    }
    
    public void mouseClicked(MouseEvent e) {
		// sem evento
    }

    public void mousePressed(MouseEvent e) {
    	System.exit(0);
    }

    public void mouseReleased(MouseEvent e) {
		// sem evento
    }

    public static void main(String args[]) {
        new LoginFrame().setVisible(true); 
    }
    
    public void InserirEstoque() {
    	
    }

}