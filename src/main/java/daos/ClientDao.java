package daos;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Client;

public interface ClientDao extends JpaRepository<Client, Integer>{

}
