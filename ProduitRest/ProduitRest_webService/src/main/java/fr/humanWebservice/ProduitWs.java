package fr.humanWebservice;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import fr.humanbooster.service.ServiceLocal;

@Path("/produitWbs")
public class ProduitWs {
	
	
	@EJB
	public ServiceLocal produitService;
	
	@GET
	@Path("/getProduit")
	@Produces("application/json")//transforme  notre requete
	//au format json donc quelque soit le type de client on peut acceder à l'EJB
	public String getProduit() {
		String nomProduit=produitService.getProduit();
				return nomProduit;
	}
	
	
	
	
}
