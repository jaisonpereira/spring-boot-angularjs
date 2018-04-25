/**
 * Usamos um modulo ja existente definido na pagina inicial e passamos por
 * parametro nome do controller definido pela convencao do angular seguido de
 * uma funcao anonima
 * 
 * recebendo uma funcao anonima
 * 
 * injetando dois servicos scope
 * 
 * e http
 * 
 */
angular.module('systemjason').controller('IndexController',
		function($scope, $http) {
			$scope.desenvolvedor = {
				nome : 'Jason Pereira',
				nivel : 'Sênior'
			}

			/**
			 * Efetuando uma req get para recuperar os dados do backend
			 */
			$http.get('/linguagens/list/').success(function(data) {
				$scope.linguagens = .data;
			}).error(function(error){
				console.error(error)
				
			});

		});