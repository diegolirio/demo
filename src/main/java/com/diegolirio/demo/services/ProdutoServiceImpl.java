package com.diegolirio.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegolirio.demo.domain.orm.Produto;
import com.diegolirio.demo.domain.repositories.ProdutoRepositoty;

@Service("produtoServiceImpl")
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepositoty produtoRepository;

	@Override
	public Iterable<Produto> findAll() {
		return this.produtoRepository.findAll();
	}

	@Override
	public Produto save(Produto produto) {
		return this.produtoRepository.save(produto);
	}
	
}
