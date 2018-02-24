$(function() {
	$(".js-load-alunos").on('click', function() {
		$.ajax({
				url: "http://localhost:8080/crudws/alunos",
				type: "get",
				success: function(response) {
					desenhaTabela(response);
				}
		});
	})
});

function desenhaTabela(dados) {
	$(".js-alunos-table-body tr").remove();
	for(var i=0; i < dados.length; i++) {
		desenhaLinha(dados[i]);
	}
}

function desenhaLinha(linha) {
	var linhaTabela = $("<tr/>");
	$(".js-alunos-table-body").append(linhaTabela);
	linhaTabela.append("<td>" + linha.id + "</td>");
	linhaTabela.append("<td>" + linha.nome + "</td>");
	linhaTabela.append("<td>" + linha.endereco + "</td>");
}
