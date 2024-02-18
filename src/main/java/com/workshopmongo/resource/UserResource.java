package com.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongo.domain.User;


/*A anotação Restcontroller é utilizada para criar endopoints em aplicações
 * web que retornam dados no formato json,xml ou qualquer outro tipo de dados 
 * Quando o metodo de um controlador é anotado com essa annotation, o spring
 * automaticamente converte o retorno desse metodo para o formato desejado e o
 * envia de volta como resposta http*/
@RestController

/*O RequestMapping define o prefixo de URL para todas as rotas de um controller*/
@RequestMapping (value = "/users")
public class UserResource {
	
	/*O getMapping mapea as solicitações http get para métodos de manipulação de
	 * recursos de um controlador.Isso significa que quando um cliente faz uma solicração get
	 * para detemirmida URL, o metodo anotado com essa annotation correspondente a essa URL será 
	 * executado*/
	@GetMapping
	/**
	 * 
	 * @return uma lista de Users
	 */
	public ResponseEntity<List<User>>  findAll(){
		/*O ResponseEntity permite retornar não apenas o corpo da resposta, mas
		 * também códigos de status personalizados,cabeçalhos personalizados e muito mais*/
		User naruto = new User(1,"Naruto Uzumaki","lamen@hotmail.com");
		User nagato = new User (2,"Nagato Uzumaki","rinegan@hotmail.com");
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(naruto,nagato));
		return ResponseEntity.ok().body(list);
		
		
	}

}
