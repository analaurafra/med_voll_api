// ...existing code...
package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GettingStarted {
    @GetMapping("/")
    public String home() {
        return "GettingStarted";
    }
}
// ...existing code...