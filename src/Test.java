import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mycart.pojo.Address;
import com.mycart.pojo.Customer;
import com.mycart.pojo.Order;
import com.mycart.pojo.Order_Details;
import com.mycart.pojo.Product;
import com.mycart.pojo.Product_Category;
import com.mycart.pojo.Purchase_Details;
import com.mycart.pojo.SubCategory;

public class Test {

	public static void main(String[] args) {
		Address address = new Address("area", "street", "city", "state", "7456");
		Customer customer = new Customer("asdfasa", "asdfasas", "fasff", address,5774366);
		Product_Category pcag = new Product_Category("Men");

		SubCategory subcag = new SubCategory();
		subcag.setName("clothing");
		subcag.setPcg(pcag);
		
		pcag.addSubCategory(subcag);
		
		
		Product product = new Product("KeyBoard", 1000, 10,"Gaming KeyBoard...!","/MyCart/images/1(7).png",10);
		
		subcag.addProduct(product);
		pcag.addProduct(product);
		product.setSubCategory(subcag);
		product.setProduct_Category(pcag);
		Order order = new Order(customer, true, true);
		
		
		Purchase_Details details = new Purchase_Details();
		Order_Details odDetails = new Order_Details(order, 2, 3, "05-09-1994",details);
		
		order.setOrder_Details(odDetails);
		
		
		
		details.setOrder_Detail(odDetails);
		details.addProduct(product);
		
		odDetails.setPurchase_Details(details);
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(customer);
		session.save(product);
		session.save(order);
		session.save(odDetails);
		session.save(details);
		session.save(subcag);
		session.save(pcag);

		
		tx.commit();
		session.close();

	}

}
