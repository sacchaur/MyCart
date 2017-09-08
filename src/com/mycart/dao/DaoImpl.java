package com.mycart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycart.pojo.Customer;
import com.mycart.pojo.Product;

@Repository
public class DaoImpl implements DaoInterface {
	SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product> pros = query.list();
		tx.commit();
		session.close();
		return pros;
	}

	@Override
	public Product getProductById(int productId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Product product = null;
		try {
			product = (Product) session.createQuery("from Product p where p.productId=?").setInteger(0, productId)
					.uniqueResult();
			tx.commit();
		} catch (NullPointerException e) {
			return new Product();
		}
		session.close();
		return product;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductBySubCategory(String productCategory) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Product> products = session.createQuery("from Product p where p.product_Category.category_name=?")
				.setString(0, productCategory).list();
		tx.commit();
		session.close();
		return products;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByName(String productName) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Product> products = session.createQuery("from Product p where p.productName=?").setString(0, productName)
				.list();
		tx.commit();
		session.close();
		return products;
	}

	@Override
	public void addCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();

	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Customer customer = (Customer) session.createQuery("from Customer p where p.email=?").setString(0, email)
				.uniqueResult();
		tx.commit();
		session.close();
		return customer;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public List<Product> getAllProductByName(String productName) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		List<Product> product = session.createQuery("from Product p where p.productName like?")
				.setString(0, "%" + productName + "%").list();
		session.close();
		return product;
	}

	@Override
	public void addProduct(Product product) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
		session.close();
	}

	@Override
	public void updateProduct(Product product) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Query query = session.createSQLQuery(
				"update product set productName = :name,price=:price,discount=:dis,description=:des,imagePath=:img,totalCount=:count"
						+ " where productId = :id");

		query.setString("name", product.getProductName());
		query.setDouble("price", product.getPrice());
		query.setFloat("dis", product.getDiscount());
		query.setString("des", product.getDescription());
		query.setString("img", product.getImagePath());
		query.setLong("count", product.getTotalCount());
		query.setInteger("id", product.getProductId());
		int result = query.executeUpdate();
		System.out.println("Rows Affected :" + result);
		tx.commit();

		/*
		 * Transaction tx = null; try { tx = session.beginTransaction();
		 * session.Update(product); tx.commit(); session.close(); } catch
		 * (HibernateException e) { if (tx != null) tx.rollback();
		 * e.printStackTrace(); } finally {
		 */
		session.close();

	}

}
