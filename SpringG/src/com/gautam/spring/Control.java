package com.gautam.spring;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gautam.spring.Service.Game;

@Controller
public class Control {

	static ArrayList<String> numbers = Game.getStartNumbers();

	@RequestMapping("/game")
	public ModelAndView startgame(HttpServletRequest request, HttpServletResponse response) {

		ArrayList<String> adjacents = new ArrayList<>();
		ModelAndView mv = new ModelAndView();

		for (int i = 9; i < numbers.size(); i++) {
			adjacents.add(numbers.get(i));
		}
		mv.addObject("nums", numbers);
		mv.addObject("adjacent", adjacents);
		mv.setViewName("game.jsp");

		return mv;

	}

	@RequestMapping("/numbers")
	public ModelAndView begingame(HttpServletRequest request, HttpServletResponse response) {
		int input = 0;
		for (int i = 0; i < 9; i++) {

			if (request.getParameter("" + i) == null) {

			} else {
				input = Integer.parseInt((request.getParameter("" + i)));
			}
		}

		ArrayList<String> adjacents = new ArrayList<>();
		for (int i1 = 9; i1 < numbers.size(); i1++) {
			adjacents.add(numbers.get(i1));
		}

		if (!(adjacents.contains("" + input))) {
			ModelAndView mv = new ModelAndView();

			mv.addObject("nums", numbers);
			mv.setViewName("game.jsp");
			mv.addObject("adjacent", adjacents);
			return mv;
		} else {
			numbers = Game.beginNumberGame(input, numbers);
			if (numbers.get(0).equals("over")) {
				ModelAndView mv = new ModelAndView();
				mv.setViewName("gameover.jsp");
				return mv;

			}
			adjacents.clear();
			for (int i = 9; i < numbers.size(); i++) {
				adjacents.add(numbers.get(i));
			}
			ModelAndView mv = new ModelAndView();
			mv.addObject("nums", numbers);
			mv.addObject("adjacent", adjacents);
			mv.setViewName("game.jsp");
			return mv;

		}

	}

}
