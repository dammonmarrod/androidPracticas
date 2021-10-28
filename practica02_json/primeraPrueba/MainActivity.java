
public class MainActivity extends AppCompatActivity {

  
  
  
private void obtenerDatos(final ArrayList lista) {
        String url = "http://www.floatrates.com/daily/eur.json";

        JsonObjectRequest peticionJSON = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                  
                                      
                    JSONArray arrayJSON = response.getJSONArray();
                    Log.v("test",arrayJSON.toString());
                  
                    for (int i=0;i<jsonObject.length();i++){

                        JSONObject resultado = arrayJSON.getJSONObject(i);
                        String code = (String) resultado.get("code");
                        String name = (String) resultado.get("name");
                        Double name = (Double) resultado.get("rate");
                        Double inverseRate = (Double) resultado.get("inverseRate");
                       
                        Clase_TipoMoneda tpmoneda = new Clase_TipoMoneda(code,name,rate,inverseRate);
                        lista.add(tpmoneda);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(peticionJSON);
    }

}
