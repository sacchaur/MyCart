package com.mycart.controller;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mycart.pojo.Address;
import com.mycart.pojo.Customer;
import com.mycart.pojo.Product;
import com.mycart.pojo.ShoppingCart;
import com.mycart.service.ServiceInterface;

@Controller
public class MyCartController {

	public ServiceInterface service;

	@Autowired
	public void setService(ServiceInterface service) {
		this.service = service;
	}

	ShoppingCart cart = new ShoppingCart();;

	@RequestMapping("/homeAction")
	protected ModelAndView showHome(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		try {
			HttpSession session = arg0.getSession();
			String email = arg0.getParameter("email1");
			System.out.println("email is  : " + email);
			Customer customer = service.getCustomerByEmail(email);
			String passwd = customer.getPassword();
			if (email.equalsIgnoreCase("admin") && passwd.equals(session.getAttribute("passwd"))) {
				return new ModelAndView("adminPage");
			}
		} catch (NullPointerException e) {
			return new ModelAndView("index");
		}
		return new ModelAndView("index");

	}

	@RequestMapping("/getAllItems")
	protected ModelAndView getAllItemsAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView mav = new ModelAndView();

		mav.addObject("product", service.getAllProduct());
		mav.setViewName("getAllItems");
		return mav;
	}

	@RequestMapping("/getItemAction")
	protected ModelAndView getItemAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView mav = new ModelAndView();
		String productId = arg0.getParameter("productId");
		mav.addObject("product", service.getProductById(Integer.parseInt(productId)));

		mav.setViewName("getItem");
		return mav;
	}

	@RequestMapping("/addCartAction")
	protected ModelAndView addCartAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		HttpSession session = arg0.getSession();
		ModelAndView mav = new ModelAndView();
		System.out.println("email is : " + session.getAttribute("email"));
		if (null == session.getAttribute("email")) {
			mav.setViewName("login");
		} else {
			String productId = arg0.getParameter("productId");
			cart.addProductToCart(service.getProductById(Integer.parseInt(productId)));
			mav.addObject("product", service.getAllProduct());
			mav.addObject("size", cart.getTotalItems());
			mav.setViewName("getAllItems");
		}

		return mav;
	}

	@RequestMapping("/showCartAction")
	protected ModelAndView showCartAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		HttpSession session = arg0.getSession();
		ModelAndView mav = new ModelAndView();
		System.out.println("email is : " + session.getAttribute("email"));
		if (null == session.getAttribute("email")) {
			mav.setViewName("login");
		} else {
			Set<Product> products = cart.getAllProductInCart();
			double totalPrice = cart.getTotalPrice();
			mav.addObject("products", products);
			mav.addObject("totalPrice", totalPrice);
			mav.setViewName("addCart");
		}

		return mav;
	}

	@RequestMapping("/loginAction")
	protected ModelAndView loginAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		HttpSession session = arg0.getSession();
		ModelAndView mav = new ModelAndView();
		try {
			String email = arg0.getParameter("email");
			String password = arg0.getParameter("passwd");
			Customer customer = service.getCustomerByEmail(email);
			String passwd = customer.getPassword();
			if (email.equalsIgnoreCase("admin") && passwd.equals(password)) {
				session.setAttribute("email", email);
				session.setAttribute("passwd", passwd);
				mav.setViewName("adminPage");
			} else if (passwd.equals(password)) {
				session.setAttribute("email", email);
				cart.removeAll();
				mav.setViewName("index");
			} else {
				mav.setViewName("login");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			mav.setViewName("login");
		}
		return mav;
	}

	@RequestMapping("/logoutAction")
	protected ModelAndView logoutAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		HttpSession session = arg0.getSession();
		ModelAndView mav = new ModelAndView();

		session.removeAttribute("email");
		session.invalidate();
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/addCustomerAction")
	protected ModelAndView addCustomerAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView mav = new ModelAndView();
		cart = new ShoppingCart();
		String name = arg0.getParameter("txtFName");
		String email = arg0.getParameter("email");
		String phoneNo = arg0.getParameter("contactNo");
		String area = arg0.getParameter("txtarea");
		String city = arg0.getParameter("txtcity");
		String street = arg0.getParameter("txtstreet");
		String state = arg0.getParameter("txtstate");
		String pincode = arg0.getParameter("txtpin");
		String password = arg0.getParameter("passwd");
		Address address = new Address(area, street, city, state, pincode);
		Customer customer = new Customer(name, email, password, address, Long.parseLong(phoneNo));
		service.addCustomer(customer);
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/checkout")
	protected ModelAndView checkout(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
			
		mav.setViewName("thankyou");
		return mav;
	}

	@RequestMapping("/removeItemAction")
	protected ModelAndView removeItemAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();

		String productId = arg0.getParameter("productid");
		Set<Product> products = cart.getAllProductInCart();
		Iterator<Product> itr = products.iterator();
		while (itr.hasNext()) {
			Product product = itr.next();
			if (product.getProductId() == Integer.parseInt(productId)) {
				itr.remove();
			}
		}
		double totalPrice = cart.getTotalPrice();

		mav.addObject("totalPrice", totalPrice);
		mav.addObject("products", products);
		mav.setViewName("addCart");
		return mav;
	}

	@RequestMapping("/searchString")
	protected ModelAndView searchString(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		String search1 = arg0.getParameter("search").trim();
		mav.addObject("product", service.getAllProductByName(search1));
		mav.setViewName("getAllItems");
		return mav;
	}

	@RequestMapping("/addProductNow")
	protected ModelAndView addProduct(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView mav = new ModelAndView();
		String productName = arg0.getParameter("productName");
		String price = arg0.getParameter("price");
		String discount = arg0.getParameter("discount");
		String description = arg0.getParameter("description");
		String imageName = arg0.getParameter("imageName");
		String count = arg0.getParameter("count");
		Product product = new Product(productName, Double.parseDouble(price), Float.parseFloat(discount), description,
				"/MyCart/images/" + imageName, Long.parseLong(count));
		service.addProduct(product);
		mav.setViewName("addProduct");
		System.out.println("Product Added....");
		return mav;
	}

	@RequestMapping("/updateProductAction")
	protected ModelAndView updateProductAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		String productName = arg0.getParameter("productNm");
		String price = arg0.getParameter("price");
		String discount = arg0.getParameter("discount");
		String description = arg0.getParameter("description");
		String imageName = arg0.getParameter("image");
		String totalCount = arg0.getParameter("count");

		Product product = new Product(productName, Double.parseDouble(price), Float.parseFloat(discount), description,
				"/MyCart/images/" + imageName, Long.parseLong(totalCount));

		service.updateProduct(product);
		mav.setViewName("updateProduct");
		return mav;
	}

	@RequestMapping("/getProductAction")
	protected ModelAndView getProductAction(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView();
			String productId = arg0.getParameter("productId");
			Product product = service.getProductById(Integer.parseInt(productId));
			mav.addObject(product);
			mav.setViewName("updateProduct");
		} catch (IllegalArgumentException e) {
			System.out.println("Product not available.");
			mav.setViewName("updateProduct");
		}
		return mav;
	}

	@RequestMapping("/loginAction1")
	protected ModelAndView loginAction1(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		HttpSession session = arg0.getSession();
		System.out.println("loginAcion1 :"+session.getAttribute("email"));
		if(null == session.getAttribute("email")){
			mav.addObject("login");
		}else{
			mav.addObject("index");
		}
		return mav;
	}
	@RequestMapping("/showImage")
	protected ModelAndView showImage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		HttpSession session = arg0.getSession();
		String imgPath = (String) arg0.getParameter("imgPath");
		System.out.println("imgPath: "+imgPath);
		mav.addObject("imgPath",imgPath);
		mav.setViewName("showImage");
		return mav;
	}
	

}
