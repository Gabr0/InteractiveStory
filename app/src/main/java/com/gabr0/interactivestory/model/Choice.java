package com.gabr0.interactivestory.model;

/**
 * Created by Gabr0 on 13/02/2018.
 */

public class Choice {
    private int mTextId;
    private int mNextPage;

    public Choice(int textId, int nextPage) {
        mTextId = textId;
        mNextPage = nextPage;
    }

    public int getTextId() {
        return mTextId;
    }

    public void setTextId(int textId) {
        mTextId = textId;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
