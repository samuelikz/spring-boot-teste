package futuroDEV.springbootteste.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController{
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/receberMensagem")
    public String receberMensagem(@RequestParam(name="mensagem",
        required=false, defaultValue="1234") 
        String mensagem, Model model) {

            model.addAttribute("mensagem", mensagem);
            return "mensagem";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
