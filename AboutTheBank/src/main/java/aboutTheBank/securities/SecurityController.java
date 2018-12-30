package aboutTheBank.securities;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController {
	@Autowired 
    //IBondService bondService;
	
	//private BondRepository bondRepository;
	
    @GetMapping("/security")
    public String security() {
       // model.addAttribute("name", name);
        return "security";
    }

	/*
    @GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewBond (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Bond bond = new Bond();
		bond.setBuyer(name);
		bond.setSeller(email);
		bondRepository.save(bond);
		return "security";
	}*/

    /*
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Bond> getAllBons() {
		// This returns a JSON or XML with the users
		return bondRepository.findAll();
	}*/
	/*
    @GetMapping("/security")
    public String findBonds(Model model) {
       // List<Bond> bonds = (List<Bond>) bondService.findAll();
        //model.addAttribute("bonds", bonds);
        return "security";
    }
	*/
}
