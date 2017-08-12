package com.diegolirio.demo.domain.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Produto {

	@Id @GeneratedValue
	private Long id;	
	private String descricao, codigo;
	private double valor;	
}
