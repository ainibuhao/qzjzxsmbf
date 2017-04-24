package qzjzxit.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import qzjzxit.system.SystemInfo;
import qzjzxit.web.mybait.entity.User;
import qzjzxit.web.service.UserService;

@Controller
@RequestMapping("/index")
public class IndexController {
	@Autowired()  
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request) {
		User user=userService.selectByPrimaryKey(1);
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("name", user.getUsername());
		return mv;
	}

}
