package org.generation.farmarcia.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "O atributo nome é obrigatorio!")
	@Size(min = 5, max = 50, message = "O atributo nome deve conter no minimo 05 caracteres")
	public String nome;
	@NotBlank(message = "O atributo valor é obrigatorio!")
	@Size(min = 5, max = 10, message = "O atributo valor deve conter no minimo 05 caracteres")
	public BigDecimal valor;
	@NotBlank(message = "O atributo data de validade é obrigatorio!")
	@Size(min = 6, max = 100, message = "O atributo data de validade deve conter no minimo 06 caracteres")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	public LocalDate dataValidade;
	//@NotBlank(message = "O atributo generico é obrigatorio!")
	public boolean generico;
	@NotBlank(message = "O atributo fornecedor é obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo fornecedor deve conter no minimo 05 caracteres")
	public String fornecedor;
	@NotBlank(message = "O atributo lote é obrigatorio!")
	@Size(min = 2, max = 100, message = "O atributo lote deve conter no minimo 02 caracteres")
	public String lote;
	
	/*@OneToMany(mappedBy = "produtos", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("produtos")
	private List<Categorias> categorias;*/
	@ManyToOne
	@JsonIgnoreProperties ("produtos")
	private Categorias categorias;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public boolean isGenerico() {
		return generico;
	}

	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	
}
