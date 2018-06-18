package br.com.xxxcompany.services;

import java.util.List;

import br.com.xxxcompany.domain.Risco;
import br.com.xxxcompany.entity.Cliente;

public interface ClienteService {
	
	public Cliente adicionarCliente(String nome, String endereco, Risco risco, Double rendaMensal);

	public Cliente updateCliente(long id, String nome, String endereco, Risco risco, Double rendaMensal);

	public Cliente getCliente(long id);

	public List<Cliente> getAllClientes();

}
