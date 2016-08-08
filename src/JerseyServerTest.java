import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class JerseyServerTest {
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		ResourceConfig rc = new PackagesResourceConfig("");
		rc.getProperties().put(
		    "com.sun.jersey.spi.container.ContainerResponseFilters",
		    "CrossDomainFilter"
		);
		HttpServer server = HttpServerFactory.create("http://localhost:8000/", rc);
		server.start();
	}
	
}
