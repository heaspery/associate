package ancay.ch.associate.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import ancay.ch.associate.config.AssociationProperties;

@ControllerAdvice
public class GlobalModelAttributes {

    private final AssociationProperties association;

    public GlobalModelAttributes(AssociationProperties association) {
        this.association = association;
    }

    @ModelAttribute("association")
    public AssociationProperties association() {
        return association;
    }

}
