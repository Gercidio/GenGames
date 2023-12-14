package com.generation.gengames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gengames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List<Produto> findAllByPrecoLessThan(@Param("precoMenor")BigDecimal preco);

    public List<Produto> findAllByPrecoGreaterThan(@Param("precoMaior")BigDecimal preco);
	
}
