package com.gc.iphonemaxplan.Fragment;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.gc.iphonemaxplan.R;
import com.gc.iphonemaxplan.Tools.TimeStampManager;
import com.gc.iphonemaxplan.bean.BaseBean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ListAdapter extends BaseQuickAdapter<BaseBean, BaseViewHolder> {

    public ListAdapter(@Nullable List<BaseBean> data) {
        super(R.layout.fragment_main_listview, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, BaseBean baseBean) {
        baseViewHolder.setText(R.id.data, TimeStampManager.getInstance().stampToTime(baseBean.getData()));
        baseViewHolder.setText(R.id.moneyChange, baseBean.getMoney());
        baseViewHolder.setText(R.id.AllMoney,baseBean.getAllMoney().toString());
    }

}
