package com.cts.schemagen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.schemagen.form.AttributeClass;
import com.cts.schemagen.form.AttributeContainer;

@Controller
public class ContactController {

	
	/*private static List<Contact> contacts = new ArrayList<Contact>();

	static {
		contacts.add(new Contact("Barack", "Obama", "barack.o@whitehouse.com", "147-852-965"));
		contacts.add(new Contact("George", "Bush", "george.b@whitehouse.com", "785-985-652"));
		contacts.add(new Contact("Bill", "Clinton", "bill.c@whitehouse.com", "236-587-412"));
		contacts.add(new Contact("Ronald", "Reagan", "ronald.r@whitehouse.com", "369-852-452"));
	}
	
	
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ModelAndView get() {
		
		ContactForm contactForm = new ContactForm();
		contactForm.setContacts(contacts);
		
		return new ModelAndView("add_contact" , "contactForm", contactForm);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("contactForm") ContactForm contactForm) {
		System.out.println(contactForm);
		System.out.println(contactForm.getContacts());
		List<Contact> contacts = contactForm.getContacts();
		
		if(null != contacts && contacts.size() > 0) {
			ContactController.contacts = contacts;
			for (Contact contact : contacts) {
				System.out.printf("%s \t %s \n", contact.getFirstname(), contact.getLastname());
			}
		}
		
		return new ModelAndView("show_contact", "contactForm", contactForm);
	}
	
	
	@ModelAttribute("programform") 
	public ProgramForm populatePojos() { 
	    // Don't forget to initialize the pojos list or else it won't work 
	    ProgramForm programform = new ProgramForm(); 
	    List<Programs> programs = LazyList.decorate(new ArrayList<Programs>(), FactoryUtils.instantiateFactory(Programs.class));

	    for(int i=0; i<2; i++) { 
	        programs.add(new Programs()); 

	    } 
	    programform.setPrograms(programs); 
	    return programform; 
	}
	
	
	@RequestMapping(value = "createprog")
	public ModelAndView tiles2(@ModelAttribute("programform") ProgramForm  programform,
	        BindingResult result) {
	    //Map<String, Object> model = new HashMap<String, Object>();
	    //model.put("articles",  articleService.listArticles());

	    return new ModelAndView("createprogram");
	}

	@RequestMapping(value = "/saveprogram", method = RequestMethod.POST)
	public ModelAndView saveProgram(@ModelAttribute("programform") ProgramForm  programform,
	        BindingResult result) {
	    for(Programs programs : programform.getPrograms()) {
	           System.out.println(programs.getProgram_id());
	          // articleService.addProgram(programs);
	        }
	    return new ModelAndView("createprogram");

}
	
	
	
	@RequestMapping(value = "/helloWorld2", method = RequestMethod.GET)
	public ModelAndView printWelcome2(@ModelAttribute("user") Users user) {

		ModelAndView mav = new ModelAndView("lazyRowLoad");
		mav.addObject("message", "Hello World!!!");
		return mav;

	}

	@RequestMapping(value = "/lazyRowAdd", method = RequestMethod.POST)
	public ModelAndView lazyRowAdd(@ModelAttribute("user") Users user) {
System.out.println(user.getName());
		Users users=new Users();
		ModelAndView mav = new ModelAndView("lazyRowLoad");
		mav.addObject("users", users);
		
		return mav;

	}
	*/
	
	
	
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public ModelAndView printWelcome() {

		ModelAndView mav = new ModelAndView("addAttribute");
		
		return mav;

	}
	
	@RequestMapping(value = "/addschema", method = RequestMethod.POST)
	public ModelAndView mapAttribute(@ModelAttribute("attributeContainer") AttributeContainer attributeContainer) {

		 for(AttributeClass attributeClass : attributeContainer.getListcontainer()) {
	           System.out.println(attributeClass.getAttributeName());
	          // articleService.addProgram(programs);
	        }
		//Users users=new Users();
		//ModelAndView mav = new ModelAndView("lazyRowLoad");
		//mav.addObject("users", users);
		 ModelAndView mav = new ModelAndView("addAttribute");
			
			return mav;

	}
	
	
	
	
	
}