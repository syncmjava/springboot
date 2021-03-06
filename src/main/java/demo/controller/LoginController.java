package demo.controller;

/**
 * Created by Administrator on 2016/10/11.
 */

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import demo.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhengyunfei on 2016/9/2.
 */
@RestController
@Api(value = "8:用户登陆接口", description = "用户登陆",position = 2,produces = "application/json")
public class LoginController {
    @Autowired
    UserMapper userMapper;
    @ApiOperation(httpMethod = "POST", value = "登陆方式一：普通登陆(<font color='blue'>release</font>)",position = 1,nickname = "手机号码+密码登陆", notes = "<h4>传递参数:</h4><br>" +
            "<table border='1' cellspacing='10' cellpadding='10'><tr><th>字段</th><th>备注</th><th>是否为空</th></tr>" +
            "<tr><td>mobile</td><td>手机号码</td> <td>否</td></tr>" +
            "<tr><td>password</td><td>密码</td> <td>否</td></tr>" +
            "</table>" +
            "<h4>返回字段:</h4><br>" +
            "<h4>1：当手机号码格式错误的时候:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"手机号码格式错误\",\"data\":null,\"code\":1004}</code></pre></div>" +
            "<h4>2:当密码格式输入错误的时候返回:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"密码格式错误,正确格式6-16位字母或数字\",\"data\":null,\"code\":1007}</code></pre></div>" +
            "<h4>4:当信息填写正确的时候返回token:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"ok\",\"data\":{\"token\":1234678905618},\"code\":0}</code></pre></div>" )
    @RequestMapping(value = "/api/user/login", method = RequestMethod.POST)
    @ResponseBody
    public Object login1(@RequestParam String mobile, @RequestParam String password,HttpServletRequest request){
        String myJsonData="";
        return myJsonData;
    }
    @ApiOperation(httpMethod = "POST", value = "登陆方式二：快速登陆(<font color='blue'>release</font>)",position = 2,nickname = "手机号码+短信验证码登录", notes = "<h4>传递参数:</h4><br>" +
            "<table border='1' cellspacing='10' cellpadding='10'><tr><th>字段</th><th>备注</th><th>是否为空</th></tr>" +
            "<tr><td>mobile</td><td>手机号码</td> <td>否</td></tr>" +
            "<tr><td>vcode</td><td>验证码</td> <td>否</td></tr>" +
            "</table>" +
            "<h4>返回字段:</h4><br>" +
            "<h4>1：当手机号码格式错误的时候:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"手机号码格式错误\",\"data\":null,\"code\":1004}</code></pre></div>" +
            "<h4>3:当验证码输入错误的时候返回:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"验证码错误\",\"data\":{\"count\":1},\"code\":1008}count:表示错误次数 </code></pre></div>" +
            "<h4>4:当信息填写正确的时候返回token:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"ok\",\"data\":{\"token\":1234678905618},\"code\":0}</code></pre></div>" )
    @RequestMapping(value = "/api/user/login2", method = RequestMethod.POST)
    @ResponseBody
    public Object login2(@RequestParam String mobile, @RequestParam String vcode,HttpServletRequest request){
        String myJsonData="";
        return myJsonData;
    }
    @ApiOperation(httpMethod = "POST", value = "获取验证码：快速登陆(<font color='blue'>release</font>)",position = 3,nickname = "获取验证码", notes = "<h4>传递参数:</h4><br>" +
            "<table border='1' cellspacing='10' cellpadding='10'><tr><th>字段</th><th>备注</th><th>是否为空</th></tr>" +
            "<tr><td>mobile</td><td>手机号码</td> <td>否</td></tr>" +
            "</table>" +
            "<h4>返回字段:</h4><br>" +
            "<h4>1：当手机号码格式错误的时候:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"手机号码格式错误\",\"data\":null,\"code\":1004}</code></pre></div>" )
        @RequestMapping(value = "/api/user/loing/getCode", method = RequestMethod.POST,produces = "application/json")
        @ResponseBody
        public Object getCode(HttpServletRequest request,@RequestParam String mobile) {
            String myJsonData="";
            return myJsonData;
        }
    @ApiOperation(httpMethod = "POST", value = "退出登陆",position = 2,nickname = "退出登陆清除缓存", notes = "<h4>传递参数:</h4><br>" +
            "<table border='1' cellspacing='10' cellpadding='10'><tr><th>字段</th><th>备注</th><th>是否为空</th></tr>" +
            "<tr><td>token</td><td>token</td> <td>否</td></tr>" +
            "</table>" +
            "<h4>返回字段:</h4><br>" +
            "<h4>1：token错误时:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"token无效\",\"data\":null,\"code\":1004}</code></pre></div>" +
            "<h4>4:正确时:</h4>" +
            "<div class=\"block response_body json\"><pre class=\"json\"><code>{\"message\":\"ok\",\"data\":null</code></pre></div>" )

    @RequestMapping(value = "/api/user/loginout", method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public Object loginout(HttpServletRequest request,@RequestParam String token) {
        String myJsonData="";
        return myJsonData;
    }
}
