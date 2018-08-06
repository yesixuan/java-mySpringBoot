package cn.vic.web;

import cn.vic.bean.JsonResult;
import cn.vic.bean.User;
import cn.vic.servivce.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户", notes = "根据id查询用户信息")
    @GetMapping(value = "user/{id}")
    public ResponseEntity<JsonResult> getUserById(@PathVariable(value = "id") Integer id) {
        JsonResult r = new JsonResult();
        try {
            User user = userService.getUserById(id);
            r.setResult(user);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }
}
