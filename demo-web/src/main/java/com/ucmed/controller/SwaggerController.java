package com.ucmed.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sy.library.entity.HosInf;
import org.sy.library.mapper.HosInfMapper;

import java.util.List;

@Api(value = "测试")
@Controller
@RequestMapping("/weixin")
@Slf4j
public class SwaggerController {

    @Autowired
    private HosInfMapper hosInfMapper;
    @ApiOperation(value = "测试中文输入输出")
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.GET},value = "/swagger.do")
    @ResponseBody
    public JSONObject test2(
            @ApiParam(name = "name", value = "姓名") @RequestParam(value = "name",required = false) String name,
            @ApiParam(name = "phone", value = "电话") @RequestParam(value = "phone",required = false) String phone
    ){
        JSONObject res=new JSONObject();
        try {
            res.put("name","nnnn"+name);
            res.put("phone","ppp"+phone);
            List<HosInf> hosInf=hosInfMapper.selectList(null);
            log.info("test2====================="+hosInf);
        }catch (Exception e){
            log.info("===="+e);
        }
        return res;
    }

    @ApiOperation(value = "测试中文输入输出")
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.GET},value = "/swagger.htm")
    @ResponseBody
    public JSONObject test(
            @ApiParam(name = "name", value = "姓名") @RequestParam(value = "name",required = false) String name,
            @ApiParam(name = "phone", value = "电话") @RequestParam(value = "phone",required = false) String phone
    ){
        JSONObject res=new JSONObject();
        res.put("name","nnnn"+name);
        res.put("phone","ppp"+phone);
        System.out.println(res.toString());
        return res;
    }

}
