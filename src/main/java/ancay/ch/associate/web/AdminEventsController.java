package ancay.ch.associate.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/events")
public class AdminEventsController {

    @GetMapping
    public String list() {
        return "admin/events";
    }

    @GetMapping("/new")
    public String create() {
        return "admin/event-form";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "admin/event-form";
    }

}
