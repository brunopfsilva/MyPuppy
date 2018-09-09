/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);



      ParseQuery<ParseObject> getAllPontos = ParseQuery.getQuery("Pontuacao");
      getAllPontos.findInBackground(new FindCallback<ParseObject>() {
          @Override
          public void done(List<ParseObject> objects, ParseException e) {

              if ( e == null){

                  for (ParseObject ponto: objects){
                      Log.i("nome",""+ ponto.get("nome"));
                  }

                  //Log.i("erro",""+objects.size());
              }else{
                  Log.i("erro",e.getMessage());
              }

          }
      });

    // ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}
