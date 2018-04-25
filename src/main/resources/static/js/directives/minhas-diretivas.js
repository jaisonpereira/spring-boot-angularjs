/**
 * Criar modulo unico para diretiva
 * 
 * Injetar esse modulo no modulo principal
 */
angular.module("minhasDiretivas", []).directive('linguagem', function() {
	// directive definition object
	var ddo = {};
	// diretiva pode ser utilizada como atributo ou elemento
	ddo.restric = 'AE';

	ddo.scope = {
		nome : '@'
	};
	/**
	 * mantendo elementos filhos com transclude
	 * 
	 * adicionar ng-transclude dentro da tag filho do template
	 * 
	 */
	ddo.transclude = true;

	ddo.templateUrl = 'js/directives/linguagem.html';

	return ddo;
});