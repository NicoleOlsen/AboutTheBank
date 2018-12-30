package aboutTheBank.bonds;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondRepository extends CrudRepository<Bond, Long> {

}