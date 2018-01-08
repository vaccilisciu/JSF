package scai.formazione.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Controller {

	public String getPage() {
		return "result";
	}
}
