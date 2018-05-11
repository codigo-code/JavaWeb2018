(function() {

	var app = angular.module('app', []);

	app.controller('controladorBody', function($scope, $http) {

		$scope.callApi = function(v) {
			var id = v.idBar;
			$http.get("http://localhost:8080/getBar/" + id).then(
					function(resp) {
						console.log(resp.data);
						if (resp.data.value !== undefined) {
							$scope.nombreBar = resp.data.value.nombre;
							$scope.capacidad = resp.data.value.cantPersonas;
							$scope.precio = resp.data.value.precio;
						} else
							alert("no tengo el dato solicitado");
					}, function(err) {
						alert("Error en el api");
					});

		}

	});

})();
