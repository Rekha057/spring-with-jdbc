package Spring_jdbc1.Spring_jdbc1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext Ac= new ClassPathXmlApplicationContext("food.xml");
       foodBean fb=Ac.getBean(foodBean.class);
       foodCRUD crud=Ac.getBean(foodDAO.class);
       int row = crud.save(fb);
       if(row>0) {
    	   System.out.println("Insertion is success");
       }
       else {
    	   System.out.println("check your code");
       }
      // List<foodBean> list = crud.getallfoodlist();
      //System.out.println(list);
    }
}
