package ar.com.educacionit.ws.rest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import ar.com.educacionit.ws.domain.Producto;
import ar.com.educacionit.ws.rest.dto.meli.CategoriaDetalle;
import ar.com.educacionit.ws.rest.dto.meli.Site;

/**
 * Hello world!
 *
 */
public class MeliCategoriaRestClient 
{
    public static void main( String[] args )
    {
    	//client
    	Client client = ClientBuilder.newClient();
    	
    	//target
    	WebTarget webTarget = client.target("https://api.mercadolibre.com/categories/MLA5725");
    	
    	Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
    	
    	Response response = invocationBuilder.get();
    	
    	if(Status.OK.getStatusCode() == response.getStatus()) {
    		
    		CategoriaDetalle categoriaDetalle = response.readEntity(CategoriaDetalle.class);
    		
    		System.out.println(categoriaDetalle);
    	}
    }
}
