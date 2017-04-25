package com.lvshun.dao;

import com.lvshun.po.Banner;

import java.util.List;

/**
 * Created by Matthew on 17/4/25.
 */
public interface BannerDao {
     List<Banner> getBanner(Banner banner);
}
