package training.sapient.pmsbasicscategory;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


// Since in ribbon we want to have multiple clients for this reason 
// we shall not have url in the feign client 

//@FeignClient(name = "pms-product-service", url = "http://localhost:8000")



//@FeignClient(name = "pms-product-service")

@FeignClient(name = "pms-zuul-api-gateway-server")
@RibbonClient(name = "pms-product-service")

public interface CategoryServiceProxy {

	@GetMapping("/pms-product-service/get-product-list-by-filter")
//	@GetMapping("/get-product-list-by-filter")
	public List<Product> getListOfProduct();
}
