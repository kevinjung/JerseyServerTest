import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

public class CrossDomainFilter implements ContainerResponseFilter {

	@Override
	public ContainerResponse filter(ContainerRequest arg0, ContainerResponse arg1) {
		arg1.getHttpHeaders().add("Access-Control-Allow-Origin", "*");
		return arg1;
	}
}