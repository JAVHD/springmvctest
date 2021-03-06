package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.constant.ResponseCode;
import com.bear.springmvctest.dto.LoginResult;
import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.UserService;
import com.bear.springmvctest.service.YcgjLoginService;
import com.bear.springmvctest.util.ApiResultUtil;
import com.bear.springmvctest.util.JwtUtil;
import com.bear.springmvctest.vo.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/13 下午5:18
 * Description:
 */

@Controller
@RequestMapping("ycgj")
@Api(tags = "登录")
public class YcgjLoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("manage/login")
    @ApiOperation(value = "后台登录")
    public @ResponseBody
    Object index(@RequestParam("username") String username, @RequestParam("password") String password) {
        //public @ResponseBody Object index(@ModelAttribute User user) {

        //入参validate

        User user = new User();
        user.setUsername(username);

        //校验登录
        if (!userService.checkUsernameIsExist(username)) {
            return ApiResultUtil.fail(ResponseCode.CODE_40001);
        }

        //校验密码
        if (!userService.checkPassword(username, password)) {
            return ApiResultUtil.fail(ResponseCode.CODE_40002);
        }

        LoginVo userDetail = userService.getLoginResult(username);

        //jwt
        String token = jwtUtil.generateToken(userDetail);
        userDetail.setToken(token);

        return ApiResultUtil.ok(userDetail);
    }

}
