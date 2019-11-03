package training.sapient.pmsbasicscategory;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

	@Autowired
	private CategoryServiceProxy proxy;
	Logger logger = LoggerFactory.getLogger(this.getClass()); 

	@GetMapping("/get-category")
	public Category getMyCategory() {
		return new Category(101, "Electronics");
	}

	@GetMapping("/get-category-with-products-feign")
	public CategoryWithProducts getMyCategoryWithProducts() {

		List<Product> response = proxy.getListOfProduct();

		logger.info("{}", response);
		
		return new CategoryWithProducts(101, "Electronics", response);
	}
}
