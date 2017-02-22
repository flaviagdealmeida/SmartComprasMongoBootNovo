package br.org.smartcompras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.org.smartcompras.models.Predefinida;
import br.org.smartcompras.repository.ListasComprasRepository;
import br.org.smartcompras.repository.ProdutoMongoRepository;

public class ListaComprasController {
	
	@Autowired
	ListasComprasRepository preRepository;
	
	@Autowired
	ProdutoMongoRepository produtoRepository;
	
	
	@RequestMapping(value = "/addpre", method = RequestMethod.POST)
	public String addMarcas(@ModelAttribute Predefinida pre) {
		preRepository.save(pre);
		return "redirect:listapredefinida";

	}
	
	

}
