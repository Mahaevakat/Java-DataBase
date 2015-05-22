package com.iasa.ka23.ManagementSystem.ui;

import javax.swing.JOptionPane;

public class MainJFrame extends AbstractInterfaceUnit {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8397070250739186264L;
	public MainJFrame() {
		initComponents ();
	}
	// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
	public void initComponents () {
	
	jScrollPane1 = new javax.swing.JScrollPane();
	jLabel1 = new javax.swing.JLabel();
	BottomLabel = new javax.swing.JLabel();
	LogInPannel = new javax.swing.JPanel();
	LoginTextField = new javax.swing.JTextField();
	OkButton = new javax.swing.JButton();
	LoginLabel = new javax.swing.JLabel();
	PasswordLabel = new javax.swing.JLabel();
	PasswordTextField = new javax.swing.JPasswordField();
	
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	setTitle("LoginPanel");
	setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	
	jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel1.setText("Добро пожаловать");
	jLabel1.setToolTipText("HalloLabel");
	
	BottomLabel.setText("© Никитин&Махаева 2015");
	
	LogInPannel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "log in"));
	LogInPannel.setToolTipText("log in");
	LogInPannel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
	
	LoginTextField.setToolTipText("LoginTextField");
	LoginTextField.setDropMode(javax.swing.DropMode.INSERT);
	LoginTextField.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			LoginTextFieldActionPerformed(evt);
			}
	});
	
	OkButton.setText("OK");
	OkButton.setToolTipText("OkButton");
		OkButton.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			OkButtonActionPerformed(evt);
		}
	});
	
	LoginLabel.setText("Логин");
	LoginLabel.setToolTipText("введите логин");
	
	PasswordLabel.setText("Пароль:");
	PasswordLabel.setToolTipText("введите пароль");
	
	PasswordTextField.setToolTipText("PasswordTextField");
	
	javax.swing.GroupLayout LogInPannelLayout = new javax.swing.GroupLayout(LogInPannel);
	LogInPannel.setLayout(LogInPannelLayout);
	LogInPannelLayout.setHorizontalGroup(
	LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(LogInPannelLayout.createSequentialGroup()
	.addGroup(LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	.addGroup(LogInPannelLayout.createSequentialGroup()
	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	.addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
	.addGroup(LogInPannelLayout.createSequentialGroup()
	.addGap(22, 22, 22)
	.addGroup(LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	.addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
	.addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	.addGroup(LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	.addComponent(LoginTextField)
	.addComponent(PasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
	.addGap(0, 0, Short.MAX_VALUE)))
	.addContainerGap(16, Short.MAX_VALUE))
	);
	LogInPannelLayout.setVerticalGroup(
	LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(LogInPannelLayout.createSequentialGroup()
	.addContainerGap()
	.addGroup(LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	.addComponent(LoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	.addComponent(LoginLabel))
	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	.addGroup(LogInPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	.addComponent(PasswordLabel)
	.addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	.addComponent(OkButton)
	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	
	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setHorizontalGroup(
	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	.addGap(0, 0, Short.MAX_VALUE)
	.addComponent(BottomLabel)
	.addGap(213, 213, 213))
	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	.addContainerGap(47, Short.MAX_VALUE)
	.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
	.addGap(61, 61, 61))
	.addGroup(layout.createSequentialGroup()
	.addGap(67, 67, 67)
	.addComponent(LogInPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	layout.setVerticalGroup(
	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(layout.createSequentialGroup()
	.addGap(29, 29, 29)
	.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	.addGap(18, 18, 18)
	.addComponent(LogInPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
	.addComponent(BottomLabel)
	.addContainerGap())
	);
	
	pack();
	}// </editor-fold> 
	
	private void LoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) { 
	// TODO add your handling code here:
	} 
	
	private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) { 
		String username = LoginTextField.getText();
		@SuppressWarnings("deprecation")
		String password = PasswordTextField.getText();
		if (service.login(username, password)){
			this.setVisible(false);
			UIManager.openMainFrame();
		}
		else {
			JOptionPane.showMessageDialog(this, "Неправильный логин или пароль.");
		}
	} 
	
	/**
	* @param args the command line arguments
	*/
		public static void main(String args[]) {
			/* Set the Nimbus look and feel */
			//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
			/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
			* For details see http://download.oracle.com/javase/tutorial/uiswing/lo.. 
			*/
			try {
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (ClassNotFoundException ex) {
				java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			} catch (InstantiationException ex) {
				java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			} catch (IllegalAccessException ex) {
				java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			} catch (javax.swing.UnsupportedLookAndFeelException ex) {
				java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			}
			//</editor-fold>
			
			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			new MainJFrame().setVisible(true);
			}
			});
		}
	
	// Variables declaration - do not modify 
	private javax.swing.JLabel BottomLabel;
	private javax.swing.JPanel LogInPannel;
	private javax.swing.JLabel LoginLabel;
	private
	javax.swing.JTextField LoginTextField;
	private javax.swing.JButton OkButton;
	private javax.swing.JLabel PasswordLabel;
	private javax.swing.JPasswordField PasswordTextField;
	private javax.swing.JLabel jLabel1;
	@SuppressWarnings("unused")
	private javax.swing.JScrollPane jScrollPane1;
	// End of variables declaration 
}