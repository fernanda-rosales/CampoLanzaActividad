package com.example.campocustom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class Campo extends LinearLayout {
    private EditText editText;
    private Button button;

    public Campo(Context context) {
        super(context);
        creaInflater();
    }

    public Campo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        creaInflater();
        inicia();
        setEtiquetas(context, attrs);
    }

    private void creaInflater() {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.custom_linear_layout, this, true);
    }

    private void inicia() {
        button = findViewById(R.id.btn);
        editText = findViewById(R.id.edit_text);
    }

    private void setEtiquetas(Context context, AttributeSet attributeSet){
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.Campo);

        String textBtn = typedArray.getString(R.styleable.Campo_etiqueta);
        String hintEdit = typedArray.getString(R.styleable.Campo_hint);

        button.setText(textBtn);
        editText.setHint(hintEdit);
        typedArray.recycle();
    }

    public void setOnClickButton(OnClickListener onClickListener) {
        button.setOnClickListener(onClickListener);
    }

    public String getText() {
        return editText.getText().toString();
    }
}
