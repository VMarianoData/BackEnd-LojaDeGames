package com.generation.lojadejogos.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 1, max = 100, message = "O atributo título dece conter no minimo 1 e no máximo 100 caracteres")
	private String nome;

	@Size(min = 1, max = 100, message = "O atributo validade deve conter no minímo 1 e no máximo 100 caracteres")
	private String tipoProduto;

	@Size(min = 1, max = 100, message = "O atributo cor deve conter no minímo 1 e no máximo 100 caracteres")
	private String cor;

	@Size(min = 1, max = 100, message = "O atributo validade deve conter no minímo 1 e no máximo 100 caracteres")
	private String temDesconto;

	@UpdateTimestamp
	private LocalDateTime date;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTemDesconto() {
		return temDesconto;
	}

	public void setTemDesconto(String temDesconto) {
		this.temDesconto = temDesconto;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
