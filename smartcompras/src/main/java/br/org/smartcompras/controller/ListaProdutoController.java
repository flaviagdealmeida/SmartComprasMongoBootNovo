package br.org.smartcompras.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.org.smartcompras.models.Produto;
import br.org.smartcompras.repository.MarcaMongoRepository;
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

	@RequestMapping(value = "/delprodutolista", params = { "removerprodutolista" }, method = RequestMethod.POST)

	public String delProduto(@ModelAttribute Produto produto, final HttpServletRequest req) {
		String produtoId = String.valueOf((req.getParameter("removerprodutolista")));

		produtoRepository.delete(produtoId);

		return "redirect:listaproduto";
	}

}
