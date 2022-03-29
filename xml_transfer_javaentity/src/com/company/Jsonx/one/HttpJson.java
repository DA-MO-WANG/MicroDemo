package com.company.Jsonx.one;

import javax.naming.Context;
import javax.swing.text.html.ListView;
import java.util.logging.Handler;

public class HttpJson extends Thread{
    public class Httpjson extends Thread {
        private String url;
        private Context context;
        private ListView listView;
        private JsonAdapter adapter;
        private Handler handler;

        public Httpjson(String url, ListView listView, JsonAdapter adapter, Handler handler) {
            super();
            this.url = url;
            this.listView = listView;
            this.adapter = adapter;
            this.handler = handler;
        }

        @Override
        public void run() {
            URL httpUrl;
            try {
                httpUrl = new URL(url);
            ···
            }

            /**
             * 从网络中获取JSON字符串，然后解析
             * @param json
             * @return
             */
            private List<Person> jsonParse(String json) {
                try {
                    List<Person> personlist = new ArrayList<Person>();
                    JSONObject jsonObject = new JSONObject(json);
                    int result = jsonObject.getInt("result");
                    if (result == 1) {
                        JSONArray jsonArray = jsonObject.getJSONArray("personData");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            Person person = new Person();
                            JSONObject personData = jsonArray.getJSONObject(i);
                            int age = personData.getInt("age");
                            String url = personData.getString("url");
                            String name = personData.getString("name");
                    ···
                            JSONArray schoolInfoArray = personData.getJSONArray("schoolInfo");
                            for (int j = 0; j < schoolInfoArray.length(); j++) {
                                JSONObject schoolInfojson = schoolInfoArray.getJSONObject(j);
                                String schoolName = schoolInfojson.getString("School_name");
                        ···
                            }
                    ···
                        }
                        return personlist;
                    } else {
                        Toast.makeText(context, "erro", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("JsonParseActivity", "json解析出现了问题");
                }

                return null;
            }
        }








}
