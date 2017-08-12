package com.diegolirio.demo.services;

import com.diegolirio.demo.domain.orm.Produto;

public interface ProdutoService {

	Iterable<Produto> findAll();

	Produto save(Produto produto);

}
