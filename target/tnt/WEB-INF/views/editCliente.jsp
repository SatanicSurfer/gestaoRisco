<%@ include file="header.jsp" %>
<div class="container-fluid">

  <div class="row">
  	<div class="col-md-6">
  	</div>
  	<div class="col-md-6">
  			  <h2>Editar Cliente: ${cliente.nome }</h2>
			<form class="form-horizontal"  action="<%=request.getContextPath()%>/cliente/editCliente.action" method="post" role="form">
				 <input type="hidden" value="${cliente.clienteId }"	 name="clienteId" id="clienteId">
				<div class="form-group">
					<label for="title">Cliente Name</label>
					<div class="input-group">
						<span class="input-group-addon"> <span	class="glyphicon glyphicon-cog"></span></span>
						 <input type="text" value="${cliente.nome }"	class="form-control" name="name" id="name"
							placeholder="Enter Name" required>
					</div>
				</div>
				<div class="form-group">
					<label for="desc">Endereco</label>
					<div class="input-group">
						<span class="input-group-addon"> <span
							class="glyphicon glyphicon-pencil"></span></span> <input type="text"
							class="form-control" name="country" value="${cliente.endereco }"
							placeholder="Enter Country" required>
					</div>
				</div>
					<button type="submit" class="btn btn-primary">Editar</button>
			</form>
  	
  	</div>
 </div>
</div>