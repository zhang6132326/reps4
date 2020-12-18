package com.zxf;

import com.zxf.domain.Video;
import com.zxf.service.VideoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@AutoConfigureMockMvc //使用MockMvc方式测试
public class VideoTest {
    @Autowired
    private VideoService videoService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVidoeListApi()throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/video/list")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
        String result=mvcResult.getResponse().getContentAsString(Charset.forName("utf-8"));
        System.out.println(result);


    }

    @Test
    public void testVideoList(){
        List<Video> videoList=videoService.listVideo();
          for(int i=0;i<videoList.size();i++){
              System.out.println(videoList.get(i));
          }
    }
}
