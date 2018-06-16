package br.com.dbccompany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.dbccompany.entity.Cliente;

@Repository("clienteDAO")
@Transactional
public class ClienteDAOImpl implements ClienteDAO {

	@PersistenceContext
	public EntityManager entityManager;

	@Transactional(readOnly = false)
	public Cliente adicionarCliente(Cliente cliente) {
		entityManager.persist(cliente);
		return cliente;
	}

	@Transactional(readOnly = false)
	public Cliente updateCliente(Cliente cliente) {
		entityManager.merge(cliente);
		return cliente;
	}

	@Transactional(readOnly = false)
	public void deleteCliente(long clienteId) {
		// TODO Auto-generated method stub

	}

	@Transactional(readOnly = false)
	public Cliente getCliente(long clienteId) {
		String sql = "select customer from Cliente cliente where cliente.clienteId = " + clienteId;
		try {
			return (Cliente) entityManager.createQuery(sql).getSingleResult();
		} catch (Exception e) {
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Cliente> getClientes() {
		return entityManager.createQuery("select cli from Cliente cli").getResultList();
	}

}
