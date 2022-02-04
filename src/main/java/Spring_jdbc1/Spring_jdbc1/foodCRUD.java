package Spring_jdbc1.Spring_jdbc1;

import java.util.List;

public interface foodCRUD {
 public int save(foodBean s);//used to insert the data to db
 public List<foodBean > getallfoodlist();//used to retrive the data
 
}
