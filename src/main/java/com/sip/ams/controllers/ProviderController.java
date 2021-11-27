package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Provider;
@RequestMapping("provider")
@Controller
public class ProviderController {
	
	static final ArrayList<Provider> providers = new ArrayList<>();
	static{
	providers.add(new Provider(1,"Orange","orange@gmail.com","France"));
	providers.add(new Provider(2,"HUAWEI","huawei@gmail.com","Chine"));
	providers.add(new Provider(3,"HP","hp@gmail.com","USA"));
	
	}
	
	
	@RequestMapping("/welcome")
	//@ResponseBody
	public String home(Model model)
	{
		String name="Sesame";
		String entreprise="vermeg";
		model.addAttribute("nom", name);
		model.addAttribute("societe", entreprise);
		
		ArrayList<String> modules = new ArrayList<>();
		modules.add("Java - OCA");
		modules.add("Java - JDBC");
		modules.add("GIT");
		modules.add("SPRING");
		model.addAttribute("modules", modules);
		return "provider/home";
	}

	@RequestMapping("/list")
	public String listProvider(Model model)
	{
		model.addAttribute("providers", providers);
		return "provider/listProvider";
	}
	
	@RequestMapping("/delete/{id}")
	//@ResponseBody
	public String deleteProvider(@PathVariable("id") int id)
	{
		int index = -1;
		int compteur = 0;
		for(Provider p : providers)
		{
			if(p.getId()==id)
			{
				index =compteur; 
			}
			compteur++;
		}
		
		providers.remove(index);
		return "redirect:../list";
		//return "ID : " + id;
	}
}
