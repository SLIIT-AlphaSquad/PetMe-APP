package com.example.petme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Items extends AppCompatActivity {
    //Initialize variable

    DrawerLayout drawerLayout;

    //changed sidenavbar. into HomeActivity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

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
        //Redirect activity to Desire
        HomeActivity.redirectActivity(this,Desire.class);
    }

    public void ClickItems(View view){
        //Recreate activity
        recreate();

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