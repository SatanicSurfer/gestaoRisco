package br.com.dbccompany.services;

import java.util.List;

import br.com.dbccompany.entity.Cliente;

public interface ClienteService {
	
	public Cliente adicionarCliente(String nome, String endereco, String risco, Double rendaMensal);

	public Cliente updateCliente(long id, String nome, String endereco, String risco, Double rendaMensal);

	public Cliente getCliente(long id);

	public List<Cliente> getAllClientes();

}
