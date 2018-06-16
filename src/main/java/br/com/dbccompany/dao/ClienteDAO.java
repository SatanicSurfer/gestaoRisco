package br.com.dbccompany.dao;

import java.util.List;

import br.com.dbccompany.entity.Cliente;

public interface ClienteDAO {
	
	public Cliente adicionarCliente(Cliente cliente);

	public Cliente updateCliente(Cliente cliente);

	public void deleteCliente(long clienteId);

	public Cliente getCliente(long clienteId);

	public List<Cliente> getClientes();
}
