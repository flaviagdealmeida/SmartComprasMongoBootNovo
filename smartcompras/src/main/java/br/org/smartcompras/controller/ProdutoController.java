package br.org.smartcompras.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.org.smartcompras.models.Marca;
import br.org.smartcompras.models.Produto;
import br.org.smartcompras.repository.MarcaMongoRepository;
import br.org.smartcompras.repository.ProdutoMongoRepository;


@Controller
public class ProdutoController {

	@Autowired
	ProdutoMongoRepository produtoRepository;
	MarcaMongoRepository marcaRepository;
	//TipoProdutoMongoRepository tipoRepository;
	
	 
	
	@RequestMapping(value = "/addprodutos", method = RequestMethod.POST)
	public String addMarcas(@ModelAttribute Produto produto) {
		produtoRepository.save(produto);
		return "redirect:produto";

	}
	

	@RequestMapping(value = "/searchprodutos")
	public String search(@RequestParam String searchprodutos) {
		return "redirect:produto";
	}

	@RequestMapping("/produto")
	public String produtoList(Model model) {
		model.addAttribute("produtoList", produtoRepository.findAll());
		return "produto";
	}

	@RequestMapping(value = "/delproduto", params = { "removerProduto" }, method = RequestMethod.POST)

	public String delProduto(@ModelAttribute Produto produto, final HttpServletRequest req) {
		String produtoId = String.valueOf((req.getParameter("removerProduto")));

		produtoRepository.delete(produtoId);

		return "redirect:produto";
	}
	
	@RequestMapping(value = "/delprodutoslista", params = { "removerProdutos" }, method = RequestMethod.POST)

	public String delProdutos(@ModelAttribute Produto produto, final HttpServletRequest req) {
		String produtoId = String.valueOf((req.getParameter("removerProdutos")));

		produtoRepository.delete(produtoId);

		return "redirect:listaproduto";
	}
	@RequestMapping("listarmarca")
	public List<Iterable<Marca>> marcaLista(){
		return Arrays.asList(marcaRepository.findAll());
		
	}

	
/*	@RequestMapping(value = "/tipoproduto", params = { "tipo" }, method = RequestMethod.POST)
	public String listarTipo(Model model, final HttpServletRequest req){
		model.addAttribute("listarTipo", tipoRepository.findTipoProduto(req.getParameter("tipo")));
		return "redirect:produto";
	}*/

}
