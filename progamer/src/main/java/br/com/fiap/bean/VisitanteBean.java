package br.com.fiap.bean;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.VisitanteDao;
import br.com.fiap.model.Visitante;

@Named
@RequestScoped
public class VisitanteBean {

	private Visitante visitante = new Visitante();
	
	private VisitanteDao visitanteDao = new VisitanteDao();
	private UploadedFile image;
	
	public String save() throws IOException  {

		System.out.println(this.visitante);
		
		System.out.println(image.getFileName()); 
		
		ServletContext servletContext = (ServletContext) FacesContext
															.getCurrentInstance()
															.getExternalContext()
															.getContext();
		String servletPath = servletContext.getRealPath("/");
		
		System.err.println(servletPath);
		
		FileOutputStream out = 
				new FileOutputStream(servletPath + "\\images\\" + image.getFileName());
		out.write(image.getContent());
		out.close();
		
		visitante.setImagePath("\\images\\" + image.getFileName());
		
		visitanteDao.create(visitante);
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage("Usuário cadastrado com sucesso"));
		
		return "profile";
		
	}
	
	public List<Visitante> listAll() {
		return visitanteDao.listAll();
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public VisitanteDao getVisitanteDao() {
		return visitanteDao;
	}

	public void setVisitanteDao(VisitanteDao visitanteDao) {
		this.visitanteDao = visitanteDao;
	}

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}



}
