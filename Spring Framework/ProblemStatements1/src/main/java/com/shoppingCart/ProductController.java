package com.shoppingCart;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;


	@Controller
	public class ProductController {
		
		@Autowired
		private ProductService productService;

		@RequestMapping(value = "/List Product", method = RequestMethod.GET)
		public String listemployees(Model model) {
			model.addAttribute("product", new Product());
			model.addAttribute("List", productService.allProduct());
			return "product";
		}

		// Same method For both Add and Update Product
		@RequestMapping(value = "/product/add", method = RequestMethod.POST)
		public String addProduct(@ModelAttribute("product") Product product) {

			if ( product.getId() == 0) {
				// new employee, add it
				productService.addProduct(product);
			} else {
				// existing employee, call update
				productService.updateByProductId(product);
			}

			return "redirect:/product";

		}

		@RequestMapping("/product/delete/{id}")
		public String deleteproduct(@PathVariable("id") int id) {

			productService.deleteByProductId(id);
			return "redirect:/product";
		}

		@RequestMapping("/product/edit/{id}")
	    public String editproduct(@PathVariable("id") int id, Model model) {
	       // model.addAttribute("product", productService.FindByProductId(id));
	        model.addAttribute("employeeList", productService.allProduct());
	        return "product";
	    }
	
}