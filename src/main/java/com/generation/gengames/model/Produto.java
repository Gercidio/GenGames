package com.generation.gengames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O nome deve conter entre 5 e 100 caracteres!")
	private String nome;
	
	@Column(length = 255)
	@Size(min = 5, max = 255, message = "A descrição deve ter no mínimo 5 e no máximo 255 caracteres.")
	@NotBlank(message = "A descrição é obrigatória!")
	private String descricao;
	
	@NotNull
	@Digits(integer = 1, fraction = 2)
	@DecimalMin(value = "0.0", inclusive = false)
	private BigDecimal preco;
	
	@Column(length = 100)
	@NotBlank(message = "O nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O nome deve conter entre 5 e 100 caracteres!")
	private String foto;
	
	@Column(length = 100)
	@NotBlank(message = "O nome do console é obrigatório!")
	@Size(min = 5, max = 100, message = "O nome do console deve conter entre 5 e 100 caracteres!")
	private String console;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}	
	

}
