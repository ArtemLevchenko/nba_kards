package com.artbender.kards.nba.nkards.service.loader;

import java.util.List;

public interface DataLoader<T> {
    List<T> load(String path);
}
