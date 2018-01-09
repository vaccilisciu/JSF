package scai.formazione.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ControllerBean {

	public String moveToPage() {
		return "result?faces-redirect=true";
	}
}
