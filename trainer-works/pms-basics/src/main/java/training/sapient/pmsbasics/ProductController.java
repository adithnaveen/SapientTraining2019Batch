package training.sapient.pmsbasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class ProductController {

	@Autowired
	private Environment environment;

	
	@Autowired(required = true)
	Configuration configuration; 

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/")
	public String sayHello() {
		return "Hello World -> running on " ; // + configuration.getPort();
	}

	@GetMapping("/get-product-list-titles")
	public MappingJacksonValue getProductListTitles() {

		Product product = new Product(101, "Computer", 10000, true);

		Set<String> fieldsExcept = new HashSet<String>();

		fieldsExcept.add("productPrice");
//		fieldsExcept.add("isAvailable");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("productPrice");

		FilterProvider filters = new SimpleFilterProvider().addFilter("product-list", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(product);
		mapping.setFilters(filters);
		logger.info("{}", mapping);
		return mapping;
	}

//	@GetMapping("/get-product-list")

	@GetMapping("/get-product-list-by-filter")
	public MappingJacksonValue getProductListPrice() {

		List<Product> list = Arrays.asList(
				new Product(101, "Computer", 10000, true,
						Integer.parseInt(environment.getProperty("local.server.port"))),
				new Product(102, "laptop", 20000, false), new Product(103, "Mouse", 300, true));

		Set<String> fields = new HashSet<String>();

		fields.add("productPrice");
		fields.add("productId");
		fields.add("port");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(fields);

		FilterProvider filters = new SimpleFilterProvider().addFilter("product-list", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(list);
		mapping.setFilters(filters);

		return mapping;
	}

}
