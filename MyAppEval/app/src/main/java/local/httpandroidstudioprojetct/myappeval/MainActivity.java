package local.httpandroidstudioprojetct.myappeval;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    private ProgressDialog pDialog;
    private ListView lv;


    // URL to get contacts JSON
    private static String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

    ArrayList<HashMap<String, String>> seismeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seismeList = new ArrayList<>();

        lv = (ListView) findViewById(R.id.list);

        new GetContacts().execute();
    }

    /**
     * Async task class to get json by making HTTP call
     */
    private class GetContacts extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    JSONArray seismee = jsonObj.getJSONArray("features");

                    // looping through All Seismes
                    for (int i = 0; i < seismee.length(); i++) {
                        JSONObject eq = seismee.getJSONObject(i);

                        JSONObject properties = eq.getJSONObject("properties");

                        String mag = properties.getString("mag");
                        String place = properties.getString("place");
                        String time = properties.getString("time");
                        String date = properties.getString("time");

// Get place
                        String distanceAndPlace[] = place.split("\\s");
                        if (distanceAndPlace.length > 3) {
                            place = distanceAndPlace[0] + " \n\n" + distanceAndPlace[1];
                            for(int j = 3; j < distanceAndPlace.length; j++) {
                                place = place + " " + distanceAndPlace[j];
                            }
                        }


                        Long timeConvert = Long.parseLong(time);
                        date = new SimpleDateFormat("dd/MM/yyyy").format(timeConvert);
                        time = new SimpleDateFormat("HH:mm:ss").format(timeConvert);


                        // tmp hash map for single contact
                        HashMap<String, String> seisme = new HashMap<>();

                        // adding each child node to HashMap key => value

                        seisme.put("mag", mag);
                        seisme.put("place", place);
                        seisme.put("time", time);
                        seisme.put("date", date);


                        // adding seism to seism list
                        seismeList.add(seisme);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }


        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();
            /**
             * Updating parsed JSON data into ListView
             * */
            ListAdapter adapter = new SimpleAdapter(
                    MainActivity.this, seismeList,
                    R.layout.list_item, new String[]{"mag", "place", "date", "time"}, new int[]{R.id.mag,
                    R.id.place, R.id.date, R.id.time});
                    lv.setAdapter(adapter);
        }

    }
}