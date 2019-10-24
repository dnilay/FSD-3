package comm.example.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import comm.example.model.Customer;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer(first_name,last_name,email) values (?,?,?)",
				customer.getFirstName(),customer.getLastName(),customer.getEmail());
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select first_name,last_name,email from customer", new CustomerMApper());
	}


}
