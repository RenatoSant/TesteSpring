package Teste.Aprendiz.TesteSpring.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusControler {

    @GetMapping("/Api/Status")
    public String checkStatus(){
        return "Online";
    }
}
