package vmg.androidc512l.minestats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vmg.androidc512l.minestats.ServerStatus.McSrvStat;
import vmg.androidc512l.minestats.ServerStatus.McSrvStatStatus;

public class MainActivity extends AppCompatActivity implements Callback<McSrvStatStatus> {

    public TextView serverAbout,serverInfo;
    public Button statusCheckButton;
    public TextInputEditText addressField;

    private static Retrofit retrofit= new Retrofit.Builder().baseUrl("https://api.mcsrvstat.us/2/").addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).build();
    public static String serverAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serverAbout=findViewById(R.id.server_about);
        serverInfo=findViewById(R.id.server_description);
        addressField=findViewById(R.id.adress_field);
        statusCheckButton=findViewById(R.id.status_check_button);
        statusCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serverAddress= Objects.requireNonNull(addressField.getText()).toString();
                if(!serverAddress.isEmpty()){
                    getStatusFrom(serverAddress);
                }else{
                    //Toast Here
                }
            }
        });
    }
    public void getStatusFrom(String address){
        McSrvStat mcSrvStat= retrofit.create(McSrvStat.class);
        Call<McSrvStatStatus> call= mcSrvStat.getStatsInfo(address);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<McSrvStatStatus> call, Response<McSrvStatStatus> response) {
        if(response.isSuccessful()){
            McSrvStatStatus status=response.body();
            //TODO Create code and XML for handling all info
            serverAbout.setText(String.valueOf(status.isOnline()));
            serverInfo.setText(status.getIp());
        }else {
            Log.e("ResponseError", String.valueOf(response.errorBody()));
        }
    }

    @Override
    public void onFailure(Call<McSrvStatStatus> call, Throwable t) {
        t.printStackTrace();
    }
}
/*



*/