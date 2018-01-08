package scai.formazione.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloWorldBean {

	public String getHello() {
		return "Hello Bean for JSF";
	}
}
