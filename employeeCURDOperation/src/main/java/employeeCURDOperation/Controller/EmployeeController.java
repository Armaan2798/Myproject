package employeeCURDOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import employeeCURDOperation.Service.EmployeeService;
import employeeCURDOperation.DTO.Employee;

@Controller
@RequestMapping("/con1")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping("/index")

	public String getIndexpage() {
		return "index";
	}

	@RequestMapping(path = "/addForm", method = RequestMethod.GET)
	private String getForm() {

		return "addEmployeeForm";
		// TODO Auto-generated method stub

	}

	@RequestMapping(path = "/addEmpForm", method = RequestMethod.GET)
	public String getAddFormPage() {
		return "addEmployeeForm";
	}

	@RequestMapping(path = "/addemp", method = RequestMethod.POST)
	public String addEmployee(Employee e, Model myModel) {
		boolean isInserted = service.addEmpolyee(e);
		String msg = "";
		if (isInserted)
			//msg = "Inserted";
			return "redirect:/con1/diplayall";
		else
			return "redirect:/con1/diplayall";

		/*myModel.addAttribute("test", msg);
		return "displayMsg";*/
	}

	@RequestMapping(path = "/diplayall", method = RequestMethod.GET)
	public String displayallEmployee(Model myModel) {
		List<Employee> allEmp = service.displayAllEmps();
		myModel.addAttribute("allEmployees", allEmp);

		return "displayAll";
	}

	@RequestMapping(path = "/edit/{id}", method = RequestMethod.GET)
	public String getEditPage(@PathVariable("id") int id, Model empModel) {
		// System.out.println(id);
		Employee emp = service.searchEmployee(id);

		empModel.addAttribute("emp", emp);
		return "editPage";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String updateEmployee(Employee e, Model myModel) {
		System.out.println(e);

		boolean isUpdate = service.update(e);
		/*String msg = "";
		if (isUpdate)
			msg = "update";
		else
			msg = "not update";

		myModel.addAttribute("test", msg);
		return "displayMsg";
		
*/
		
		if (isUpdate) {
			return "redirect:/con1/index";
			
		}
		return "redirect:/con1/diplayall";
	}

	@RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
	private String delete(@PathVariable("id") int id, Model myModel) {

		boolean isDeleted = service.delete(id);
		/*
		 * String msg=""; if(isDeleted) msg="update"; else msg="not update";
		 * 
		 * myModel.addAttribute("test",msg);
		 */
		/* return "redirect:/employee/diplayall"; */
		if (isDeleted) {
			return "redirect:/con1/diplayall";
		} else {
			return "redirect:/con1/diplayall";
		}
	}

	// @requestparam(name=value),@pathvariable
}
