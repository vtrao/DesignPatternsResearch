package tilesapp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.tiles.ComponentContext;
import org.apache.struts.tiles.Controller;

import org.apache.struts.tiles.beans.MenuItem;
import org.apache.struts.tiles.beans.SimpleMenuItem;

import java.util.ArrayList;
import java.util.List;


/**
 * @author rhightower
 */
public class SimpleController implements Controller{
	public void perform(ComponentContext context, 
						HttpServletRequest request, 
						HttpServletResponse response, 
						ServletContext servletContext) 
						throws ServletException, IOException {
		List items = (List)getLinks();
		context.putAttribute("items",items);
	}
    private MenuItem createMenuItem(String label, String link){
		SimpleMenuItem item = new SimpleMenuItem();
		item.setLink(link);
		item.setValue(label);    
		return item;	
    }
    private List getLinks(){
		List list = new ArrayList();
		list.add(createMenuItem("Home",
			"/index.html"));
		list.add(createMenuItem("Rick's",
            "http://www.rickhightower.com"));
		list.add(createMenuItem("Trivera",
			"http://www.triveratech.com"));
		return list;
    }
}
 