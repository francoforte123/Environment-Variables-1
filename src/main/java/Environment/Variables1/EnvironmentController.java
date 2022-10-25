package Environment.Variables1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

    @Autowired
    Environment environment;

    @GetMapping
    public String getMessage(){
        return "Developer= " + environment.getProperty("devName") + ", authCode= " + environment.getProperty("authCode");
    }
}
