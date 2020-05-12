package youtube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 public class PolicyManagementController {

   @RequestMapping(value = "/cratePolicy",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
  public void createPolicy(HttpServletRequest request, HttpServletResponse response)
           throws Exception {
    System.out.println("##### /cratePolicy  called #####");
   }

  @RequestMapping(value = "/modifyPolicy",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
  public void modifyPolicy(HttpServletRequest request, HttpServletResponse response)
          throws Exception {
   System.out.println("##### /modifyPolicy  called #####");
  }


 }
