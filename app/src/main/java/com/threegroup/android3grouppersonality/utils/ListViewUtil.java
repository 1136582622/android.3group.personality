package com.threegroup.android3grouppersonality.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * @author
 * @date 2020-06-29 11:11
 **/
public class ListViewUtil {

    public static void setListViewHeightBasedOnChildren(ListView listView) {

        //获取ListView对应的Adapter
        ListAdapter listAdapter = listView.getAdapter();

        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;

        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            //listAdapter.getCount()返回数据项的数目
            View listItem = listAdapter.getView(i, null, listView);
            //计算子项View 的宽高
            listItem.measure(0, 0);
            //统计所有子项的总高度
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        //listView.getDividerHeight()获取子项间分隔符占用的高度
        //params.height最后得到整个ListView完整显示需要的高度
        listView.setLayoutParams(params);
    }
}
