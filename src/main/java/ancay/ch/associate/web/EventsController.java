package ancay.ch.associate.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EventsController {

    @GetMapping("/events")
    public String events() {
        return "events";
    }

    @GetMapping("/events/{id}")
    public String event(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "event";
    }

}
