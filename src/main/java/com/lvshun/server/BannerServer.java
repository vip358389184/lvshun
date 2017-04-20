package com.lvshun.server;

import com.lvshun.po.Banner;
import com.lvshun.util.page.Page;

import java.util.List;

/**
 * Created by Matthew on 17/4/25.
 */
public interface BannerServer {
    Page<Banner> getBanner(Page<Banner> page);
}
