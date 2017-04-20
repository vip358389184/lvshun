package com.lvshun.biz.impl;

import com.lvshun.biz.BannerBiz;
import com.lvshun.po.Banner;
import com.lvshun.server.BannerServer;
import com.lvshun.util.enmoUtil.MainEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matthew on 17/4/25.
 */
@Service
public class BannerBizImpl implements BannerBiz {

    @Autowired
    private BannerServer bannerServer;

    public List<Banner> getBanner() {
        Banner banner=new Banner();
        banner.setStatus(MainEnum.BANNER_STATUS_TRUE.getCode());

        return bannerServer.getBanner(banner);
    }
}
