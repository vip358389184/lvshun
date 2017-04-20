package com.lvshun.dao;

import com.lvshun.po.Banner;
import com.lvshun.util.page.Page;

import java.util.List;

/**
 * Created by Matthew on 17/4/25.
 */
public interface BannerDao {
     List<Banner> getBanner(Page<Banner> page);
}
