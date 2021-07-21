package com.example.notehw;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notehw.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private RecyclerView mRecyclerView;
    private ListnoteAdapter mAdapter;
    private ArrayList<String> mNoteList;
    FloatingActionButton mBtnAdd;
    FloatingActionButton mBtnCheck;
    private boolean isFragmentDisplayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        mRecyclerView = findViewById(R.id.ll_RecyclerView);
        mAdapter = new ListnoteAdapter(this, mNoteList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mBtnAdd = findViewById(R.id.icon_add);
        mBtnCheck = findViewById(R.id.icon_check);
        mBtnCheck.setOnClickListener(this);
        mBtnAdd.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_reset) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
   switch (v.getId()){
       case R.id.icon_add:
           ListnoteFragment listnoteFragment = ListnoteFragment.newInstance();
           FragmentManager fragmentManager = getSupportFragmentManager();
           FragmentTransaction fragmentTransaction = fragmentManager
                   .beginTransaction();

           fragmentTransaction.add(R.id.fragment_imtemnote,
                   listnoteFragment).addToBackStack(null).commit();
           mBtnCheck.hide();
           isFragmentDisplayed = true;

           break;
       case R.id.icon_check:

           break;

   }
    }
}