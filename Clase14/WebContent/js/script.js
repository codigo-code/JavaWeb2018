(function() {

	var app = angular.module('myapp', []);

	app.controller('formularioControlador', function($scope,$http) {
		$scope.titulo ="Bienvenidos a la aplicacion amicariana!";
		
		
		$scope.checar =function(v){
			console.log(v.nombre);
		}
		
		 
		
		$scope.checkUser=function(){
			 $http({
			        method : "GET",
			        url : "check.do"
			    }).then(function mySuccess(response) {
			    	console.log(response);
			        
			    	if($scope.user == response.data.user && 
			    	$scope.password == response.data.password)
			    	{
			    		alert("el usuario puede ingresar a la app");
			    	}else{
			    		alert("usuario o contraseña no valida")
			    	}
			    	
			        
			        
			    }, function myError(response) {
			        $scope.myWelcome = response.statusText;
			    });
		}
		
	});
	
	app.controller('controlado2',function($scope){
		
	});

})();