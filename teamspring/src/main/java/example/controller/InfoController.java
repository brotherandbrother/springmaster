package example.controller;

import example.bean.User;
import example.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/info")
public class InfoController {
    @ResponseBody
        @RequestMapping("/list")
    public List<User> list(ModelMap modelMap){
        return new UserDao().query(null,null);
    }
}
