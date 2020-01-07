package com.hudaoxing.cas.client.demo;

import org.jasig.cas.client.util.AssertionHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoController {
    @RequestMapping("")
    public String index(Model model, HttpServletRequest request) {
        //获取用户名，根据业务需要选择
        model.addAttribute("ru", request.getRemoteUser());
        model.addAttribute("pu", AssertionHolder.getAssertion().getPrincipal().getName());
        return "index";
    }
}
