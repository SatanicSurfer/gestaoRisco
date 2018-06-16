<%@include file="WEB-INF/views/header.jsp"%>
	Welcome
	<div class="container-fluid">
  <div class="row">
  
  	<div class="col-md-12">
  				<div class="">
  					<a  class="btn btn-primary" href="<%=contextPath%>/cliente/clienteForm.action" style="margin-left:50%;">Adicionar Cliente</a>
  				</div>
                <div class="table-responsive">

                    <table id="mytable" class="table table-bordered" style="margin:10px;width:60%;">
                        <thead>
                          <th>Cliente Id</th>
                          <th>Nome</th>
                          <th>Endereco</th>
                          <th>Edit</th>
                        </thead>
                        <tbody>
								<tr>
								 	<td>${cliente.clienteId }</td>
									<td>${cliente.nome }</td>
									<td>${cliente.endereco }</td>
									<td>
									<a  class="btn btn-primary" href="<%=contextPath%>/cliente/editClienteView/${cliente.clienteId}.action">Editar</a>
									<a  class="btn btn-warning" href="<%=contextPath%>/cliente/deleteCliente/clienteId=${cliente.clienteId}.action">Apagar</a>
									</td>
								</tr>
                        </tbody>
                    </table>
                    <div class="clearfix"></div>
                 </div>
  	</div>
  </div>
</div>
<%@include file="WEB-INF/views/footer.jsp"%>