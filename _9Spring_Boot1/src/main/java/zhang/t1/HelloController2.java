package zhang.t1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController2 {
    @ResponseBody
    @RequestMapping("/h3")
    public String h3(){
        return "abc123";
    }
}
