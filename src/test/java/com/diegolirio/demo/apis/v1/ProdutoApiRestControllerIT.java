package com.diegolirio.demo.apis.v1;

import static com.jayway.restassured.RestAssured.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.diegolirio.demo.DemoApplication;
import com.jayway.restassured.RestAssured;

@ActiveProfiles("integration")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProdutoApiRestControllerIT {

    //private static final String PRODUTO_CODIGO = "654165165165";

	@LocalServerPort
    private int serverPort;
    
    //@Autowired
    //private ProdutoService produtoService;    
	
    @Before
    public void setup() {
    	RestAssured.port = this.serverPort;
    	//Produto produto = Produto.builder().codigo(PRODUTO_CODIGO).descricao("TV").valor(1200.99).build();
    	//Produto save = produtoService.save(produto);
    	//System.out.println(save);
	}
    
	@Test
	public void produto_resource_return_200_com_id_and_codigo() {
		when()
			.get("/api/v1/produtos")
		.then()
			.statusCode(200);
			//.body("[0]", )
			//.body("id", equalTo(1), 
			//	  "codigo", contains(PRODUTO_CODIGO));
	}

}
