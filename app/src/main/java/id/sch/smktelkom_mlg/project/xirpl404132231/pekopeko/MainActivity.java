package id.sch.smktelkom_mlg.project.xirpl404132231.pekopeko;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    private BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItems(R.menu.menu_main);
        bottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.tab_drink) {
                    drink mi = new drink();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, mi).commit();
                } else if (menuItemId == R.id.tab_home) {
                    home d = new home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, d).commit();
                } else if (menuItemId == R.id.tab_food) {
                    food d = new food();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, d).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        bottomBar.mapColorForTab(0, "#F44336");
        bottomBar.mapColorForTab(1, "#03A9F4");
        bottomBar.mapColorForTab(2, "#FF6F00");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}