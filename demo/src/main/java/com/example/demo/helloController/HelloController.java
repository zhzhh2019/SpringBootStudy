package com.example.demo.helloController;



import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "测试相关接口")
public class HelloController {



    @ApiOperation(value = "接口的功能介绍",notes = "提示接口使用者注意事项",httpMethod = "GET")
    @ApiImplicitParam(dataType = "string",name = "name",value = "姓名",required = true)
    @RequestMapping(value = "/")
    public String hello(String name){
        return "hello word1!" +name;

    }

    @ApiOperation(value = "接口的功能介绍1",notes = "提示接口使用者注意事项1",httpMethod = "GET")
    @ApiImplicitParam(dataType = "string",name = "name",value = "姓名",required = true)
    @RequestMapping(value = "/test")
    public String hello1(String name){
        return "hello word1!" +name;

    }
    /**
     * @ApiImplicitParams：用在请求的方法上，包含一组参数说明
     *        @ApiImplicitParam：对单个参数的说明
     *          name：参数名
     * 	        value：参数的说明、描述
     * 	        required：参数是否必须必填
     * 	        paramType：参数放在哪个地方
     * 	        · query --> 请求参数的获取：@RequestParam
     * 	        · header --> 请求参数的获取：@RequestHeader
     * 	        · path（用于restful接口）--> 请求参数的获取：@PathVariable
     * 	        · body（请求体）-->  @RequestBody User user
     * 	        · form（普通表单提交）
     * 	    dataType：参数类型，默认String，其它值dataType="Integer"
     * 	    defaultValue：参数的默认值
     *
     * */


    @ApiOperation(value="用户登录",notes="随边说点啥")
    @ApiImplicitParams({
            @ApiImplicitParam(name="mobile",value="手机号",required=true,paramType="form"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="form"),
            @ApiImplicitParam(name="age",value="年龄",required=true,paramType="form",dataType="Integer")
    })
    @PostMapping("/login")
    public String login(@RequestParam String mobile, @RequestParam String password,
                        @RequestParam Integer age){
        return "login";
    }
    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name="userId", dataType="String", required=true, value="用户Id")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(@RequestParam String userId) {
        return "user";
    }
}
