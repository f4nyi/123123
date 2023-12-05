package com.example.project_springboot2.service;

import com.example.project_springboot2.Cli.HelloWorldClient;
import com.example.project_springboot2.dao.CheatWebsiteDao;
import com.example.project_springboot2.pojo.CheatWebsite.CheatWebsite;
import com.example.project_springboot2.pojo.CheatWebsite.CheatWebsiteBean;
import com.example.project_springboot2.service.Url.BlackURLservice1;
import com.example.project_springboot2.service.Url.WhiteURLservice1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Zhuo
 */
@Service
public class CheatWebsiteService1 {

    @Autowired
    CheatWebsiteDao cheatWebsiteDao;
    @Autowired
    WhiteURLservice1 whiteURLservice1;
    @Autowired
    BlackURLservice1 blackURLservice1;

    public static CheatWebsite dealWithType(CheatWebsite cheatWebsite) {
        int[] type = new int[13];
        int maxType = 0;
        int maxNum = 0;
        if (Objects.equals(cheatWebsite.getSvmType(), "") || "0".equals(cheatWebsite.getSvmType())) {
            type[0]++;
        } else {
            type[Integer.parseInt(cheatWebsite.getSvmType())]++;
        }
        if (Objects.equals(cheatWebsite.getRfType(), "") || "0".equals(cheatWebsite.getRfType())) {
            type[0]++;
        } else {
            type[Integer.parseInt(cheatWebsite.getRfType())]++;
        }
        if (Objects.equals(cheatWebsite.getDtType(), "") || "0".equals(cheatWebsite.getDtType())) {
            type[0]++;
        } else {
            type[Integer.parseInt(cheatWebsite.getDtType())]++;
        }
        if (Objects.equals(cheatWebsite.getAdaboostType(), "") || "0".equals(cheatWebsite.getAdaboostType())) {
            type[0]++;
        } else {
            type[Integer.parseInt(cheatWebsite.getAdaboostType())]++;
        }
        if (Objects.equals(cheatWebsite.getGbdType(), "") || "0".equals(cheatWebsite.getGbdType())) {
            type[0]++;
        } else {
            type[Integer.parseInt(cheatWebsite.getGbdType())]++;
        }
        if (Objects.equals(cheatWebsite.getNcmType(), "") || "0".equals(cheatWebsite.getNcmType()) || "NULL".equals(cheatWebsite.getNcmType())) {
            type[0]++;
        } else {
            type[Integer.parseInt(cheatWebsite.getNcmType())]++;
        }
        for (int i = 0; i < type.length; i++) {
            if (maxNum <= type[i]) {
                maxNum = type[i];
                maxType = i;
            }
        }
        cheatWebsite.setIfMalice(maxType == 0 ? false : true);
        cheatWebsite.setUrlType(String.valueOf(maxType));
        return cheatWebsite;
    }

    //分页查找函数
    public CheatWebsiteBean<CheatWebsite> selectPage(int currentPage, int pagesize) {
        int begin = (currentPage - 1) * pagesize;
        int size = pagesize;
        List<CheatWebsite> cheatWebsiteList = cheatWebsiteDao.selectByPage(begin, size);

        int totalCount = cheatWebsiteDao.seletTotalCount();
        //对各类模型的结果进行判断
        for (CheatWebsite item : cheatWebsiteList) {
            item.setIfMalice(!Objects.equals(item.getSvmType(), "0"));
            item.setUrlType(item.getSvmType());
        }
        CheatWebsiteBean<CheatWebsite> cheatWebsiteCheatWebsiteBean = new CheatWebsiteBean<>(totalCount, cheatWebsiteList);
        return cheatWebsiteCheatWebsiteBean;
    }

    //调用模型，获取信息
    public Map runModel(String url) throws InterruptedException {
        HelloWorldClient client = new HelloWorldClient("localhost", 50051);
        try {
            String user = url;
            return client.greet(user);
        } finally {
            client.shutdown();
        }
    }

