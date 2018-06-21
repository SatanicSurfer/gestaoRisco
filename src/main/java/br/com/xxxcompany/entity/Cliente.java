package br.com.xxxcompany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;

import br.com.xxxcompany.domain.Risco;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cliente_id", unique = true, nullable = false)
	private long clienteId;
	
	@Column(name="nome")
	private String nome;

	@ManyToMany
	@JoinTable(name="tb_cliente_endereco", joinColumns ={
			@JoinColumn(name="cliente_id") },
			inverseJoinColumns = { @JoinColumn(name="endereco_id")})
	private Set<Endereco> listaEndereco;
	
	@Column(name="risco")
	@Enumerated(EnumType.STRING)
	private Risco risco;
	
	@Column(name="renda_mensal")
	@NumberFormat(pattern="$###.###,00")
	private Double rendaMensal;
	
	public long getClienteId() {
		return clienteId;
	}
	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Endereco> getListaEndereco() {
		return listaEndereco;
	}
	public void setListaEndereco(Set<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}
	public Risco getRisco() {
		return risco;
	}
	public void setRisco(Risco risco) {
		this.risco = risco;
	}
	public Double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (clienteId ^ (clienteId >>> 32));
		result = prime * result + ((listaEndereco == null) ? 0 : listaEndereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rendaMensal == null) ? 0 : rendaMensal.hashCode());
		result = prime * result + ((risco == null) ? 0 : risco.hashCode());
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
		Cliente other = (Cliente) obj;
		if (clienteId != other.clienteId)
			return false;
		if (listaEndereco == null) {
			if (other.listaEndereco != null)
				return false;
		} else if (!listaEndereco.equals(other.listaEndereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rendaMensal == null) {
			if (other.rendaMensal != null)
				return false;
		} else if (!rendaMensal.equals(other.rendaMensal))
			return false;
		if (risco == null) {
			if (other.risco != null)
				return false;
		} else if (!risco.equals(other.risco))
			return false;
		return true;
	}

}
