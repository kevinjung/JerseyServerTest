import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/")
public class JerseyServerResource {
	@GET
	public String helloworld() {
		return "Hello world!";
	}
}
