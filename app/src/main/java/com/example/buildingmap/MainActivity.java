package com.example.buildingmap;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.buildingmap.activity.BaseActivity;
import com.example.buildingmap.adapter.LanguageAdapter;
import com.example.buildingmap.model.Language;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView mListLanguages;
    private LanguageAdapter mLanguageAdapter;
    private List<Language> mLanguages = new ArrayList<>();

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initComponents() {
        mListLanguages = findViewById(R.id.rc_language);
        mListLanguages.setLayoutManager(new GridLayoutManager(this, 9));
        mListLanguages.setHasFixedSize(true);

        loadLanguage();
    }

    private void loadLanguage() {
        mLanguages.clear();
        mLanguages.add(new Language("zh", R.mipmap.zh, R.string.select_language_zh));
        mLanguages.add(new Language("zh", R.mipmap.zh, R.string.select_language_zh));
        mLanguages.add(new Language("en", R.mipmap.en, R.string.select_language_en));
        mLanguages.add(new Language("ko", R.mipmap.ko, R.string.select_language_ko));
        mLanguages.add(new Language("ja", R.mipmap.ja, R.string.select_language_ja));
        mLanguages.add(new Language("fr", R.mipmap.fr, R.string.select_language_fr));
        mLanguages.add(new Language("ms", R.mipmap.ms, R.string.select_language_ms));
        mLanguages.add(new Language("it", R.mipmap.it, R.string.select_language_it));
        mLanguages.add(new Language("es", R.mipmap.es, R.string.select_language_es));
        mLanguageAdapter = new LanguageAdapter(this, mLanguages);
        mListLanguages.setAdapter(mLanguageAdapter);
        mLanguageAdapter.notifyDataSetChanged();
    }

    @Override
    protected void addListener() {

    }
}
