package com.ms.webmagic.service;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/7/24
 * @description: 爬虫demo
 */
public class DmzjProcessor implements PageProcessor {
    int myid = 0;
    int size = 10;
    /**
     * 抓取网站的相关配置，可以包括编码、抓取间隔1s、重试次数等
     */
    private Site site = Site.me().setCharset("utf8").setRetryTimes(1000).setSleepTime(1000);

    @Override
    public Site getSite() {
        return site;
    }

    @Override
    public void process(Page page) {
        Html html = page.getHtml();
        size++;
        String hahawebname = html.xpath("//div[@class=\"odd_anim_title_tnew\"]/div[@class=\"tvversion\"]/a/span[@class=\"anim_title_text\"]/h1/text()").get();
    }

    public static void main(String[] args) {
        int username = 10;
        DmzjProcessor my = new DmzjProcessor();
        long startTime, endTime;
        System.out.println("开始爬取...");
        for (; username <= 15000; username++) {
            startTime = System.currentTimeMillis();
            Spider.create(my).addUrl("http://donghua.dmzj.com/donghua_info/" + username + ".html").thread(5).run();
            endTime = System.currentTimeMillis();
            System.out.println("爬取结束，耗时约" + ((endTime - startTime) / 1000) + "秒");
        }
    }
}
