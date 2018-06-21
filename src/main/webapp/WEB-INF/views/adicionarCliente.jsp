<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ include file="header.jsp"%>
<div class="container-fluid">

	<div class="row">
		<div class="col-md-6">
			<h2>Adicionar Cliente</h2>
			
			<form class="form-horizontal" action="<%=request.getContextPath()%>/cliente/adicionarCliente.action"
				method="post" role="form">
				
				<div class="form-group">
					<label for="nome">Nome</label>
					<div class="input-group" >
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-cog"></span></span> <input type="text"
							class="form-control" name="nome" id="nome"
							placeholder="Nome Sobrenome" required="true">
					</div>
				</div>
				<div class="form-group">
					<label for="endereco">Endereço</label>
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="endereco" id="endereco"
							placeholder="Digite seu logradouro: Rua, Av, Servidão etc..."
							required="true">
					</div>
				</div>
				<div class="form-group">
					<label for="numero">Número</label>
					<div class="input-group" style="width: 30%">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="numero" id="numero"
							placeholder="Número" required="true">
					</div>
				</div>
				<div class="form-group">
					<label for="cep">CEP</label>
					<div class="input-group" style="width: 30%">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="cep" id="cep" placeholder="CEP"
							required="true">
					</div>
				</div>
				<div class="form-group">
					<label for="cidade">Cidade</label>
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="cidade" id="cidade"
							placeholder="Cidade" required="true">
					</div>
				</div>
				<div class="form-group">
					<label for="estado">Estado</label>
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="estado" id="estado"
							placeholder="Estado" required="true">
					</div>
				</div>
				<div class="form-group">
					<label for="rendaMensal">Renda Mensal</label>
					<div class="input-group">
						<span class="input-group-addon">R$</span>
						<input type="number" step="any" class="form-control currency" 
						data-number-to-fixed="2" data-number-stepfactor="100" 
						name="rendaMensal" id="rendaMensal" placeholder="Renda Mensal" required="true"/>
					</div>
				</div>
				<div class="form-group">
					<label for="risco">Risco</label>
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="risco" id="risco" placeholder="Risco" required="true" style="width: 30%">
					</div>
				</div>

				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>

		</div>
	</div>
</div>
