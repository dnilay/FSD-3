package comm.example.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import comm.example.model.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCustomer(Customer customer) {
		jdbcTemplate.update("insert into customer(first_name,last_name,email) values (?,?,?)",
				customer.getFirstName(),customer.getLastName(),customer.getEmail());
		
	}


}
