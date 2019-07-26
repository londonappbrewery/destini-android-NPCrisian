package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button btnTop;
    private Button btnBottom;
    private TextView txtStory;
    private int mStoryIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStoryIndex = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        btnTop = (Button) findViewById(R.id.buttonTop);
        btnBottom = (Button) findViewById(R.id.buttonBottom);
        txtStory = (TextView)findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex == 1){
                    txtStory.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                }
                else if(mStoryIndex == 2){
                    txtStory.setText(R.string.T6_End);
                    btnBottom.setVisibility(View.INVISIBLE);
                    btnTop.setVisibility(View.INVISIBLE);
                }
                if(mStoryIndex == 99){
                    mStoryIndex = 1;
                    btnTop.callOnClick();
                }

            }
        });
        
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 2){
                    txtStory.setText(R.string.T5_End);
                    btnBottom.setVisibility(View.INVISIBLE);
                    btnTop.setVisibility(View.INVISIBLE);
                }
                if(mStoryIndex == 99){
                    txtStory.setText(R.string.T4_End);
                    btnBottom.setVisibility(View.INVISIBLE);
                    btnTop.setVisibility(View.INVISIBLE);
                }
                if(mStoryIndex == 1){
                    txtStory.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 99;
                }

            }
        });

    }
}
