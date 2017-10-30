package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Asus on 10/26/2017.
 */

public class WordsAdapter extends ArrayAdapter<Words> {
    public WordsAdapter(Activity context, ArrayList<Words> words){
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Words currentView = getItem(position);

        TextView englishWord = (TextView) listItem.findViewById(R.id.list_item1);
        englishWord.setText(currentView.getDefaultTranslation());

        TextView miwokWord = (TextView) listItem.findViewById(R.id.list_item2);
        miwokWord.setText(currentView.getMiwokTranslation());

        return listItem;
    }
}
