package com.example.buildingmap.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.buildingmap.R;
import com.example.buildingmap.model.Language;
import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {

    private Context mContext;
    private List<Language> mLanguages;

    public LanguageAdapter(Context context, List<Language> languages) {
        mContext = context;
        mLanguages = languages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LanguageAdapter.ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_language, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Language language = mLanguages.get(position);
        holder.mImvLanguage.setImageResource(language.getImage());
        holder.mTvLanguage.setText(language.getNameLanguage());

    }

    @Override
    public int getItemCount() {
        return mLanguages.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImvLanguage;
        private TextView mTvLanguage;
        private View mViewSelected;

        ViewHolder(View itemView) {
            super(itemView);
            mImvLanguage = itemView.findViewById(R.id.image_language);
            mTvLanguage = itemView.findViewById(R.id.tv_language);
            mViewSelected = itemView.findViewById(R.id.imv_language);
        }
    }
}
