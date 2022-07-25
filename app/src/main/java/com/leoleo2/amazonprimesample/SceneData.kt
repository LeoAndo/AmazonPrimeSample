package com.leoleo2.amazonprimesample

/**
 * decompile:
 * <string name="watch_amazon_hostname_jp">watch.amazon.co.jp</string>
 * <string name="app_primevideo_hostname">app.primevideo.com</string>
 * B09PQB418P: 映画ドラえもん　のび太の新恐竜
 */
enum class SceneData(val uriString: String) {
    HOME("intent://watch.amazon.co.jp/home"),
    DOWNLOAD("intent://watch.amazon.co.jp/downloads"),
    WATCH_LIST("intent://watch.amazon.co.jp/watchlist"),
    WATCH_LIST_V2("https://watch.amazon.co.jp/list_watchlist"),
    DETAIL("intent://watch.amazon.co.jp/detail/B09PQB418P"),
    LIBRARY("https://watch.amazon.co.jp/library"),
    FOLLOWING_SELECTION("https://watch.amazon.co.jp/followingSelection"),
    CANTILEVER("https://watch.amazon.co.jp/cantilever"),
    COMINGSOON("https://watch.amazon.co.jp/comingsoon"),

    // TODO: 以下はまともに動かなかったuri！
/*
    SEARCH("intent://watch.amazon.co.jp/search"),
    PRIME_SIGN_UP("content://com.amazon.avod.primesignup"),
    SIGN_UP("content://com.amazon.avod.signup"),
    WATCH("intent://watch.amazon.co.jp/watch"),
    LANDING("https://watch.amazon.co.jp/landing"),
    SETTINGS("intent://watch.amazon.co.jp/settings"),
    BROWSE("https://watch.amazon.co.jp/browse"),
    PARTY("https://watch.amazon.co.jp/party"),
 */
}