package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "news")
public class NewsController {

    @RequestMapping(value = "getAll")
    public List<News> getAll(){
        News news1 = new News(1,"aaa","fffff");
        News news2 = new News(1,"bbb","ddddd");
        News news3 = new News(1,"ccc","eeeee");
        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
