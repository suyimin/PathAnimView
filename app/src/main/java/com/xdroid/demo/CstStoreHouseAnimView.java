package com.xdroid.demo;

import android.content.Context;
import android.util.AttributeSet;

import com.xdroid.pathanim.StoreHouseAnimView;
import com.xdroid.pathanim.utils.PathParserUtils;
import com.xdroid.pathanim.res.StoreHousePath;

/**
 * 介绍：一个StoreHouse风格动画的View
 * 继承View的好处是 xml可以预览 ，也可以代码动态设置
 */
public class CstStoreHouseAnimView extends StoreHouseAnimView {

    public CstStoreHouseAnimView(Context context) {
        this(context, null);
    }

    public CstStoreHouseAnimView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CstStoreHouseAnimView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //根据String 转化成Path
        setSourcePath(PathParserUtils.getPathFromArrayFloatList(StoreHousePath.getPath("ZhangXuTong", 1.1f, 16)));
    }

}
