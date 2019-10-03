package br.com.projeto.test;

import javax.swing.JOptionPane;

import br.com.projeto.beans.Endereco;
import br.com.projeto.dao.EnderecoDAO;

/*
 * @author Michael RM82443
 * 
 * */
public class CadastroEnderecoDAO {

	public static void main(String[] args) {
		EnderecoDAO dao = null;
		Endereco endereco = null;
		
		try {
			dao = new EnderecoDAO();
			endereco = new Endereco();
			
			endereco.setLougradouro(JOptionPane.showInputDialog("Endereco"));
			endereco.setNumero(JOptionPane.showInputDialog("Numero"));
			endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
			endereco.setCep(JOptionPane.showInputDialog("Cep"));
			endereco.setZona(JOptionPane.showInputDialog("Zona"));
			endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
			endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
			endereco.setEstado(JOptionPane.showInputDialog("Estado"));
			
			dao.addEndereco(endereco);

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}