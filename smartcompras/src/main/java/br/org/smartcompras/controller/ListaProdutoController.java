package br.org.smartcompras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.org.smartcompras.repository.ProdutoMongoRepository;

@Controller
public class ListaProdutoController {

	@Autowired
	ProdutoMongoRepository produtoRepository;

	
	@RequestMapping(value = "/searchprodutoslista")
	public String search(@RequestParam String searchprodutoslista) {
		return "redirect:listaproduto";
	}

	@RequestMapping("/listaproduto")
	public String produtoList(Model model) {
		model.addAttribute("produtoList", produtoRepository.findAll());
		return "listaproduto";
	}
		
	

	
}
