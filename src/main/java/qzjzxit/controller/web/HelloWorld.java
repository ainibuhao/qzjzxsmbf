package qzjzxit.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}

	/** Freemarkerģ���Controller */
	@RequestMapping(value = "/welcome", method = { RequestMethod.GET })
	public ModelAndView getFirstPage(HttpServletRequest request) {
		// welcom������ͼ�����ƣ�welcom.ftl��
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("name", "My First Spring Mvc and Freemarker !");
		return mv;
	}

	/** jspģ���Controller */
	@RequestMapping(value = "/jsp", method = { RequestMethod.GET })
	public ModelAndView getJsp(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message1", "�л���jspģ�塢");
		mv.addObject("message2", "My First Spring Mvc");
		mv.setViewName("index");
		return mv;
	}
}
