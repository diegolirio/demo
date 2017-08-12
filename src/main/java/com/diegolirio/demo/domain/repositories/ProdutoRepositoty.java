package com.diegolirio.demo.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diegolirio.demo.domain.orm.Produto;

@Repository
public interface ProdutoRepositoty extends CrudRepository<Produto, Long> {

}
