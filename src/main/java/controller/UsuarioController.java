package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Usuario;


@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioController {

	private Usuario usuario;
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	public String adicionar(){
		usuarios.add(usuario);
		
		return null;
		
	}
}