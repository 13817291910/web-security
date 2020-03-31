package dkk.websecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private static Logger logger = LoggerFactory.getLogger("TestController");
    @RequestMapping("/")
    @ResponseBody
    String home(String flag){
        logger.info("flag=" + flag);
        return "flag=" + flag;
    }
}
