angular.module('imagens').controller('ImgProdutosController', function($scope, $http){
	
	$scope.fotos =[];
	$scope.filtro='';
	
		
		$http.get('listagem/fotos')
			.sucess(function(fotos){
				$scope.fotos = fotos;
			})
		.error(function(erro){
			console.log(erro);
		})
	
}); 	