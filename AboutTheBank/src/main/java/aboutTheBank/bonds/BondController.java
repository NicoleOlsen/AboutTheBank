package aboutTheBank.bonds;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BondController {
    
    @Autowired
    IBondService bondService;

    @GetMapping("/bonds")
    public String findBonds(Model model) {
        
        List<Bond> bonds = (List<Bond>) bondService.findAll();
        
        model.addAttribute("bonds", bonds);
        
        return "bonds";
    }
}