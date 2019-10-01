
package com.prtTool.app.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/*import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.prt.dbconnection.DBConnection;
import com.prt.pojo.releasePojo;

@RestController
public class SpringPRTController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showDate()
	{
		return new ModelAndView("welcomePage");
	}
	
	@RequestMapping(value="/hom", method=RequestMethod.GET)
	public ModelAndView showLoginPage(
			@RequestParam(value="startdate") String startdate,
            @RequestParam(value="endDate") String endDate) throws SQLException, ParseException {
        List<releasePojo> releaseList=DBConnection.dateAdjustedCall(startdate, endDate);
        ModelAndView model1 = new ModelAndView("Index");
		model1.addObject("lists", releaseList);
		return model1;
    }
	
}

