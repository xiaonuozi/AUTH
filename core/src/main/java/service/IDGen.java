package service;

import web.Result;

public interface IDGen {

    Result get(String key);

    boolean init();
}
