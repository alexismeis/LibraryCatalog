package catalog.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import catalog.beans.Book;
import catalog.beans.InventoryItem;
import catalog.beans.Transaction;
import catalog.beans.User;

/**
 * @author dominicwood - ddwood2@dmacc.edu
 * CIS175 - Fall 2022
 * Nov 11, 2022
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public User user() {
		User bean = new User();
		return bean;
	}
	@Bean
	public Book book() {
		Book bean = new Book();
		return bean;
	}
	@Bean
	public Transaction transaction() {
		Transaction bean = new Transaction();
		return bean;
	}
	@Bean
	public InventoryItem inventoryItem() {
		InventoryItem bean = new InventoryItem();
		return bean;
	}
}
