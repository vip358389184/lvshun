package com.lvshun.server;

import com.lvshun.po.Banner;

import java.util.List;

/**
 * Created by Matthew on 17/4/25.
 */
public interface BannerServer {
    List<Banner> getBanner(Banner banner);
}
