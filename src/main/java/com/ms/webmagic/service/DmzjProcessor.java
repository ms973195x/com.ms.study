package com.ms.webmagic.service;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.List;

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
        List<String> allData = html.xpath("//div[@class='jxs_list green']/p/span[1]/text()").all();
        List<String> allName = html.xpath("//div[@class='jxs_list green']/p/span[2]/text()").all();
        List<String> allMarket = html.xpath("//div[@class='jxs_list green']/p/span[3]/a/text()").all();
        List<String> allMinimumPrice = html.xpath("//div[@class='jxs_list green']/p/span[4]/text()").all();
        List<String> allTopPrice = html.xpath("//div[@class='jxs_list green']/p/span[5]/text()").all();
        List<String> allAveragePrice = html.xpath("//div[@class='jxs_list green']/p/span[6]/text()").all();
        List<String> allUnit = html.xpath("//div[@class='jxs_list green']/p/span[7]/text()").all();
        for (int i = 0; i < allData.size(); i++) {
            System.out.println("时间： " + allData.get(i));
            System.out.println("名称： " + allName.get(i));
            System.out.println("市场名称： " + allMarket.get(i));
            System.out.println("最低价： " + allMinimumPrice.get(i));
            System.out.println("最高价： " + allTopPrice.get(i));
            System.out.println("平均价： " + allAveragePrice.get(i));
            System.out.println("单位： " + allUnit.get(i));
        }
    }

    public static void main(String[] args) {
        int username = 1;
        DmzjProcessor my = new DmzjProcessor();
        long startTime, endTime;
        System.out.println("开始爬取...");
        for (; username <= 10; username++) {
            startTime = System.currentTimeMillis();
            Spider.create(my).addUrl("http://www.vegnet.com.cn/Channel/Price?page=" + username + "&flag=12&ename=huanggua").thread(5).run();
            endTime = System.currentTimeMillis();
            System.out.println("爬取结束，耗时约" + ((endTime - startTime) / 1000) + "秒");
        }
    }
}
