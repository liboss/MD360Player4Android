package com.asha.vrlib;

import com.asha.vrlib.model.position.MDMutablePosition;

/**
 * Created by hzqiujiadi on 2017/5/10.
 * hzqiujiadi ashqalcn@gmail.com
 */

public class MD360Camera {

    private boolean mPositionValidate;
    private float mEyeX = 0f;
    private float mEyeY = 0f;
    private float mEyeZ = 0f;
    private float mLookX = 0f;
    private float mLookY = 0f;

    private boolean mProjectionValidate;
    private float mNearScale = 1f;
    private float mRatio = 1.5f;
    private int mViewportWidth = 2;
    private int mViewportHeight = 1;

    private boolean mRotationValidate;
    private final MDMutablePosition mRotation = MDMutablePosition.newInstance();


    MD360Camera setLookX(float mLookX) {
        this.mLookX = mLookX;
        mPositionValidate = true;
        return this;
    }

    MD360Camera setLookY(float mLookY) {
        this.mLookY = mLookY;
        mPositionValidate = true;
        return this;
    }

    MD360Camera setEyeX(float mEyeX) {
        this.mEyeX = mEyeX;
        mPositionValidate = true;
        return this;
    }

    MD360Camera setEyeY(float mEyeY) {
        this.mEyeY = mEyeY;
        mPositionValidate = true;
        return this;
    }

    MD360Camera setEyeZ(float mEyeZ) {
        this.mEyeZ = mEyeZ;
        mPositionValidate = true;
        return this;
    }

    float getEyeX() {
        return mEyeX;
    }

    float getEyeY() {
        return mEyeY;
    }

    float getEyeZ() {
        return mEyeZ;
    }

    float getLookX() {
        return mLookX;
    }

    float getLookY() {
        return mLookY;
    }

    float getNearScale() {
        return mNearScale;
    }

    MD360Camera setNearScale(float scale) {
        this.mNearScale = scale;
        mProjectionValidate = true;
        return this;
    }

    MD360Camera setRoll(float roll){
        mRotation.setRoll(roll);
        mRotationValidate = true;
        return this;
    }

    MD360Camera setPitch(float pitch){
        mRotation.setPitch(pitch);
        mRotationValidate = true;
        return this;
    }

    MD360Camera setYaw(float yaw){
        mRotation.setYaw(yaw);
        mRotationValidate = true;
        return this;
    }

    float getPitch() {
        return mRotation.getPitch();
    }

    float getYaw() {
        return mRotation.getYaw();
    }

    float getRoll() {
        return mRotation.getRoll();
    }

    MD360Camera updateViewport(int width, int height){
        mViewportWidth = width;
        mViewportHeight = height;
        mRatio = width * 1.0f / height;
        mProjectionValidate = true;
        return this;
    }

    float getRatio() {
        return mRatio;
    }

    int getViewportWidth() {
        return mViewportWidth;
    }

    int getViewportHeight() {
        return mViewportHeight;
    }

    boolean isRotationValidate() {
        return mRotationValidate;
    }

    public boolean isPositionValidate() {
        return mPositionValidate;
    }

    public boolean isProjectionValidate() {
        return mProjectionValidate;
    }

    public void consumePositionValidate() {
        mPositionValidate = false;
    }

    public void consumeProjectionValidate() {
        mProjectionValidate = false;
    }

    public void consumeRotationValidate() {
        mRotationValidate = false;
    }
}
