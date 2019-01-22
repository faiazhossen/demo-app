package mobileapp.faiaz.home.com.startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobileapp.faiaz.home.com.startup.adapters.ItemAdapter;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.txt_name)
    TextView txt_name;

    @BindView(R.id.txt_password)
    TextView txt_password;

    @BindView(R.id.lst_items)
    RecyclerView lst_items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        txt_name.setText(getIntent().getExtras().getString("name"));
        txt_password.setText(getIntent().getExtras().getString("password"));

        lst_items.setLayoutManager(new LinearLayoutManager(this));
        lst_items.setAdapter(new ItemAdapter(this,getData()));

    }

    List<DataItem> getData(){
        return Arrays.asList(
                new DataItem("1","Mamun","Dhaka"),
                new DataItem("2","Naidul","Chatgaia"),
                new DataItem("3","BB","MM"),
                new DataItem("4","Mamun","Dhaka")
        );
    }
}
