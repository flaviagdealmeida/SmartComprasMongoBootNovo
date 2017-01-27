package br.org.smartcompras.repository;


import br.org.smartcompras.models.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoMongoRepository extends CrudRepository<Produto, String>{

}
