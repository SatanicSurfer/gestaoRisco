package br.com.xxxcompany.ui.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.xxxcompany.domain.Risco;
import br.com.xxxcompany.entity.Cliente;
import br.com.xxxcompany.services.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	@Qualifier("clienteService")
	private ClienteService clienteService;
	
	@GetMapping("/")
	public String getHome(){
		return "redirect:clientes.action";
	}
	
	@GetMapping("/clientes")
	public ModelAndView getCustomers(){
		ModelAndView model  = new ModelAndView("clientes");
		List<Cliente> list = clienteService.getAllClientes();
		model.addObject("clientes", list);
		return model;
	}
	
	@GetMapping("/editClienteView/{clienteId}")
	public ModelAndView getEditCustomerForm(@PathVariable("clienteID") String clienteId){
		
		
		ModelAndView model  = new ModelAndView("editCliente");
		Cliente cli = clienteService.getCliente(Long.parseLong(clienteId));
		model.addObject("cliente", cli);
		return model;
		
	}
	@RequestMapping(value="/editCliente",method=RequestMethod.POST)
	public ModelAndView editCustomer(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("clientes");
		String clienteId = request.getParameter("clienteId");
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String risco = request.getParameter("risco");
		Risco riscoEnum = Risco.valueOf(risco);
		Double rendaMensal = Double.valueOf(request.getParameter("rendaMensal"));
		Cliente cliente = clienteService.updateCliente(Long.parseLong(clienteId), nome, endereco, riscoEnum, Double.valueOf(rendaMensal));
		if(cliente !=null){
			model.addObject("saveSuccess", "Cliente adicionado com sucesso: "+cliente.getNome());
		}else{
			model.addObject("saveError", "Falha na criação do registro");
		}
		List<Cliente> list = clienteService.getAllClientes();
		model.addObject("clientes", list);
		
		return model;
		
	}
	
	@RequestMapping(value="/adicionarCliente",method=RequestMethod.POST)
	public ModelAndView adicionarCliente(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("clientes");
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String risco = request.getParameter("risco");
		Double rendaMensal = Double.valueOf(request.getParameter("rendaMensal"));
		
		Risco riscoEnum = Risco.valueOf(risco);
		
		Cliente cliente = clienteService.adicionarCliente(nome, endereco, riscoEnum, Double.valueOf(rendaMensal));
		if(cliente!=null){
			model.addObject("saveSuccess", "Cliente Adicionado com sucesso:"+cliente.getNome());
		}else{
			model.addObject("saveError", "Customer creation failed");
		}
		List<Cliente> list = clienteService.getAllClientes();
		model.addObject("clientes", list);
		
		return model;
		
	}
	
}
