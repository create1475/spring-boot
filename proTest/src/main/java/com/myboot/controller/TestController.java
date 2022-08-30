package com.myboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myboot.dao.TestDAO;
import com.myboot.vo.TestVO;

@Controller("testController")
public class TestController {
	
	@Autowired
	private TestVO testVO;
	
	@Autowired
	private TestDAO testDAO;
	
	@RequestMapping(value = {"/testform.do"}, method = RequestMethod.GET)
	private ModelAndView main(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = (String) request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		System.out.println(viewName);
		mav.setViewName(viewName);
		return mav;
	}
	
	
	@RequestMapping(value = "/test9.do", method = RequestMethod.POST)
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/text; charset=utf-8");
		List membersList = testDAO.listTests();
		ModelAndView mav = new ModelAndView("/listtest");
		mav.addObject("membersList",membersList);
		return mav;
	}
}
