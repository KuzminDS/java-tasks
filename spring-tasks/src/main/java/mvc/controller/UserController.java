package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class UserController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Hello world!");
        return modelAndView;
    }
}