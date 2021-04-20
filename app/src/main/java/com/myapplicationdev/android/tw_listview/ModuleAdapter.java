package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private Context context;
    private TextView moduleName;
    private ArrayList<Module> alModule;
    private ImageView imageView;

    public ModuleAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Module> objects) {
        super(context, resource, objects);

        alModule = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        Module currentMod = alModule.get(position);

        moduleName = rowView.findViewById(R.id.moduleCode);
        imageView = rowView.findViewById(R.id.moduleImageView);

        moduleName.setText(currentMod.getModuleName());
        imageView.setImageResource(currentMod.getImageIcon());

        return rowView;
    }

}
