package scai.formazione.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloWorldBean {

	
	public String getTitle() {
		return "HelloBean";
	}
	
	public String getBody() {
		return "Text from HelloJavaBean.java";
	}
}
