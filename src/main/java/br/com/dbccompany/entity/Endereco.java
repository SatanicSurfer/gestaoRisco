package br.com.dbccompany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="endereco_id")
	private long enderecoID;
	
	@Column(name="logradouro")
	private String logradouro;
	
	@Column(name="numero")
	private Integer numero;
	
	@Column(name="cep")
	private String CEP;
	
	@Column(name="cidade")
	private String Cidade;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToMany(mappedBy="listaEndereco")
	private Set<Cliente> listaCliente;

	public long getEnderecoID() {
		return enderecoID;
	}

	public void setEnderecoID(long enderecoID) {
		this.enderecoID = enderecoID;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Set<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(Set<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CEP == null) ? 0 : CEP.hashCode());
		result = prime * result + ((Cidade == null) ? 0 : Cidade.hashCode());
		result = prime * result + ((listaCliente == null) ? 0 : listaCliente.hashCode());
		result = prime * result + (int) (enderecoID ^ (enderecoID >>> 32));
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (CEP == null) {
			if (other.CEP != null)
				return false;
		} else if (!CEP.equals(other.CEP))
			return false;
		if (Cidade == null) {
			if (other.Cidade != null)
				return false;
		} else if (!Cidade.equals(other.Cidade))
			return false;
		if (listaCliente == null) {
			if (other.listaCliente != null)
				return false;
		} else if (!listaCliente.equals(other.listaCliente))
			return false;
		if (enderecoID != other.enderecoID)
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
