package br.com.dbccompany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dbccompany.dao.ClienteDAO;
import br.com.dbccompany.entity.Cliente;

@Service("clienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired(required = true)
	@Qualifier("clienteDAO")
	private ClienteDAO clienteDAO;

	@Transactional
	public Cliente adicionarCliente(String nome, String endereco, String risco, Double rendaMensal) {
		System.out.println(" Cliente Service create invoked: " + nome);
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setRendaMensal(rendaMensal);
		cliente.setRisco(risco);
		cliente = clienteDAO.adicionarCliente(cliente);
		return cliente;
	}

	@Transactional
	public Cliente updateCliente(long id, String nome, String endereco, String risco, Double rendaMensal) {
		System.out.println("Cliente Service Update invoked: " + nome);
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setRendaMensal(rendaMensal);
		cliente.setRisco(risco);
		cliente = clienteDAO.updateCliente(cliente);
		return cliente;
	}

	@Override
	public Cliente getCliente(long id) {
	       return clienteDAO.getCliente(id);
	}

	@Override
	public List<Cliente> getAllClientes() {
		return clienteDAO.getClientes();
	}

}
