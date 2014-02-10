package nl.frankkie.bronymlpblindbagguide;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import nl.fluffikens.pony.Pony;
import nl.fluffikens.pony.waves.*;

import java.util.ArrayList;

/**
 * Created by FrankkieNL on 27-8-13.
 */
public class CodeActivity extends Activity {

    ArrayList<AbstractWave> waves = new ArrayList<AbstractWave>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWaves();
        initUI();
    }

    public void initWaves() {
        waves.clear();
        waves.add(new Wave1());
        waves.add(new Wave2());
        waves.add(new Wave3());
        waves.add(new Wave4());
        waves.add(new Wave5());
        waves.add(new Wave6());
        waves.add(new Wave7());
        waves.add(new Wave8());
        waves.add(new Wave8_1());
        waves.add(new Wave8_2());
        waves.add(new Wave9());
    }

    @Override
    protected void onResume() {
        super.onResume();
        //re init, to show new progress !!
        initWaves();
        initUI();
    }

    public void initUI() {
        setContentView(R.layout.activity_code);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup container = (ViewGroup) findViewById(R.id.code_container);
        for (final AbstractWave w : waves) {
            ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.layout_row, container, false);
            try {
                Drawable d = Drawable.createFromStream(getAssets().open(w.getWaveCover()), null);
                ((ImageView) viewGroup.findViewById(R.id.row_icon)).setImageDrawable(d);
            } catch (Exception e) {
                //ignore
            }
            ((TextView) viewGroup.findViewById(R.id.row_title)).setText("Wave " + w.getWaveName());
            if (w.getDescription() == null || w.getDescription().equals("")) {
                viewGroup.findViewById(R.id.row_secondLine).setVisibility(View.GONE);
            } else {
                ((TextView) viewGroup.findViewById(R.id.row_secondLine)).setText(w.getDescription());
            }
            //Completion
            ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(R.id.row_progress);
            int nrHasPoniesFromWave = 0;
            int nrOfPoniesInWave = w.getPonies().length;
            for (int i=0; i<nrOfPoniesInWave; i++){
                if (prefs.getBoolean("w" + w.getWave() + "p" + i, false)){
                    nrHasPoniesFromWave++;
                }
            }
            progressBar.setProgress(mapInt(nrHasPoniesFromWave,0,nrOfPoniesInWave,0,100));
            ((TextView)viewGroup.findViewById(R.id.row_progress_text)).setText("" + nrHasPoniesFromWave + " / " + nrOfPoniesInWave);
            //
            viewGroup.setFocusable(true);
            viewGroup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(CodeActivity.this, WaveActivity.class);
                    intent.putExtra("waveNr", w.getWave());
                    startActivity(intent);
                }
            });
            //add to container
            container.addView(viewGroup);
        }
    }

    long mapLong(long x, long in_min, long in_max, long out_min, long out_max)
    {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }

    int mapInt(int x, int in_min, int in_max, int out_min, int out_max)
    {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }

    public class WaveOLD {
        public WaveOLD(int nr, String imageName) {
            this.nr = nr;
            this.imageName = imageName;
            this.description = "";
        }

        public WaveOLD(int nr, String imageName, String description) {
            this.nr = nr;
            this.imageName = imageName;
            this.description = description;
        }

        int nr;
        String imageName;
        String description;
    }

    //        waves.add(new Wave(1, "Wave 1/blindbag1_M_angervo.jpg"));
//        waves.add(new Wave(2, "Wave 2/cover.jpg", "Only in Europe"));
//        waves.add(new Wave(3, "Wave 3/cover.jpg"));
//        waves.add(new Wave(4, "Wave 4/cover.jpg"));
//        waves.add(new Wave(5, "Wave 5/cover.jpg"));
//        waves.add(new Wave(6, "Wave 6/cover.jpg"));
//        waves.add(new Wave(7, "Wave 7/cover.jpg"));
//        waves.add(new Wave(8, "Wave 8/cover.jpg"));
}
