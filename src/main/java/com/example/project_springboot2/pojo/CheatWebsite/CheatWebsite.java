package com.example.project_springboot2.pojo.CheatWebsite;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;

/**
 * @author Zhuo
 */
@Getter
public class CheatWebsite {
    @TableId(type = IdType.AUTO)
    // Id信息
    private Long id;
    // URL
    private String url;
    // HTTP相应
    private String stat;
    // 图片数量
    private String imgNum;
    //域内HTTP请求数
    private String domainInNum;
    //域外HTTP请求数
    private String domainOutNum;
    //域内HTTPS请求数
    private String domainInNum1;
    //域外HTTPS请求数
    private String domainOutNum1;
    //iframe标签数目
    private String iframeNum;
    //meta标签数目
    private String metaNum;
    //embed标签数目
    private String embedNum;
    // object标签数目
    private String objectNum;
    // script标签数目
    private String scriptNum;
    // eval函数数量
    private String evalNum;
    // setTimeout函数数目
    private String setTimeoutNum;
    // setInterval函数数目
    private String setIntervalNum;
    // location函数数目
    private String locationNum;
    // open函数数目
    private String openNum;
    // src标签数量
    private String srcNum;
    // setAttribute标签数量
    private String setAttributeNum;
    // innerHTML标签数量
    private String innerHTMLNum;
    // 信息完整度
    private String whoisInfo;
    // 注册商
    private String register;
    // 更新日期
    private String updatedDate;
    // 创建日期
    private String creationDate;
    // 邮箱
    private String email;
    // 支持向量机
    private String svmType;
    // 决策树
    private String dtType;
    // 随机森林
    private String rfType;
    // Adaboost
    private String adaboostType;
    // GBD
    private String gbdType;
    // NCM
    private String ncmType;
    // 时间戳
    private String timeChuo;
    // 是否恶意
    private Boolean ifMalice;
    // url类型
    private String urlType;

    public CheatWebsite() {
    }

    public CheatWebsite(Long id, String url, String stat, String imgNum, String domainInNum, String domainOutNum, String domainInNum1, String domainOutNum1, String iframeNum, String metaNum, String embedNum, String objectNum, String scriptNum, String evalNum, String setTimeoutNum, String setIntervalNum, String locationNum, String openNum, String srcNum, String setAttributeNum, String innerHTMLNum, String whoisInfo, String register, String updatedDate, String creationDate, String email, String svmType, String dtType, String rfType, String adaboostType, String gbdType, String ncmType, String timeChuo, Boolean ifMalice, String urlType) {
        this.id = id;
        this.url = url;
        this.stat = stat;
        this.imgNum = imgNum;
        this.domainInNum = domainInNum;
        this.domainOutNum = domainOutNum;
        this.domainInNum1 = domainInNum1;
        this.domainOutNum1 = domainOutNum1;
        this.iframeNum = iframeNum;
        this.metaNum = metaNum;
        this.embedNum = embedNum;
        this.objectNum = objectNum;
        this.scriptNum = scriptNum;
        this.evalNum = evalNum;
        this.setTimeoutNum = setTimeoutNum;
        this.setIntervalNum = setIntervalNum;
        this.locationNum = locationNum;
        this.openNum = openNum;
        this.srcNum = srcNum;
        this.setAttributeNum = setAttributeNum;
        this.innerHTMLNum = innerHTMLNum;
        this.whoisInfo = whoisInfo;
        this.register = register;
        this.updatedDate = updatedDate;
        this.creationDate = creationDate;
        this.email = email;
        this.svmType = svmType;
        this.dtType = dtType;
        this.rfType = rfType;
        this.adaboostType = adaboostType;
        this.gbdType = gbdType;
        this.ncmType = ncmType;
        this.timeChuo = timeChuo;
        this.ifMalice = ifMalice;
        this.urlType = urlType;
    }

    public CheatWebsite(String url, String stat, String imgNum,
                        String domainInNum, String domainOutNum, String domainInNum1, String domainOutNum1,
                        String iframeNum, String metaNum, String embedNum, String objectNum,
                        String scriptNum, String evalNum, String setTimeoutNum, String setIntervalNum,
                        String locationNum, String openNum, String srcNum, String setAttributeNum,
                        String innerHTMLNum, String whoisInfo, String register, String updatedDate,
                        String creationDate, String email, String svmType, String timeChuo) {
        this.url = url;
        this.stat = stat;
        this.imgNum = imgNum;
        this.domainInNum = domainInNum;
        this.domainOutNum = domainOutNum;
        this.domainInNum1 = domainInNum1;
        this.domainOutNum1 = domainOutNum1;
        this.iframeNum = iframeNum;
        this.metaNum = metaNum;
        this.embedNum = embedNum;
        this.objectNum = objectNum;
        this.scriptNum = scriptNum;
        this.evalNum = evalNum;
        this.setTimeoutNum = setTimeoutNum;
        this.setIntervalNum = setIntervalNum;
        this.locationNum = locationNum;
        this.openNum = openNum;
        this.srcNum = srcNum;
        this.setAttributeNum = setAttributeNum;
        this.innerHTMLNum = innerHTMLNum;
        this.whoisInfo = whoisInfo;
        this.register = register;
        this.updatedDate = updatedDate;
        this.creationDate = creationDate;
        this.email = email;
        this.svmType = svmType;
        this.dtType = "";
        this.rfType = "";
        this.adaboostType = "";
        this.gbdType = "";
        this.ncmType = "";
        this.timeChuo = timeChuo;
    }

