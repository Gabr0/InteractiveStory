package com.gabr0.interactivestory.model;
import com.gabr0.interactivestory.model.Choice;
/**
 * Created by Gabr0 on 13/02/2018.
 */

public class Page {
    private int mImageId;
    private int mTextId;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinalPage = false;

    public Page(int imageId, int textId) {
        mImageId = imageId;
        mTextId = textId;
        mIsFinalPage = true;
    }

    public Page(int imageId, int textId, Choice choice1, Choice choice2) {
        mImageId = imageId;
        mTextId = textId;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public boolean isFinalPage() {
        return mIsFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        mIsFinalPage = finalPage;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public int getTextId() {
        return mTextId;
    }

    public void setTextId(int textId) {
        mTextId = textId;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
