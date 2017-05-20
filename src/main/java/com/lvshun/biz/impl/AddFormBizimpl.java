package com.lvshun.biz.impl;

import com.lvshun.biz.AddFormBiz;
import com.lvshun.po.AddFroms;
import com.lvshun.server.AddFromserver;
import com.lvshun.vo.Addfro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/5/19.
 */
@Service
public class AddFormBizimpl implements AddFormBiz {

    @Autowired
    private AddFromserver addformserver;

    public int paddfrom(Addfro addfro){
        AddFroms  addFroms = new AddFroms();
        addFroms.setUsername(addfro.getUsername());
        addFroms.setPhone(addfro.getPhone());
        addFroms.setDawk(addfro.getDawk());
        addFroms.setPrefecture(addfro.getPrefecture());
        addFroms.setAddress(addfro.getAddress());
        return addformserver.paddfrom(addFroms);

    }
}
