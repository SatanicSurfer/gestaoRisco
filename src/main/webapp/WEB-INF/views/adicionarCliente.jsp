<%@ include file="header.jsp" %>
<div class="container-fluid">

  <div class="row">
  	<div class="col-md-6">
  			  <h2>Adicionar Cliente</h2>
			<form class="form-horizontal"  action="<%=request.getContextPath()%>/cliente/adicionarCliente.action" method="post" role="form">
				<div class="form-group">
					<label for="title">Nome</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" 	class="form-control" name="name" id="name"
							placeholder="Nome Sobrenome" required>
					</div>
				</div>
				<div class="form-group">
					<label for="desc">Endereço</label>
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="endereco" id="endereco"
							placeholder="Digite seu logradouro: Rua, Av, Servidão etc..." required>
					</div>
				</div>
					<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
  	
  	</div>
 </div>
</div>