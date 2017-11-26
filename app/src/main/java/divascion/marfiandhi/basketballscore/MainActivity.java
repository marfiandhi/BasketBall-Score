package divascion.marfiandhi.basketballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    int b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void points2B(View view) {
        b+=2;
        displayB(b);
    }
    public void points3B(View view) {
        b+=3;
        displayB(b);
    }
    public void freeThrowB(View view) {
        b+=1;
        displayB(b);
    }
    public void points2A(View view) {
        a+=2;
        displayA(a);
    }
    public void points3A(View view) {
        a+=3;
        displayA(a);
    }
    public void freeThrowA(View view) {
        a+=1;
        displayA(a);
    }
    public void reset(View view) {
        a=0;
        b=0;
        displayA(a);
        displayB(b);
    }
    private void displayA(int score) {
        TextView quantityTextView = (TextView) findViewById(
          R.id.scoreTeamA);
        quantityTextView.setText(""+score);
    }
    private void displayB(int score) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.scoreTeamB);
        quantityTextView.setText(""+score);
    }
}
