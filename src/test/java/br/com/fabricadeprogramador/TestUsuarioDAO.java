package br.com.fabricadeprogramador;

import java.util.List;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		//testExcluir();
		//testSalvar();
		//testBuscarPorId();
		testBuscarTodos();
	}
	
	private static void testBuscarPorId() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscarPorId(5);
		System.out.println(usuario);
	}
	
	private static void testBuscarTodos() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> lista = usuarioDAO.buscarTodos();
		for (Usuario u: lista){
			System.out.println(u);
		}
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

	public static void testExcluir() {
		// Excluindo o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);

		// Excluindo usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso");
	}

	public static void testSalvar(){
		
		Usuario usuario = new Usuario();
		//usuario.setId(1);
		usuario.setNome("Dandan");
		usuario.setLogin("dg");
		usuario.setSenha("123456");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.salvar(usuario);
		
		System.out.println("Salvo com sucesso");
	}



}
