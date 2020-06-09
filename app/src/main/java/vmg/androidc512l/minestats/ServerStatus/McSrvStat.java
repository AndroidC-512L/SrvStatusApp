package vmg.androidc512l.minestats.ServerStatus;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface McSrvStat {
    //Get status from server
    @GET("/2/{address}")
    Call<McSrvStatStatus> getStatsInfo(@Path("address") String address);
}