    //获得时间
    public String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String time = formatter.format(date);
        return time;
    }

    //正常创建函数
    public CheatWebsite create(String url) throws InterruptedException {
        Map params = runModel(url);
        String time = getTime();

        CheatWebsite cheatWebsite =
                new CheatWebsite(url,
                        params.get("Stat").toString(),
                        params.get("ImgNum").toString(),
                        params.get("DomainInNum").toString(),
                        params.get("DomainOutNum").toString(),
                        params.get("DomainInNum1").toString(),
                        params.get("DomainOutNum1").toString(),
                        params.get("IframeNum").toString(),
                        params.get("MetaNum").toString(),
                        params.get("EmbedNum").toString(),
                        params.get("ObjectNum").toString(),
                        params.get("ScriptNum").toString(),
                        params.get("EvalNum").toString(),
                        params.get("SetTimeoutNum").toString(),
                        params.get("SetIntervalNum").toString(),
                        params.get("LocationNum").toString(),
                        params.get("OpenNum").toString(),
                        params.get("SrcNum").toString(),
                        params.get("SetAttributeNum").toString(),
                        params.get("InnerHTMLNum").toString(),
                        params.get("WhoisInfo").toString(),
                        params.get("Register").toString(),
                        params.get("UpdatedDate").toString(),
                        params.get("CreationDate").toString(),
                        params.get("Email").toString(),
                        params.get("Svm").toString(),
//                        params.get("Dt").toString(),
//                        params.get("Rf").toString(),
//                        params.get("Ab").toString(),
//                        params.get("Gbd").toString(),
//                        params.get("Ncm").toString(),
                        time);
        return cheatWebsite;
    }

    //是否涉诈判断函数以及黑白名单联动
    public CheatWebsite logicWB(CheatWebsite cheatWebsite) {
        //逻辑判断
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (!"NULL".equals(cheatWebsite.getSvmType())) {
            a[Integer.parseInt(cheatWebsite.getSvmType())]++;
        }
        if (!"NULL".equals(cheatWebsite.getDtType())) {
            a[Integer.parseInt(cheatWebsite.getDtType())]++;
        }
        if (!"NULL".equals(cheatWebsite.getRfType())) {
            a[Integer.parseInt(cheatWebsite.getRfType())]++;
        }
        if (!"NULL".equals(cheatWebsite.getAdaboostType())) {
            a[Integer.parseInt(cheatWebsite.getAdaboostType())]++;
        }
        if (!"NULL".equals(cheatWebsite.getGbdType())) {
            a[Integer.parseInt(cheatWebsite.getGbdType())]++;
        }
        if (!"NULL".equals(cheatWebsite.getNcmType())) {
            a[Integer.parseInt(cheatWebsite.getNcmType())]++;
        }
        int b = a[0];
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
                flag = i;
            }
        }

        //黑白名单联动
//        if(flag==0 && whiteURLservice1.findByUrl(url)==null){
//            WhiteURL whiteURL=new WhiteURL(url);
//            whiteURLservice1.add(whiteURL);
//        }
//        if (flag!=0 && blackURLservice1.findByUrl(url)==null){
//            BlackURL blackURL=new BlackURL(url);
//            blackURLservice1.add(blackURL);
//        }
        return cheatWebsite;
    }

    //单项查找函数
    public CheatWebsite findByUrl(String url) {
        if (cheatWebsiteDao.findByUrl(url) != null) {
            CheatWebsite cheatWebsite = cheatWebsiteDao.findByUrl(url);
            cheatWebsite.setTimeChuo(getTime());
            cheatWebsite.setIfMalice(!Objects.equals(cheatWebsite.getSvmType(), "0"));
            cheatWebsite.setUrlType(cheatWebsite.getSvmType());
            return cheatWebsite;
        } else {
            System.out.println("未找到url:" + url);
            return null;
        }
    }

    //网页的添加
    public CheatWebsite add(String url) throws InterruptedException {
        System.out.println("待查找URL链接为：" + url);
        if (cheatWebsiteDao.findByUrl(url) == null) {
            //正常创建函数
            CheatWebsite cheatWebsite = create(url);
            System.out.println("CheatWebsiteService1" + cheatWebsite);
            //是否涉诈判断函数以及黑白名单联动
            cheatWebsiteDao.add(cheatWebsite);
            System.out.println("CheatWebsiteService1" + "成功添加至数据库！");
            cheatWebsite.setIfMalice(!Objects.equals(cheatWebsite.getSvmType(), "0"));
            cheatWebsite.setUrlType(cheatWebsite.getSvmType());
            System.out.println("CheatWebsiteService1" + "成功设置！");
            return cheatWebsite;
        } else {
            System.out.println("已有该url:" + url);
            CheatWebsite cheatWebsite = cheatWebsiteDao.findByUrl(url);
            cheatWebsite.setIfMalice(!Objects.equals(cheatWebsite.getSvmType(), "0"));
            cheatWebsite.setUrlType(cheatWebsite.getSvmType());
            return cheatWebsite;
        }
    }
}
