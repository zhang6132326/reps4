package com.zxf.eduservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zxf.commonutils.R;
import com.zxf.eduservice.entity.EduTeacher;
import com.zxf.eduservice.entity.vo.TeacherQuery;
import com.zxf.eduservice.service.EDUTEACHERervice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师; InnoDB free: 11264 kB 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-06-24
 */
@Api(description = "讲师管理")
@RestController
@RequestMapping("/eduservice/teacher")
@CrossOrigin //解决跨域问题
public class EduTeacherController {
       //把service注入
       @Autowired
      private EDUTEACHERervice eduteacheRervice;
       /*
            1 查询讲师表所有数据
        */
       /*
       @ApiOperation(value = "所有讲师列表")
       @GetMapping("findAll")
       public List<EduTeacher> findAllTeacher(){
           List<EduTeacher> list = eduteacheRervice.list(null);
           return list;
       }
       */
       @ApiOperation(value = "所有讲师列表")
       @GetMapping("findAll")
       public R findAllTeacher(){
           //int r=34/0; //测试异常处理类
      /*
           try {
               int[] r = new int[1];
               r[9] = 12;
           }catch (Exception e){
               //执行自定义异常
               throw new ZxfException(2001,"执行了自定义异常。。。");
           }
           */

           List<EduTeacher> list = eduteacheRervice.list(null);
           return R.ok().data("items",list);
       }

       /*
           2 逻辑删除讲师的方法
        */
       /*
       @ApiOperation(value = "根据ID逻辑删除讲师")
       @DeleteMapping("{id}")
       public boolean removeTeacher(@ApiParam(name = "id",value = "讲师ID",required = true) @PathVariable String id){
           boolean flag=eduteacheRervice.removeById(id);
           return flag;
       }
       */
       @ApiOperation(value = "根据ID逻辑删除讲师")
       @DeleteMapping("{id}")
       public R removeTeacher(@ApiParam(name = "id",value = "讲师ID",required = true) @PathVariable String id){
           boolean flag=eduteacheRervice.removeById(id);
           if(flag){
               return R.ok();
           }else {
               return R.error();
           }
       }
       /*
           分页查询讲师
             current 当前页
             limit  每页记录数

        */
       @ApiOperation(value = "讲师分页查询")
       @GetMapping("pageTeacher/{current}/{limit}")
       public R pageListTeacher(@PathVariable long current,
                                @PathVariable long limit){
           Page<EduTeacher> pageTeacher=new Page<>(current,limit);
           eduteacheRervice.page(pageTeacher,null);

           long total=pageTeacher.getTotal(); //总记录数
           List<EduTeacher> records = pageTeacher.getRecords();//数据集合

           Map map=new HashMap();
            map.put("z1",total);  //key 的值随便定义  相当于变量的名字。
            map.put("z2",records);
             return R.ok().data(map);


         //  return  R.ok().data("total",total).data("rows",records);
       }
       /*
           条件查询  带分页
        */
       @ApiOperation(value = "讲师分页查询带条件的!!")
       @PostMapping("pageTeacherCondition/{current}/{limit}")
       public R pagetTeacherCondition(@PathVariable long current,
                                      @PathVariable long limit,
                                      //@RequestBody表示提交方式必须为post 所有条件都可以为空
                                      @RequestBody(required = false) TeacherQuery teacherQuery){
           // 创建page对象
           Page<EduTeacher> pageTeacher=new Page<>(current,limit);
           //创建条件
           QueryWrapper<EduTeacher> wrapper=new QueryWrapper<>();
           //各种条件 名字 头衔1高级 2首席  开始时间  结束时间
           String name=teacherQuery.getName();
           Integer level=teacherQuery.getLevel();
           String begin=teacherQuery.getBegin();
           String end=teacherQuery.getEnd();
           if(!StringUtils.isEmpty(name)){
               //构建条件
               wrapper.like("name",name);
           }
           if(!StringUtils.isEmpty(level)){
               wrapper.eq("level",level); // ==
           }
           if(!StringUtils.isEmpty(begin)){
               wrapper.ge("gmt_create",begin); // >=
           }if(!StringUtils.isEmpty(end)){
               wrapper.le("gmt_modified",end);  // <=
           }

            //调用方法实现分页查询
           eduteacheRervice.page(pageTeacher,wrapper);
           long total=pageTeacher.getTotal();//总页数
           List<EduTeacher> records = pageTeacher.getRecords(); //数据list集合
           return R.ok().data("total",total).data("rows",records);
       }
       /*
           添加讲师数据
        */
       @ApiOperation(value = "添加讲师数据")
       @PostMapping("addTeacher")
       public R addTeacher(@RequestBody  EduTeacher  eduTeacher){
           boolean save=eduteacheRervice.save(eduTeacher);
           if(save){
               return R.ok();
           }else {
               return R.error();
           }
       }
       /*
           根据讲师ID进行查询
        */
       @ApiOperation(value = "根据讲师ID进行查询")
       @GetMapping("getTeacher/{id}")
       public R getTeacher(@PathVariable String id ){
           EduTeacher eduTeacher =eduteacheRervice.getById(id);
             return R.ok().data("teacher",eduTeacher);
       }
       /*
          讲师修改
        */
       @ApiOperation(value = "讲师修改")
       @PostMapping("updateTeacher")
       public R updateTeacher(@RequestBody EduTeacher eduTeacher){
              boolean flag=eduteacheRervice.updateById(eduTeacher);
              if(flag){
                  return R.ok();
              }else {
                  return R.error();
              }
       }

}

