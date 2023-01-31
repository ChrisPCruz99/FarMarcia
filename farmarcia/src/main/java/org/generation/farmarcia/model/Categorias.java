package org.generation.farmarcia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "O atributo nome é obrigatorio!")
	@Size(min = 5, max = 1000, message = "O atributo nome deve conter no minimo 05 caracteres")
	public String nome;
	@NotBlank(message = "O atributo descricao é obrigatorio!")
	@Size(min = 5, max = 1000, message = "O atributo descricao deve conter no minimo 05 caracteres")
	public String descricao;
	/*@NotBlank(message = "O atributo analgesico é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo analgesico deve conter no minimo 05 caracteres")
	public String quantiade;
	@NotBlank(message = "O atributo vitaminas é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo vitaminas deve conter no minimo 05 caracteres")
	public String embalagem;
	@NotBlank(message = "O atributo higiene é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo higiene deve conter no minimo 05 caracteres")
	public String higiene;
	@NotBlank(message = "O atributo homeopatico é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo homeopatico deve conter no minimo 05 caracteres")
	public String homeopatico;
	
	@ManyToOne
	@JsonIgnoreProperties ("categorias")
	private Produtos produtos;*/
	
	@OneToMany(mappedBy = "categorias", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("categorias")
	private List<Produtos> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}
}
	