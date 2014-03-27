package com.kg.avatartest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AvatarView extends ImageView {
	private TypedArray typedArray;
	private BitmapDrawable faceDrawable;
	private BitmapDrawable hairDrawable;
	private BitmapDrawable eyesDrawable;
	private BitmapDrawable lipsDrawable;

	public AvatarView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.typedArray = context.getTheme().obtainStyledAttributes(attrs,
				R.styleable.Avatar, 0, 0);
		init();
	}

	public AvatarView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.typedArray = context.getTheme().obtainStyledAttributes(attrs,
				R.styleable.Avatar, 0, 0);
		init();
	}

	public AvatarView(Context context) {
		super(context);
		init();
	}
	
	private void init(){
		this.faceDrawable = (BitmapDrawable) typedArray.getDrawable(R.styleable.Avatar_face);
		this.hairDrawable = (BitmapDrawable) typedArray.getDrawable(R.styleable.Avatar_hair);
		this.eyesDrawable = (BitmapDrawable) typedArray.getDrawable(R.styleable.Avatar_eyes);
		this.lipsDrawable = (BitmapDrawable) typedArray.getDrawable(R.styleable.Avatar_lips);

		if(this.faceDrawable == null){
			this.faceDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.face);
		}
		if(this.hairDrawable == null){
			this.hairDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.hair1);
		}
		if(this.eyesDrawable == null){
			this.eyesDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.eye1);
		}
		if(this.lipsDrawable == null){
			this.lipsDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.lips1);
		}
	}
	
	private void bound(){
		Rect source = new Rect(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
		
		this.faceDrawable.setBounds(source);
		this.hairDrawable.setBounds(source);
		this.eyesDrawable.setBounds(source);
		this.lipsDrawable.setBounds(source);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		bound();
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		faceDrawable.draw(canvas);
		eyesDrawable.draw(canvas);
		lipsDrawable.draw(canvas);
		hairDrawable.draw(canvas);
	}

	public BitmapDrawable getFaceDrawable() {
		return faceDrawable;
	}

	public BitmapDrawable getHairDrawable() {
		return hairDrawable;
	}

	public BitmapDrawable getEyesDrawable() {
		return eyesDrawable;
	}

	public BitmapDrawable getLipsDrawable() {
		return lipsDrawable;
	}

	public void setFaceDrawable(BitmapDrawable faceDrawable) {
		this.faceDrawable = faceDrawable;
		bound();
	}

	public void setHairDrawable(BitmapDrawable hairDrawable) {
		this.hairDrawable = hairDrawable;
		bound();
	}

	public void setEyesDrawable(BitmapDrawable eyesDrawable) {
		this.eyesDrawable = eyesDrawable;
		bound();
	}

	public void setLipsDrawable(BitmapDrawable lipsDrawable) {
		this.lipsDrawable = lipsDrawable;
		bound();
	}

	public void setFace(int faceDrawable) {
		this.faceDrawable = (BitmapDrawable) getResources().getDrawable(faceDrawable);
		bound();
	}

	public void setHair(int hairDrawable) {
		this.hairDrawable = (BitmapDrawable) getResources().getDrawable(hairDrawable);
		bound();
	}

	public void setEyes(int eyesDrawable) {
		this.eyesDrawable = (BitmapDrawable) getResources().getDrawable(eyesDrawable);
		bound();
	}

	public void setLips(int lipsDrawable) {
		this.lipsDrawable = (BitmapDrawable) getResources().getDrawable(lipsDrawable);
		bound();
	}
}
