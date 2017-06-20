package local.httpandroidstudioprojetct.myappeval;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import local.httpandroidstudioprojetct.myappeval.quakeApi.Feature;

/**
 * Created by Formation on 20/06/2017.
 */

public class QuakeAdapter extends ArrayAdapter<Feature> {

    Context context;
    List<Feature> features;
    public QuakeAdapter(@NonNull Context context, @NonNull List<Feature> features) {
        super(context,0, features);
        this.context = context;
        this.features = features;
    }

    @Override
    public int getCount() {
        return features.size(); //returns total of orders in the list
    }

    @Override
    public Feature getItem(int position) {
        return features.get(position); //returns list order at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
        }
        FeatureViewHolder viewHolder = (FeatureViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new FeatureViewHolder();
            viewHolder.mag = (TextView) convertView.findViewById(R.id.mag);
            viewHolder.place = (TextView) convertView.findViewById(R.id.place);
            viewHolder.date = (TextView) convertView.findViewById(R.id.date);
            viewHolder.time = (TextView) convertView.findViewById(R.id.time);
            viewHolder.url = (TextView) convertView.findViewById(R.id.url);


            convertView.setTag(viewHolder);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  TextView t =(TextView)  v.findViewById(R.id.url);

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(t.getText().toString()));
                    getContext().startActivity(browserIntent);
                    Log.i("§§§ CLICK §§§", ""+t.getText());
                }
            });
        }

        //getItem(position) it will recover position the order of list
        Feature feature = getItem(position);
        viewHolder.mag.setText(""+feature.getProperties().getMag());
        viewHolder.place.setText(feature.getProperties().getPlace());
        viewHolder.date.setText(""+feature.getProperties().getTime());
        viewHolder.time.setText(""+feature.getProperties().getTime());
        viewHolder.url.setText(""+feature.getProperties().getUrl());


        return convertView;
    }

    private class FeatureViewHolder {
        public TextView mag;
        public TextView place;
        public TextView date;
        public TextView time;
        public TextView url;



    }
}
