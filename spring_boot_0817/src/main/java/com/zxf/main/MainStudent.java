package com.zxf.main;
import com.zxf.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainStudent {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("Springstu.xml");
        Student  st=(Student)app.getBean("stu");
        System.out.println(st.getName());
        System.out.println(st.getPreferences());
        System.out.println(st.getPreferences().get("url"));
        System.out.println(st.getList());
        System.out.println(st.getSet());
          String[] ss=st.getArray();
          for(String s:ss){
              System.out.println(s);
          }
          System.out.println(st.getMap());
    }
}