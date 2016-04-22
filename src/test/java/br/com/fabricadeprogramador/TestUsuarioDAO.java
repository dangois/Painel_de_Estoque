package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}

	public static void testExcluir() {
		// Excluindo o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);

		// Excluindo usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso");
	}

	public static void testAlterar() {
		// Alterando o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Jãozão da Silva");
		usu.setLogin("jzaoss");
		usu.setSenha("12345678");

		// Alterando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso");
	}

	public static void testCadastrar() {
		// Criando o Usuário
		Usuario usu = new Usuario();
		usu.setNome("Jãozão");
		usu.setLogin("jzao");
		usu.setSenha("123");

		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso");

	}

}
