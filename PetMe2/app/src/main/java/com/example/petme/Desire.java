package com.example.petme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Desire extends AppCompatActivity {

    //Initialize variable
    DrawerLayout drawerLayout;

    //Changes sidenavbar. into HomeActivity.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desire);

        //Assign variable
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        //open drawer
        HomeActivity.openDrawer(drawerLayout);
    }



    public void ClickSellDonate(View view){
        //Redirect activity to ClickSellDonate
        HomeActivity.redirectActivity(this,HomeActivity.class);
    }

    public void ClickDesire(View view){
        //Recreate activity
        recreate();
    }

    public void ClickItems(View view){
        //Redirect activity to Items
        HomeActivity.redirectActivity(this,Items.class);
    }

    public void ClickLogout(View view){
        //close App
        HomeActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        //close drawer
        HomeActivity.closeDrawer(drawerLayout);
    }
}