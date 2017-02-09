/*angular.module('produtos').controller(function($scope, $http){
	
	$scope.imgs =[];
	
	$http.get('localhost:8080/listaimgprodutos')
	.success(function(img){
		$scope.imgs = img;
	})
	.error(function(erro){
		console.log(error);
	})
}); */


angular.module('produtos').factory('ProdutosController', function($http) {
    return {
        getProduct: function(id) {
            return $http.get('/listaimgproduto').then(function(response) {
                return response.data;
            });
        }
    };
});

/*$http.get("welcome.htm").then(function (response) {
    $scope.myWelcome = response.data;
});
});*/