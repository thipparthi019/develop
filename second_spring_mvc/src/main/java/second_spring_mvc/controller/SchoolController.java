package second_spring_mvc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import second_spring_mvc.dao.SchoolDao;
import second_spring_mvc.dto.SchoolDto;

@Controller
public class SchoolController {

	@Autowired
	SchoolDao sDao;
	
	@RequestMapping("/home1")
	public  ModelAndView create()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("home.jsp");
		mav.addObject("sDto", new SchoolDto());
		return mav;
	}
	@RequestMapping("/sub")
	public ModelAndView insert(@ModelAttribute SchoolDto sDto) 
	{
		sDao.saveData(sDto);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("mes.jsp");
		mav.addObject("msg", " inserted Sucessfully.......");
		return mav;
		
	}
	@RequestMapping("/display")
	public ModelAndView retrive()
	{
		ArrayList<SchoolDto> students=sDao.getAllStu();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("disp.jsp");
		mav.addObject("stu", students);
		return mav;
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int stuNo)
	{
		String mesg=sDao.deleteStu(stuNo);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("mes.jsp");
		mav.addObject("msg", mesg);
		return mav;
		
	}
	@RequestMapping("/edit")
	public ModelAndView editStu(@RequestParam int stuNo)
	{
		SchoolDto sDto=sDao.getStuNo(stuNo);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("edit.jsp");
		mav.addObject("sDto", sDto);
		return mav;
	}
	@RequestMapping("/modify")
	public ModelAndView updateStu(@ModelAttribute SchoolDto sDto)
	{
		String message=sDao.updateStu(sDto);
		ModelAndView mav=new ModelAndView();
	    mav.setViewName("mes.jsp");
	    mav.addObject("msg", message);
		return mav;
	}
}
