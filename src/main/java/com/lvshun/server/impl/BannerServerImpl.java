package com.lvshun.server.impl;

import com.lvshun.dao.BannerDao;
import com.lvshun.po.Banner;
import com.lvshun.server.BannerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Matthew on 17/4/25.
 */
@Service
public class BannerServerImpl implements BannerServer{

    @Autowired
    private BannerDao bannerDao;

    public List<Banner> getBanner(Banner banner) {
        return bannerDao.getBanner(banner);
    }


}