    @Override
    public String toString() {
        return "CheatWebsite{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", stat='" + stat + '\'' +
                ", imgNum='" + imgNum + '\'' +
                ", domainInNum='" + domainInNum + '\'' +
                ", domainOutNum='" + domainOutNum + '\'' +
                ", domainInNum1='" + domainInNum1 + '\'' +
                ", domainOutNum1='" + domainOutNum1 + '\'' +
                ", iframeNum='" + iframeNum + '\'' +
                ", metaNum='" + metaNum + '\'' +
                ", embedNum='" + embedNum + '\'' +
                ", objectNum='" + objectNum + '\'' +
                ", scriptNum='" + scriptNum + '\'' +
                ", evalNum='" + evalNum + '\'' +
                ", setTimeoutNum='" + setTimeoutNum + '\'' +
                ", setIntervalNum='" + setIntervalNum + '\'' +
                ", locationNum='" + locationNum + '\'' +
                ", openNum='" + openNum + '\'' +
                ", srcNum='" + srcNum + '\'' +
                ", setAttributeNum='" + setAttributeNum + '\'' +
                ", innerHTMLNum='" + innerHTMLNum + '\'' +
                ", whoisInfo='" + whoisInfo + '\'' +
                ", register='" + register + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", email='" + email + '\'' +
                ", svmType='" + svmType + '\'' +
                ", dtType='" + dtType + '\'' +
                ", rfType='" + rfType + '\'' +
                ", adaboostType='" + adaboostType + '\'' +
                ", gbdType='" + gbdType + '\'' +
                ", ncmType='" + ncmType + '\'' +
                ", timeChuo='" + timeChuo + '\'' +
                ", ifMalice=" + ifMalice +
                ", urlType='" + urlType + '\'' +
                '}';
    }

    public void setGbdType(String gbdType) {
        this.gbdType = gbdType;
    }

    public void setNcmType(String ncmType) {
        this.ncmType = ncmType;
    }

    public void setTimeChuo(String timeChuo) {
        this.timeChuo = timeChuo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void setImgNum(String imgNum) {
        this.imgNum = imgNum;
    }

    public void setDomainInNum(String domainInNum) {
        this.domainInNum = domainInNum;
    }

    public void setDomainOutNum(String domainOutNum) {
        this.domainOutNum = domainOutNum;
    }

    public void setDomainInNum1(String domainInNum1) {
        this.domainInNum1 = domainInNum1;
    }

    public void setDomainOutNum1(String domainOutNum1) {
        this.domainOutNum1 = domainOutNum1;
    }

    public void setIframeNum(String iframeNum) {
        this.iframeNum = iframeNum;
    }

    public void setMetaNum(String metaNum) {
        this.metaNum = metaNum;
    }

    public void setEmbedNum(String embedNum) {
        this.embedNum = embedNum;
    }

    public void setObjectNum(String objectNum) {
        this.objectNum = objectNum;
    }

    public void setScriptNum(String scriptNum) {
        this.scriptNum = scriptNum;
    }

    public void setEvalNum(String evalNum) {
        this.evalNum = evalNum;
    }

    public void setSetTimeoutNum(String setTimeoutNum) {
        this.setTimeoutNum = setTimeoutNum;
    }

    public void setSetIntervalNum(String setIntervalNum) {
        this.setIntervalNum = setIntervalNum;
    }

    public void setLocationNum(String locationNum) {
        this.locationNum = locationNum;
    }

    public void setOpenNum(String openNum) {
        this.openNum = openNum;
    }

    public void setSrcNum(String srcNum) {
        this.srcNum = srcNum;
    }

    public void setSetAttributeNum(String setAttributeNum) {
        this.setAttributeNum = setAttributeNum;
    }

    public void setInnerHTMLNum(String innerHTMLNum) {
        this.innerHTMLNum = innerHTMLNum;
    }

    public void setWhoisInfo(String whoisInfo) {
        this.whoisInfo = whoisInfo;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSvmType(String svmType) {
        this.svmType = svmType;
    }

    public void setDtType(String dtType) {
        this.dtType = dtType;
    }

    public void setRfType(String rfType) {
        this.rfType = rfType;
    }

    public void setIfMalice(Boolean ifMalice) {
        this.ifMalice = ifMalice;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public void setAdaboostType(String adaboostType) {
        this.adaboostType = adaboostType;
    }
}
