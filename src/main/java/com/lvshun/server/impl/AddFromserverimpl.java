package com.lvshun.server.impl;

import com.lvshun.dao.AddFormDao;
import com.lvshun.po.AddFroms;
import com.lvshun.server.AddFromserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/5/19.
 */

@Service
public class AddFromserverimpl implements AddFromserver{

    @Autowired
    private AddFormDao   addformdao;

    public int paddfrom(AddFroms addfrom){

        return  addformdao.paddfrom(addfrom);
    }

}
