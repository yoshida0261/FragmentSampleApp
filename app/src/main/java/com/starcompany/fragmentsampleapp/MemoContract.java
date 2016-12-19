package com.starcompany.fragmentsampleapp;

import android.provider.BaseColumns;

/**
 * Created by takeshi on 16/12/19.
 */
public class MemoContract {
    public MemoContract() {}

    public static abstract class Memos implements BaseColumns {
        public static final String TABLE_NAME = "memos";
        public static final String COL_TITLE = "title";
        public static final String COL_BODY = "body";
        public static final String COL_CREATE = "created";
        public static final String COL_UPDATED = "updated";
    }
}
