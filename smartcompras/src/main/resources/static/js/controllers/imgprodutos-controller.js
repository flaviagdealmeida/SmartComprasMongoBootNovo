angular.module('produtos').controller('ImgprodutosController', function($scope, $http){
	
	$scope.fotos =[];
	$scope.filtro='';
	
		
		$http.get('/produto')
			.sucess(function(foto){
				$scope.fotos = foto;
			})
		.error(function(erro){
			console.log(erro);
		})
	
}); 

