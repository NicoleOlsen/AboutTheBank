package aboutTheBank.bonds;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BondService implements IBondService {

    @Autowired
    private BondRepository repository;

    @Override
    public List<Bond> findAll() {

        List<Bond> bonds = (List<Bond>) repository.findAll();
        
        return bonds;
    }
}