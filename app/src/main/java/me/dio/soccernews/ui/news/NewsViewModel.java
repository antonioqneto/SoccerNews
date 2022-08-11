package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news= new MutableLiveData<>();

        //TODO Remover Mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ararinha completaria 247 anos neste fim de semana", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam diam orci, aliquam."));
        news.add(new News("Roberto Carlos anuncia aquisição de USJ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam diam orci, aliquam."));
        news.add(new News("Estão abertas as inscrições para escolinha do USJ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam diam orci, aliquam."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}