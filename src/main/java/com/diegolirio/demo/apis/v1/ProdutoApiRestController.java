package com.diegolirio.demo.apis.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegolirio.demo.domain.orm.Produto;
import com.diegolirio.demo.services.ProdutoService;

@RestController
@RequestMapping(value="/api/v1/produto")
public class ProdutoApiRestController {

	@Autowired @Qualifier("produtoServiceImpl")
	private ProdutoService produtoService;

	@GetMapping("/find-all")
	public Iterable<Produto> findAll() {
		return this.produtoService.findAll();
	}
	
	@PostMapping("/save")
	public Produto save(@RequestBody Produto produto) {
		return this.produtoService.save(produto);
	}
	
}
