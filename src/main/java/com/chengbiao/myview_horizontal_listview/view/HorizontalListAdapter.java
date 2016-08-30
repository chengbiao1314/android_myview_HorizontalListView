package com.chengbiao.myview_horizontal_listview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.chengbiao.myview_horizontal_listview.R;

/**
 * Created by Ricky on 2016/8/25.
 */
public class HorizontalListAdapter extends BaseAdapter {

    private Context context;

    public HorizontalListAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView==null){
            holder = new ViewHolder();
            convertView = View.inflate(context,R.layout.item_module_hlistview, null);
            holder.mTitle=(TextView)convertView.findViewById(R.id.tv_title_item);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }


        holder.mTitle.setText("position" + position);

        return convertView;
    }

    private static class ViewHolder {
        private TextView mTitle ;
    }

}
